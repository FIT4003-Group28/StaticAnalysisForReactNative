package defpackage;
/* compiled from: PG */
/* renamed from: bvnr  reason: default package */
/* loaded from: classes4.dex */
public final class bvnr extends itb implements bvnt {
    private final bvnf a;

    public bvnr(bvnf bvnfVar) {
        this.a = bvnfVar;
    }

    @Override // defpackage.bvnt
    public final void e(btlu btluVar, String str, String str2, String str3, ddho ddhoVar, final mw<bvns> mwVar) {
        deha.q(this.a.a(btluVar, str, str2, str3, ddhoVar), bvqj.b(new bvqg(mwVar) { // from class: bvnq
            private final mw a;

            {
                this.a = mwVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.a((bvns) obj);
            }
        }), dege.a);
    }

    @Override // defpackage.bvnt
    public final dehn<bvns> f(btlu btluVar, String str, String str2, String str3, ddho ddhoVar) {
        return this.a.a(btluVar, str, str2, str3, ddhoVar);
    }
}
