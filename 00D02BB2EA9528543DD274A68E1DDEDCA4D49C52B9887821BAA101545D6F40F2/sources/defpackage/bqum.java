package defpackage;
/* renamed from: bqum  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bqum implements dbrn {
    static final dbrn a = new bqum();

    private bqum() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dqwu bZ = dqwv.c.bZ();
        dqwx dqwxVar = ((bqxi) obj).a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqwv dqwvVar = (dqwv) bZ.b;
        dqwvVar.b = dqwxVar.h;
        dqwvVar.a |= 1;
        return bZ.bK();
    }
}
