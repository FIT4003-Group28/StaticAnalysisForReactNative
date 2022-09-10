package defpackage;
/* compiled from: PG */
/* renamed from: cxvf  reason: default package */
/* loaded from: classes5.dex */
final class cxvf implements Runnable {
    final /* synthetic */ cxvg a;

    public cxvf(cxvg cxvgVar) {
        this.a = cxvgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.setVisibility(8);
        cxvg cxvgVar = this.a;
        cxvi cxviVar = cxvgVar.d;
        cxov cxovVar = cxviVar.i;
        if (cxovVar != null) {
            cxovVar.r(cxvgVar.c.z(cxviVar.a));
        }
    }
}
