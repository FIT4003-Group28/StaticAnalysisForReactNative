package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.vr.ndk.base.DaydreamApi;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ahso  reason: default package */
/* loaded from: classes.dex */
public final class ahso implements ahle, ahop, airt, ynl {
    public final ahkv a;
    public final ahst b;
    public final Handler c;
    public DaydreamApi d;
    public ahsm e;
    public ahsl f;
    public dt g;
    public boolean h;
    public yjk i;
    public jwh j;
    private final afka k;
    private final azqb l;
    private final azqb m;
    private final Set n = new HashSet();

    public ahso(ahkv ahkvVar, afka afkaVar, azqb azqbVar, azqb azqbVar2, ahst ahstVar) {
        ahkvVar.getClass();
        this.a = ahkvVar;
        afkaVar.getClass();
        this.k = afkaVar;
        azqbVar.getClass();
        this.l = azqbVar;
        azqbVar2.getClass();
        this.m = azqbVar2;
        this.b = ahstVar;
        this.c = new Handler(Looper.getMainLooper());
        final ahsj ahsjVar = new ahsj(this);
        ahkvVar.r = new Runnable() { // from class: ahkp
            @Override // java.lang.Runnable
            public final void run() {
                dt dtVar = ahsj.this.a.g;
                if (dtVar != null) {
                    dtVar.onBackPressed();
                }
            }
        };
        ahkl ahklVar = ahkvVar.k;
        if (ahklVar != null) {
            ahklVar.h(ahkvVar.r);
        }
        ahkvVar.u = this;
    }

    @Override // defpackage.ahle
    public final void a(boolean z) {
        this.c.post(new ahsk(this, z));
    }

    public final void b(ahsn ahsnVar) {
        this.n.add(ahsnVar);
    }

    public final void c() {
        this.a.q(null, false);
        i(false);
        for (ahsn ahsnVar : this.n) {
            ahsnVar.m(false);
        }
        this.k.aB(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(ahgn ahgnVar) {
        if (ahgnVar.c() == aijs.FULLSCREEN || !this.a.w) {
            return;
        }
        c();
    }

    public final void e() {
        if (!j()) {
            zep.b("Attempted to enter VR mode when it wasn't available. Doing nothing.");
        } else if (!this.b.b()) {
            ahsl ahslVar = this.f;
            if (ahslVar != null) {
                niv nivVar = (niv) ahslVar;
                if (nivVar.d && ((awvd) nivVar.b.c()).d) {
                    ((airr) nivVar.c.get()).a();
                    nivVar.e = true;
                    Context context = nivVar.a;
                    context.startActivity(ahss.a(context));
                    return;
                }
            }
            airr airrVar = (airr) this.l.get();
            if (!airrVar.T()) {
                airrVar.b();
            }
            for (ahsn ahsnVar : this.n) {
                ahsnVar.m(true);
            }
            this.a.q(new ahlf(this), true);
            this.k.aB(true);
            i(true);
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.s().b.h(aiwv.n(airwVar.aB(), 256L)).h(aiwv.l(0)).aa(new ayqb() { // from class: ahsh
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ahso.this.d((ahgn) obj);
            }
        }, ahqs.d)};
    }

    public final void h(ahsn ahsnVar) {
        this.n.remove(ahsnVar);
    }

    public final void i(boolean z) {
        jwh jwhVar = this.j;
        if (jwhVar != null) {
            if (z) {
                jwhVar.a.mJ().getWindow().addFlags(128);
            } else {
                jwhVar.a.mJ().getWindow().clearFlags(128);
            }
        }
    }

    public final boolean j() {
        ajah ajahVar = ((airr) this.l.get()).q.a;
        return ajahVar != null && (ajahVar.q().a & 1) != 0 && ((Boolean) this.m.get()).booleanValue() && !this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(final int i) {
        if (!ahss.f(this.g, i)) {
            zep.b("Attempted to launch the YouTube VR app on a non-supported device. Doing nothing.");
        } else if (this.b.b()) {
        } else {
            if (ahss.e(this.g, i)) {
                ahss.d(this.g, i, this.d, (airr) this.l.get());
            } else if (this.g == null || this.i == null) {
            } else {
                yiu yiuVar = new yiu() { // from class: ahsg
                    @Override // defpackage.yiu
                    public final void kC(int i2, int i3, Intent intent) {
                        final ahso ahsoVar = ahso.this;
                        final int i4 = i;
                        if (i2 != 500) {
                            return;
                        }
                        ahsoVar.c.post(new Runnable() { // from class: ahsi
                            @Override // java.lang.Runnable
                            public final void run() {
                                ahso.this.k(i4);
                            }
                        });
                    }
                };
                this.i.a(ahss.c(this.g, i), 500, yiuVar);
            }
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                d((ahgn) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahgn.class};
    }
}
