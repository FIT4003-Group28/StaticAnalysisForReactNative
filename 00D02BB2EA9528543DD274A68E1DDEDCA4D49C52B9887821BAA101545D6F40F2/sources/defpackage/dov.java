package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: dov  reason: default package */
/* loaded from: classes6.dex */
public final class dov implements drn {
    public static final dspt a = dsuz.f();
    private final dpk b;
    private final btvo c;
    private final dbty<dtm> d;
    private final dpg e;

    public dov(dpk dpkVar, final dbsg<czw> dbsgVar, btvo btvoVar, dpg dpgVar) {
        this.b = dpkVar;
        this.c = btvoVar;
        this.e = dpgVar;
        this.d = dbsgVar.a() ? new dbty(dbsgVar) { // from class: dom
            private final dbsg a;

            {
                this.a = dbsgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dbsg dbsgVar2 = this.a;
                dspt dsptVar = dov.a;
                return ((czw) dbsgVar2.b()).a();
            }
        } : don.a;
    }

    @Override // defpackage.drn
    public final boolean a() {
        return dph.a(this.c, this.d);
    }

    @Override // defpackage.drn
    public final boolean b() {
        return dph.b(this.c, this.d);
    }

    @Override // defpackage.drn
    public final dro c(PersonId personId, m mVar) {
        dpj a2 = this.b.a(this.e.c(2), mVar);
        a2.d(personId);
        return a2;
    }

    @Override // defpackage.drn
    public final dro d(m mVar) {
        return this.b.a(this.e.c(1), mVar);
    }
}
