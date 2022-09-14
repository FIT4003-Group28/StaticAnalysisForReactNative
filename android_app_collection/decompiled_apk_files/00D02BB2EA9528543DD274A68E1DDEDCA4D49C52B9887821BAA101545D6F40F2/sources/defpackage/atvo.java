package defpackage;

import android.content.Context;
import android.text.Spannable;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atvo  reason: default package */
/* loaded from: classes2.dex */
public class atvo extends atsu<crrd> {
    private static final long c = TimeUnit.SECONDS.toMillis(30);
    private final bvsl A;
    private int B;
    private final amfi d;

    public atvo(btrm btrmVar, cref crefVar, Context context, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, amfi amfiVar, bvsl bvslVar, boolean z, btvo btvoVar, crrd crrdVar) {
        super(crrdVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, c, false);
        this.d = amfiVar;
        this.A = bvslVar;
        this.B = 0;
    }

    private final CharSequence[] h(int i) {
        dowb g;
        ArrayList arrayList = new ArrayList();
        String d = ((crrd) this.e).a.d();
        dowb G = ((crrd) this.e).a.G();
        if (G != null && (g = bynw.g(G, i)) != null) {
            String b = bynw.b(this.j, this.A, g);
            if (d != null) {
                StringBuilder sb = new StringBuilder(d.length() + 5 + String.valueOf(b).length());
                sb.append(d);
                sb.append("  •  ");
                sb.append(b);
                d = sb.toString();
            } else {
                d = b;
            }
        }
        if (d != null) {
            arrayList.add(d);
        }
        if (bynw.e(((crrd) this.e).a.H()).booleanValue()) {
            bvsx bvsxVar = new bvsx(this.j);
            Spannable e = bvsxVar.e(this.j.getDrawable(2131233175), 1.0f);
            bvsu c2 = bvsxVar.c(R.string.REPORTED_VIA_WAZE_APP);
            bvsv a = bvsxVar.a(e);
            a.g(" ");
            a.f(c2);
            arrayList.add(a.c());
        }
        return (CharSequence[]) arrayList.toArray(new CharSequence[0]);
    }

    @Override // defpackage.atsu, defpackage.atss, defpackage.atxz
    public synchronized void Oa() {
        super.Oa();
        btrm btrmVar = this.g;
        dceq a = dcet.a();
        a.b(crmh.class, new atvq(crmh.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.atsu, defpackage.atss, defpackage.atxz
    public synchronized void Ob() {
        this.g.a(this);
        super.Ob();
    }

    @Override // defpackage.atsu
    protected final void e() {
        crrd crrdVar = (crrd) this.e;
        if (crrdVar.c) {
            this.p = this.j.getText(R.string.TRAFFIC_INCIDENT_CLEARED_UP);
        } else {
            amwb amwbVar = crrdVar.a;
            String g = amwbVar.g();
            if (g != null) {
                H(bynw.c(bynw.a(g), this.d, new amfq(this) { // from class: atvn
                    private final atvo a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.amfq
                    public final void a(amfu amfuVar) {
                        atvo atvoVar = this.a;
                        atvoVar.H(bynw.d(amfuVar));
                        cqkx.p(atvoVar);
                    }
                }));
            }
            this.p = amwbVar.b();
            B(h(this.B));
        }
        amwb amwbVar2 = crrdVar.a;
        if (dbsj.d(amwbVar2.j()) || dbsj.d(amwbVar2.k())) {
            this.v = cjtd.a(dtxw.cS);
        } else {
            cjta b = cjtd.b();
            b.b = amwbVar2.j();
            b.g(amwbVar2.k());
            this.v = b.a();
        }
        atsm S = S(true);
        S.h = cjtd.a(dtxw.cT);
        M(S.a());
    }

    public void g(crmh crmhVar) {
        int f;
        if (crmhVar == null || this.B == (f = bynw.f(crmhVar.b.b()))) {
            return;
        }
        this.B = f;
        B(h(f));
        cqkx.p(this);
    }
}
