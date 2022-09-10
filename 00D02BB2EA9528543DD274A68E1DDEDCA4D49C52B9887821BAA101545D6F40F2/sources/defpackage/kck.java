package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kck  reason: default package */
/* loaded from: classes7.dex */
public class kck extends asdi implements kcf {
    private boolean a;
    private boolean b;
    private final ldm c;
    private final Resources d;
    private final kcj e;
    private final kci f;
    @dzsi
    private final kct g;

    public kck(kcu kcuVar, kce kceVar, crmw crmwVar, ldm ldmVar, @dzsi dowa dowaVar, bvsl bvslVar, Resources resources, kcj kcjVar, kci kciVar, Context context) {
        super(crmwVar.g(), dowaVar, bvslVar, resources);
        kct kctVar;
        this.b = true;
        this.c = ldmVar;
        this.d = resources;
        this.e = kcjVar;
        this.f = kciVar;
        if (kceVar.a) {
            kcu.a(context, 1);
            kcp a = kcuVar.a.a();
            kcu.a(a, 2);
            cfns a2 = kcuVar.b.a();
            kcu.a(a2, 3);
            kcu.a(ldmVar, 4);
            kcu.a(crmwVar, 5);
            cqhn a3 = kcuVar.c.a();
            kcu.a(a3, 6);
            Executor a4 = kcuVar.d.a();
            kcu.a(a4, 7);
            kctVar = new kct(context, a, a2, ldmVar, crmwVar, a3, a4);
        } else {
            kctVar = null;
        }
        this.g = kctVar;
        if (kctVar != null) {
            kctVar.d();
        }
    }

    @dzsi
    private final dwfl m() {
        int a;
        ilo iloVar = this.c.d;
        if (iloVar == null) {
            return null;
        }
        for (dwfl dwflVar : iloVar.aE()) {
            if (dwflVar != null && ((a = dwfc.a(dwflVar.f)) == 0 || a == 1)) {
                dizh dizhVar = dwflVar.p;
                if (dizhVar == null) {
                    dizhVar = dizh.j;
                }
                diis diisVar = dizhVar.g;
                if (diisVar == null) {
                    diisVar = diis.h;
                }
                int a2 = diip.a(diisVar.b);
                if (a2 == 0 || a2 != 2) {
                    return dwflVar;
                }
            }
        }
        return null;
    }

    private final void n() {
        if (this.b) {
            ((kad) this.f).a.d.a();
            this.b = false;
        }
    }

    @Override // defpackage.kcf
    public cqkl a() {
        n();
        return cqkl.a;
    }

    @Override // defpackage.kcf
    public Boolean b() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.kcf
    public CharSequence c() {
        String str = this.c.b;
        return str == null ? this.d.getString(R.string.LOADING_ADDRESS_CONTEXT_LABEL) : str;
    }

    @Override // defpackage.kcf
    @dzsi
    public CharSequence d() {
        dndr dndrVar;
        ldm ldmVar = this.c;
        String str = ldmVar.c;
        ilo iloVar = ldmVar.d;
        if (iloVar == null || (dndrVar = iloVar.p) == dndr.HOME || dndrVar == dndr.WORK) {
            return null;
        }
        return str;
    }

    @Override // defpackage.kcf
    public Boolean e() {
        return Boolean.valueOf(d() != null);
    }

    @Override // defpackage.kcf
    public Boolean f() {
        return Boolean.valueOf(V() != null);
    }

    @Override // defpackage.kcf
    @dzsi
    public jic g() {
        dwfl m;
        if (h().booleanValue() && (m = m()) != null) {
            ckql ckqlVar = new ckql();
            ckqlVar.f = true;
            return new jic(m.h, jfv.b(m), nqu.av(), 0, null, ckqlVar);
        }
        return null;
    }

    @Override // defpackage.kcf
    public Boolean h() {
        ilo iloVar = this.c.d;
        boolean z = false;
        if (iloVar == null || iloVar.bg()) {
            return false;
        }
        dwfl m = m();
        if (m != null && (m.a & 128) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.kcf
    public cqkl i() {
        kac kacVar = (kac) this.e;
        kacVar.a.d.a();
        kaf kafVar = kacVar.a;
        nop nopVar = kafVar.c;
        kdi kdiVar = kafVar.e;
        ldm ldmVar = kafVar.a;
        ksr ksrVar = kafVar.f;
        kdk kdkVar = kdk.NAVIGATE;
        mnz mnzVar = mnz.ARRIVAL_CARD;
        dcdc<ldm> e = dcdc.e();
        kaf kafVar2 = kacVar.a;
        nopVar.k(kdiVar.c(ldmVar, ksrVar, null, kdkVar, mnzVar, false, false, e, null, kafVar2.b, kafVar2.c));
        return cqkl.a;
    }

    @Override // defpackage.kcf
    @dzsi
    public kch j() {
        return this.g;
    }

    public void k() {
        n();
    }

    public void l(boolean z) {
        this.a = z;
    }
}
