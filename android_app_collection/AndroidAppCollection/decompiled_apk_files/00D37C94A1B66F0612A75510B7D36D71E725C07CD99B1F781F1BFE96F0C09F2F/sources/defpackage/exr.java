package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: exr  reason: default package */
/* loaded from: classes3.dex */
final class exr implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ ext b;

    public exr(ext extVar, View view) {
        this.b = extVar;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.ae = this.a.getMeasuredWidth();
        this.b.af = this.a.getMeasuredHeight();
        this.b.aG();
    }
}
