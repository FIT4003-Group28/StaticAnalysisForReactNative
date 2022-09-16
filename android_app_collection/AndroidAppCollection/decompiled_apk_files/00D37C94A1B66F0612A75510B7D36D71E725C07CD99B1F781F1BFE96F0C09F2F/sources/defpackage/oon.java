package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.g;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.i;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.c;
import j$.util.Objects;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.AccessControlException;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: oon  reason: default package */
/* loaded from: classes3.dex */
public final class oon implements ooh {
    public static final Map a = new HashMap();
    protected static final Map b = new HashMap();
    public final f c;
    protected final Context d;
    public final boolean e;
    public oof f;
    public azqb g;
    public aabu h;
    public String i;
    protected final int j;
    private final String k;
    private final g l;
    private a m;
    private aapl n;

    static {
        zep.k("YouTubeAndroidPlayerAPI");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public oon(Context context, String str, f fVar, boolean z, int i) {
        this.d = context;
        this.k = str;
        this.c = fVar;
        this.e = z;
        this.j = i;
        this.l = new g(context, str, fVar);
    }

    public static int l(Exception exc) {
        if (exc instanceof zfl) {
            return 12;
        }
        return ((exc instanceof UnknownHostException) || (exc instanceof SocketException) || (exc instanceof yrc)) ? 10 : 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int m(Context context, f fVar, int i) {
        return Objects.hash(fVar.a, Integer.valueOf(i), etk.n(context));
    }

    public static void n(final ooo oooVar, Handler handler, final Context context, final String str, final String str2, final String str3, final String str4, final boolean z, final int i) {
        handler.post(new Runnable() { // from class: ooj
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Not initialized variable reg: 29, insn: 0x0263: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r29 I:??[OBJECT, ARRAY]), block:B:33:0x0263 */
            /* JADX WARN: Type inference failed for: r1v0, types: [ooj] */
            /* JADX WARN: Type inference failed for: r1v1, types: [ooo] */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4 */
            @Override // java.lang.Runnable
            public final void run() {
                f fVar;
                Integer valueOf;
                oon oonVar;
                Object obj;
                ooo oooVar2;
                Integer num;
                oon oonVar2;
                ?? r1 = this;
                Context context2 = context;
                String str5 = str;
                String str6 = str2;
                String str7 = str3;
                String str8 = str4;
                boolean z2 = z;
                int i2 = i;
                ooo oooVar3 = oooVar;
                Map map = oon.a;
                try {
                    try {
                        try {
                            fVar = new f(str6, str7, str5);
                            ylr.c();
                            int m = oon.m(context2, fVar, i2);
                            Map map2 = oon.a;
                            valueOf = Integer.valueOf(m);
                            oonVar = (oon) map2.get(valueOf);
                        } catch (Exception e) {
                            e = e;
                            r1 = oooVar3;
                        }
                        try {
                            if (oonVar == null) {
                                oon oonVar3 = new oon(context2, str8, fVar, z2, i2);
                                ylr.c();
                                if (!oonVar3.e) {
                                    num = valueOf;
                                    oooVar2 = oooVar3;
                                    oonVar2 = oonVar3;
                                    ooe M = opr.M();
                                    oonVar2.k(M);
                                    axzl.n(M.a, a.class);
                                    axzl.n(M.b, d.class);
                                    axzl.n(M.c, Context.class);
                                    axzl.n(M.d, aaay.class);
                                    axzl.n(M.e, ahfm.class);
                                    axzl.n(M.f, afsz.class);
                                    axzl.n(M.g, amup.class);
                                    axzl.n(M.h, wkn.class);
                                    axzl.n(M.i, amqo.class);
                                    oonVar2.f = new opr(M.a, new com.google.android.apps.youtube.embeddedplayer.service.util.a(), M.b, new xeu(), M.c, M.d, M.e, M.f, M.g, M.h, M.i, M.j, M.k, M.l, null, null);
                                } else {
                                    oqj M2 = oqa.M();
                                    oonVar3.k(M2);
                                    M2.m = new vwt();
                                    axzl.n(M2.a, a.class);
                                    axzl.n(M2.b, d.class);
                                    axzl.n(M2.c, Context.class);
                                    axzl.n(M2.d, aaay.class);
                                    axzl.n(M2.e, ahfm.class);
                                    axzl.n(M2.f, afsz.class);
                                    axzl.n(M2.g, amup.class);
                                    axzl.n(M2.h, wkn.class);
                                    axzl.n(M2.i, amqo.class);
                                    axzl.n(M2.m, vwk.class);
                                    oooVar2 = oooVar3;
                                    num = valueOf;
                                    oonVar2 = oonVar3;
                                    oonVar2.f = new oqa(M2.a, new com.google.android.apps.youtube.embeddedplayer.service.util.a(), M2.b, new xeu(), M2.m, M2.c, M2.d, M2.e, M2.f, M2.g, M2.h, M2.i, M2.j, M2.k, M2.l, null, null);
                                }
                                oonVar2.f.G().execute(new zel(oonVar2.f.u()));
                                oonVar2.f.y().h(oonVar2.f.G(), usw.l, null);
                                final zej t = oonVar2.f.t();
                                if (!zej.a) {
                                    t.b.execute(new Runnable() { // from class: zef
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            try {
                                                zej.this.a();
                                            } catch (IllegalStateException e2) {
                                                zep.d("GooglePlayProviderInstaller failed.", e2);
                                            }
                                        }
                                    });
                                }
                                if (oonVar2.e) {
                                    final oqk oqkVar = (oqk) oonVar2.f;
                                    oqkVar.getClass();
                                    oonVar2.g = new azqb() { // from class: ool
                                        @Override // defpackage.azqb
                                        public final Object get() {
                                            return oqk.this.O();
                                        }
                                    };
                                    oonVar2.h = oqkVar.R();
                                }
                                oonVar2.f.r().c();
                                afuw E = oonVar2.f.E();
                                afus.a(E);
                                oonVar2.f.o().g(oonVar2.f.x());
                                E.b = oonVar2.f.C().a(oonVar2.f.P());
                                E.g();
                                oonVar2.f.D().c();
                                oonVar2.f.N().c();
                                aqto i3 = pce.i(oonVar2.f.K());
                                if (oonVar2.j != 1 && i3 != null && i3.c) {
                                    oonVar2.f.e().a();
                                }
                                oonVar2.f.v().c();
                                oonVar2.j();
                                oonVar2.f.B().a();
                                String num2 = Integer.toString(oon.m(oonVar2.d, oonVar2.c, oonVar2.j));
                                if (!oon.b.containsKey(num2)) {
                                    oon.b.put(num2, oonVar2.f.J());
                                }
                                oon.a.put(num, oonVar2);
                                oonVar = oonVar2;
                            } else {
                                oooVar2 = oooVar3;
                                oonVar.j();
                            }
                            oooVar2.a(oonVar);
                        } catch (Exception e2) {
                            e = e2;
                            r1 = obj;
                            r1.b(e);
                        }
                    } catch (IllegalArgumentException e3) {
                        String message = e3.getMessage();
                        if (message != null) {
                            zep.b(message);
                        }
                        throw e3;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            }
        });
    }

    @Override // defpackage.ooh
    public final com.google.android.apps.youtube.embeddedplayer.service.csi.service.a a() {
        return this.f.c();
    }

    @Override // defpackage.ooh
    public final b b() {
        return this.f.f();
    }

    @Override // defpackage.ooh
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f c() {
        return this.f.i();
    }

    @Override // defpackage.ooh
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.g d() {
        return this.f.j();
    }

    @Override // defpackage.ooh
    public final c e() {
        return this.f.k();
    }

    @Override // defpackage.ooh
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.c f() {
        return this.f.l();
    }

    @Override // defpackage.ooh
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c g() {
        return this.f.m();
    }

    @Override // defpackage.ooh
    public final ajmy h() {
        return this.f.F();
    }

    public final void j() {
        this.f.G().execute(new Runnable() { // from class: ook
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    oon.this.f.z().a();
                } catch (aart unused) {
                    aqvb.k("Failed to retrieve configs on init", new Object[0]);
                }
            }
        });
    }

    public final void k(opi opiVar) {
        String num = Integer.toString(m(this.d, this.c, this.j));
        ahfl a2 = ahfm.a();
        a2.d(new zgz() { // from class: ooi
            @Override // defpackage.zgz
            public final Object a() {
                return oon.this.i;
            }
        });
        a2.b();
        a2.c(true);
        opiVar.j(a2.a());
        i iVar = new i(this.e, this.c);
        afsy afsyVar = new afsy();
        afsyVar.a = iVar;
        afsyVar.b = afss.ANDROID_EMBEDDED_PLAYER;
        afsyVar.c = new oom(this);
        afsyVar.d = new oom(this, 1);
        opiVar.h(afsyVar.a());
        opiVar.f(acqy.a);
        opiVar.d(this.d);
        this.n = new aapl(this.d, 1);
        aaax aaaxVar = new aaax();
        aaaxVar.c = arov.ANDROID_EMBEDDED_PLAYER;
        aaaxVar.d = this.n;
        opiVar.g(aaaxVar.a());
        opiVar.l(this.l);
        wkm a3 = wkn.a(alyz.a(this.d));
        a3.b(true);
        a3.c(true);
        a3.e(true);
        a3.d(true);
        a3.f(true);
        opiVar.b(a3.a());
        if (this.m == null) {
            this.m = new a(this.c, this.k);
        }
        opiVar.c(this.m);
        opiVar.e((CronetEngine) b.get(num));
        opiVar.i(String.valueOf(num).concat("_partition"));
        f fVar = this.c;
        int hashCode = fVar.a.hashCode();
        int hashCode2 = fVar.c.hashCode();
        StringBuilder sb = new StringBuilder(20);
        sb.append(((hashCode + 527) * 31) + hashCode2);
        sb.append("_ep_prefs");
        opiVar.k(sb.toString());
        Context context = this.d;
        f fVar2 = this.c;
        opiVar.a(new d(new com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c(context, fVar2.c, fVar2.a)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [wge, java.lang.Object] */
    @Override // defpackage.ooh
    public final void i(String str, afwa afwaVar) {
        azqb azqbVar;
        if (!this.e || (azqbVar = this.g) == null) {
            throw new AccessControlException("Permission denied: unauthorized usage of SignIn API");
        }
        azqbVar.get().n(str, afwaVar);
    }
}
