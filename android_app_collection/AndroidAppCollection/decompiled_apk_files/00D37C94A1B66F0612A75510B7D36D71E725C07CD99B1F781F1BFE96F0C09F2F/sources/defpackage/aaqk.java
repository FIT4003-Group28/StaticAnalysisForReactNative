package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aaqk  reason: default package */
/* loaded from: classes.dex */
public final class aaqk extends afyl implements cfc {
    public static final /* synthetic */ int a = 0;
    private static final alzi b;
    private final azqb A;
    private final boolean B;
    private final boolean C;
    private final yjc D;
    private final yjb E;
    private final afzs F;
    private final snc G;
    private byte[] H;
    private Map I;

    /* renamed from: J  reason: collision with root package name */
    private String f22J;
    private String K;
    private boolean L;
    private boolean M;
    private final aaqs c;
    private final aoqu k;
    private final afzf l;
    private final afvy m;
    private final Set n;
    private final Set q;
    private final Set r;
    private final aapv s;
    private final afsm t;
    private final String u;
    private final String v;
    private final aadd w;
    private final aaqr x;
    private final boolean y;
    private final afvn z;

    static {
        alzh c = alzi.b.c();
        alzh c2 = alzi.b.c();
        c2.e(22, alzi.a);
        c.e(1, c2.a());
        b = c.a();
    }

    public aaqk(aaqs aaqsVar, aoqu aoquVar, afzf afzfVar, afvy afvyVar, Set set, Set set2, Set set3, afsm afsmVar, String str, String str2, ytz ytzVar, boolean z, boolean z2, snc sncVar, afvn afvnVar, aadd aaddVar, aapv aapvVar, boolean z3, azqb azqbVar, yjc yjcVar, yjb yjbVar, afzs afzsVar, aaqr aaqrVar) {
        super(ytzVar, new afsj(afzfVar, afsmVar), !aaqsVar.o());
        this.L = false;
        this.M = false;
        aaqsVar.getClass();
        this.c = aaqsVar;
        this.k = aoquVar;
        afzfVar.getClass();
        this.l = afzfVar;
        this.m = afvyVar;
        this.n = set;
        this.q = set2;
        this.r = set3;
        this.t = afsmVar;
        this.u = str;
        this.v = str2;
        this.w = aaddVar;
        this.x = aaqrVar;
        if (ytzVar == ytz.IMMEDIATE) {
            s();
        }
        this.B = z;
        this.C = z2;
        this.G = sncVar;
        this.z = afvnVar;
        this.f = this;
        this.s = aapvVar;
        this.y = z3;
        this.A = azqbVar;
        yjcVar.getClass();
        this.D = yjcVar;
        yjbVar.getClass();
        this.E = yjbVar;
        this.F = afzsVar;
    }

    private final aapq C() {
        aapq aapqVar = new aapq();
        aapqVar.b(0);
        aapqVar.a = 0L;
        aapqVar.b = this.c.m;
        aapqVar.c = Integer.valueOf(a());
        amuk f = this.c.f();
        if (f != null) {
            aapqVar.d = f;
            return aapqVar;
        }
        throw new NullPointerException("Null networkHealthAnnotations");
    }

    private final aoqu D() {
        aoqt a2 = this.c.a();
        aopa s = this.c.s();
        if (this.y) {
            ((aapo) this.A.get()).b(s);
        }
        return ((aoqt) this.D.a(a2, s)).mo39build();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, aoqu] */
    private static final aoqu E(byte[] bArr, aorb aorbVar) {
        return aorbVar.n(bArr, aoos.b());
    }

    public final boolean A() {
        return this.c.h;
    }

    @Override // defpackage.cfc
    public final int a() {
        return (int) this.x.c.a;
    }

    @Override // defpackage.cfc
    public final int b() {
        return (int) this.x.c.a();
    }

    @Override // defpackage.cfc
    public final void c(cff cffVar) {
        afvy afvyVar;
        boolean z = cffVar instanceof ceq;
        if (!z) {
            aaqr aaqrVar = this.x;
            if ((!yhq.a(cffVar) && !aaqrVar.a.a(cffVar)) || !h()) {
                throw cffVar;
            }
            z = false;
        }
        if (this.x.c.b()) {
            if (z) {
                if (!this.M) {
                    afvm e = e();
                    if (!e.z() && (afvyVar = this.m) != null) {
                        this.I = null;
                        afvyVar.a(e).b(e);
                    }
                    this.M = true;
                } else {
                    throw cffVar;
                }
            }
            if (this.x.b()) {
                this.f22J = null;
                this.I = null;
            }
            this.L = true;
            return;
        }
        throw cffVar;
    }

    @Override // defpackage.yua
    public final cff d(cff cffVar) {
        aapq aapqVar;
        if (this.C) {
            p((aapr) k(aapr.class));
            aapqVar = C();
        } else {
            aapqVar = null;
        }
        if (cffVar instanceof cfd) {
            zgg zggVar = new zgg(cffVar);
            if (this.C) {
                aaqu aaquVar = new aaqu();
                aaquVar.a = Integer.valueOf(zggVar.c.b);
                for (aono aonoVar : zggVar.b()) {
                    String str = aonoVar.b;
                    if (str != null) {
                        if (aaquVar.b == null) {
                            aaquVar.b = amuk.f();
                        }
                        aaquVar.b.h(str);
                    }
                }
                amuf amufVar = aaquVar.b;
                if (amufVar != null) {
                    aaquVar.c = amufVar.g();
                } else if (aaquVar.c == null) {
                    aaquVar.c = amuk.q();
                }
                Integer num = aaquVar.a;
                if (num == null) {
                    throw new IllegalStateException("Missing required properties: rpcStatusCode");
                }
                aapqVar.e = new aaqv(num.intValue(), aaquVar.c);
            }
            cffVar = zggVar;
        }
        if (this.C) {
            r(aapqVar.a());
        }
        return cffVar;
    }

    @Override // defpackage.afyl, defpackage.afye
    public final afvm e() {
        return this.c.n;
    }

    @Override // defpackage.yua
    public final Map f() {
        if (this.I == null) {
            HashMap hashMap = new HashMap();
            this.I = hashMap;
            hashMap.put("Content-Type", "application/x-protobuf");
            this.I.put("X-GOOG-API-FORMAT-VERSION", "2");
            if (!z()) {
                this.F.a(t());
            }
            for (afxq afxqVar : this.n) {
                afxqVar.b(this.I, this);
            }
        }
        return this.I;
    }

    @Override // defpackage.yua
    public final boolean h() {
        return this.c.i;
    }

    @Override // defpackage.yua
    public final Optional j() {
        return this.c.o;
    }

    @Override // defpackage.yua
    public final String l() {
        if (this.K == null) {
            String b2 = this.c.b();
            if ("NO_CACHE_KEY_VALUE".equals(b2)) {
                b2 = t();
            }
            this.K = b2;
        }
        return this.K;
    }

    @Override // defpackage.yua
    public final String m() {
        return t();
    }

    @Override // defpackage.yua
    public final byte[] qA() {
        if (this.H == null) {
            aaqs aaqsVar = this.c;
            aaqsVar.c();
            if (aaqsVar.g != null) {
                this.H = D().toByteArray();
            } else {
                throw new IllegalArgumentException("Must set clickTrackingParams.");
            }
        }
        return this.H;
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        cew cewVar2 = cewVar;
        ylr.b();
        try {
            this.l.kW();
            long d = this.G.d();
            yre yreVar = this.c.p;
            if (yreVar != null) {
                yreVar.d();
            }
            aoqu E = E(cewVar2.b, this.k.getParserForType());
            final arpa arpaVar = (arpa) this.E.a(E);
            long d2 = this.G.d();
            if (yreVar != null) {
                yreVar.c();
            }
            byte[] bArr = cewVar2.b;
            if (this.y) {
                try {
                    ((aapo) this.A.get()).a(this.c.s(), arpaVar);
                    abgd a2 = abgd.a(aoog.O(cewVar2.b), b);
                    byte[] bArr2 = new byte[a2.b];
                    a2.b(aool.ak(bArr2));
                    bArr = bArr2;
                } catch (IOException unused) {
                    zep.b("Failed rewriting consistency token");
                    bArr = cewVar2.b;
                }
            }
            String d3 = this.z.c().d();
            String d4 = this.c.n.d();
            athe atheVar = this.w.a().f;
            if (atheVar == null) {
                atheVar = athe.a;
            }
            if (!atheVar.b || !this.c.n() || d3.equals(d4) || this.c.m()) {
                if (arpaVar != null) {
                    for (aaqx aaqxVar : this.r) {
                        if (aaqxVar.e(this.c)) {
                            aaqxVar.c(arpaVar);
                        }
                    }
                }
                if (!B(cewVar)) {
                    this.s.b(this.c.n, E, bArr, new amqo() { // from class: aaqg
                        @Override // defpackage.amqo
                        public final Object get() {
                            arpa arpaVar2 = arpa.this;
                            int i = aaqk.a;
                            return arpaVar2;
                        }
                    });
                    if (!afyl.B(cewVar)) {
                        amuk q = amuk.q();
                        if (cewVar2.d != null) {
                            amuf amufVar = new amuf();
                            amufVar.j(cewVar2.d);
                            amufVar.h(afyl.p);
                            q = amufVar.g();
                        }
                        cewVar2 = new cew(cewVar2.a, cewVar2.b, cewVar2.e, cewVar2.f, q);
                    }
                }
                cer f = this.c.p() ? abga.f(bArr, cewVar2.c, arpaVar) : null;
                int i = 0;
                this.c.h = f == null ? false : TextUtils.equals((CharSequence) f.g.get("X-YouTube-cache-hit"), "true");
                cfb b2 = cfb.b(E, f);
                if (this.C) {
                    p((aapr) k(aapr.class));
                    aapq C = C();
                    C.a = Long.valueOf(d2 - d);
                    byte[] bArr3 = cewVar2.b;
                    if (bArr3 != null) {
                        i = bArr3.length;
                    }
                    C.b(i);
                    r(C.a());
                }
                return b2;
            }
            return cfb.a(new ceq("Authentication changed while request was being made"));
        } catch (aopx e) {
            zep.d("Failed while attempting to deserialize network response", e);
            return cfb.a(new cey(e));
        }
    }

    public final String t() {
        Uri uri;
        if (this.f22J == null) {
            String str = this.c.m;
            if (this.B) {
                uri = (Uri) anlz.z(this.t.a());
            } else {
                uri = (Uri) anlz.z(this.t.b());
            }
            Uri.Builder appendQueryParameter = uri.buildUpon().appendEncodedPath(this.t.f()).appendEncodedPath(str).appendQueryParameter("key", this.u);
            if (!TextUtils.isEmpty(this.v)) {
                appendQueryParameter.appendQueryParameter("asig", this.v);
            }
            for (afyd afydVar : this.q) {
                this.c.h();
                afydVar.a();
            }
            for (Map.Entry entry : this.c.h().entrySet()) {
                appendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            if (this.L) {
                aaqr aaqrVar = this.x;
                if (aaqrVar.b()) {
                    aaqrVar.b.a(appendQueryParameter);
                }
            }
            this.f22J = appendQueryParameter.build().toString();
        }
        return this.f22J;
    }

    @Override // defpackage.afyl, defpackage.afye
    public final String u() {
        return this.c.l;
    }

    @Override // defpackage.afyl
    public final List v() {
        String str;
        ArrayList arrayList = new ArrayList();
        String simpleName = D().getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 15);
        sb.append("Request type: ");
        sb.append(simpleName);
        sb.append("\n");
        arrayList.add(sb.toString());
        if (!this.c.o()) {
            str = "CACHE READ DISABLED";
        } else {
            str = !this.c.p() ? "CACHE DISABLED" : A() ? "CACHE HIT" : "CACHE MISS";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 9);
        sb2.append("Cached: ");
        sb2.append(str);
        sb2.append("\n");
        arrayList.add(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        try {
            sb3.append("curl ");
            Map f = f();
            for (String str2 : f.keySet()) {
                if (!str2.equals("Content-Type")) {
                    String str3 = (String) f.get(str2);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str3).length());
                    sb4.append("-H \"");
                    sb4.append(str2);
                    sb4.append(":");
                    sb4.append(str3);
                    sb4.append("\" ");
                    sb3.append(sb4.toString());
                }
            }
        } catch (ceq e) {
            zep.i("Curl command line not available", e);
        }
        String jSONObject = aaji.d(D()).toString();
        sb3.append("-H \"Content-Type:application/json\" -d '");
        sb3.append(jSONObject.replace("'", "'\\''"));
        sb3.append("' '");
        sb3.append(t().replace("'", "'\\''"));
        sb3.append('\'');
        arrayList.addAll(zgh.q(sb3.toString()));
        return arrayList;
    }

    @Override // defpackage.afyl
    public final synchronized List w(cew cewVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String name = this.k.getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 16);
        sb.append("Response type: ");
        sb.append(name);
        sb.append("\n");
        arrayList.add(sb.toString());
        int i = cewVar.a;
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("Status: ");
        sb2.append(i);
        sb2.append("\n");
        arrayList.add(sb2.toString());
        boolean z = this.c.h;
        StringBuilder sb3 = new StringBuilder(14);
        sb3.append("Cached: ");
        sb3.append(z);
        sb3.append("\n");
        arrayList.add(sb3.toString());
        for (String str : cewVar.c.keySet()) {
            String str2 = (String) cewVar.c.get(str);
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length());
            sb4.append("Header:");
            sb4.append(str);
            sb4.append(":");
            sb4.append(str2);
            sb4.append("\n");
            arrayList.add(sb4.toString());
        }
        if (cewVar.a == 200) {
            try {
                int length = cewVar.b.length;
                StringBuilder sb5 = new StringBuilder(46);
                sb5.append("Actual response length (as proto): ");
                sb5.append(length);
                arrayList.add(sb5.toString());
                arrayList.addAll(zgh.q(aaji.d(E(cewVar.b, this.k.getParserForType())).toString()));
            } catch (aopx e) {
                arrayList.add("Could not parse response. See earlier logcat.");
                zep.d("Could not parse response", e);
            }
        } else {
            String str3 = new String(cewVar.b);
            arrayList.add(str3.length() != 0 ? "Error response: ".concat(str3) : new String("Error response: "));
        }
        return arrayList;
    }

    @Override // defpackage.yua
    /* renamed from: x */
    public final void qz(aoqu aoquVar) {
        y();
        this.l.lG(aoquVar);
    }

    public final void y() {
        this.H = null;
    }

    @Override // defpackage.afyl, defpackage.afye
    public final boolean z() {
        return this.c.m();
    }
}
