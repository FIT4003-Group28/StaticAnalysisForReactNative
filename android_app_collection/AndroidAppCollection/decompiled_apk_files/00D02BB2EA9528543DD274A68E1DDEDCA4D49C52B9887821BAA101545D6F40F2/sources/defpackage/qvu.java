package defpackage;

import android.app.Activity;
import android.app.Application;
import android.text.Spannable;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: qvu  reason: default package */
/* loaded from: classes7.dex */
public abstract class qvu implements qvm {
    private final dxio<afwt> a;
    public final qut d;
    public final Activity e;
    public final dxio<ros> f;
    public final isd g;
    public final dxio<qwx> h;
    public final btvo i;
    public dcdc<jho> j;
    public boolean k = false;
    private final acyp l;

    /* JADX INFO: Access modifiers changed from: protected */
    public qvu(Activity activity, qut qutVar, dxio<ros> dxioVar, dxio<afwt> dxioVar2, isd isdVar, dxio<qwx> dxioVar3, acyp acypVar, btvo btvoVar) {
        this.e = activity;
        this.d = qutVar;
        this.f = dxioVar;
        this.a = dxioVar2;
        this.g = isdVar;
        this.h = dxioVar3;
        this.l = acypVar;
        this.i = btvoVar;
    }

    private final boolean h() {
        quy k = this.d.k();
        if (k == null) {
            return false;
        }
        if (k.d() != null && k.d().a == dndr.INFERRED_HOME) {
            return true;
        }
        return k.e() != null && k.e().a == dndr.INFERRED_WORK;
    }

    @Override // defpackage.qvm
    public View.OnClickListener OA() {
        return new View.OnClickListener(this) { // from class: qvo
            private final qvu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jho OH;
                jho OH2;
                dcdc<jho> f;
                dcdc g;
                qvu qvuVar = this.a;
                if (!qvuVar.OB().booleanValue()) {
                    return;
                }
                dktt dkttVar = qvuVar.i.getPassiveAssistParameters().a().am;
                if (dkttVar == null) {
                    dkttVar = dktt.z;
                }
                if (dkttVar.v) {
                    qwx a = qvuVar.h.a();
                    qut qutVar = qvuVar.d;
                    ros a2 = qvuVar.f.a();
                    quy k = qvuVar.d.k();
                    if (k == null) {
                        g = dcdc.e();
                    } else {
                        g = dcdc.g(qvx.d(dndr.HOME, k.d(), qvt.a(qvuVar.e)), qvx.d(dndr.WORK, k.e(), qvt.b(qvuVar.e)));
                    }
                    qvy qvyVar = new qvy(qutVar, a2, g);
                    qwx.a(qvyVar, 1);
                    cqhn a3 = a.a.a();
                    qwx.a(a3, 2);
                    cqkj a4 = a.b.a();
                    qwx.a(a4, 3);
                    cqhu a5 = a.c.a();
                    qwx.a(a5, 4);
                    Application a6 = a.d.a();
                    qwx.a(a6, 5);
                    dxio a7 = ((dxjh) a.e).a();
                    qwx.a(a7, 6);
                    qww qwwVar = new qww(qvyVar, a3, a4, a5, a6, a7);
                    qwwVar.e(qwwVar, view);
                    return;
                }
                if (qvuVar.j == null) {
                    quy k2 = qvuVar.d.k();
                    if (k2 == null) {
                        f = dcdc.e();
                    } else {
                        dccx F = dcdc.F();
                        azva d = k2.d();
                        if (d == null) {
                            OH = qvuVar.OG(qvt.a(qvuVar.e));
                        } else {
                            OH = qvuVar.OH(qvt.a(qvuVar.e), d);
                        }
                        F.g(OH);
                        azva e = k2.e();
                        if (e == null) {
                            OH2 = qvuVar.OG(qvt.b(qvuVar.e));
                        } else {
                            OH2 = qvuVar.OH(qvt.b(qvuVar.e), e);
                        }
                        F.g(OH2);
                        f = F.f();
                    }
                    qvuVar.j = f;
                }
                isc a8 = qvuVar.g.a(view);
                a8.a(qvuVar.j);
                a8.show();
            }
        };
    }

    @Override // defpackage.qvm
    public Boolean OB() {
        if (this.d.k() == null || h()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.qvm
    public final jht OC() {
        jhu h = jhv.h();
        jhm jhmVar = new jhm();
        jhmVar.a = this.e.getText(R.string.COMMUTE_SETTINGS_MENU_ITEM);
        jhmVar.d(new View.OnClickListener(this) { // from class: qvp
            private final qvu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f.a().e();
            }
        });
        jhmVar.f = cjtd.a(dtxl.al);
        h.d(jhmVar.c());
        h.e(b());
        return h.b();
    }

    @Override // defpackage.qvm
    public qvn OD() {
        return new qvs(this);
    }

    @Override // defpackage.qvm
    public Boolean OE() {
        return false;
    }

    @Override // defpackage.qvm
    public Boolean OF() {
        return Boolean.valueOf(!this.l.f());
    }

    public final jho OG(qvt qvtVar) {
        qvv qvvVar = (qvv) qvtVar;
        bvsv a = new bvsx(this.e.getResources()).a(qvvVar.c);
        a.n();
        a.l(ibm.n().b(this.e));
        Spannable c = a.c();
        jhm jhmVar = new jhm();
        jhmVar.a = c;
        jhmVar.d(new View.OnClickListener(this) { // from class: qvq
            private final qvu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f.a().i();
            }
        });
        cjtd cjtdVar = qvvVar.f;
        if (cjtdVar != null) {
            jhmVar.f = cjtdVar;
        }
        return jhmVar.c();
    }

    public final jho OH(qvt qvtVar, final azva azvaVar) {
        jhm jhmVar = new jhm();
        qvv qvvVar = (qvv) qvtVar;
        jhmVar.a = qvvVar.b;
        jhmVar.d(new View.OnClickListener(this, azvaVar) { // from class: qvr
            private final qvu a;
            private final azva b;

            {
                this.a = this;
                this.b = azvaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qvu qvuVar = this.a;
                qvuVar.d.i(this.b);
            }
        });
        cjtd cjtdVar = qvvVar.e;
        if (cjtdVar != null) {
            jhmVar.f = cjtdVar;
        }
        return jhmVar.c();
    }

    @Override // defpackage.qvm
    public final cqkl Ow() {
        this.a.a().p();
        return cqkl.a;
    }

    @Override // defpackage.qvm
    public final CharSequence Ox() {
        if (h()) {
            return ((qvv) qvt.c(this.e, null)).a;
        }
        return c().d();
    }

    @Override // defpackage.qvm
    @dzsi
    public final cjtd Oy() {
        if (h()) {
            return ((qvv) qvt.c(this.e, null)).d;
        }
        return c().h();
    }

    @Override // defpackage.qvm
    @dzsi
    public cjtd Oz() {
        return null;
    }

    @Override // defpackage.qvm
    @dzsi
    public cqix<?> a() {
        return null;
    }

    protected abstract List<jho> b();

    protected abstract qvt c();
}
