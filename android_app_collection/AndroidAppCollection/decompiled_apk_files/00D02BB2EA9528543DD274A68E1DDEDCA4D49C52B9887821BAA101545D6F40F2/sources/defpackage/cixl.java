package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cixl  reason: default package */
/* loaded from: classes4.dex */
public class cixl implements cixj, btzi {
    public final dxio<cavs> a;
    private final Executor c;
    private final Resources d;
    private final dxio<ccif> e;
    private final dxio<chnm> f;
    private final dxio<ceet> g;
    private final ry h;
    private final int i;
    private final int j;
    @dzsi
    private final Date k;
    private boolean l = false;
    public final deig<dwul> b = deig.d();

    public cixl(buva buvaVar, Resources resources, dxio dxioVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, Executor executor, ry ryVar, int i, int i2, Date date) {
        this.d = resources;
        this.a = dxioVar;
        this.e = dxioVar2;
        this.f = dxioVar3;
        this.g = dxioVar4;
        this.c = executor;
        this.h = ryVar;
        this.i = i;
        this.j = i2;
        this.k = date;
        dwtj dwtjVar = (dwtj) dwtm.l.bZ();
        dkfz dkfzVar = dkfz.c;
        if (dwtjVar.c) {
            dwtjVar.bF();
            dwtjVar.c = false;
        }
        dwtm dwtmVar = (dwtm) dwtjVar.b;
        dkfzVar.getClass();
        dwtmVar.h = dkfzVar;
        dwtmVar.a |= 64;
        buvaVar.b((dwtm) dwtjVar.bK(), this, executor);
    }

    @Override // defpackage.btzi
    public void QY(btzr<dwtm> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.cixj
    public Boolean c() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.cixj
    public Boolean d() {
        return Boolean.valueOf(this.f.a().t());
    }

    @Override // defpackage.cixj
    public Integer e() {
        return Integer.valueOf(this.i);
    }

    @Override // defpackage.cixj
    public String f() {
        return String.format(Locale.getDefault(), "%d %s %s", Integer.valueOf(this.i), this.d.getString(R.string.CZ_POINTS_DIALOG_LABEL_POINTS), this.d.getString(R.string.CZ_POINTS_DIALOG_TODAYS_POINTS_DESCRIPTION));
    }

    @Override // defpackage.cixj
    public Integer g() {
        return Integer.valueOf(this.j);
    }

    @Override // defpackage.cixj
    public Date h() {
        Date date = this.k;
        dbsk.s(date);
        return date;
    }

    @Override // defpackage.cixj
    public String i() {
        Locale locale = Locale.getDefault();
        Resources resources = this.d;
        Date date = this.k;
        dbsk.s(date);
        return String.format(locale, "%d %s %s", Integer.valueOf(this.j), this.d.getString(R.string.CZ_POINTS_DIALOG_LABEL_POINTS), resources.getString(R.string.CZ_POINTS_DIALOG_MONTHLY_POINTS_DESCRIPTION, date));
    }

    @Override // defpackage.cixj
    public Integer j() {
        return Integer.valueOf(this.f.a().t() ? R.string.CZ_POINTS_DIALOG_QUICK_STATS_TITLE : R.string.CZ_POINTS_DIALOG_TITLE);
    }

    @Override // defpackage.cixj
    public cqkl k() {
        this.h.f();
        return cqkl.a;
    }

    @Override // defpackage.cixj
    public cqkl l() {
        this.e.a().c(dtxl.hK, null);
        this.h.f();
        return cqkl.a;
    }

    @Override // defpackage.cixj
    public cqkl m() {
        this.b.Pk(new Runnable(this) { // from class: cixk
            private final cixl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cixl cixlVar = this.a;
                cixlVar.a.a().f(cawz.a((dwul) deha.s(cixlVar.b)));
            }
        }, this.c);
        this.h.f();
        return cqkl.a;
    }

    @Override // defpackage.cixj
    public cqkl n() {
        this.g.a().i(null);
        this.h.f();
        return cqkl.a;
    }

    @Override // defpackage.cixj
    public CharSequence o() {
        return this.h.H().getString(R.string.CZ_POINTS_DIALOG_POINTS_STATS_LINK);
    }

    @Override // defpackage.cixj
    public CharSequence p() {
        return this.h.H().getString(R.string.OK_BUTTON);
    }

    @Override // defpackage.btzi
    /* renamed from: q */
    public void QZ(btzr<dwtm> btzrVar, dwul dwulVar) {
        this.b.j(dwulVar);
        dori doriVar = dwulVar.b;
        if (doriVar == null) {
            doriVar = dori.l;
        }
        this.l = doriVar.k;
        cqkx.p(this);
    }
}
