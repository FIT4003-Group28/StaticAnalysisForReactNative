package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bvot  reason: default package */
/* loaded from: classes4.dex */
final class bvot implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ bvou b;

    public bvot(bvou bvouVar, View view) {
        this.b = bvouVar;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.removeOnLayoutChangeListener(this.b);
        this.b.b();
    }
}
