package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Random;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acvf  reason: default package */
/* loaded from: classes.dex */
public final class acvf implements acvh {
    private final zfq a;
    private final snc b;
    private final acrr c;
    private final SharedPreferences d;
    private final acve e;
    private final Executor f;
    private final ConcurrentHashMap g;

    public acvf(SharedPreferences sharedPreferences, zfq zfqVar, snc sncVar, acrr acrrVar, Executor executor) {
        sharedPreferences.getClass();
        this.d = sharedPreferences;
        zfqVar.getClass();
        this.a = zfqVar;
        sncVar.getClass();
        this.b = sncVar;
        acrrVar.getClass();
        this.c = acrrVar;
        this.e = new acve(k(), sncVar);
        this.g = new ConcurrentHashMap();
        this.f = anlz.g(executor);
    }

    private final String v(asny asnyVar) {
        jj jjVar = new jj(asnyVar, "");
        String str = (String) this.g.get(jjVar);
        if (str == null) {
            String d = d();
            String str2 = (String) this.g.putIfAbsent(jjVar, d);
            return str2 == null ? d : str2;
        }
        return str;
    }

    private final void w(asny asnyVar, int i, String str, asnr asnrVar) {
        if (TextUtils.isEmpty(str)) {
            str = v(asnyVar);
        }
        aopa mo52toBuilder = asnrVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        asnr asnrVar2 = (asnr) mo52toBuilder.instance;
        str.getClass();
        asnrVar2.b |= 2;
        asnrVar2.d = str;
        mo52toBuilder.copyOnWrite();
        asnr asnrVar3 = (asnr) mo52toBuilder.instance;
        asnrVar3.b |= 32;
        asnrVar3.h = i;
        asnr asnrVar4 = (asnr) mo52toBuilder.mo39build();
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cG(asnrVar4);
        this.c.c((arrh) a.mo39build());
        acve acveVar = this.e;
        if (acveVar.a) {
            String str2 = asnrVar4.c;
            String str3 = asnrVar4.d;
            long j = asnrVar4.f;
            long j2 = asnrVar4.e;
            asnx asnxVar = asnrVar4.g;
            if (asnxVar == null) {
                asnxVar = asnx.a;
            }
            String str4 = asnxVar.d;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 102 + String.valueOf(str3).length() + String.valueOf(str4).length());
            sb.append("logActionSpan: ");
            sb.append(str2);
            sb.append(", CAN ");
            sb.append(str3);
            sb.append(", Start Time ");
            sb.append(j);
            sb.append(", Span Length ");
            sb.append(j2);
            sb.append(", request URL ");
            sb.append(str4);
            acveVar.a(sb.toString());
        }
    }

    @Override // defpackage.acvh
    public final int a() {
        return new Random().nextInt(Integer.MAX_VALUE);
    }

    @Override // defpackage.acvh
    public final acvg b(asny asnyVar) {
        acvg c = c(asnyVar);
        c.e();
        return c;
    }

    @Override // defpackage.acvh
    public final acvg c(asny asnyVar) {
        return new acvb(this, this.b, asnyVar, d(), ampq.i(null), k());
    }

    @Override // defpackage.acvh
    public final String d() {
        return this.a.b(16);
    }

    @Override // defpackage.acvh
    public final void e(asno asnoVar) {
        f(asnoVar, -1L);
    }

    public final void f(asno asnoVar, long j) {
        if (TextUtils.isEmpty(asnoVar.e)) {
            this.e.c("logActionInfo");
            return;
        }
        if (j < 0) {
            j = this.b.c();
        }
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cF(asnoVar);
        this.c.f((arrh) a.mo39build(), j);
        acve acveVar = this.e;
        if (!acveVar.a) {
            return;
        }
        String str = asnoVar.e;
        asny b = asny.b(asnoVar.d);
        if (b == null) {
            b = asny.LATENCY_ACTION_UNKNOWN;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(valueOf).length());
        sb.append("logActionInfo: ");
        sb.append(str);
        sb.append(", action ");
        sb.append(valueOf);
        acveVar.a(sb.toString());
    }

    @Override // defpackage.acvh
    public final void g(asno asnoVar) {
        this.f.execute(new acvd(this, asnoVar, this.b.c()));
    }

    @Override // defpackage.acvh
    public final void h(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            this.e.c("logBaseline");
            return;
        }
        aopa createBuilder = asnn.a.createBuilder();
        createBuilder.copyOnWrite();
        asnn asnnVar = (asnn) createBuilder.instance;
        str.getClass();
        asnnVar.b |= 1;
        asnnVar.c = str;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cE((asnn) createBuilder.mo39build());
        this.c.f((arrh) a.mo39build(), j);
        acve acveVar = this.e;
        if (!acveVar.a) {
            return;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("logBaseline ");
        sb.append(j);
        acveVar.b(str, sb.toString());
    }

    @Override // defpackage.acvh
    public final void i(String str) {
        this.f.execute(new acvc(this, str, this.b.c()));
    }

    @Override // defpackage.acvh
    public final void j(String str, String str2, long j) {
        if (TextUtils.isEmpty(str2)) {
            acve acveVar = this.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
            sb.append("logTick(");
            sb.append(str);
            sb.append(")");
            acveVar.c(sb.toString());
            return;
        }
        aopa createBuilder = asns.a.createBuilder();
        createBuilder.copyOnWrite();
        asns asnsVar = (asns) createBuilder.instance;
        str.getClass();
        asnsVar.b |= 1;
        asnsVar.c = str;
        createBuilder.copyOnWrite();
        asns asnsVar2 = (asns) createBuilder.instance;
        str2.getClass();
        asnsVar2.b |= 2;
        asnsVar2.d = str2;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cH((asns) createBuilder.mo39build());
        this.c.f((arrh) a.mo39build(), j);
        acve acveVar2 = this.e;
        if (!acveVar2.a) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length());
        sb2.append("logTick: ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(j);
        acveVar2.b(str2, sb2.toString());
    }

    protected final boolean k() {
        return this.d.getBoolean("DebugCsiGelLogging", false);
    }

    @Override // defpackage.acvh
    public final void l(asny asnyVar) {
        String str = (String) this.g.remove(new jj(asnyVar, ""));
        acve acveVar = this.e;
        if (acveVar.a) {
            if (str == null) {
                String valueOf = String.valueOf(asnyVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79);
                sb.append("Attempted to clearActionNonce, didn't exist. actionType=[");
                sb.append(valueOf);
                sb.append("], actionDescriptor=[]");
                acveVar.a(sb.toString());
                return;
            }
            long d = acveVar.d(asnyVar);
            String valueOf2 = String.valueOf(asnyVar);
            String e = acve.e(acveVar.b.c(), d);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51 + String.valueOf(e).length());
            sb2.append("clearActionNonce actionType=[");
            sb2.append(valueOf2);
            sb2.append("] actionDescriptor=[] ");
            sb2.append(e);
            acveVar.b(str, sb2.toString());
        }
    }

    @Override // defpackage.acvh
    public final boolean m(asny asnyVar) {
        return this.g.containsKey(new jj(asnyVar, ""));
    }

    @Override // defpackage.acvh
    public final void n(asny asnyVar, asno asnoVar) {
        aopa mo52toBuilder = asnoVar.mo52toBuilder();
        String v = v(asnyVar);
        mo52toBuilder.copyOnWrite();
        asno asnoVar2 = (asno) mo52toBuilder.instance;
        v.getClass();
        asnoVar2.b |= 2;
        asnoVar2.e = v;
        e((asno) mo52toBuilder.mo39build());
    }

    @Override // defpackage.acvh
    public final void o(asny asnyVar, int i, String str, asnr asnrVar) {
        if (i < 0 || asnrVar == null || asnrVar.c.isEmpty() || asnrVar.e <= 0) {
            return;
        }
        w(asnyVar, i, str, asnrVar);
    }

    @Override // defpackage.acvh
    public final void p(asny asnyVar, asnr asnrVar) {
        if (asnrVar == null || asnrVar.c.isEmpty() || asnrVar.e <= 0) {
            return;
        }
        w(asnyVar, a(), "", asnrVar);
    }

    @Override // defpackage.acvh
    public final void q(asny asnyVar) {
        r(asnyVar, this.b.c());
    }

    @Override // defpackage.acvh
    public final void r(asny asnyVar, long j) {
        String v = v(asnyVar);
        acve acveVar = this.e;
        if (acveVar.a) {
            acveVar.c.put(new jj(asnyVar, ""), Long.valueOf(j));
        }
        h(v, j);
        acve acveVar2 = this.e;
        if (acveVar2.a) {
            long d = acveVar2.d(asnyVar);
            String valueOf = String.valueOf(asnyVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66);
            sb.append("logBaseline actionType=[");
            sb.append(valueOf);
            sb.append("] actionDescriptor=[] ");
            sb.append(d);
            acveVar2.b(v, sb.toString());
        }
    }

    @Override // defpackage.acvh
    public final void s(asny asnyVar) {
        q(asnyVar);
        aopa createBuilder = asno.a.createBuilder();
        createBuilder.copyOnWrite();
        asno asnoVar = (asno) createBuilder.instance;
        asnoVar.d = asnyVar.bL;
        asnoVar.b |= 1;
        String v = v(asnyVar);
        createBuilder.copyOnWrite();
        asno asnoVar2 = (asno) createBuilder.instance;
        v.getClass();
        asnoVar2.b |= 2;
        asnoVar2.e = v;
        e((asno) createBuilder.mo39build());
    }

    @Override // defpackage.acvh
    public final void t(String str, asny asnyVar) {
        long c = this.b.c();
        String v = v(asnyVar);
        j(str, v, c);
        acve acveVar = this.e;
        if (!acveVar.a) {
            return;
        }
        if (v == null) {
            String valueOf = String.valueOf(asnyVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75);
            sb.append("logTick, actionNonce not found for given actionType=[");
            sb.append(valueOf);
            sb.append("], actionDescriptor=[]");
            acveVar.a(sb.toString());
            return;
        }
        long d = acveVar.d(asnyVar);
        String valueOf2 = String.valueOf(asnyVar);
        String e = acve.e(c, d);
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 54 + String.valueOf(valueOf2).length() + String.valueOf(e).length());
        sb2.append("logTick tickName=[");
        sb2.append(str);
        sb2.append("] actionType=[");
        sb2.append(valueOf2);
        sb2.append("] actionDescriptor=[] ");
        sb2.append(e);
        acveVar.b(v, sb2.toString());
    }

    @Override // defpackage.acvh
    public final void u(String str, asny asnyVar) {
        t(str, asnyVar);
        l(asnyVar);
    }
}
