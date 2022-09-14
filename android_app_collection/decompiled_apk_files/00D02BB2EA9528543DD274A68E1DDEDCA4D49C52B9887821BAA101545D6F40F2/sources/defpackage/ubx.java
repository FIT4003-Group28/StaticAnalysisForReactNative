package defpackage;

import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* compiled from: PG */
/* renamed from: ubx  reason: default package */
/* loaded from: classes7.dex */
public class ubx implements ubp {
    private dbsg<tmd> a;
    private dbsg<FetchState> b;

    public ubx(cqhn cqhnVar, dbsg<tmd> dbsgVar, dbsg<FetchState> dbsgVar2) {
        this.b = dbsgVar2;
        this.a = dbsgVar;
    }

    @Override // defpackage.ubp
    public Boolean a() {
        boolean z = false;
        if (this.b.a() && this.a.a() && this.b.b().a().a().equals(tgk.IN_PROGRESS)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void b(dbsg<FetchState> dbsgVar) {
        if (!this.b.equals(dbsgVar)) {
            this.b = dbsgVar;
            cqkx.p(this);
        }
    }

    public void c(dbsg<tmd> dbsgVar) {
        if (!this.a.equals(dbsgVar)) {
            this.a = dbsgVar;
            cqkx.p(this);
        }
    }
}
