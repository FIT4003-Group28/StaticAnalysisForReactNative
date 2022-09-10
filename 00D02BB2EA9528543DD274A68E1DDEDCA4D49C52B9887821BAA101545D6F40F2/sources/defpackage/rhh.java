package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rhh  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class rhh implements dbrn {
    static final dbrn a = new rhh();

    private rhh() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        rhy rhyVar = (rhy) obj;
        dnkj ca = dnkn.g.ca(rhyVar.b);
        dnki dnkiVar = rhyVar.c.a;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dnkn dnknVar = (dnkn) ca.b;
        dnkiVar.getClass();
        dnknVar.c = dnkiVar;
        dnknVar.b = 2;
        dbsg<V> h = rhyVar.d.get(0).a.h(rhu.a);
        if (h.a()) {
            dnli dnliVar = (dnli) h.b();
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnkn dnknVar2 = (dnkn) ca.b;
            dnliVar.getClass();
            dnknVar2.e = dnliVar;
            dnknVar2.a |= 8;
        }
        dbsg<V> h2 = rhyVar.d.get(1).a.h(rhv.a);
        if (h2.a()) {
            dnli dnliVar2 = (dnli) h2.b();
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnkn dnknVar3 = (dnkn) ca.b;
            dnliVar2.getClass();
            dnknVar3.f = dnliVar2;
            dnknVar3.a |= 16;
        }
        return ca.bK();
    }
}
