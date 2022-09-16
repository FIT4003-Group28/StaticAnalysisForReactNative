package defpackage;
/* compiled from: PG */
/* renamed from: trk  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class trk implements anir {
    public final /* synthetic */ tru a;
    private final /* synthetic */ int b;

    public /* synthetic */ trk(tru truVar) {
        this.a = truVar;
    }

    public /* synthetic */ trk(tru truVar, int i) {
        this.b = i;
        this.a = truVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.b;
        if (i == 0) {
            Void r4 = (Void) obj;
            return this.a.g();
        } else if (i == 1) {
            Void r42 = (Void) obj;
            tvs tvsVar = this.a.d;
            int i2 = typ.a;
            return anii.i(tvsVar.c(), new tvj(tvsVar, 9), tvsVar.n);
        } else {
            tru truVar = this.a;
            return anii.h(truVar.i((tqm) obj, null, 2), ryj.o, truVar.f);
        }
    }
}
