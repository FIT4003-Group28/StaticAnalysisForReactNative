package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: bwup  reason: default package */
/* loaded from: classes4.dex */
final class bwup implements Runnable {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ bwuq b;

    public bwup(bwuq bwuqVar, Bitmap bitmap) {
        this.b = bwuqVar;
        this.a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bwuq bwuqVar = this.b;
        bwuqVar.d.c.add(bwuqVar.b);
        bwuq bwuqVar2 = this.b;
        if (!bwuqVar2.h) {
            bwuqVar2.c.a(this.a);
        }
        bwuq bwuqVar3 = this.b;
        bwuqVar3.d.c.remove(bwuqVar3.b);
        bwuq bwuqVar4 = this.b;
        bwuqVar4.d.b(bwuqVar4.b);
        this.b.a.b();
    }
}
