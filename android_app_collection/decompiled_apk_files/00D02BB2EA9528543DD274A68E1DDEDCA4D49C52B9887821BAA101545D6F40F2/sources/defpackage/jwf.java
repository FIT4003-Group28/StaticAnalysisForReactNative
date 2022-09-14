package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jwf  reason: default package */
/* loaded from: classes7.dex */
public final class jwf extends nor {
    private final jty A;
    public final Context a;
    public final nov b;
    public final kcv c;
    public final btvo d;
    public final ntc e;
    public final jyx f;
    public final kdi g;
    public final nop h;
    public final noo i;
    public final cqkf<jyq> j;
    public final jyj k;
    public final cov l;
    public dcdc<jyo> m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public final jwh<jyo> r;
    private final not s;
    private final kdg t;
    private final Executor u;
    private final jwd v;
    private final crzm<Boolean> w;
    @dzsi
    private cryz<jwe> x;
    private final jyw y;
    private final crzp<Boolean> z;

    public jwf(cqkj cqkjVar, nov novVar, kcv kcvVar, btvo btvoVar, crzm crzmVar, jty jtyVar, kdi kdiVar, nop nopVar, noo nooVar, not notVar, kdg kdgVar, Executor executor, cjqy cjqyVar, cjqq cjqqVar, ntc ntcVar, jwd jwdVar, CharSequence charSequence, jyj jyjVar) {
        super(cjqyVar, cjqqVar);
        this.m = dcdc.e();
        this.n = false;
        this.o = false;
        this.q = 0;
        jwa jwaVar = new jwa(this);
        this.y = jwaVar;
        this.r = new jwb(this);
        this.z = new jwc(this);
        Context context = cqkjVar.d;
        this.a = context;
        this.b = novVar;
        this.c = kcvVar;
        this.d = btvoVar;
        this.w = crzmVar;
        this.A = jtyVar;
        this.g = kdiVar;
        this.h = nopVar;
        this.i = nooVar;
        this.s = notVar;
        this.t = kdgVar;
        this.u = executor;
        this.e = ntcVar;
        this.v = jwdVar;
        this.k = jyjVar;
        this.f = new jyx(context, charSequence, jwaVar, !kcvVar.p(), jyjVar);
        cqkf<jyq> d = cqkjVar.d(new jyd(), ((npb) notVar).b, false);
        this.j = d;
        this.l = (cov) d.c().findViewById(jyd.b);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        deig<jwe> deigVar;
        this.j.e(this.f);
        this.l.a.setClipChildren(false);
        this.l.setAdapter(this.e);
        this.w.d(this.z, this.u);
        if (this.o) {
            dukx dukxVar = this.d.getCarParameters().e;
            if (dukxVar == null) {
                dukxVar = dukx.c;
            }
            this.p = dukxVar.b - 8;
        } else {
            dukx dukxVar2 = this.d.getCarParameters().e;
            if (dukxVar2 == null) {
                dukxVar2 = dukx.c;
            }
            this.p = dukxVar2.b;
        }
        lnm lnmVar = (lnm) this.v;
        btlu j = lnmVar.i.j();
        if (btlu.p(j)) {
            lnmVar.l.j(new jwe(lnmVar.b.getString(R.string.CAR_NO_CONTACTS_MAPS_NOT_SIGNED_IN)));
            bvoo.h("Cannot start autocomplete, signed out.", new Object[0]);
            deigVar = lnmVar.l;
        } else if (j == null || j.u()) {
            if (btlu.n(j)) {
                lnmVar.l.j(new jwe(lnmVar.b.getString(R.string.CAR_NO_CONTACTS_MAPS_NOT_SIGNED_IN)));
                bvoo.h("Cannot start autocomplete, incognito account selected.", new Object[0]);
                deigVar = lnmVar.l;
            } else {
                String o = lnmVar.i.o();
                if (j == null || o == null) {
                    lnmVar.l.j(new jwe(lnmVar.b.getString(R.string.CAR_NO_CONTACTS_MAPS_NOT_SIGNED_IN)));
                    bvoo.h("Cannot start autocomplete, account is null.", new Object[0]);
                    deigVar = lnmVar.l;
                } else {
                    lnmVar.m = lnmVar.k.c(SystemClock.elapsedRealtime(), j, ahvk.STANDARD_NAVIGATION);
                    lnmVar.h.a(o, lnmVar.n);
                    deigVar = lnmVar.l;
                }
            }
        } else {
            lnmVar.l.j(new jwe(lnmVar.b.getString(R.string.CAR_NO_CONTACTS_MAPS_NOT_SIGNED_IN)));
            bvoo.h("Cannot start autocomplete, auth token expired.", new Object[0]);
            deigVar = lnmVar.l;
        }
        this.x = bvqj.d(deigVar, new bvqg(this) { // from class: jvx
            private final jwf a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                jwf jwfVar = this.a;
                jwe jweVar = (jwe) obj;
                if (jweVar.b.length() <= 0) {
                    if (jweVar.a.isEmpty()) {
                        return;
                    }
                    dcdc<jyo> dcdcVar = jweVar.a;
                    for (int i = 0; i < dcdcVar.size(); i++) {
                        dcdcVar.get(i).h(i);
                    }
                    jwfVar.m = dcdcVar;
                    int k = jwfVar.k();
                    if (k < dcdcVar.size()) {
                        jwfVar.e.z(new jxl(), dcdcVar.subList(0, k));
                        if (jwfVar.o) {
                            jwfVar.e.A(new jyh(), new jyy(jwfVar.a.getString(R.string.CAR_LIST_LOCKOUT), jwfVar.k.g(), k));
                        }
                        jwfVar.e.s();
                    } else {
                        jwfVar.e.b(new jxl(), dcdcVar);
                    }
                    jwfVar.f.l();
                    cov covVar = jwfVar.l;
                    covVar.b.g = true;
                    covVar.a(0);
                    return;
                }
                jwfVar.f.m(jweVar.b);
            }
        }, this.u);
    }

    @Override // defpackage.non
    public final noq b() {
        this.c.i(this);
        this.t.d(this);
        this.A.setKeyInterceptor(new kdh(this) { // from class: jvy
            private final jwf a;

            {
                this.a = this;
            }

            @Override // defpackage.kdh
            public final boolean a(KeyEvent keyEvent) {
                jwf jwfVar = this.a;
                if (keyEvent.getAction() == 1 && jwfVar.f.f().booleanValue() && keyEvent.getKeyCode() == 19) {
                    jwfVar.j.c().findViewById(jyd.a).requestFocus();
                    return true;
                }
                return false;
            }
        });
        cjsz a = this.k.a();
        if (a != null) {
            s(a);
        }
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.j.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
        this.c.h(this);
        this.A.a();
        this.t.e(this);
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        cryz<jwe> cryzVar = this.x;
        if (cryzVar != null) {
            cryzVar.c();
            this.x = null;
        }
        lnm lnmVar = (lnm) this.v;
        lnmVar.h.b();
        ahvm ahvmVar = lnmVar.m;
        if (ahvmVar != null && !ahvmVar.b()) {
            lnmVar.m.a();
        }
        lnmVar.m = null;
        this.w.c(this.z);
        this.j.e(null);
    }

    @Override // defpackage.non
    public final String g() {
        return "AlphaJumpListOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.s.b(noeVar, this.j.c());
    }

    public final int k() {
        if (this.o) {
            return this.p;
        }
        dukx dukxVar = this.d.getCarParameters().e;
        if (dukxVar == null) {
            dukxVar = dukx.c;
        }
        return dukxVar.a;
    }

    public final void l(int i) {
        int k = k() / 2;
        int max = Math.max(i - k, 0);
        int min = Math.min(k + i, this.m.size());
        dcdc<jyo> subList = this.m.subList(max, min);
        for (int i2 = 0; i2 < subList.size(); i2++) {
            subList.get(i2).h(i2);
        }
        if (this.o) {
            this.e.B();
            if (max > 0) {
                int i3 = max - 1;
                this.e.A(new jyh(), new jyy(this.a.getString(R.string.CAR_LIST_LOCKOUT), this.k.f(), i3));
                this.q = i3;
            } else {
                this.q = max;
            }
            this.e.z(new jxl(), subList);
            if (min < this.m.size()) {
                this.e.A(new jyh(), new jyy(this.a.getString(R.string.CAR_LIST_LOCKOUT), this.k.g(), min));
            }
            this.e.s();
        } else {
            this.e.b(new jxl(), subList);
            this.q = max;
        }
        int i4 = this.q;
        cov covVar = this.l;
        covVar.b.g = true;
        covVar.a(i - i4);
    }
}
