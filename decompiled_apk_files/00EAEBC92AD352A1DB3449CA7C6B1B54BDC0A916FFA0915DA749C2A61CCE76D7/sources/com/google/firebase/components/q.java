package com.google.firebase.components;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Map.Entry f8557b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.b.l.a f8558c;

    private q(Map.Entry entry, c.e.b.l.a aVar) {
        this.f8557b = entry;
        this.f8558c = aVar;
    }

    public static Runnable a(Map.Entry entry, c.e.b.l.a aVar) {
        return new q(entry, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((c.e.b.l.b) this.f8557b.getKey()).a(this.f8558c);
    }
}
