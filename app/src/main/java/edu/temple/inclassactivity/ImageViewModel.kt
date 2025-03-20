package edu.temple.inclassactivity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData

class ImageViewModel : ViewModel() {
    private val selectedImage = MutableLiveData<Int>()

    fun setSelectedImage(imageId: Int) {
        selectedImage.value = imageId
    }
    fun getSelectedImage() : LiveData<Int> {
        return selectedImage
    }
fun setImages(imageArray: IntArray) {
    this.image.value = imageArray
}
    fun getImage() : LiveData<IntArray> {
        return images
    }
}