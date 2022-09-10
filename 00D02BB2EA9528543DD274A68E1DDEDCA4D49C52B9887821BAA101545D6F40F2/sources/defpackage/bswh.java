package defpackage;
/* renamed from: bswh  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bswh implements bszo {
    static final bszo a = new bswh();

    private bswh() {
    }

    @Override // defpackage.bszo
    public final void a(dssi dssiVar, Object obj) {
        arky arkyVar = (arky) dssiVar;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (arkyVar.c) {
            arkyVar.bF();
            arkyVar.c = false;
        }
        arkz arkzVar = (arkz) arkyVar.b;
        arkz arkzVar2 = arkz.g;
        arkzVar.a |= 8;
        arkzVar.e = booleanValue;
    }
}
