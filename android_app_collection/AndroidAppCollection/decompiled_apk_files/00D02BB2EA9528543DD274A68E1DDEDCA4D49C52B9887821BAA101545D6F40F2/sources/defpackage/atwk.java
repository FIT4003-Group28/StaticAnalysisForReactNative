package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atwk  reason: default package */
/* loaded from: classes2.dex */
public class atwk extends atsu<crrd> implements atye {
    private static final long c = TimeUnit.SECONDS.toMillis(30);
    private final bvjj A;
    private boolean B;
    private long C;
    private dqkr D;
    @dzsi
    private final crfl E;
    @dzsi
    private atyd F;
    @dzsi
    private atyd G;
    private boolean H;
    private final cqhn d;

    public atwk(btrm btrmVar, cref crefVar, Context context, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, boolean z, cqhn cqhnVar, @dzsi crfl crflVar, btvo btvoVar, bvjj bvjjVar, crrd crrdVar) {
        super(crrdVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, c, false);
        this.C = 0L;
        this.D = dqkr.UNKNOWN_INCIDENT_TYPE;
        this.H = false;
        this.d = cqhnVar;
        this.E = crflVar;
        this.A = bvjjVar;
    }

    @Override // defpackage.atss, defpackage.atxz
    public atxx U() {
        return atxx.VOTABLE_INCIDENT;
    }

    @Override // defpackage.atsu
    protected final void e() {
        CharSequence text;
        amwb amwbVar = ((crrd) this.e).a;
        doyd h = amwbVar.h();
        if (h == null) {
            h = doyd.INCIDENT_OTHER;
        }
        dqkr b = amwc.b(h);
        if (b == null) {
            b = dqkr.UNKNOWN_INCIDENT_TYPE;
        }
        this.D = b;
        final boolean i = amwbVar.i();
        this.p = i ? amwbVar.b() : amwbVar.d();
        if (this.E != null) {
            long a = amwbVar.a();
            this.C = a;
            if (this.E.c(a)) {
                this.q = null;
                B(this.j.getText(R.string.MIDTRIP_UGC_VOTE_SENT_FEEDBACK));
            } else {
                if (doyd.INCIDENT_SPEED_LIMIT.equals(amwbVar.h())) {
                    this.B = true;
                    this.q = amwbVar.d();
                } else {
                    if (amwbVar.I().isEmpty()) {
                        text = this.j.getText(R.string.MIDTRIP_UGC_VOTE_CAN_YOU_SEE_THIS);
                    } else {
                        text = this.j.getText(R.string.MIDTRIP_UGC_VOTE_IS_THE_ROAD_CLOSED);
                    }
                    this.q = text;
                }
                int s = this.A.s(bvjk.jz, 0);
                if (s < 3) {
                    B(this.j.getText(R.string.MIDTRIP_UGC_VOTE_SAFETY_TEXT));
                    this.A.W(bvjk.jz, s + 1);
                } else {
                    B(new CharSequence[0]);
                }
                final long longValue = ((Long) dbsg.j(amwbVar.n()).c(0L)).longValue();
                final List<dqts> I = amwbVar.I();
                this.F = new atwd(this.d, this.f, cjtd.a(dtxw.aO), new atwb(this) { // from class: atwe
                    private final atwk a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.atwb
                    public final boolean a() {
                        return this.a.h();
                    }
                }, cqrt.l(R.string.MIDTRIP_UGC_VOTE_YES), R.drawable.animated_check, R.drawable.animated_confirm_button, new atwc(this, longValue, I, i) { // from class: atwf
                    private final atwk a;
                    private final long b;
                    private final List c;
                    private final boolean d;

                    {
                        this.a = this;
                        this.b = longValue;
                        this.c = I;
                        this.d = i;
                    }

                    @Override // defpackage.atwc
                    public final void a() {
                        this.a.k(6, 1 + this.b, this.c, this.d);
                    }
                }, new atvy(this) { // from class: atwg
                    private final atwk a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.atvy
                    public final void a() {
                        this.a.p();
                    }
                });
                this.G = new atwd(this.d, this.f, cjtd.a(dtxw.aP), new atwb(this) { // from class: atwh
                    private final atwk a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.atwb
                    public final boolean a() {
                        return this.a.h();
                    }
                }, cqrt.l(R.string.MIDTRIP_UGC_VOTE_NO), R.drawable.animated_close, R.drawable.animated_deny_button, new atwc(this, longValue, I, i) { // from class: atwi
                    private final atwk a;
                    private final long b;
                    private final List c;
                    private final boolean d;

                    {
                        this.a = this;
                        this.b = longValue;
                        this.c = I;
                        this.d = i;
                    }

                    @Override // defpackage.atwc
                    public final void a() {
                        this.a.k(4, this.b, this.c, this.d);
                    }
                }, new atvy(this) { // from class: atwj
                    private final atwk a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.atvy
                    public final void a() {
                        this.a.p();
                    }
                });
            }
        }
        if (dbsj.d(amwbVar.j()) || dbsj.d(amwbVar.k())) {
            this.v = cjtd.a(dtxw.cS);
        } else {
            cjta b2 = cjtd.b();
            b2.b = amwbVar.j();
            b2.g(amwbVar.k());
            this.v = b2.a();
        }
        atsm S = S(true);
        S.h = cjtd.a(dtxw.cT);
        M(S.a());
    }

    @Override // defpackage.atye
    public Boolean g() {
        return Boolean.valueOf(this.B);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h() {
        crfl crflVar = this.E;
        return crflVar != null && crflVar.c(this.C);
    }

    @Override // defpackage.atye
    @dzsi
    public atyd i() {
        return this.F;
    }

    @Override // defpackage.atye
    @dzsi
    public atyd j() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(int i, long j, List<dqts> list, boolean z) {
        bvrj.UI_THREAD.c();
        if (!this.H && this.E != null) {
            this.H = true;
            cqkx.p(this);
            this.E.i(this.C, this.D, i, j, list, z);
        }
    }
}
