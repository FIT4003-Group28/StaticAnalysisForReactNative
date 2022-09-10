package defpackage;
/* renamed from: cdmg  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cdmg implements dbrn {
    static final dbrn a = new cdmg();

    private cdmg() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        drfj drfjVar = (drfj) obj;
        String str = drfjVar.c;
        int a2 = drfi.a(drfjVar.d);
        boolean z = a2 != 0 && a2 == 3;
        drfq drfqVar = drfjVar.b;
        if (drfqVar == null) {
            drfqVar = drfq.a;
        }
        return cdom.e(str, z, drfqVar);
    }
}
