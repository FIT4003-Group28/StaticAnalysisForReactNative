package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: adoz */
/* loaded from: classes.dex */
public final class adoz extends adqy implements adrp {
    public static final String a = zep.a("MDX.CastV3");
    public final MdxSessionFactory b;
    public final adhz c;
    public final acvg d;
    public final acvg e;
    public final acyz f;
    public final String g;
    public final Handler h;
    public final ScheduledExecutorService i;
    public qku j;
    public qoh k;
    public boolean l;
    public final List m;
    public final adnd n;
    private final yni o;
    private adoy p;

    public adoz(adhz adhzVar, MdxSessionFactory mdxSessionFactory, Context context, adrk adrkVar, adnu adnuVar, yzj yzjVar, yni yniVar, acvg acvgVar, acvg acvgVar2, int i, ampq ampqVar, acyz acyzVar, aczr aczrVar, Handler handler, acwu acwuVar, ScheduledExecutorService scheduledExecutorService, atcw atcwVar, adnd adndVar) {
        super(context, adrkVar, adnuVar, yzjVar, acwuVar, atcwVar);
        this.m = new ArrayList();
        this.c = adhzVar;
        this.b = mdxSessionFactory;
        yniVar.getClass();
        this.o = yniVar;
        acvgVar.getClass();
        this.d = acvgVar;
        acvgVar2.getClass();
        this.e = acvgVar2;
        this.f = acyzVar;
        this.h = handler;
        this.i = scheduledExecutorService;
        this.n = adndVar;
        this.g = aczrVar.j;
        adnv a2 = adnw.a();
        a2.i(2);
        a2.e(adhzVar.b());
        a2.d(adew.f(adhzVar));
        a2.f(i);
        if (ampqVar.h()) {
            a2.g((String) ampqVar.c());
        }
        this.am = a2.a();
    }

    public static atcv am(int i, atcv atcvVar) {
        if (aczm.a.contains(Integer.valueOf(i))) {
            return atcv.MDX_SESSION_DISCONNECT_REASON_CAST_AUTHENTICATION_FAILURE;
        }
        if (i != 2002) {
            if (i != 2005) {
                if (i != 2152) {
                    if (i != 2271) {
                        if (i != 2473) {
                            if (i != 2450) {
                                if (i != 2451) {
                                    switch (i) {
                                        case 2154:
                                        case 2155:
                                        case 2156:
                                        case 2158:
                                        case 2161:
                                            break;
                                        case 2157:
                                        case 2159:
                                        case 2160:
                                            break;
                                        default:
                                            switch (i) {
                                                case 2251:
                                                case 2253:
                                                    break;
                                                case 2252:
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 2259:
                                                            return atcv.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE;
                                                        case 2260:
                                                        case 2261:
                                                            return atcv.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
                                                        default:
                                                            return atcvVar;
                                                    }
                                            }
                                    }
                                }
                            }
                        }
                        return atcv.MDX_SESSION_DISCONNECT_REASON_CONNECTION_TIMEOUT;
                    }
                    return atcv.MDX_SESSION_DISCONNECT_REASON_NETWORK;
                }
                return atcv.MDX_SESSION_DISCONNECT_REASON_CAST_SDK_CANCELLED;
            }
            return atcv.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED;
        }
        return atcv.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void J() {
        qoh qohVar = this.k;
        if (qohVar == null) {
            super.J();
            return;
        }
        qohVar.f().g(new adow(new adot(this, 1)));
        this.o.d(new adaa());
        this.e.c("mdx_ccs");
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void K() {
        qoh qohVar = this.k;
        if (qohVar == null) {
            super.K();
            return;
        }
        qohVar.g().g(new adow(new adot(this)));
        this.o.d(new adab());
        this.e.c("mdx_ccp");
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void V(final int i) {
        qta qtaVar;
        qoh qohVar = this.k;
        if (qohVar == null) {
            super.V(i);
            return;
        }
        double d = i / 100.0f;
        qnm.g("Must be called from the main thread.");
        if (!qohVar.l()) {
            qtaVar = qoh.v();
        } else {
            qnw qnwVar = new qnw(qohVar, d);
            qoh.u(qnwVar);
            qtaVar = qnwVar;
        }
        qtaVar.g(new adow(new Runnable() { // from class: adou
            @Override // java.lang.Runnable
            public final void run() {
                super/*adqy*/.V(i);
            }
        }));
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void Y(int i, int i2) {
        V(i);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean aa() {
        adhz adhzVar = this.c;
        return !adhzVar.a.d(1) && adhzVar.a.d(4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adqy
    public final void aq(atcv atcvVar, int i, aifh aifhVar) {
        if (atcv.MDX_SESSION_DISCONNECT_REASON_ROUTE_UNSELECTED.equals(atcvVar) || atcv.MDX_SESSION_DISCONNECT_REASON_UNKNOWN.equals(atcvVar)) {
            atcvVar = am(i, atcvVar);
        }
        super.aq(atcvVar, i, aifhVar);
    }

    public final void ar() {
        int i;
        if (!this.aj.A || (i = this.ah) >= this.ai || this.j == null) {
            return;
        }
        this.ah = i + 1;
        f().b(this.j);
    }

    @Override // defpackage.adqy
    public final void as() {
        qku qkuVar;
        this.ak.c(6);
        this.d.c("cc_c");
        if (!aG() || (qkuVar = this.j) == null || !qkuVar.o()) {
            return;
        }
        f().b(this.j);
    }

    @Override // defpackage.adrp
    public final void at(final boolean z) {
        this.h.post(new Runnable() { // from class: adov
            @Override // java.lang.Runnable
            public final void run() {
                adoz adozVar = adoz.this;
                adozVar.f.d(z);
            }
        });
    }

    @Override // defpackage.adqy
    public final boolean au() {
        return false;
    }

    @Override // defpackage.adqy
    public final void av(boolean z) {
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final int b() {
        double d;
        qku qkuVar = this.j;
        if (qkuVar == null || !qkuVar.o()) {
            zep.m(a, "Cast session is either null or not connected.");
            return super.b();
        }
        qku qkuVar2 = this.j;
        qnm.g("Must be called from the main thread.");
        qjj qjjVar = qkuVar2.c;
        if (qjjVar != null) {
            qjz qjzVar = (qjz) qjjVar;
            qjzVar.f();
            d = qjzVar.l;
        } else {
            d = 0.0d;
        }
        return (int) (d * 100.0d);
    }

    public final synchronized aczb f() {
        if (this.p == null) {
            this.p = new adoy(this);
        }
        return this.p;
    }

    @Override // defpackage.adnt
    public final adig k() {
        return this.c;
    }
}
