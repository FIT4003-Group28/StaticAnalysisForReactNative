package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: adqy  reason: default package */
/* loaded from: classes.dex */
public abstract class adqy implements adnt {
    private static final String a = zep.a("MDX.BaseMdxSession");
    public final adrk af;
    public adnl ag;
    protected final int ai;
    protected final acwu aj;
    public final adnu ak;
    protected adnw am;
    protected adqy an;
    public final atcw ao;
    private final Context b;
    private final yzj c;
    private Integer f;
    private adns h;
    private final List d = new ArrayList();
    private atcv g = atcv.MDX_SESSION_DISCONNECT_REASON_UNKNOWN;
    private int e = 0;
    protected int ah = 0;
    protected aifh al = aifh.DEFAULT;

    /* JADX INFO: Access modifiers changed from: protected */
    public adqy(Context context, adrk adrkVar, adnu adnuVar, yzj yzjVar, acwu acwuVar, atcw atcwVar) {
        this.b = context;
        this.af = adrkVar;
        this.ak = adnuVar;
        this.c = yzjVar;
        this.ai = acwuVar.G;
        this.aj = acwuVar;
        this.ao = atcwVar;
    }

    @Override // defpackage.adnt
    public void A(String str) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.A(str);
        }
    }

    @Override // defpackage.adnt
    public void B() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.B();
        }
    }

    @Override // defpackage.adnt
    public final void C() {
        D(atcv.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER);
    }

    @Override // defpackage.adnt
    public void D(atcv atcvVar) {
        rr(atcvVar, aifh.DEFAULT);
    }

    @Override // defpackage.adnt
    public void E() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.E();
        }
    }

    @Override // defpackage.adnt
    public void F(String str) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.F(str);
        }
    }

    @Override // defpackage.adnt
    public void G(String str) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.G(str);
        }
    }

    @Override // defpackage.adnt
    public void H() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.H();
        }
    }

    @Override // defpackage.adnt
    public void I() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.I();
        }
    }

    @Override // defpackage.adnt
    public void J() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.J();
        }
    }

    @Override // defpackage.adnt
    public void K() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.K();
        }
    }

    @Override // defpackage.adnt
    public void L(adnl adnlVar) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.L(adnlVar);
        } else {
            this.ag = adnlVar;
        }
    }

    @Override // defpackage.adnt
    public void M() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.M();
        }
    }

    @Override // defpackage.adnt
    public void N(adnx adnxVar) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.N(adnxVar);
        } else {
            this.d.remove(adnxVar);
        }
    }

    @Override // defpackage.adnt
    public void O(String str) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.O(str);
        }
    }

    @Override // defpackage.adnt
    public void P(long j) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.P(j);
        }
    }

    @Override // defpackage.adnt
    public void Q(int i, String str, String str2) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.Q(i, str, str2);
        }
    }

    @Override // defpackage.adnt
    public void R(String str) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.R(str);
        }
    }

    @Override // defpackage.adnt
    public void S(boolean z) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.S(z);
        }
    }

    @Override // defpackage.adnt
    public void T(boolean z) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.T(z);
        }
    }

    @Override // defpackage.adnt
    public void U(SubtitleTrack subtitleTrack) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.U(subtitleTrack);
        }
    }

    @Override // defpackage.adnt
    public void V(int i) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.V(i);
        }
    }

    @Override // defpackage.adnt
    public void W() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.W();
        }
    }

    @Override // defpackage.adnt
    public void X() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.X();
        }
    }

    @Override // defpackage.adnt
    public void Y(int i, int i2) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.Y(i, i2);
        }
    }

    @Override // defpackage.adnt
    public boolean Z() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.Z();
        }
        return false;
    }

    @Override // defpackage.adnt
    public int a() {
        adqy adqyVar = this.an;
        return adqyVar != null ? adqyVar.a() : this.e;
    }

    public boolean aG() {
        return this.ah > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final adrk aK() {
        return new adrk() { // from class: adqw
            @Override // defpackage.adrk
            public final void a(adnt adntVar) {
                adqy adqyVar = adqy.this;
                if (adqyVar.an.a() != 0) {
                    adqyVar.af.a(adqyVar);
                }
            }
        };
    }

    public final Integer aL() {
        Integer num = this.f;
        if (num != null) {
            return num;
        }
        adqy adqyVar = this.an;
        if (adqyVar == null) {
            return null;
        }
        return adqyVar.aL();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aM(atcv atcvVar, int i) {
        aq(atcvVar, i, aifh.DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aN(adne adneVar) {
        this.c.d(this.b.getString(adneVar.i, k().b()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aO(adqy adqyVar) {
        this.an = adqyVar;
        for (adnx adnxVar : this.d) {
            this.an.z(adnxVar);
        }
        this.d.clear();
        adqyVar.rs(this.ag);
    }

    @Override // defpackage.adnt
    public boolean aa() {
        return false;
    }

    @Override // defpackage.adnt
    public boolean ab() {
        adqy adqyVar = this.an;
        return adqyVar != null ? adqyVar.a() == 0 : this.e == 0;
    }

    @Override // defpackage.adnt
    public boolean ac() {
        adqy adqyVar = this.an;
        return adqyVar != null && ((adpl) adqyVar).Q;
    }

    @Override // defpackage.adnt
    public boolean ad() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.ad();
        }
        return false;
    }

    @Override // defpackage.adnt
    public boolean ae() {
        adqy adqyVar = this.an;
        return adqyVar != null && ((adpl) adqyVar).R;
    }

    @Override // defpackage.adnt
    public boolean af(String str) {
        adqy adqyVar = this.an;
        return adqyVar != null && adqyVar.af(str);
    }

    @Override // defpackage.adnt
    public boolean ag(adnr adnrVar) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.ag(adnrVar);
        }
        return false;
    }

    @Override // defpackage.adnt
    public boolean ah(String str, String str2) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.ah(str, str2);
        }
        return true;
    }

    @Override // defpackage.adnt
    public boolean ai() {
        return this.am.h > 0;
    }

    @Override // defpackage.adnt
    public int aj() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return ((adpl) adqyVar).ae;
        }
        return 1;
    }

    @Override // defpackage.adnt
    public void ak(int i) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.ak(i);
        }
    }

    @Override // defpackage.adnt
    public void al() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.al();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aq(atcv atcvVar, int i, aifh aifhVar) {
        if (this.g == atcv.MDX_SESSION_DISCONNECT_REASON_UNKNOWN) {
            this.f = Integer.valueOf(i);
        }
        rr(atcvVar, aifhVar);
    }

    public abstract void as();

    public abstract boolean au();

    public abstract void av(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public void aw() {
        if (this.e == 2) {
            return;
        }
        this.e = 2;
        atcv r = r();
        boolean z = false;
        if (r == atcv.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER) {
            if (ad()) {
                z = true;
            }
        } else {
            String str = a;
            String valueOf = String.valueOf(r());
            String valueOf2 = String.valueOf(aL());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
            sb.append("Disconnecting without user initiation, reason: ");
            sb.append(valueOf);
            sb.append(", code: ");
            sb.append(valueOf2);
            zep.o(str, sb.toString(), new Throwable());
        }
        av(z);
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.rr(r, this.al);
            return;
        }
        this.af.a(this);
        this.al = aifh.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ax(adnl adnlVar) {
        this.e = 0;
        this.ag = adnlVar;
        as();
        this.af.a(this);
    }

    @Override // defpackage.adnt
    public int b() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return ((adpl) adqyVar).aa;
        }
        return 30;
    }

    @Override // defpackage.adnt
    public long c() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.c();
        }
        return 0L;
    }

    @Override // defpackage.adnt
    public long d() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.d();
        }
        return -1L;
    }

    @Override // defpackage.adnt
    public long e() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.e();
        }
        return 0L;
    }

    @Override // defpackage.adnt
    public long g() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.g();
        }
        return -1L;
    }

    @Override // defpackage.adnt
    public RemoteVideoAd h() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return ((adpl) adqyVar).M;
        }
        return null;
    }

    @Override // defpackage.adnt
    public yix i() {
        adqy adqyVar = this.an;
        if (adqyVar == null) {
            return null;
        }
        return ((adpl) adqyVar).N;
    }

    @Override // defpackage.adnt
    public final adig j() {
        adqy adqyVar = this.an;
        if (adqyVar == null) {
            return null;
        }
        return ((adpl) adqyVar).x;
    }

    @Override // defpackage.adnt
    public final ScreenId l() {
        if (k() instanceof adib) {
            return ((adib) k()).f;
        }
        adqy adqyVar = this.an;
        if (adqyVar == null) {
            return null;
        }
        adib adibVar = ((adpl) adqyVar).x;
        if (adibVar instanceof adib) {
            return adibVar.f;
        }
        return null;
    }

    @Override // defpackage.adnt
    public adnm m() {
        adqy adqyVar = this.an;
        return adqyVar != null ? ((adpl) adqyVar).K : adnm.UNSTARTED;
    }

    @Override // defpackage.adnt
    public adns n() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return ((adpl) adqyVar).E;
        }
        if (this.h == null) {
            this.h = new adqx();
        }
        return this.h;
    }

    @Override // defpackage.adnt
    public final adnw o() {
        return this.am;
    }

    @Override // defpackage.adnt
    public aifh p() {
        return this.al;
    }

    @Override // defpackage.adnt
    public ankt q(String str) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.q(str);
        }
        return anlz.q(false);
    }

    @Override // defpackage.adnt
    public final atcv r() {
        adqy adqyVar;
        if (this.g == atcv.MDX_SESSION_DISCONNECT_REASON_UNKNOWN && (adqyVar = this.an) != null) {
            return adqyVar.r();
        }
        return this.g;
    }

    public int ro() {
        return 0;
    }

    public String rp() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.rp();
        }
        return null;
    }

    public String rq() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.rq();
        }
        return null;
    }

    public void rr(atcv atcvVar, aifh aifhVar) {
        if (this.g == atcv.MDX_SESSION_DISCONNECT_REASON_UNKNOWN) {
            this.g = atcvVar;
        }
        this.al = aifhVar;
        aw();
    }

    public void rs(adnl adnlVar) {
        this.g = atcv.MDX_SESSION_DISCONNECT_REASON_UNKNOWN;
        this.f = null;
        this.ah = 0;
        this.al = aifh.DEFAULT;
        ax(adnlVar);
    }

    public boolean rt() {
        return a() == 2 && !this.aj.ap.contains(Integer.valueOf(r().C));
    }

    @Override // defpackage.adnt
    public String s() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.s();
        }
        return null;
    }

    @Override // defpackage.adnt
    public String t() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.t();
        }
        return adnl.a.e;
    }

    @Override // defpackage.adnt
    public String u() {
        adqy adqyVar = this.an;
        return adqyVar != null ? adqyVar.u() : "";
    }

    @Override // defpackage.adnt
    public String v() {
        adqy adqyVar = this.an;
        return adqyVar != null ? ((adpl) adqyVar).P : adnl.a.b;
    }

    @Override // defpackage.adnt
    public String w() {
        adqy adqyVar = this.an;
        return adqyVar != null ? ((adpl) adqyVar).O : adnl.a.e;
    }

    @Override // defpackage.adnt
    public String x() {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            return adqyVar.x();
        }
        return adnl.a.b;
    }

    @Override // defpackage.adnt
    public void y(String str) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.y(str);
        }
    }

    @Override // defpackage.adnt
    public void z(adnx adnxVar) {
        adqy adqyVar = this.an;
        if (adqyVar != null) {
            adqyVar.z(adnxVar);
        } else {
            this.d.add(adnxVar);
        }
    }
}
