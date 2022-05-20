package com.aptech;

public class Sorting {


    public int[] selectionSort(int[] arr){
        int size = arr.length;
        for(int itr =0;itr<size-1;itr++){
            int min_id = itr;
            for (int i = itr+1;i<size;i++){
                if(arr[i]<arr[min_id]){
                    min_id=i;
                }
            }
            int temp = arr[itr];
            arr[itr]=arr[min_id];
            arr[min_id]=temp;
        }
        return arr;
    }
    int binarySearch(int arr[],int elem){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==elem){
                return mid;
            }
            else if(elem<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;
    }
    int binarySearch(int arr[],int element,int start,int end){
        int mid=start+((end-start)/2);
        if(start>end){
            return -1;
        }
        if(arr[mid]==element){
            return mid;
        }else if(element<arr[mid]){
            return binarySearch(arr, element,start,mid-1);
        }
        else{
            return binarySearch(arr, element,mid+1,end);
        }

    }
}
