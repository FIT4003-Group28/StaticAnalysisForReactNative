package defpackage;
/* compiled from: PG */
/* renamed from: arjp  reason: default package */
/* loaded from: classes2.dex */
public final class arjp implements arkb {
    private final dxio<dbsg<czo>> a;
    private final dem b;
    private final arla c;

    public arjp(dxio<dbsg<czo>> dxioVar, den denVar, final arla arlaVar) {
        this.a = dxioVar;
        this.b = denVar.a(czh.WALKING_NAVIGATION, new dbty(arlaVar) { // from class: arjm
            private final arla a;

            {
                this.a = arlaVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return deha.a(Boolean.valueOf(!((arjz) this.a).c.c));
            }
        });
        this.c = arlaVar;
    }

    @Override // defpackage.arkb
    public final dehn<dbsg<diz>> a() {
        if (!this.a.a().a()) {
            return deha.a(dbpy.a);
        }
        return this.a.a().b().a(czh.WALKING_NAVIGATION);
    }

    @Override // defpackage.arkb
    public final arla b() {
        return this.c;
    }

    @Override // defpackage.arkb
    public final dehn<Boolean> c() {
        if (!this.a.a().a()) {
            return deha.a(false);
        }
        final dem demVar = this.b;
        return demVar.a(new del(demVar) { // from class: dej
            private final dem a;

            {
                this.a = demVar;
            }

            @Override // defpackage.del
            public final Object a(dbsg dbsgVar, boolean z) {
                dem demVar2 = this.a;
                boolean z2 = false;
                if (!dbsgVar.a()) {
                    return false;
                }
                if (czn.a((dfmo) dbsgVar.b()) == 2 && demVar2.b(demVar2.a.a(), z)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }, false);
    }
}
