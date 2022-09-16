package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: aeks  reason: default package */
/* loaded from: classes.dex */
public final class aeks implements aenm, aelb {
    private final aeln A;
    private final aell B;
    private final ampq C;
    private final ampq D;
    private final amqo F;
    private final Set G;
    private aenr H;
    private boolean I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f36J;
    private final afjz L;
    public final aems a;
    public final ScheduledExecutorService b;
    public final aadd c;
    public final atts d;
    public final aekr e;
    public final ankt f;
    public final aela g;
    public final snc h;
    public boolean j;
    public ayny k;
    public Uri l;
    public final aenv m;
    public final aflm n;
    private final aanr o;
    private final aeaf p;
    private final adzz q;
    private final atb r;
    private final ScheduledExecutorService s;
    private final aant t;
    private final aekg u;
    private final afjm v;
    private final aelq w;
    private final List x;
    private final StringBuilder y;
    private final afkd z;
    private final AtomicBoolean E = new AtomicBoolean(false);
    public final AtomicLong i = new AtomicLong(0);
    private boolean K = false;

    public aeks(aanr aanrVar, aems aemsVar, aeaf aeafVar, adzz adzzVar, atb atbVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, aant aantVar, aekg aekgVar, afjm afjmVar, aelq aelqVar, aadd aaddVar, aacz aaczVar, afjz afjzVar, afkd afkdVar, aeln aelnVar, amqo amqoVar, aenv aenvVar, aflm aflmVar, aela aelaVar, snc sncVar, aell aellVar, ampq ampqVar, ampq ampqVar2) {
        this.o = aanrVar;
        afms.a(aemsVar);
        this.a = aemsVar;
        afms.a(aeafVar);
        this.p = aeafVar;
        afms.a(adzzVar);
        this.q = adzzVar;
        afms.a(atbVar);
        this.r = atbVar;
        afms.a(scheduledExecutorService);
        this.b = scheduledExecutorService;
        afms.a(scheduledExecutorService2);
        this.s = scheduledExecutorService2;
        this.t = aantVar;
        this.u = aekgVar;
        afms.a(afjmVar);
        this.v = afjmVar;
        afms.a(aaddVar);
        this.c = aaddVar;
        this.x = new ArrayList();
        this.y = new StringBuilder();
        afms.a(afjzVar);
        this.L = afjzVar;
        this.w = aelqVar;
        this.z = afkdVar;
        this.A = aelnVar;
        this.m = aenvVar;
        this.n = aflmVar;
        final aekr aekrVar = new aekr();
        this.e = aekrVar;
        this.f = aed.c(new agr() { // from class: aekj
            @Override // defpackage.agr
            public final Object a(agp agpVar) {
                aekr.this.a = agpVar;
                return "Onesie response future.";
            }
        });
        this.g = aelaVar;
        this.F = amqoVar;
        this.h = sncVar;
        this.G = new HashSet();
        this.B = aellVar;
        this.C = ampqVar;
        this.D = ampqVar2;
        afms.a(aaczVar);
        atfw atfwVar = aaczVar.b().k;
        atts attsVar = (atfwVar == null ? atfw.a : atfwVar).s;
        this.d = attsVar == null ? atts.b : attsVar;
    }

    private static Uri o(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? uri.buildUpon().appendQueryParameter("cpn", str).build() : uri;
    }

    private final aeko p(afjm afjmVar, Uri uri) {
        return new aeko(afjmVar, uri, this.t);
    }

    private final aoob q() {
        return r().k;
    }

    private final attv r() {
        arhd a = this.c.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            attv attvVar = atdyVar.d;
            return attvVar == null ? attv.a : attvVar;
        }
        return attv.a;
    }

    private final String s(aekg aekgVar, aenx aenxVar) {
        String str = "1";
        String str2 = aekgVar == null ? str : "0";
        if (aenxVar != null) {
            str = "0";
        }
        StringBuilder sb = new StringBuilder(str2.length() + 15 + str.length());
        sb.append("b.null:");
        sb.append(str2);
        sb.append(";p.null:");
        sb.append(str);
        String sb2 = sb.toString();
        if (aekgVar != null) {
            String str3 = aekgVar.l;
            long b = aekgVar.b();
            long d = this.h.d();
            long j = aekgVar.h;
            long d2 = this.h.d();
            long j2 = aekgVar.g;
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 76 + String.valueOf(str3).length());
            sb3.append(sb2);
            sb3.append(";sr:");
            sb3.append(str3);
            sb3.append(";bd.");
            sb3.append(b);
            sb3.append(";st.");
            sb3.append(d - j);
            sb3.append(";ct.");
            sb3.append(d2 - j2);
            return sb3.toString();
        }
        return sb2;
    }

    private final List t() {
        arhd a = this.c.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            attv attvVar = atdyVar.d;
            if (attvVar == null) {
                attvVar = attv.a;
            }
            attt atttVar = attvVar.g;
            if (atttVar == null) {
                atttVar = attt.b;
            }
            return atttVar.e;
        }
        return amuk.q();
    }

    private static void u(ati atiVar, aanr aanrVar) {
        atiVar.l();
        for (Map.Entry entry : aanrVar.c.entrySet()) {
            atiVar.m((String) entry.getKey(), (String) entry.getValue());
        }
    }

    private final synchronized void v(Exception exc, boolean z) {
        if (!(exc instanceof aeht) || ((aeht) exc).a != 5) {
            this.m.c("response.parse", exc);
        } else {
            Throwable cause = exc.getCause();
            if (cause instanceof IOException) {
                this.m.b((IOException) cause);
            } else {
                this.m.c("net", exc);
            }
        }
        this.n.U();
        afki afkiVar = afki.ONESIE;
        Object[] objArr = new Object[2];
        objArr[0] = true != z ? "Non-fatal" : "Fatal";
        objArr[1] = exc.toString();
        afkj.c(afkiVar, exc, "%s error occurred during Onesie request. Details: %s", objArr);
        if ((exc.getCause() instanceof ate) && (exc.getCause().getCause() instanceof SocketTimeoutException)) {
            ayny aynyVar = this.k;
            if (aynyVar != null) {
                aynyVar.so(exc);
            }
            i();
        } else if (!z) {
        } else {
            ayny aynyVar2 = this.k;
            if (aynyVar2 != null) {
                aynyVar2.so(exc);
            }
            b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean w(defpackage.adzz r8, java.util.List r9, long r10) {
        /*
            java.util.Iterator r9 = r9.iterator()
        L4:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r9.next()
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel r0 = (com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel) r0
            java.lang.String r2 = r0.b
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L2e
            int r3 = r0.e()
            java.lang.String r4 = r0.w()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r0.toMicros(r10)
            r7 = 1
            r1 = r8
            boolean r0 = r1.g(r2, r3, r4, r5, r7)
            if (r0 != 0) goto L4
        L2e:
            r8 = 0
            return r8
        L30:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeks.w(adzz, java.util.List, long):boolean");
    }

    private final ati x(afjz afjzVar, aenx aenxVar) {
        ati a = this.r.a();
        int i = afjzVar.p().o;
        aelv aelvVar = new aelv(a, this.r, new aelu(this.u, a()), this.b, this.n, aenxVar != null ? Math.max(i, (int) Math.ceil(afjzVar.p().p * aenxVar.b)) : i);
        if (afjzVar.q().m) {
            final aelq aelqVar = this.w;
            return new aelr(aelvVar, this.m, this.n, aelqVar.a, aelqVar.b, aelqVar.c, aelqVar.d, new afls(new amqo() { // from class: aelp
                @Override // defpackage.amqo
                public final Object get() {
                    afjz afjzVar2 = aelq.this.e;
                    if ((afjzVar2.q().b & 524288) != 0) {
                        aqxk aqxkVar = afjzVar2.q().n;
                        return aqxkVar == null ? aqxk.a : aqxkVar;
                    }
                    aopa createBuilder = aqxk.a.createBuilder();
                    createBuilder.copyOnWrite();
                    aqxk aqxkVar2 = (aqxk) createBuilder.instance;
                    aqxkVar2.b |= 1;
                    aqxkVar2.c = 1000;
                    createBuilder.copyOnWrite();
                    aqxk aqxkVar3 = (aqxk) createBuilder.instance;
                    aqxkVar3.b |= 2;
                    aqxkVar3.d = 2.0f;
                    createBuilder.copyOnWrite();
                    aqxk aqxkVar4 = (aqxk) createBuilder.instance;
                    aqxkVar4.b |= 8;
                    aqxkVar4.f = 0.5f;
                    return (aqxk) createBuilder.mo39build();
                }
            }), aelqVar.e.q().o);
        }
        return aelvVar;
    }

    public final List a() {
        attu attuVar = r().h;
        if (attuVar == null) {
            attuVar = attu.a;
        }
        return attuVar.c;
    }

    public final synchronized void b() {
        Iterable p;
        if (this.K) {
            return;
        }
        this.K = true;
        this.m.a();
        aenr aenrVar = this.H;
        if (aenrVar != null) {
            aenrVar.a();
            this.H = null;
        }
        if (!this.j && !this.o.g()) {
            this.n.aa();
            this.e.a.b();
        }
        for (Future future : this.x) {
            future.cancel(true);
        }
        this.x.clear();
        Set set = this.a.h;
        if (set == null) {
            p = amyg.a;
        } else {
            p = amvn.p(set);
        }
        amzs it = p.iterator();
        while (it.hasNext()) {
            this.A.a.remove((String) it.next());
        }
        this.a.k();
        this.f36J = false;
        this.I = false;
    }

    @Override // defpackage.aenm
    public final synchronized void c(byte[] bArr) {
        if (!this.I) {
            this.n.W();
            try {
                this.a.q(bArr);
                this.I = true;
            } catch (aend e) {
                String valueOf = String.valueOf(afjt.f(e, true, 1));
                String concat = valueOf.length() != 0 ? "OnesieControllerError;".concat(valueOf) : new String("OnesieControllerError;");
                afus.e(2, 8, amps.d(concat), 1.0d);
                afkj.c(afki.ONESIE, e, "%s", concat);
            }
        }
    }

    @Override // defpackage.aenm
    public final void d(Exception exc) {
        v(exc, true);
    }

    @Override // defpackage.aenm
    public final void e(String str, Set set) {
        this.p.b(str, set);
    }

    public final synchronized void f(String str) {
        if (this.G.contains(str)) {
            return;
        }
        this.G.add(str);
        aeln aelnVar = this.A;
        aekh aekhVar = new aekh(this);
        int i = aelnVar.b.p().E;
        if (i > 0) {
            aelnVar.a.resize(i);
        }
        aelnVar.a.put(str, aekhVar);
    }

    public final synchronized void g() {
        aenr aenrVar = this.H;
        if (aenrVar != null) {
            aenrVar.a();
            this.H = null;
        }
        this.a.l();
    }

    @Override // defpackage.aenm
    public final void h(Exception exc) {
        afkj.c(afki.ONESIE, exc, "Onesie encountered a non-fatal error.", new Object[0]);
        v(exc, false);
    }

    @Override // defpackage.aenm
    public final synchronized void i() {
        this.n.ab();
        ayny aynyVar = this.k;
        if (aynyVar != null && !((ayuw) aynyVar).a.l()) {
            ayny aynyVar2 = this.k;
            if (!((ayuw) aynyVar2).a.l() && !((ayuw) aynyVar2).d) {
                ((ayuw) aynyVar2).d = true;
                ((ayuw) aynyVar2).f();
            }
        }
        if (!this.j && !this.o.g() && this.o.b().equals(aouw.ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE)) {
            this.n.aa();
            this.n.U();
            IllegalStateException illegalStateException = new IllegalStateException("finished without player response");
            this.m.c("response.noplayerresponse", illegalStateException);
            this.e.a(illegalStateException);
            afki afkiVar = afki.ABR;
        }
        this.a.l();
        afki afkiVar2 = afki.ABR;
    }

    @Override // defpackage.aenm
    public final synchronized void j(String str) {
        if (this.y.length() > 0) {
            this.y.append(",");
        }
        this.y.append(str);
        this.n.ai(this.y.toString());
    }

    @Override // defpackage.aenm
    public final synchronized void k(aent aentVar) {
        f(aentVar.c);
        if (!aentVar.g && aentVar.b.length > 0 && !this.j && !this.f36J) {
            this.f36J = true;
            this.n.ah();
        }
        this.a.c(aentVar);
    }

    public final boolean l() {
        afjz afjzVar = this.L;
        return new aops(afjzVar.p().C, attt.a).contains(apgc.ANDROID_ONESIE_HOT_CONFIG_FEATURES_DISABLE_CANCEL_FROM_MEDIAPLAYER);
    }

    public final synchronized void m(Uri uri, long j) {
        for (int i = 0; i < 2; i++) {
            if (j > 0) {
                this.x.add(this.s.schedule(p(this.v, uri), j, TimeUnit.MILLISECONDS));
            } else {
                this.x.add(this.s.submit(p(this.v, uri)));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:209|210|86|87|(1:89)(2:189|(3:193|91|(4:101|(2:104|(3:106|107|108))|139|567)(5:94|95|(2:97|98)|99|100)))|90|91|(0)|101|(2:104|(0))|139|567) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0217, code lost:
        if (r10 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05e6, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05e8, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05ea, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x05f0, code lost:
        r2 = r0;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x05f5, code lost:
        r2 = r0;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x061a, code lost:
        r2 = r0;
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d2 A[Catch: all -> 0x0035, RuntimeException -> 0x003a, aegw -> 0x003f, TryCatch #13 {aegw -> 0x003f, RuntimeException -> 0x003a, all -> 0x0035, blocks: (B:7:0x0019, B:9:0x0023, B:11:0x0027, B:12:0x002a, B:26:0x0063, B:28:0x0067, B:33:0x009c, B:38:0x00a7, B:48:0x00e2, B:55:0x00fc, B:63:0x011a, B:67:0x0125, B:73:0x013f, B:82:0x015f, B:84:0x017a, B:86:0x017e, B:87:0x0180, B:89:0x0184, B:90:0x0186, B:92:0x018d, B:94:0x019b, B:96:0x01b2, B:100:0x01c2, B:102:0x01d2, B:104:0x01d6, B:105:0x01d8, B:107:0x01dc, B:108:0x01de, B:110:0x01e5, B:112:0x01ee, B:115:0x01f5, B:193:0x0495, B:205:0x050d, B:215:0x0542, B:197:0x04a5, B:199:0x04ab, B:124:0x0238, B:130:0x0269, B:133:0x0272, B:135:0x0278, B:137:0x028a, B:138:0x02bb, B:139:0x02c0, B:140:0x02c4, B:143:0x02ca, B:149:0x02f5, B:151:0x02f9, B:153:0x0305, B:158:0x030e, B:181:0x0368, B:183:0x0381, B:184:0x0385, B:186:0x038b, B:188:0x03a3, B:160:0x0317, B:162:0x031a, B:163:0x0322, B:165:0x0325, B:178:0x035d, B:167:0x0330, B:169:0x033b, B:172:0x034a, B:171:0x0343, B:109:0x01e1, B:91:0x0189, B:42:0x00b4, B:22:0x0048), top: B:311:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e1 A[Catch: all -> 0x0035, RuntimeException -> 0x003a, aegw -> 0x003f, TryCatch #13 {aegw -> 0x003f, RuntimeException -> 0x003a, all -> 0x0035, blocks: (B:7:0x0019, B:9:0x0023, B:11:0x0027, B:12:0x002a, B:26:0x0063, B:28:0x0067, B:33:0x009c, B:38:0x00a7, B:48:0x00e2, B:55:0x00fc, B:63:0x011a, B:67:0x0125, B:73:0x013f, B:82:0x015f, B:84:0x017a, B:86:0x017e, B:87:0x0180, B:89:0x0184, B:90:0x0186, B:92:0x018d, B:94:0x019b, B:96:0x01b2, B:100:0x01c2, B:102:0x01d2, B:104:0x01d6, B:105:0x01d8, B:107:0x01dc, B:108:0x01de, B:110:0x01e5, B:112:0x01ee, B:115:0x01f5, B:193:0x0495, B:205:0x050d, B:215:0x0542, B:197:0x04a5, B:199:0x04ab, B:124:0x0238, B:130:0x0269, B:133:0x0272, B:135:0x0278, B:137:0x028a, B:138:0x02bb, B:139:0x02c0, B:140:0x02c4, B:143:0x02ca, B:149:0x02f5, B:151:0x02f9, B:153:0x0305, B:158:0x030e, B:181:0x0368, B:183:0x0381, B:184:0x0385, B:186:0x038b, B:188:0x03a3, B:160:0x0317, B:162:0x031a, B:163:0x0322, B:165:0x0325, B:178:0x035d, B:167:0x0330, B:169:0x033b, B:172:0x034a, B:171:0x0343, B:109:0x01e1, B:91:0x0189, B:42:0x00b4, B:22:0x0048), top: B:311:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0238 A[Catch: all -> 0x0035, RuntimeException -> 0x003a, aegw -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #13 {aegw -> 0x003f, RuntimeException -> 0x003a, all -> 0x0035, blocks: (B:7:0x0019, B:9:0x0023, B:11:0x0027, B:12:0x002a, B:26:0x0063, B:28:0x0067, B:33:0x009c, B:38:0x00a7, B:48:0x00e2, B:55:0x00fc, B:63:0x011a, B:67:0x0125, B:73:0x013f, B:82:0x015f, B:84:0x017a, B:86:0x017e, B:87:0x0180, B:89:0x0184, B:90:0x0186, B:92:0x018d, B:94:0x019b, B:96:0x01b2, B:100:0x01c2, B:102:0x01d2, B:104:0x01d6, B:105:0x01d8, B:107:0x01dc, B:108:0x01de, B:110:0x01e5, B:112:0x01ee, B:115:0x01f5, B:193:0x0495, B:205:0x050d, B:215:0x0542, B:197:0x04a5, B:199:0x04ab, B:124:0x0238, B:130:0x0269, B:133:0x0272, B:135:0x0278, B:137:0x028a, B:138:0x02bb, B:139:0x02c0, B:140:0x02c4, B:143:0x02ca, B:149:0x02f5, B:151:0x02f9, B:153:0x0305, B:158:0x030e, B:181:0x0368, B:183:0x0381, B:184:0x0385, B:186:0x038b, B:188:0x03a3, B:160:0x0317, B:162:0x031a, B:163:0x0322, B:165:0x0325, B:178:0x035d, B:167:0x0330, B:169:0x033b, B:172:0x034a, B:171:0x0343, B:109:0x01e1, B:91:0x0189, B:42:0x00b4, B:22:0x0048), top: B:311:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023b A[Catch: all -> 0x05ee, RuntimeException -> 0x05f3, aegw -> 0x0618, TRY_ENTER, TryCatch #14 {aegw -> 0x0618, RuntimeException -> 0x05f3, all -> 0x05ee, blocks: (B:5:0x000c, B:24:0x005b, B:31:0x006d, B:36:0x00a1, B:46:0x00c0, B:51:0x00ec, B:58:0x0105, B:61:0x0114, B:71:0x0139, B:191:0x03c7, B:201:0x04d4, B:202:0x04d8, B:212:0x053a, B:226:0x0567, B:195:0x049f, B:122:0x0228, B:127:0x023d, B:146:0x02d1, B:179:0x0362, B:190:0x03a7, B:176:0x0357, B:175:0x034f, B:126:0x023b, B:77:0x014a, B:70:0x012e, B:57:0x0101, B:40:0x00ac, B:45:0x00b9, B:44:0x00b7, B:35:0x009f, B:20:0x0044, B:23:0x004f), top: B:309:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x038b A[Catch: all -> 0x0035, RuntimeException -> 0x003a, aegw -> 0x003f, TryCatch #13 {aegw -> 0x003f, RuntimeException -> 0x003a, all -> 0x0035, blocks: (B:7:0x0019, B:9:0x0023, B:11:0x0027, B:12:0x002a, B:26:0x0063, B:28:0x0067, B:33:0x009c, B:38:0x00a7, B:48:0x00e2, B:55:0x00fc, B:63:0x011a, B:67:0x0125, B:73:0x013f, B:82:0x015f, B:84:0x017a, B:86:0x017e, B:87:0x0180, B:89:0x0184, B:90:0x0186, B:92:0x018d, B:94:0x019b, B:96:0x01b2, B:100:0x01c2, B:102:0x01d2, B:104:0x01d6, B:105:0x01d8, B:107:0x01dc, B:108:0x01de, B:110:0x01e5, B:112:0x01ee, B:115:0x01f5, B:193:0x0495, B:205:0x050d, B:215:0x0542, B:197:0x04a5, B:199:0x04ab, B:124:0x0238, B:130:0x0269, B:133:0x0272, B:135:0x0278, B:137:0x028a, B:138:0x02bb, B:139:0x02c0, B:140:0x02c4, B:143:0x02ca, B:149:0x02f5, B:151:0x02f9, B:153:0x0305, B:158:0x030e, B:181:0x0368, B:183:0x0381, B:184:0x0385, B:186:0x038b, B:188:0x03a3, B:160:0x0317, B:162:0x031a, B:163:0x0322, B:165:0x0325, B:178:0x035d, B:167:0x0330, B:169:0x033b, B:172:0x034a, B:171:0x0343, B:109:0x01e1, B:91:0x0189, B:42:0x00b4, B:22:0x0048), top: B:311:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0495 A[Catch: all -> 0x0035, RuntimeException -> 0x003a, aegw -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #13 {aegw -> 0x003f, RuntimeException -> 0x003a, all -> 0x0035, blocks: (B:7:0x0019, B:9:0x0023, B:11:0x0027, B:12:0x002a, B:26:0x0063, B:28:0x0067, B:33:0x009c, B:38:0x00a7, B:48:0x00e2, B:55:0x00fc, B:63:0x011a, B:67:0x0125, B:73:0x013f, B:82:0x015f, B:84:0x017a, B:86:0x017e, B:87:0x0180, B:89:0x0184, B:90:0x0186, B:92:0x018d, B:94:0x019b, B:96:0x01b2, B:100:0x01c2, B:102:0x01d2, B:104:0x01d6, B:105:0x01d8, B:107:0x01dc, B:108:0x01de, B:110:0x01e5, B:112:0x01ee, B:115:0x01f5, B:193:0x0495, B:205:0x050d, B:215:0x0542, B:197:0x04a5, B:199:0x04ab, B:124:0x0238, B:130:0x0269, B:133:0x0272, B:135:0x0278, B:137:0x028a, B:138:0x02bb, B:139:0x02c0, B:140:0x02c4, B:143:0x02ca, B:149:0x02f5, B:151:0x02f9, B:153:0x0305, B:158:0x030e, B:181:0x0368, B:183:0x0381, B:184:0x0385, B:186:0x038b, B:188:0x03a3, B:160:0x0317, B:162:0x031a, B:163:0x0322, B:165:0x0325, B:178:0x035d, B:167:0x0330, B:169:0x033b, B:172:0x034a, B:171:0x0343, B:109:0x01e1, B:91:0x0189, B:42:0x00b4, B:22:0x0048), top: B:311:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x049f A[Catch: all -> 0x05ee, RuntimeException -> 0x05f3, aegw -> 0x0618, TRY_ENTER, TRY_LEAVE, TryCatch #14 {aegw -> 0x0618, RuntimeException -> 0x05f3, all -> 0x05ee, blocks: (B:5:0x000c, B:24:0x005b, B:31:0x006d, B:36:0x00a1, B:46:0x00c0, B:51:0x00ec, B:58:0x0105, B:61:0x0114, B:71:0x0139, B:191:0x03c7, B:201:0x04d4, B:202:0x04d8, B:212:0x053a, B:226:0x0567, B:195:0x049f, B:122:0x0228, B:127:0x023d, B:146:0x02d1, B:179:0x0362, B:190:0x03a7, B:176:0x0357, B:175:0x034f, B:126:0x023b, B:77:0x014a, B:70:0x012e, B:57:0x0101, B:40:0x00ac, B:45:0x00b9, B:44:0x00b7, B:35:0x009f, B:20:0x0044, B:23:0x004f), top: B:309:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x050b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0540 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0600 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0614 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0625 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0639 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x063c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0568 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x054f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v30, types: [long] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 1625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeks.n():void");
    }
}
