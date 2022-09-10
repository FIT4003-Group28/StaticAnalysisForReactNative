package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sbs  reason: default package */
/* loaded from: classes7.dex */
public class sbs implements sac {
    public final seu a;
    public final seu b;
    public final Runnable c;
    public boolean d;
    public dngu e;
    public dngu f;
    private final dpol g;
    private final set h;
    private final cqkn<sac> i;
    private final cqkn<sac> j;

    public sbs(Application application, cqhn cqhnVar, sev sevVar, dpol dpolVar, Boolean bool, dngu dnguVar, dngu dnguVar2, Runnable runnable) {
        sbp sbpVar = new sbp(this);
        this.h = sbpVar;
        this.i = new sbq(this);
        this.j = new sbr(this);
        this.d = bool.booleanValue();
        this.c = runnable;
        this.g = dpolVar;
        this.e = dnguVar;
        this.f = dnguVar2;
        seu a = sevVar.a(application.getString(R.string.GET_TO_WORK_BY_TITLE), sbpVar, null, dtxl.cg, dtxl.cf);
        this.a = a;
        a.h(dnguVar);
        seu a2 = sevVar.a(application.getString(R.string.GO_HOME_AT_TITLE), sbpVar, null, dtxl.ci, dtxl.ch);
        this.b = a2;
        a2.h(dnguVar2);
        a2.j(Boolean.valueOf(sht.g(dnguVar, dnguVar2)));
    }

    @Override // defpackage.sac
    public Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.sac
    public cqkn<sac> b() {
        return this.i;
    }

    @Override // defpackage.sac
    public cqkn<sac> c() {
        return this.j;
    }

    @Override // defpackage.sac
    public sas d() {
        return this.a;
    }

    @Override // defpackage.sac
    public sas e() {
        return this.b;
    }

    @Override // defpackage.sac
    public dngu f() {
        return this.f;
    }

    @Override // defpackage.sac
    public dngu g() {
        return this.e;
    }

    @Override // defpackage.sac
    public dpol h() {
        return this.g;
    }

    @Override // defpackage.sac
    public cjtd i() {
        return cjtd.a(dtxl.cc);
    }

    @Override // defpackage.sac
    public cjtd j() {
        cjta b = cjtd.b();
        b.d = dtxl.cb;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = this.d ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
    }
}
