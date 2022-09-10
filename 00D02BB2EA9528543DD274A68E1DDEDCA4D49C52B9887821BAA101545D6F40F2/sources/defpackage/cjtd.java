package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cjtd  reason: default package */
/* loaded from: classes.dex */
public class cjtd implements Serializable {
    public static final dcqe a = dcqe.c("cjtd");
    public static final cjtd b = new cjtd();
    public static final cjtd c = new cjtd();
    @dzsi
    public final String d;
    @dzsi
    @Deprecated
    public final String e;
    @dzsi
    public final String f;
    @dzsi
    public final ddho g;
    @dzsi
    public final dvnp h;
    @dzsi
    public final decs i;
    public final boolean j;
    public final cjtc k;
    @dzsi
    public final String l;
    @dzsi
    public final cjsa m;
    @dzsi
    private final bvrt<deab> n;
    private final bvrt<ddev> o;

    public cjtd() {
        this(null, null, null, null, null, ddev.u, null, null, false, null, cjtc.g().a(), null);
    }

    public static cjtd a(ddho ddhoVar) {
        cjta b2 = b();
        b2.d = ddhoVar;
        return b2.a();
    }

    public static cjta b() {
        return new cjta();
    }

    public static cjta c(@dzsi cjtd cjtdVar) {
        if (cjtdVar == null) {
            return new cjta();
        }
        cjta b2 = b();
        b2.a = cjtdVar.d();
        b2.g(cjtdVar.d);
        b2.b = cjtdVar.e;
        b2.c = cjtdVar.f;
        ddev e = cjtdVar.e();
        if (e != null) {
            dsqp dsqpVar = (dsqp) e.cu(5);
            dsqpVar.bC(e);
            b2.e = (ddeu) dsqpVar;
        }
        b2.f = cjtdVar.h;
        b2.i = cjtdVar.m;
        b2.w(cjtdVar.f());
        b2.i(cjtdVar.g());
        b2.j(cjtdVar.h());
        b2.r(cjtdVar.i());
        b2.v(cjtdVar.j());
        b2.s(cjtdVar.k());
        b2.g = cjtdVar.i;
        ddho ddhoVar = cjtdVar.g;
        if (ddhoVar != null) {
            b2.d = ddhoVar;
        }
        return b2;
    }

    @dzsi
    public final deab d() {
        return (deab) bvrt.f(this.n, (dssr) deab.c.cu(7), deab.c);
    }

    public final ddev e() {
        return this.o.e((dssr) ddev.u.cu(7), ddev.u);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof cjtd) {
            cjtd cjtdVar = (cjtd) obj;
            if (dbsd.a(this.n, cjtdVar.n) && dbsd.a(this.d, cjtdVar.d) && dbsd.a(this.e, cjtdVar.e) && dbsd.a(this.f, cjtdVar.f) && dbsd.a(this.g, cjtdVar.g) && dbsd.a(e(), cjtdVar.e()) && this.h == cjtdVar.h && dbsd.a(this.i, cjtdVar.i) && dbsd.a(Boolean.valueOf(this.j), Boolean.valueOf(cjtdVar.j)) && dbsd.a(this.m, cjtdVar.m) && dbsd.a(this.k, cjtdVar.k) && dbsd.a(this.l, cjtdVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final ddhj f() {
        return this.k.a();
    }

    public final int g() {
        return this.k.b();
    }

    @dzsi
    public final dddg h() {
        return (dddg) bvrt.f(this.k.c(), (dssr) dddg.g.cu(7), dddg.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{d(), this.d, this.e, this.f, this.g, e(), this.h, this.i, Boolean.valueOf(this.j), this.m, this.k, this.l});
    }

    @dzsi
    public final ddzg i() {
        return (ddzg) bvrt.f(this.k.d(), (dssr) ddzg.t.cu(7), ddzg.t);
    }

    @dzsi
    public final ddgy j() {
        return (ddgy) bvrt.f(this.k.e(), (dssr) ddgy.d.cu(7), ddgy.d);
    }

    @dzsi
    public final ddet k() {
        return (ddet) bvrt.f(this.k.f(), (dssr) ddet.D.cu(7), ddet.D);
    }

    public final boolean l() {
        return !dbsj.d(this.d) || !dbsj.d(this.e) || this.g != null;
    }

    public final String toString() {
        ddev e = e();
        dbsb d = dbsc.d("Ue3LoggingCommonParams");
        d.c();
        d.b("uiState", d());
        String str = this.d;
        ddxx c2 = cjrx.c(str);
        if (c2 != null) {
            ddho d2 = cjth.d(c2.d);
            str = c2.d == d2.b() ? Integer.toString(c2.d) : String.format(Locale.US, "[%d] %d", Integer.valueOf(c2.d), Integer.valueOf(d2.b()));
        }
        d.b("dataElement", str);
        d.b("serverEi", this.e);
        d.b("splitEventDataReference", this.f);
        ddho ddhoVar = this.g;
        ddmq ddmqVar = null;
        d.b("visualElement", ddhoVar == null ? null : Integer.toString(ddhoVar.b()));
        ddjj ddjjVar = e.c;
        if (ddjjVar == null) {
            ddjjVar = ddjj.c;
        }
        d.b("adRedirectUrl", dbsj.f(ddjjVar.b));
        d.b("prefetchUpgradeType", this.h);
        d.b("clickFeatureFingerprint", this.i);
        d.b("clickFeatureFingerprintScrubbed", this.j ? true : null);
        d.b("forcedExternalContext", this.m);
        d.b("impressionParams", this.k);
        d.b("notificationMetadata", this.l);
        if ((e.a & 128) != 0 && (ddmqVar = e.h) == null) {
            ddmqVar = ddmq.d;
        }
        d.b("bottomSheetParams", ddmqVar);
        return d.toString();
    }

    public cjtd(deab deabVar, String str, String str2, String str3, ddho ddhoVar, ddev ddevVar, dvnp dvnpVar, decs decsVar, boolean z, cjsa cjsaVar, cjtc cjtcVar, String str4) {
        this.n = bvrt.a(deabVar);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = ddhoVar;
        this.o = bvrt.b(ddevVar);
        this.h = dvnpVar;
        this.i = decsVar;
        this.j = z;
        this.m = cjsaVar;
        this.k = cjtcVar;
        this.l = str4;
    }
}
