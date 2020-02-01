package com.cxz.wanandroid.rx.scheduler

import com.androidwind.androidquick.module.rxjava.scheduler.BaseScheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
class SingleMainScheduler<T> : BaseScheduler<T>(Schedulers.single(), AndroidSchedulers.mainThread())
