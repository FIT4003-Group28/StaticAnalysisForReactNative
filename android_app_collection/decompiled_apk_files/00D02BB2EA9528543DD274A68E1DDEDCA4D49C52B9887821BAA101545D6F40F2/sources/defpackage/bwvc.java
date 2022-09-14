package defpackage;

import com.google.geo.imagery.viewer.api.PhotoHandle;
/* compiled from: PG */
/* renamed from: bwvc  reason: default package */
/* loaded from: classes4.dex */
final class bwvc implements Runnable {
    final /* synthetic */ PhotoHandle a;
    final /* synthetic */ bwvd b;

    public bwvc(bwvd bwvdVar, PhotoHandle photoHandle) {
        this.b = bwvdVar;
        this.a = photoHandle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            bwvd bwvdVar = this.b;
            if (!bwvdVar.a) {
                bwve bwveVar = bwvdVar.b;
                bwveVar.c.setCamera(bwveVar.i.bK());
                this.b.b.e.f(this.a);
                bwve bwveVar2 = this.b.b;
                bwveVar2.h = bwveVar2.g;
                bwveVar2.b.a();
            }
        }
    }
}
