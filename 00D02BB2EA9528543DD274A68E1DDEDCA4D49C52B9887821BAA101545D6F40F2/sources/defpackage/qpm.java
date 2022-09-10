package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: qpm  reason: default package */
/* loaded from: classes7.dex */
public class qpm extends qvu {
    public final yzi a;
    private final Activity l;
    private final qph m;
    private final qco n;

    public qpm(Activity activity, dxio<ros> dxioVar, dxio<afwt> dxioVar2, isd isdVar, yzi yziVar, dxio<qwx> dxioVar3, acyp acypVar, btvo btvoVar, @dzsi qut qutVar, qph qphVar, qco qcoVar) {
        super(activity, qutVar, dxioVar, dxioVar2, isdVar, dxioVar3, acypVar, btvoVar);
        dbsk.a(qcoVar.c() != null);
        this.l = activity;
        this.a = yziVar;
        this.m = qphVar;
        this.n = qcoVar;
        qphVar.o(new mw(this) { // from class: qpj
            private final qpm a;

            {
                this.a = this;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                qpm qpmVar = this.a;
                qpmVar.k = ((Boolean) obj).booleanValue();
                cqkx.p(qpmVar);
            }
        });
    }

    @Override // defpackage.qvu, defpackage.qvm
    public cqix<?> a() {
        return cqgr.fT(new qmz(), this.m);
    }

    @Override // defpackage.qvu
    protected final List<jho> b() {
        qup e;
        dccx F = dcdc.F();
        jhm jhmVar = new jhm();
        jhmVar.a = this.l.getString(R.string.COMMUTE_HUB_CREATE_SHORTCUT_OVERFLOW_BUTTON);
        jhmVar.f = cjtd.a(dtxl.aT);
        jhmVar.d(new View.OnClickListener(this) { // from class: qpk
            private final qpm a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.b();
            }
        });
        F.g(jhmVar.c());
        qut qutVar = this.d;
        if (qutVar != null && qutVar.o() && (e = this.n.e()) != null && e.b() == domy.TRANSIT) {
            jhm jhmVar2 = new jhm();
            jhmVar2.a = this.l.getString(R.string.COMMUTE_HUB_VIEW_DRIVING);
            jhmVar2.f = cjtd.a(dtxl.bN);
            jhmVar2.d(new View.OnClickListener(this) { // from class: qpl
                private final qpm a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.d.j(domy.DRIVE);
                }
            });
            F.g(jhmVar2.c());
        }
        return F.f();
    }

    @Override // defpackage.qvu
    protected final qvt c() {
        dndr a = this.n.c().a();
        if (a == null) {
            a = dndr.UNKNOWN_ALIAS_TYPE;
        }
        int ordinal = a.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 5) {
                    if (ordinal != 6) {
                        return qvt.c(this.l, this.n.c().e());
                    }
                }
            }
            return qvt.b(this.l);
        }
        return qvt.a(this.l);
    }
}
