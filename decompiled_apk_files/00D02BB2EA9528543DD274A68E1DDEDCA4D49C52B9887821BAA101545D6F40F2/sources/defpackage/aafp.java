package defpackage;

import android.app.Activity;
import android.text.format.DateUtils;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aafp  reason: default package */
/* loaded from: classes2.dex */
public class aafp implements aaff {
    public final aafo a;
    private final Activity b;
    private final eapg c;
    private final eapy d;
    private final Boolean e;

    public aafp(Activity activity, cqhn cqhnVar, eapg eapgVar, eapy eapyVar, Boolean bool, aafo aafoVar) {
        this.b = activity;
        this.c = eapgVar;
        this.d = eapyVar;
        this.e = bool;
        this.a = aafoVar;
    }

    private final Boolean i(eapg eapgVar) {
        return Boolean.valueOf(new eapy(eapgVar).D(this.d));
    }

    private final Boolean j(eapg eapgVar) {
        return Boolean.valueOf(new eapy(eapgVar).C(this.d));
    }

    private final Boolean k() {
        eapg l;
        eapg k = this.a.k();
        if (k == null) {
            return false;
        }
        if (i(k).booleanValue()) {
            return true;
        }
        if (!j(k).booleanValue() || (l = this.a.l()) == null) {
            return false;
        }
        return Boolean.valueOf(!j(l).booleanValue());
    }

    @Override // defpackage.aaff
    public jej a() {
        return new jej(this.d.l(), this.d.m() - 1, 0);
    }

    @Override // defpackage.aaff
    public bqh b() {
        return new bqh(this) { // from class: aafn
            private final aafp a;

            {
                this.a = this;
            }

            @Override // defpackage.bqh
            public final void a(bqa bqaVar) {
                Boolean valueOf;
                aafp aafpVar = this.a;
                eapg eapgVar = new eapg(bqaVar.a, bqaVar.b + 1, bqaVar.c);
                if (eapgVar.C(aafpVar.a.m())) {
                    valueOf = false;
                } else {
                    eapg n = aafpVar.a.n();
                    if (n == null) {
                        valueOf = true;
                    } else {
                        valueOf = Boolean.valueOf(!eapgVar.B(n));
                    }
                }
                if (valueOf.booleanValue()) {
                    aafpVar.a.j(eapgVar);
                    cqkx.p(aafpVar);
                }
            }
        };
    }

    @Override // defpackage.aaff
    public String c() {
        return DateUtils.formatDateTime(this.b, this.d.d(15).n().getTime(), this.d.l() == this.c.r() ? 56 : 52).toUpperCase(Locale.getDefault());
    }

    @Override // defpackage.aaff
    public Boolean d() {
        return this.e;
    }

    @Override // defpackage.aaff
    public int e() {
        eapg k = this.a.k();
        if (k == null || !k().booleanValue() || !new eapy(k).D(this.d)) {
            return 0;
        }
        return k.t();
    }

    @Override // defpackage.aaff
    public int f() {
        eapg l = this.a.l();
        if (l == null || !k().booleanValue()) {
            return 0;
        }
        if (!new eapy(l).D(this.d)) {
            return 32;
        }
        return l.t();
    }

    @Override // defpackage.aaff
    public int g() {
        eapg m = this.a.m();
        if (i(m).booleanValue()) {
            return m.t();
        }
        return j(m).booleanValue() ? 0 : 32;
    }

    @Override // defpackage.aaff
    public int h() {
        eapg n = this.a.n();
        if (n == null) {
            return 32;
        }
        if (i(n).booleanValue()) {
            return n.t();
        }
        return j(n).booleanValue() ? 0 : 32;
    }
}
