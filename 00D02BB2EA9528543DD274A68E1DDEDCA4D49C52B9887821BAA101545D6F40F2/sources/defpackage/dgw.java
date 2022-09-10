package defpackage;
/* compiled from: PG */
/* renamed from: dgw  reason: default package */
/* loaded from: classes6.dex */
public final class dgw {
    public final btvo a;
    public final ahjw b;
    private final dbty<Boolean> c;

    public dgw(final dbsg<czw> dbsgVar, btvo btvoVar, ahjw ahjwVar) {
        this.a = btvoVar;
        this.b = ahjwVar;
        this.c = dbud.a(new dbty(dbsgVar) { // from class: dgv
            private final dbsg a;

            {
                this.a = dbsgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dte dteVar = ((czw) ((dbsu) this.a).a).a().b;
                if (dteVar == null) {
                    dteVar = dte.w;
                }
                return Boolean.valueOf(dteVar.r);
            }
        });
    }

    public final boolean a(int i) {
        dbsg<Integer> a = this.b.a();
        if (!this.c.a().booleanValue()) {
            dkgz dkgzVar = this.a.getAugmentedRealityParameters().c;
            if (dkgzVar == null) {
                dkgzVar = dkgz.d;
            }
            if (!dkgzVar.a) {
                return false;
            }
        }
        return a.a() && a.b().intValue() >= i;
    }
}
