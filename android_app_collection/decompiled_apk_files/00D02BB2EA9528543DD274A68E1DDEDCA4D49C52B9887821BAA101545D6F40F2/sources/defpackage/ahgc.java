package defpackage;
/* renamed from: ahgc  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ahgc implements dbrn {
    static final dbrn a = new ahgc();

    private ahgc() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        ahft ahftVar = (ahft) ((cqix) obj).b();
        agyc bZ = agyd.d.bZ();
        dlcn e = ahftVar.e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agyd agydVar = (agyd) bZ.b;
        e.getClass();
        agydVar.b = e;
        agydVar.a |= 1;
        int f = ahftVar.f();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agyd agydVar2 = (agyd) bZ.b;
        agydVar2.a |= 2;
        agydVar2.c = f;
        return bZ.bK();
    }
}
