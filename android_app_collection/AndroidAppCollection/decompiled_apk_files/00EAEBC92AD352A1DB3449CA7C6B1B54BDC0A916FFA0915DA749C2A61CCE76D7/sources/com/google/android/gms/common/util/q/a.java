package com.google.android.gms.common.util.q;

import com.google.android.gms.common.internal.s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f7114a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadFactory f7115b;

    public a(String str) {
        this(str, 0);
    }

    private a(String str, int i) {
        this.f7115b = Executors.defaultThreadFactory();
        s.a(str, (Object) "Name must not be null");
        this.f7114a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f7115b.newThread(new b(runnable, 0));
        newThread.setName(this.f7114a);
        return newThread;
    }
}
