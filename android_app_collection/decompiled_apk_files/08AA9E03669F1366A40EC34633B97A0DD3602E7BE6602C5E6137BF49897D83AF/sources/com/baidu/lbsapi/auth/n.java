package com.baidu.lbsapi.auth;

import android.os.Handler;
import android.os.Looper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n extends Thread {

    /* renamed from: a  reason: collision with root package name */
    Handler f1510a;

    /* renamed from: b  reason: collision with root package name */
    private Object f1511b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1512c;

    n() {
        this.f1510a = null;
        this.f1511b = new Object();
        this.f1512c = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(String str) {
        super(str);
        this.f1510a = null;
        this.f1511b = new Object();
        this.f1512c = false;
    }

    public void a() {
        if (a.f1483a) {
            a.a("Looper thread quit()");
        }
        this.f1510a.getLooper().quit();
    }

    public void b() {
        synchronized (this.f1511b) {
            try {
                if (!this.f1512c) {
                    this.f1511b.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void c() {
        synchronized (this.f1511b) {
            this.f1512c = true;
            this.f1511b.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f1510a = new Handler();
        if (a.f1483a) {
            a.a("new Handler() finish!!");
        }
        Looper.loop();
        if (a.f1483a) {
            a.a("LooperThread run() thread id:" + String.valueOf(Thread.currentThread().getId()));
        }
    }
}
