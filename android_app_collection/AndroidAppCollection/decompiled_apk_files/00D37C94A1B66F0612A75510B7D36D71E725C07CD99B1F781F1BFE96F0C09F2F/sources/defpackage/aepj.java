package defpackage;

import android.net.NetworkInfo;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aepj  reason: default package */
/* loaded from: classes.dex */
public final class aepj implements aepf {
    public final aant a;
    private final azqb c;
    private final yrj d;
    private String h;
    private String i;
    private boolean j;
    private final Map e = new HashMap();
    public final Set b = new HashSet();
    private final atk f = new aepi(this);
    private final aeph g = new aeph();

    public aepj(azqb azqbVar, yrj yrjVar, aant aantVar) {
        this.c = azqbVar;
        this.d = yrjVar;
        this.a = aantVar;
    }

    private final aepl q(PlayerConfigModel playerConfigModel) {
        int c;
        String r;
        apfm apfmVar = playerConfigModel.c.j;
        if (apfmVar == null) {
            apfmVar = apfm.a;
        }
        int c2 = apfu.c(apfmVar.e);
        if (c2 == 0 || c2 == 1) {
            c = 2;
        } else {
            apfm apfmVar2 = playerConfigModel.c.j;
            if (apfmVar2 == null) {
                apfmVar2 = apfm.a;
            }
            c = apfu.c(apfmVar2.e);
            if (c == 0) {
                c = 1;
            }
        }
        int i = c - 1;
        if (i == 2) {
            r = r(1);
        } else if (i != 3) {
            r = i != 4 ? "" : r(3);
        } else {
            r = r(2);
        }
        if (!r.equals(this.h)) {
            this.i = this.h;
            this.h = r;
            this.j = true;
        }
        aepl aeplVar = (aepl) this.e.get(this.h);
        if (aeplVar == null) {
            this.j = true;
            aepl aeplVar2 = (aepl) this.c.get();
            this.e.put(this.h, aeplVar2);
            return aeplVar2;
        }
        return aeplVar;
    }

    private final String r(int i) {
        String[] s = this.d.s();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < Math.min(i, 3); i2++) {
            sb.append(s[i2]);
        }
        return sb.toString();
    }

    @Override // defpackage.atk
    public final synchronized void a(asv asvVar, asy asyVar, boolean z, int i) {
        try {
            aepl q = q(this.a.get());
            if (this.j) {
                this.g.a(null);
                this.e.remove(this.i);
                return;
            }
            q.a(asvVar, asyVar, z, i);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("onBytesTransferred got an exception: ");
            sb.append(valueOf);
            afus.b(1, 6, sb.toString());
        }
    }

    @Override // defpackage.atk
    public final synchronized void b(asv asvVar, asy asyVar, boolean z) {
        try {
            aepl q = q(this.a.get());
            if (this.j) {
                this.e.remove(this.i);
            } else {
                q.b(asvVar, asyVar, z);
            }
            this.g.a(null);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("onTransferEnd got an exception: ");
            sb.append(valueOf);
            afus.b(1, 6, sb.toString());
        }
    }

    @Override // defpackage.atk
    public final void c(asv asvVar, asy asyVar, boolean z) {
        try {
            q(this.a.get()).c(asvVar, asyVar, z);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("onTransferStart got an exception: ");
            sb.append(valueOf);
            afus.b(1, 6, sb.toString());
        }
    }

    @Override // defpackage.atk
    public final synchronized void d(asv asvVar, asy asyVar, boolean z) {
        try {
            aepl q = q(this.a.get());
            this.g.a(q);
            q.d(asvVar, asyVar, z);
            this.j = false;
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("onTransferStart got an exception: ");
            sb.append(valueOf);
            afus.b(1, 6, sb.toString());
        }
    }

    @Override // defpackage.aepf, defpackage.awx
    public final synchronized long e() {
        return j().b;
    }

    @Override // defpackage.awx
    public final void f(Handler handler, aww awwVar) {
        this.g.a.a(handler, awwVar);
    }

    @Override // defpackage.awx
    public final void g(aww awwVar) {
        this.g.a.c(awwVar);
    }

    @Override // defpackage.aepf, defpackage.aepl
    public final synchronized long h() {
        long h = q(this.a.get()).h();
        if (h > 0) {
            return h;
        }
        return j().b;
    }

    @Override // defpackage.aepf
    public final atk i() {
        return this.f;
    }

    @Override // defpackage.aepf
    public final synchronized aepk j() {
        long j;
        PlayerConfigModel playerConfigModel = this.a.get();
        NetworkInfo d = this.d.d();
        aqlv g = this.d.g(d);
        long e = q(playerConfigModel).e();
        if (e <= 0) {
            apfm apfmVar = playerConfigModel.c.j;
            if (apfmVar == null) {
                apfmVar = apfm.a;
            }
            if (apfmVar.i.size() != 0) {
                apfm apfmVar2 = playerConfigModel.c.j;
                if (apfmVar2 == null) {
                    apfmVar2 = apfm.a;
                }
                for (apfl apflVar : apfmVar2.i) {
                    aqlv b = aqlv.b(apflVar.b);
                    if (b == null) {
                        b = aqlv.DETAILED_NETWORK_TYPE_UNKNOWN;
                        continue;
                    }
                    if (b == g) {
                        j = apflVar.c;
                        break;
                    }
                }
            }
            j = 0;
            if (j <= 0) {
                apfm apfmVar3 = playerConfigModel.c.j;
                if (apfmVar3 == null) {
                    apfmVar3 = apfm.a;
                }
                if (apfmVar3.c && playerConfigModel.I() > 0) {
                    return new aepk(playerConfigModel.I(), 3, g);
                }
                long c = this.d.c(d);
                if (c != -1) {
                    return new aepk(c, 2, g);
                }
                aqwu aqwuVar = playerConfigModel.c.e;
                if (aqwuVar == null) {
                    aqwuVar = aqwu.b;
                }
                int i = aqwuVar.i * 8;
                if (i == 0) {
                    i = 800000;
                }
                return new aepk(i, 4, g);
            }
            return new aepk(j, 2, g);
        }
        return new aepk(e, 1, g);
    }

    @Override // defpackage.aepf, defpackage.aepl
    public final void k() {
        q(this.a.get()).k();
    }

    @Override // defpackage.aepf
    public final void l(aetv aetvVar, boolean z, PlayerConfigModel playerConfigModel) {
        q(this.a.get()).o(playerConfigModel);
        if (z) {
            int p = p();
            StringBuilder sb = new StringBuilder(11);
            sb.append(p - 1);
            aetvVar.w("bpt", sb.toString());
        }
    }

    @Override // defpackage.aepl
    public final synchronized void m(long j) {
        q(this.a.get()).m(j);
    }

    @Override // defpackage.aepl
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.aepl
    public final /* synthetic */ void o(PlayerConfigModel playerConfigModel) {
    }

    @Override // defpackage.aepl
    public final synchronized int p() {
        return q(this.a.get()).p();
    }
}
