package com.baidu.mapapi.utils;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f1954a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f1955b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, int i) {
        this.f1954a = context;
        this.f1955b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread thread;
        long currentTimeMillis = System.currentTimeMillis();
        do {
            if (System.currentTimeMillis() - currentTimeMillis > 3000) {
                a.a(this.f1954a);
                a.a(this.f1955b, this.f1954a);
            }
            thread = a.v;
        } while (!thread.isInterrupted());
    }
}
