package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxcq  reason: default package */
/* loaded from: classes4.dex */
class bxcq implements bxca {
    private final Activity a;
    private final cjmt b;
    private final Runnable c;
    private final dwfl d;
    @dzsi
    private final ilo e;
    private final dxio<afha> f;
    private final cafi g;
    private final jic h;
    private final String i;
    private final String j;
    private final CharSequence k;
    private final String l;
    private final String m;
    private final jic n;

    public bxcq(Activity activity, dxio<afha> dxioVar, cafi cafiVar, cqat cqatVar, cjmt cjmtVar, Runnable runnable, dwfl dwflVar, @dzsi ilo iloVar, int i, int i2, boolean z) {
        String str;
        this.a = activity;
        this.f = dxioVar;
        this.g = cafiVar;
        this.b = cjmtVar;
        this.c = runnable;
        this.d = dwflVar;
        this.e = iloVar;
        Resources resources = activity.getResources();
        dizh dizhVar = dwflVar.p;
        diis diisVar = (dizhVar == null ? dizh.j : dizhVar).g;
        if (((diisVar == null ? diis.h : diisVar).a & 4) != 0) {
            dizh dizhVar2 = dwflVar.p;
            diis diisVar2 = (dizhVar2 == null ? dizh.j : dizhVar2).g;
            dhpf dhpfVar = (diisVar2 == null ? diis.h : diisVar2).f;
            dhpfVar = dhpfVar == null ? dhpf.i : dhpfVar;
            eaol eaolVar = new eaol(dhpfVar.b, dhpfVar.c, dhpfVar.d, dhpfVar.e, dhpfVar.f);
            eaol eaolVar2 = new eaol(cqatVar.b());
            int i3 = eaolVar2.x(eaolVar) ? 0 : eapw.b(eaolVar, eaolVar2).p;
            if (i3 >= 12) {
                int i4 = eapk.b(eaolVar, eaolVar2).p;
                str = resources.getQuantityString(R.plurals.STREETVIEW_IMAGE_MONTHS_AGO, i4, Integer.valueOf(i4));
            } else {
                str = resources.getQuantityString(R.plurals.STREETVIEW_IMAGE_WEEKS_AGO, i3, Integer.valueOf(i3));
            }
        } else {
            str = "";
        }
        this.k = str;
        dwfh dwfhVar = dwflVar.k;
        dnpq dnpqVar = (dwfhVar == null ? dwfh.d : dwfhVar).c;
        this.i = (dnpqVar == null ? dnpq.g : dnpqVar).d;
        dwfh dwfhVar2 = dwflVar.k;
        dnpq dnpqVar2 = (dwfhVar2 == null ? dwfh.d : dwfhVar2).c;
        this.j = (dnpqVar2 == null ? dnpq.g : dnpqVar2).c;
        if (z) {
            dizh dizhVar3 = dwflVar.p;
            dlwk dlwkVar = (dizhVar3 == null ? dizh.j : dizhVar3).d;
            this.m = (dlwkVar == null ? dlwk.g : dlwkVar).f;
        } else {
            this.m = "";
        }
        ckqc b = jfv.b(dwflVar);
        dwfh dwfhVar3 = dwflVar.k;
        dnpq dnpqVar3 = (dwfhVar3 == null ? dwfh.d : dwfhVar3).c;
        this.n = new jic((dnpqVar3 == null ? dnpq.g : dnpqVar3).e, b, 2131232998);
        this.l = activity.getString(R.string.STREETVIEW_GALLERY_IMAGE_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        this.h = new jic(dwflVar.h, b, 0, 200);
    }

    private final cjtd n(ddho ddhoVar) {
        dizh dizhVar = this.d.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dggg dgggVar = dizhVar.b;
        if (dgggVar == null) {
            dgggVar = dggg.d;
        }
        ilo iloVar = this.e;
        return bwzj.c(ddhoVar, dgggVar, iloVar == null ? null : iloVar.ai()).a();
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.bxca
    public Integer b() {
        return Integer.valueOf(bxcs.e(this.a));
    }

    @Override // defpackage.bxca
    public Integer c() {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        if (this.a.getResources().getConfiguration().orientation == 1) {
            return Integer.valueOf(Math.round((b().intValue() * 4.0f) / 3.0f));
        }
        return Integer.valueOf((displayMetrics.heightPixels - this.b.g()) - bxcs.d(82, displayMetrics));
    }

    @Override // defpackage.bxca
    public jic d() {
        return this.h;
    }

    @Override // defpackage.bxca
    public String e() {
        return this.i;
    }

    @Override // defpackage.bxca
    public jic f() {
        return this.n;
    }

    @Override // defpackage.bxca
    public void g() {
        this.c.run();
    }

    @Override // defpackage.bxca
    public CharSequence h() {
        return this.l;
    }

    @Override // defpackage.bxca
    public void i() {
        Runnable b = bmek.b(this.a, this.g, this.f, this.j);
        if (b != null) {
            b.run();
        } else {
            this.f.a().k(this.a, this.j, 1);
        }
    }

    @Override // defpackage.bxca
    public CharSequence j() {
        return this.k;
    }

    @Override // defpackage.bxca
    public cjtd k() {
        return n(dtyb.ek);
    }

    @Override // defpackage.bxca
    public cjtd l() {
        return n(dtyb.eh);
    }

    @Override // defpackage.bxca
    public CharSequence m() {
        return this.m;
    }
}
