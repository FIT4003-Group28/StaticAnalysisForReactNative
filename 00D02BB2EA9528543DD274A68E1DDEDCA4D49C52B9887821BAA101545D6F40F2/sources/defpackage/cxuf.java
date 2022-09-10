package defpackage;
/* compiled from: PG */
/* renamed from: cxuf  reason: default package */
/* loaded from: classes5.dex */
final class cxuf implements Runnable {
    final /* synthetic */ cxug a;

    public cxuf(cxug cxugVar) {
        this.a = cxugVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cxug cxugVar = this.a;
        cxui cxuiVar = cxugVar.b;
        cxov cxovVar = cxuiVar.h;
        if (cxovVar != null) {
            cxovVar.r(cxugVar.a.z(cxuiVar.a));
        }
    }
}
