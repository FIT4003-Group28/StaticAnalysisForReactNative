package defpackage;
/* compiled from: PG */
/* renamed from: inx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class inx implements ayog {
    public final /* synthetic */ ayos a;
    private final /* synthetic */ int b;

    public /* synthetic */ inx(ayos ayosVar) {
        this.a = ayosVar;
    }

    public /* synthetic */ inx(ayos ayosVar, int i) {
        this.b = i;
        this.a = ayosVar;
    }

    @Override // defpackage.ayog
    public final ayof a(ayoc ayocVar) {
        if (this.b == 0) {
            ayos ayosVar = this.a;
            int i = iou.cp;
            return ayocVar.H(ayosVar.j().B(ayoc.x()));
        }
        return ayocVar.H(this.a.j().B(ayoc.x()));
    }
}
