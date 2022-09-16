package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: rpn  reason: default package */
/* loaded from: classes4.dex */
public final class rpn implements rml {
    private static volatile rpn s;
    private final Map A;
    public final rlp a;
    public rjt b;
    public rkz c;
    public rpd d;
    public rjl e;
    public rnl f;
    public ron g;
    public rli h;
    public final rlx i;
    long k;
    public List l;
    public int m;
    public int n;
    public boolean o;
    public List p;
    public List q;
    private final rkx t;
    private final rpp u;
    private boolean v;
    private boolean w;
    private boolean x;
    private FileLock y;
    private FileChannel z;
    public boolean j = false;
    private final rpr B = new rpl(this);
    public long r = -1;
    private final rpe C = new rpe(this);

    public rpn(rpo rpoVar) {
        this.i = rlx.j(rpoVar.a);
        rpp rppVar = new rpp(this);
        rppVar.W();
        this.u = rppVar;
        rkx rkxVar = new rkx(this);
        rkxVar.W();
        this.t = rkxVar;
        rlp rlpVar = new rlp(this);
        rlpVar.W();
        this.a = rlpVar;
        this.A = new HashMap();
        aH().g(new rpg(this));
    }

    public static final void R(rpf rpfVar) {
        if (rpfVar != null) {
            if (rpfVar.X()) {
                return;
            }
            String valueOf = String.valueOf(rpfVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Upload Component not created");
    }

    static final void S(rqf rqfVar, int i, String str) {
        List unmodifiableList = Collections.unmodifiableList(((rqg) rqfVar.instance).i());
        for (int i2 = 0; i2 < unmodifiableList.size(); i2++) {
            if ("_err".equals(((rqi) unmodifiableList.get(i2)).c)) {
                return;
            }
        }
        aopa createBuilder = rqi.a.createBuilder();
        createBuilder.copyOnWrite();
        rqi rqiVar = (rqi) createBuilder.instance;
        rqiVar.b |= 1;
        rqiVar.c = "_err";
        long longValue = Long.valueOf(i).longValue();
        createBuilder.copyOnWrite();
        rqi rqiVar2 = (rqi) createBuilder.instance;
        rqiVar2.b |= 4;
        rqiVar2.e = longValue;
        aopa createBuilder2 = rqi.a.createBuilder();
        createBuilder2.copyOnWrite();
        rqi rqiVar3 = (rqi) createBuilder2.instance;
        rqiVar3.b |= 1;
        rqiVar3.c = "_ev";
        createBuilder2.copyOnWrite();
        rqi rqiVar4 = (rqi) createBuilder2.instance;
        rqiVar4.b |= 2;
        rqiVar4.d = str;
        rqfVar.b((rqi) createBuilder.mo39build());
        rqfVar.b((rqi) createBuilder2.mo39build());
    }

    static final void U(rqf rqfVar, String str) {
        List unmodifiableList = Collections.unmodifiableList(((rqg) rqfVar.instance).i());
        for (int i = 0; i < unmodifiableList.size(); i++) {
            if (str.equals(((rqi) unmodifiableList.get(i)).c)) {
                rqfVar.c(i);
                return;
            }
        }
    }

    private final Boolean W(rix rixVar) {
        try {
            if (rixVar.b() != -2147483648L) {
                if (rixVar.b() == qyr.b(b()).d(rixVar.m(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = qyr.b(b()).d(rixVar.m(), 0).versionName;
                String p = rixVar.p();
                if (p != null && p.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void X(rqf rqfVar, rqf rqfVar2) {
        qnm.c("_e".equals(((rqg) rqfVar.instance).h()));
        r();
        rqi x = rpp.x((rqg) rqfVar.mo39build(), "_et");
        if (x == null || (x.b & 4) == 0) {
            return;
        }
        long j = x.e;
        if (j <= 0) {
            return;
        }
        r();
        rqi x2 = rpp.x((rqg) rqfVar2.mo39build(), "_et");
        if (x2 != null) {
            long j2 = x2.e;
            if (j2 > 0) {
                j += j2;
            }
        }
        r();
        rpp.u(rqfVar2, "_et", Long.valueOf(j));
        r();
        rpp.u(rqfVar, "_fr", 1L);
    }

    private final boolean Y(AppMetadata appMetadata) {
        axtf.b();
        return f().p(appMetadata.a, rkg.ae) ? !TextUtils.isEmpty(appMetadata.b) || !TextUtils.isEmpty(appMetadata.u) || !TextUtils.isEmpty(appMetadata.q) : !TextUtils.isEmpty(appMetadata.b) || !TextUtils.isEmpty(appMetadata.q);
    }

    private final boolean Z(rqf rqfVar, rqf rqfVar2) {
        qnm.c("_e".equals(((rqg) rqfVar.instance).h()));
        r();
        rqi x = rpp.x((rqg) rqfVar.mo39build(), "_sc");
        String str = null;
        String str2 = x == null ? null : x.d;
        r();
        rqi x2 = rpp.x((rqg) rqfVar2.mo39build(), "_pc");
        if (x2 != null) {
            str = x2.d;
        }
        if (str == null || !str.equals(str2)) {
            return false;
        }
        X(rqfVar, rqfVar2);
        return true;
    }

    private final void aa(aopa aopaVar, long j, boolean z) {
        rpq rpqVar;
        String str = true != z ? "_lte" : "_se";
        rpq j2 = j().j(((rqk) aopaVar.instance).r, str);
        if (j2 == null) {
            String str2 = ((rqk) aopaVar.instance).r;
            T();
            rpqVar = new rpq(str2, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String str3 = ((rqk) aopaVar.instance).r;
            T();
            rpqVar = new rpq(str3, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) j2.e).longValue() + j));
        }
        aopa createBuilder = rqo.a.createBuilder();
        createBuilder.copyOnWrite();
        rqo rqoVar = (rqo) createBuilder.instance;
        rqoVar.b |= 2;
        rqoVar.d = str;
        T();
        long currentTimeMillis = System.currentTimeMillis();
        createBuilder.copyOnWrite();
        rqo rqoVar2 = (rqo) createBuilder.instance;
        rqoVar2.b |= 1;
        rqoVar2.c = currentTimeMillis;
        long longValue = ((Long) rpqVar.e).longValue();
        createBuilder.copyOnWrite();
        rqo rqoVar3 = (rqo) createBuilder.instance;
        rqoVar3.b |= 8;
        rqoVar3.f = longValue;
        rqo rqoVar4 = (rqo) createBuilder.mo39build();
        int z2 = rpp.z(aopaVar, str);
        if (z2 < 0) {
            aopaVar.s(rqoVar4);
        } else {
            aopaVar.u(z2, rqoVar4);
        }
        if (j > 0) {
            j().C(rpqVar);
            aG().k.c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", rpqVar.e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0128, code lost:
        if (r15.equals(java.lang.Long.valueOf(r12.e)) == false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ab(defpackage.aopa r39, defpackage.rpm r40) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpn.ab(aopa, rpm):void");
    }

    public static rpn q(Context context) {
        qnm.b(context.getApplicationContext());
        if (s == null) {
            synchronized (rpn.class) {
                if (s == null) {
                    s = new rpn(new rpo(context));
                }
            }
        }
        return s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(EventParcel eventParcel, AppMetadata appMetadata) {
        EventParcel eventParcel2;
        List<ConditionalUserPropertyParcel> p;
        List<ConditionalUserPropertyParcel> p2;
        List<ConditionalUserPropertyParcel> p3;
        qnm.b(appMetadata);
        qnm.l(appMetadata.a);
        v();
        x();
        String str = appMetadata.a;
        EventParcel eventParcel3 = eventParcel;
        long j = eventParcel3.d;
        axum.b();
        if (f().o(rkg.ax)) {
            rkt b = rkt.b(eventParcel);
            v();
            rps.E(null, b.d, false);
            eventParcel3 = b.a();
        }
        r();
        if (!rpp.w(eventParcel3, appMetadata)) {
            return;
        }
        if (!appMetadata.h) {
            c(appMetadata);
            return;
        }
        List list = appMetadata.t;
        if (list == null) {
            eventParcel2 = eventParcel3;
        } else if (list.contains(eventParcel3.a)) {
            Bundle a = eventParcel3.b.a();
            a.putLong("ga_safelisted", 1L);
            eventParcel2 = new EventParcel(eventParcel3.a, new EventParams(a), eventParcel3.c, eventParcel3.d);
        } else {
            aG().j.d("Dropping non-safelisted event. appId, event name, origin", str, eventParcel3.a, eventParcel3.c);
            return;
        }
        j().s();
        try {
            rjt j2 = j();
            qnm.l(str);
            j2.n();
            j2.V();
            if (j >= 0) {
                p = j2.p("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
            } else {
                j2.aG().f.c("Invalid time querying timed out conditional properties", rks.a(str), Long.valueOf(j));
                p = Collections.emptyList();
            }
            for (ConditionalUserPropertyParcel conditionalUserPropertyParcel : p) {
                if (conditionalUserPropertyParcel != null) {
                    aG().k.d("User property timed out", conditionalUserPropertyParcel.a, l().e(conditionalUserPropertyParcel.c.b), conditionalUserPropertyParcel.c.a());
                    EventParcel eventParcel4 = conditionalUserPropertyParcel.g;
                    if (eventParcel4 != null) {
                        N(new EventParcel(eventParcel4, j), appMetadata);
                    }
                    j().E(str, conditionalUserPropertyParcel.c.b);
                }
            }
            rjt j3 = j();
            qnm.l(str);
            j3.n();
            j3.V();
            if (j >= 0) {
                p2 = j3.p("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
            } else {
                j3.aG().f.c("Invalid time querying expired conditional properties", rks.a(str), Long.valueOf(j));
                p2 = Collections.emptyList();
            }
            ArrayList<EventParcel> arrayList = new ArrayList(p2.size());
            for (ConditionalUserPropertyParcel conditionalUserPropertyParcel2 : p2) {
                if (conditionalUserPropertyParcel2 != null) {
                    aG().k.d("User property expired", conditionalUserPropertyParcel2.a, l().e(conditionalUserPropertyParcel2.c.b), conditionalUserPropertyParcel2.c.a());
                    j().v(str, conditionalUserPropertyParcel2.c.b);
                    EventParcel eventParcel5 = conditionalUserPropertyParcel2.k;
                    if (eventParcel5 != null) {
                        arrayList.add(eventParcel5);
                    }
                    j().E(str, conditionalUserPropertyParcel2.c.b);
                }
            }
            for (EventParcel eventParcel6 : arrayList) {
                N(new EventParcel(eventParcel6, j), appMetadata);
            }
            rjt j4 = j();
            String str2 = eventParcel2.a;
            qnm.l(str);
            qnm.l(str2);
            j4.n();
            j4.V();
            if (j >= 0) {
                p3 = j4.p("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
            } else {
                j4.aG().f.d("Invalid time querying triggered conditional properties", rks.a(str), j4.L().c(str2), Long.valueOf(j));
                p3 = Collections.emptyList();
            }
            ArrayList<EventParcel> arrayList2 = new ArrayList(p3.size());
            for (ConditionalUserPropertyParcel conditionalUserPropertyParcel3 : p3) {
                if (conditionalUserPropertyParcel3 != null) {
                    UserAttributeParcel userAttributeParcel = conditionalUserPropertyParcel3.c;
                    String str3 = conditionalUserPropertyParcel3.a;
                    qnm.b(str3);
                    String str4 = conditionalUserPropertyParcel3.b;
                    String str5 = userAttributeParcel.b;
                    Object a2 = userAttributeParcel.a();
                    qnm.b(a2);
                    rpq rpqVar = new rpq(str3, str4, str5, j, a2);
                    if (j().C(rpqVar)) {
                        aG().k.d("User property triggered", conditionalUserPropertyParcel3.a, l().e(rpqVar.c), rpqVar.e);
                    } else {
                        aG().c.d("Too many active user properties, ignoring", rks.a(conditionalUserPropertyParcel3.a), l().e(rpqVar.c), rpqVar.e);
                    }
                    EventParcel eventParcel7 = conditionalUserPropertyParcel3.i;
                    if (eventParcel7 != null) {
                        arrayList2.add(eventParcel7);
                    }
                    conditionalUserPropertyParcel3.c = new UserAttributeParcel(rpqVar);
                    conditionalUserPropertyParcel3.e = true;
                    j().B(conditionalUserPropertyParcel3);
                }
            }
            N(eventParcel2, appMetadata);
            for (EventParcel eventParcel8 : arrayList2) {
                N(new EventParcel(eventParcel8, j), appMetadata);
            }
            j().w();
        } finally {
            j().t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(EventParcel eventParcel, String str) {
        rix f = j().f(str);
        if (f == null || TextUtils.isEmpty(f.p())) {
            aG().j.b("No app data available; dropping event", str);
            return;
        }
        Boolean W = W(f);
        if (W == null) {
            if (!"_ui".equals(eventParcel.a)) {
                aG().f.b("Could not find package. appId", rks.a(str));
            }
        } else if (!W.booleanValue()) {
            aG().c.b("App version does not match; dropping event. appId", rks.a(str));
            return;
        }
        String s2 = f.s();
        String p = f.p();
        long b = f.b();
        String o = f.o();
        long g = f.g();
        long d = f.d();
        boolean S = f.S();
        String q = f.q();
        long a = f.a();
        boolean R = f.R();
        String l = f.l();
        Boolean k = f.k();
        long e = f.e();
        List u = f.u();
        axtf.b();
        C(eventParcel, new AppMetadata(str, s2, p, b, o, g, d, (String) null, S, false, q, a, 0L, 0, R, false, l, k, e, u, f().p(f.m(), rkg.ae) ? f.r() : null, h(str).f()));
    }

    final void C(EventParcel eventParcel, AppMetadata appMetadata) {
        qnm.l(appMetadata.a);
        rkt b = rkt.b(eventParcel);
        s().F(b.d, j().e(appMetadata.a));
        s().G(b, f().c(appMetadata.a));
        EventParcel a = b.a();
        if ("_cmp".equals(a.a) && "referrer API v2".equals(a.b.c("_cis"))) {
            String c = a.b.c("gclid");
            if (!TextUtils.isEmpty(c)) {
                L(new UserAttributeParcel("_lgclid", a.d, c, "auto"), appMetadata);
            }
        }
        A(a, appMetadata);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
        r10 = (java.util.List) r12.get("Last-Modified");
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[Catch: all -> 0x0152, TryCatch #1 {all -> 0x015b, blocks: (B:4:0x000c, B:5:0x000e, B:61:0x014d, B:41:0x00df, B:40:0x00db, B:48:0x00fc, B:6:0x0025, B:16:0x0042, B:60:0x0146, B:21:0x005b, B:26:0x00ab, B:25:0x009d, B:28:0x00b2, B:31:0x00be, B:33:0x00c4, B:38:0x00d1, B:50:0x0101, B:52:0x0114, B:54:0x012f, B:56:0x0139, B:58:0x013f, B:59:0x0143, B:53:0x0120, B:44:0x00e8, B:46:0x00f2), top: B:69:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114 A[Catch: all -> 0x0152, TryCatch #1 {all -> 0x015b, blocks: (B:4:0x000c, B:5:0x000e, B:61:0x014d, B:41:0x00df, B:40:0x00db, B:48:0x00fc, B:6:0x0025, B:16:0x0042, B:60:0x0146, B:21:0x005b, B:26:0x00ab, B:25:0x009d, B:28:0x00b2, B:31:0x00be, B:33:0x00c4, B:38:0x00d1, B:50:0x0101, B:52:0x0114, B:54:0x012f, B:56:0x0139, B:58:0x013f, B:59:0x0143, B:53:0x0120, B:44:0x00e8, B:46:0x00f2), top: B:69:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120 A[Catch: all -> 0x0152, TryCatch #1 {all -> 0x015b, blocks: (B:4:0x000c, B:5:0x000e, B:61:0x014d, B:41:0x00df, B:40:0x00db, B:48:0x00fc, B:6:0x0025, B:16:0x0042, B:60:0x0146, B:21:0x005b, B:26:0x00ab, B:25:0x009d, B:28:0x00b2, B:31:0x00be, B:33:0x00c4, B:38:0x00d1, B:50:0x0101, B:52:0x0114, B:54:0x012f, B:56:0x0139, B:58:0x013f, B:59:0x0143, B:53:0x0120, B:44:0x00e8, B:46:0x00f2), top: B:69:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpn.D(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:(19:73|(1:75)(2:187|(1:189)(2:190|(1:215)(2:194|(2:196|(1:214)(7:202|203|204|205|206|(1:208)(1:211)|209)))))|76|(1:78)|79|80|81|82|83|84|85|86|87|88|89|(5:91|92|93|94|(11:96|97|98|99|(1:101)(6:117|118|(1:158)(8:122|(3:124|(2:126|(1:128))(1:156)|129)(1:157)|130|(1:132)(1:155)|133|134|135|136)|137|138|(4:140|(1:142)|143|(1:145)))|102|103|(1:105)|106|107|108)(1:163))(1:176)|164|165|(11:167|97|98|99|(0)(0)|102|103|(0)|106|107|108)(11:168|169|170|99|(0)(0)|102|103|(0)|106|107|108))|79|80|81|82|83|84|85|86|87|88|89|(0)(0)|164|165|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:68|(19:73|(1:75)(2:187|(1:189)(2:190|(1:215)(2:194|(2:196|(1:214)(7:202|203|204|205|206|(1:208)(1:211)|209)))))|76|(1:78)|79|80|81|82|83|84|85|86|87|88|89|(5:91|92|93|94|(11:96|97|98|99|(1:101)(6:117|118|(1:158)(8:122|(3:124|(2:126|(1:128))(1:156)|129)(1:157)|130|(1:132)(1:155)|133|134|135|136)|137|138|(4:140|(1:142)|143|(1:145)))|102|103|(1:105)|106|107|108)(1:163))(1:176)|164|165|(11:167|97|98|99|(0)(0)|102|103|(0)|106|107|108)(11:168|169|170|99|(0)(0)|102|103|(0)|106|107|108))|216|76|(0)|79|80|81|82|83|84|85|86|87|88|89|(0)(0)|164|165|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x046f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0471, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0473, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0474, code lost:
        r22 = "_et";
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x047c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x047d, code lost:
        r22 = "_et";
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0481, code lost:
        r15 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x039c A[Catch: all -> 0x0641, TryCatch #13 {all -> 0x0641, blocks: (B:24:0x00a4, B:26:0x00b2, B:44:0x010f, B:46:0x011e, B:48:0x0136, B:49:0x015a, B:51:0x01ab, B:54:0x01bc, B:58:0x01d1, B:60:0x01dc, B:64:0x01e9, B:67:0x01fa, B:71:0x0205, B:73:0x0208, B:74:0x0228, B:76:0x022d, B:79:0x024a, B:82:0x0261, B:84:0x0282, B:87:0x028a, B:89:0x0295, B:119:0x036e, B:121:0x039c, B:122:0x039f, B:212:0x0585, B:221:0x05df, B:223:0x05ed, B:227:0x0632, B:90:0x02a4, B:92:0x02c9, B:93:0x02d8, B:95:0x02df, B:97:0x02e5, B:99:0x02ef, B:101:0x02f9, B:103:0x02ff, B:105:0x0305, B:106:0x030a, B:112:0x032e, B:115:0x0333, B:116:0x0345, B:117:0x0353, B:118:0x0361, B:217:0x0594, B:219:0x05c6, B:220:0x05c9, B:224:0x0613, B:226:0x0617, B:77:0x023b, B:30:0x00c0, B:32:0x00c4, B:36:0x00d4, B:38:0x00ec, B:40:0x00f6, B:43:0x00fe, B:123:0x03c4, B:125:0x03d2, B:127:0x03e1, B:130:0x03f4, B:132:0x040b, B:134:0x0415, B:140:0x042d, B:142:0x0453, B:145:0x0468, B:160:0x0484), top: B:255:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03f4 A[Catch: SQLiteException -> 0x0471, all -> 0x0477, TRY_ENTER, TRY_LEAVE, TryCatch #11 {SQLiteException -> 0x0471, blocks: (B:127:0x03e1, B:130:0x03f4), top: B:251:0x03e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0453 A[Catch: SQLiteException -> 0x046f, all -> 0x0477, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x046f, blocks: (B:140:0x042d, B:142:0x0453, B:145:0x0468), top: B:248:0x042d }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0468 A[Catch: SQLiteException -> 0x046f, all -> 0x0477, TRY_ENTER, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x046f, blocks: (B:140:0x042d, B:142:0x0453, B:145:0x0468), top: B:248:0x042d }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04a0 A[Catch: all -> 0x058b, TRY_LEAVE, TryCatch #3 {all -> 0x058b, blocks: (B:143:0x0462, B:163:0x0496, B:165:0x04a0, B:209:0x056b, B:210:0x056e, B:167:0x04b3, B:172:0x04d4, B:174:0x04dc, B:176:0x04e4, B:180:0x04f6, B:184:0x0504, B:188:0x0510, B:201:0x054f, B:203:0x0555, B:204:0x055a, B:206:0x0560, B:182:0x04fd, B:170:0x04c2, B:146:0x046b), top: B:238:0x039f, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x056b A[Catch: all -> 0x058b, TryCatch #3 {all -> 0x058b, blocks: (B:143:0x0462, B:163:0x0496, B:165:0x04a0, B:209:0x056b, B:210:0x056e, B:167:0x04b3, B:172:0x04d4, B:174:0x04dc, B:176:0x04e4, B:180:0x04f6, B:184:0x0504, B:188:0x0510, B:201:0x054f, B:203:0x0555, B:204:0x055a, B:206:0x0560, B:182:0x04fd, B:170:0x04c2, B:146:0x046b), top: B:238:0x039f, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05ed A[Catch: all -> 0x0641, TryCatch #13 {all -> 0x0641, blocks: (B:24:0x00a4, B:26:0x00b2, B:44:0x010f, B:46:0x011e, B:48:0x0136, B:49:0x015a, B:51:0x01ab, B:54:0x01bc, B:58:0x01d1, B:60:0x01dc, B:64:0x01e9, B:67:0x01fa, B:71:0x0205, B:73:0x0208, B:74:0x0228, B:76:0x022d, B:79:0x024a, B:82:0x0261, B:84:0x0282, B:87:0x028a, B:89:0x0295, B:119:0x036e, B:121:0x039c, B:122:0x039f, B:212:0x0585, B:221:0x05df, B:223:0x05ed, B:227:0x0632, B:90:0x02a4, B:92:0x02c9, B:93:0x02d8, B:95:0x02df, B:97:0x02e5, B:99:0x02ef, B:101:0x02f9, B:103:0x02ff, B:105:0x0305, B:106:0x030a, B:112:0x032e, B:115:0x0333, B:116:0x0345, B:117:0x0353, B:118:0x0361, B:217:0x0594, B:219:0x05c6, B:220:0x05c9, B:224:0x0613, B:226:0x0617, B:77:0x023b, B:30:0x00c0, B:32:0x00c4, B:36:0x00d4, B:38:0x00ec, B:40:0x00f6, B:43:0x00fe, B:123:0x03c4, B:125:0x03d2, B:127:0x03e1, B:130:0x03f4, B:132:0x040b, B:134:0x0415, B:140:0x042d, B:142:0x0453, B:145:0x0468, B:160:0x0484), top: B:255:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0613 A[Catch: all -> 0x0641, TryCatch #13 {all -> 0x0641, blocks: (B:24:0x00a4, B:26:0x00b2, B:44:0x010f, B:46:0x011e, B:48:0x0136, B:49:0x015a, B:51:0x01ab, B:54:0x01bc, B:58:0x01d1, B:60:0x01dc, B:64:0x01e9, B:67:0x01fa, B:71:0x0205, B:73:0x0208, B:74:0x0228, B:76:0x022d, B:79:0x024a, B:82:0x0261, B:84:0x0282, B:87:0x028a, B:89:0x0295, B:119:0x036e, B:121:0x039c, B:122:0x039f, B:212:0x0585, B:221:0x05df, B:223:0x05ed, B:227:0x0632, B:90:0x02a4, B:92:0x02c9, B:93:0x02d8, B:95:0x02df, B:97:0x02e5, B:99:0x02ef, B:101:0x02f9, B:103:0x02ff, B:105:0x0305, B:106:0x030a, B:112:0x032e, B:115:0x0333, B:116:0x0345, B:117:0x0353, B:118:0x0361, B:217:0x0594, B:219:0x05c6, B:220:0x05c9, B:224:0x0613, B:226:0x0617, B:77:0x023b, B:30:0x00c0, B:32:0x00c4, B:36:0x00d4, B:38:0x00ec, B:40:0x00f6, B:43:0x00fe, B:123:0x03c4, B:125:0x03d2, B:127:0x03e1, B:130:0x03f4, B:132:0x040b, B:134:0x0415, B:140:0x042d, B:142:0x0453, B:145:0x0468, B:160:0x0484), top: B:255:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e A[Catch: all -> 0x0641, TryCatch #13 {all -> 0x0641, blocks: (B:24:0x00a4, B:26:0x00b2, B:44:0x010f, B:46:0x011e, B:48:0x0136, B:49:0x015a, B:51:0x01ab, B:54:0x01bc, B:58:0x01d1, B:60:0x01dc, B:64:0x01e9, B:67:0x01fa, B:71:0x0205, B:73:0x0208, B:74:0x0228, B:76:0x022d, B:79:0x024a, B:82:0x0261, B:84:0x0282, B:87:0x028a, B:89:0x0295, B:119:0x036e, B:121:0x039c, B:122:0x039f, B:212:0x0585, B:221:0x05df, B:223:0x05ed, B:227:0x0632, B:90:0x02a4, B:92:0x02c9, B:93:0x02d8, B:95:0x02df, B:97:0x02e5, B:99:0x02ef, B:101:0x02f9, B:103:0x02ff, B:105:0x0305, B:106:0x030a, B:112:0x032e, B:115:0x0333, B:116:0x0345, B:117:0x0353, B:118:0x0361, B:217:0x0594, B:219:0x05c6, B:220:0x05c9, B:224:0x0613, B:226:0x0617, B:77:0x023b, B:30:0x00c0, B:32:0x00c4, B:36:0x00d4, B:38:0x00ec, B:40:0x00f6, B:43:0x00fe, B:123:0x03c4, B:125:0x03d2, B:127:0x03e1, B:130:0x03f4, B:132:0x040b, B:134:0x0415, B:140:0x042d, B:142:0x0453, B:145:0x0468, B:160:0x0484), top: B:255:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d1 A[Catch: all -> 0x0641, TryCatch #13 {all -> 0x0641, blocks: (B:24:0x00a4, B:26:0x00b2, B:44:0x010f, B:46:0x011e, B:48:0x0136, B:49:0x015a, B:51:0x01ab, B:54:0x01bc, B:58:0x01d1, B:60:0x01dc, B:64:0x01e9, B:67:0x01fa, B:71:0x0205, B:73:0x0208, B:74:0x0228, B:76:0x022d, B:79:0x024a, B:82:0x0261, B:84:0x0282, B:87:0x028a, B:89:0x0295, B:119:0x036e, B:121:0x039c, B:122:0x039f, B:212:0x0585, B:221:0x05df, B:223:0x05ed, B:227:0x0632, B:90:0x02a4, B:92:0x02c9, B:93:0x02d8, B:95:0x02df, B:97:0x02e5, B:99:0x02ef, B:101:0x02f9, B:103:0x02ff, B:105:0x0305, B:106:0x030a, B:112:0x032e, B:115:0x0333, B:116:0x0345, B:117:0x0353, B:118:0x0361, B:217:0x0594, B:219:0x05c6, B:220:0x05c9, B:224:0x0613, B:226:0x0617, B:77:0x023b, B:30:0x00c0, B:32:0x00c4, B:36:0x00d4, B:38:0x00ec, B:40:0x00f6, B:43:0x00fe, B:123:0x03c4, B:125:0x03d2, B:127:0x03e1, B:130:0x03f4, B:132:0x040b, B:134:0x0415, B:140:0x042d, B:142:0x0453, B:145:0x0468, B:160:0x0484), top: B:255:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022d A[Catch: all -> 0x0641, TryCatch #13 {all -> 0x0641, blocks: (B:24:0x00a4, B:26:0x00b2, B:44:0x010f, B:46:0x011e, B:48:0x0136, B:49:0x015a, B:51:0x01ab, B:54:0x01bc, B:58:0x01d1, B:60:0x01dc, B:64:0x01e9, B:67:0x01fa, B:71:0x0205, B:73:0x0208, B:74:0x0228, B:76:0x022d, B:79:0x024a, B:82:0x0261, B:84:0x0282, B:87:0x028a, B:89:0x0295, B:119:0x036e, B:121:0x039c, B:122:0x039f, B:212:0x0585, B:221:0x05df, B:223:0x05ed, B:227:0x0632, B:90:0x02a4, B:92:0x02c9, B:93:0x02d8, B:95:0x02df, B:97:0x02e5, B:99:0x02ef, B:101:0x02f9, B:103:0x02ff, B:105:0x0305, B:106:0x030a, B:112:0x032e, B:115:0x0333, B:116:0x0345, B:117:0x0353, B:118:0x0361, B:217:0x0594, B:219:0x05c6, B:220:0x05c9, B:224:0x0613, B:226:0x0617, B:77:0x023b, B:30:0x00c0, B:32:0x00c4, B:36:0x00d4, B:38:0x00ec, B:40:0x00f6, B:43:0x00fe, B:123:0x03c4, B:125:0x03d2, B:127:0x03e1, B:130:0x03f4, B:132:0x040b, B:134:0x0415, B:140:0x042d, B:142:0x0453, B:145:0x0468, B:160:0x0484), top: B:255:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023b A[Catch: all -> 0x0641, TryCatch #13 {all -> 0x0641, blocks: (B:24:0x00a4, B:26:0x00b2, B:44:0x010f, B:46:0x011e, B:48:0x0136, B:49:0x015a, B:51:0x01ab, B:54:0x01bc, B:58:0x01d1, B:60:0x01dc, B:64:0x01e9, B:67:0x01fa, B:71:0x0205, B:73:0x0208, B:74:0x0228, B:76:0x022d, B:79:0x024a, B:82:0x0261, B:84:0x0282, B:87:0x028a, B:89:0x0295, B:119:0x036e, B:121:0x039c, B:122:0x039f, B:212:0x0585, B:221:0x05df, B:223:0x05ed, B:227:0x0632, B:90:0x02a4, B:92:0x02c9, B:93:0x02d8, B:95:0x02df, B:97:0x02e5, B:99:0x02ef, B:101:0x02f9, B:103:0x02ff, B:105:0x0305, B:106:0x030a, B:112:0x032e, B:115:0x0333, B:116:0x0345, B:117:0x0353, B:118:0x0361, B:217:0x0594, B:219:0x05c6, B:220:0x05c9, B:224:0x0613, B:226:0x0617, B:77:0x023b, B:30:0x00c0, B:32:0x00c4, B:36:0x00d4, B:38:0x00ec, B:40:0x00f6, B:43:0x00fe, B:123:0x03c4, B:125:0x03d2, B:127:0x03e1, B:130:0x03f4, B:132:0x040b, B:134:0x0415, B:140:0x042d, B:142:0x0453, B:145:0x0468, B:160:0x0484), top: B:255:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024a A[Catch: all -> 0x0641, TRY_LEAVE, TryCatch #13 {all -> 0x0641, blocks: (B:24:0x00a4, B:26:0x00b2, B:44:0x010f, B:46:0x011e, B:48:0x0136, B:49:0x015a, B:51:0x01ab, B:54:0x01bc, B:58:0x01d1, B:60:0x01dc, B:64:0x01e9, B:67:0x01fa, B:71:0x0205, B:73:0x0208, B:74:0x0228, B:76:0x022d, B:79:0x024a, B:82:0x0261, B:84:0x0282, B:87:0x028a, B:89:0x0295, B:119:0x036e, B:121:0x039c, B:122:0x039f, B:212:0x0585, B:221:0x05df, B:223:0x05ed, B:227:0x0632, B:90:0x02a4, B:92:0x02c9, B:93:0x02d8, B:95:0x02df, B:97:0x02e5, B:99:0x02ef, B:101:0x02f9, B:103:0x02ff, B:105:0x0305, B:106:0x030a, B:112:0x032e, B:115:0x0333, B:116:0x0345, B:117:0x0353, B:118:0x0361, B:217:0x0594, B:219:0x05c6, B:220:0x05c9, B:224:0x0613, B:226:0x0617, B:77:0x023b, B:30:0x00c0, B:32:0x00c4, B:36:0x00d4, B:38:0x00ec, B:40:0x00f6, B:43:0x00fe, B:123:0x03c4, B:125:0x03d2, B:127:0x03e1, B:130:0x03f4, B:132:0x040b, B:134:0x0415, B:140:0x042d, B:142:0x0453, B:145:0x0468, B:160:0x0484), top: B:255:0x00a4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(com.google.android.gms.measurement.internal.AppMetadata r28) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpn.E(com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        qnm.l(conditionalUserPropertyParcel.a);
        qnm.b(conditionalUserPropertyParcel.c);
        qnm.l(conditionalUserPropertyParcel.c.b);
        v();
        x();
        if (!Y(appMetadata)) {
            return;
        }
        if (!appMetadata.h) {
            c(appMetadata);
            return;
        }
        j().s();
        try {
            c(appMetadata);
            String str = conditionalUserPropertyParcel.a;
            qnm.b(str);
            ConditionalUserPropertyParcel g = j().g(str, conditionalUserPropertyParcel.c.b);
            if (g != null) {
                aG().j.c("Removing conditional user property", conditionalUserPropertyParcel.a, l().e(conditionalUserPropertyParcel.c.b));
                j().E(str, conditionalUserPropertyParcel.c.b);
                if (g.e) {
                    j().v(str, conditionalUserPropertyParcel.c.b);
                }
                EventParcel eventParcel = conditionalUserPropertyParcel.k;
                if (eventParcel != null) {
                    EventParams eventParams = eventParcel.b;
                    Bundle a = eventParams != null ? eventParams.a() : null;
                    rps s2 = s();
                    EventParcel eventParcel2 = conditionalUserPropertyParcel.k;
                    qnm.b(eventParcel2);
                    EventParcel aw = s2.aw(str, eventParcel2.a, a, g.b, conditionalUserPropertyParcel.k.d, true);
                    qnm.b(aw);
                    N(aw, appMetadata);
                }
            } else {
                aG().f.c("Conditional user property doesn't exist", rks.a(conditionalUserPropertyParcel.a), l().e(conditionalUserPropertyParcel.c.b));
            }
            j().w();
        } finally {
            j().t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        v();
        x();
        if (!Y(appMetadata)) {
            return;
        }
        if (!appMetadata.h) {
            c(appMetadata);
        } else if (!"_npa".equals(userAttributeParcel.b) || appMetadata.r == null) {
            aG().j.b("Removing user property", l().e(userAttributeParcel.b));
            j().s();
            try {
                c(appMetadata);
                rjt j = j();
                String str = appMetadata.a;
                qnm.b(str);
                j.v(str, userAttributeParcel.b);
                j().w();
                aG().j.b("User property removed", l().e(userAttributeParcel.b));
            } finally {
                j().t();
            }
        } else {
            aG().j.a("Falling back to manifest metadata value for ad personalization");
            T();
            L(new UserAttributeParcel("_npa", System.currentTimeMillis(), Long.valueOf(true != appMetadata.r.booleanValue() ? 0L : 1L), "auto"), appMetadata);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(AppMetadata appMetadata) {
        if (this.p != null) {
            ArrayList arrayList = new ArrayList();
            this.q = arrayList;
            arrayList.addAll(this.p);
        }
        rjt j = j();
        String str = appMetadata.a;
        qnm.b(str);
        qnm.l(str);
        j.n();
        j.V();
        try {
            SQLiteDatabase d = j.d();
            String[] strArr = {str};
            int delete = d.delete("apps", "app_id=?", strArr) + d.delete("events", "app_id=?", strArr) + d.delete("user_attributes", "app_id=?", strArr) + d.delete("conditional_properties", "app_id=?", strArr) + d.delete("raw_events", "app_id=?", strArr) + d.delete("raw_events_metadata", "app_id=?", strArr) + d.delete("queue", "app_id=?", strArr) + d.delete("audience_filter_values", "app_id=?", strArr) + d.delete("main_event_params", "app_id=?", strArr) + d.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                j.aG().k.c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            j.aG().c.c("Error resetting analytics data. appId, error", rks.a(str), e);
        }
        if (appMetadata.h) {
            E(appMetadata);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        EventParcel eventParcel;
        qnm.l(conditionalUserPropertyParcel.a);
        qnm.b(conditionalUserPropertyParcel.b);
        qnm.b(conditionalUserPropertyParcel.c);
        qnm.l(conditionalUserPropertyParcel.c.b);
        v();
        x();
        if (!Y(appMetadata)) {
            return;
        }
        if (!appMetadata.h) {
            c(appMetadata);
            return;
        }
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel);
        boolean z = false;
        conditionalUserPropertyParcel2.e = false;
        j().s();
        try {
            rjt j = j();
            String str = conditionalUserPropertyParcel2.a;
            qnm.b(str);
            ConditionalUserPropertyParcel g = j.g(str, conditionalUserPropertyParcel2.c.b);
            if (g != null && !g.b.equals(conditionalUserPropertyParcel2.b)) {
                aG().f.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", l().e(conditionalUserPropertyParcel2.c.b), conditionalUserPropertyParcel2.b, g.b);
            }
            if (g == null || !g.e) {
                if (TextUtils.isEmpty(conditionalUserPropertyParcel2.f)) {
                    UserAttributeParcel userAttributeParcel = conditionalUserPropertyParcel2.c;
                    conditionalUserPropertyParcel2.c = new UserAttributeParcel(userAttributeParcel.b, conditionalUserPropertyParcel2.d, userAttributeParcel.a(), conditionalUserPropertyParcel2.c.f);
                    conditionalUserPropertyParcel2.e = true;
                    z = true;
                }
            } else {
                conditionalUserPropertyParcel2.b = g.b;
                conditionalUserPropertyParcel2.d = g.d;
                conditionalUserPropertyParcel2.h = g.h;
                conditionalUserPropertyParcel2.f = g.f;
                conditionalUserPropertyParcel2.i = g.i;
                conditionalUserPropertyParcel2.e = true;
                UserAttributeParcel userAttributeParcel2 = conditionalUserPropertyParcel2.c;
                conditionalUserPropertyParcel2.c = new UserAttributeParcel(userAttributeParcel2.b, g.c.c, userAttributeParcel2.a(), g.c.f);
            }
            if (conditionalUserPropertyParcel2.e) {
                UserAttributeParcel userAttributeParcel3 = conditionalUserPropertyParcel2.c;
                String str2 = conditionalUserPropertyParcel2.a;
                qnm.b(str2);
                String str3 = conditionalUserPropertyParcel2.b;
                String str4 = userAttributeParcel3.b;
                long j2 = userAttributeParcel3.c;
                Object a = userAttributeParcel3.a();
                qnm.b(a);
                rpq rpqVar = new rpq(str2, str3, str4, j2, a);
                if (j().C(rpqVar)) {
                    aG().j.d("User property updated immediately", conditionalUserPropertyParcel2.a, l().e(rpqVar.c), rpqVar.e);
                } else {
                    aG().c.d("(2)Too many active user properties, ignoring", rks.a(conditionalUserPropertyParcel2.a), l().e(rpqVar.c), rpqVar.e);
                }
                if (z && (eventParcel = conditionalUserPropertyParcel2.i) != null) {
                    N(new EventParcel(eventParcel, conditionalUserPropertyParcel2.d), appMetadata);
                }
            }
            if (j().B(conditionalUserPropertyParcel2)) {
                aG().j.d("Conditional property added", conditionalUserPropertyParcel2.a, l().e(conditionalUserPropertyParcel2.c.b), conditionalUserPropertyParcel2.c.a());
            } else {
                aG().c.d("Too many conditional properties, ignoring", rks.a(conditionalUserPropertyParcel2.a), l().e(conditionalUserPropertyParcel2.c.b), conditionalUserPropertyParcel2.c.a());
            }
            j().w();
        } finally {
            j().t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(String str, rjq rjqVar) {
        v();
        x();
        this.A.put(str, rjqVar);
        rjt j = j();
        qnm.b(str);
        j.n();
        j.V();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", rjqVar.f());
        try {
            if (j.d().insertWithOnConflict("consent_settings", null, contentValues, 5) != -1) {
                return;
            }
            j.aG().c.b("Failed to insert/update consent setting (got -1). appId", rks.a(str));
        } catch (SQLiteException e) {
            j.aG().c.c("Error storing consent setting. appId, error", rks.a(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K() {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpn.K():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        long j;
        v();
        x();
        if (!Y(appMetadata)) {
            return;
        }
        if (!appMetadata.h) {
            c(appMetadata);
            return;
        }
        int o = s().o(userAttributeParcel.b);
        if (o != 0) {
            rps s2 = s();
            String str = userAttributeParcel.b;
            f();
            String A = s2.A(str, 24, true);
            String str2 = userAttributeParcel.b;
            s().R(this.B, appMetadata.a, o, "_ev", A, str2 != null ? str2.length() : 0);
            return;
        }
        int b = s().b(userAttributeParcel.b, userAttributeParcel.a());
        if (b != 0) {
            rps s3 = s();
            String str3 = userAttributeParcel.b;
            f();
            String A2 = s3.A(str3, 24, true);
            Object a = userAttributeParcel.a();
            s().R(this.B, appMetadata.a, b, "_ev", A2, (a == null || (!(a instanceof String) && !(a instanceof CharSequence))) ? 0 : String.valueOf(a).length());
            return;
        }
        Object z = s().z(userAttributeParcel.b, userAttributeParcel.a());
        if (z == null) {
            return;
        }
        if ("_sid".equals(userAttributeParcel.b)) {
            long j2 = userAttributeParcel.c;
            String str4 = userAttributeParcel.f;
            String str5 = appMetadata.a;
            qnm.b(str5);
            rpq j3 = j().j(str5, "_sno");
            if (j3 != null) {
                Object obj = j3.e;
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                    L(new UserAttributeParcel("_sno", j2, Long.valueOf(j + 1), str4), appMetadata);
                }
            }
            if (j3 != null) {
                aG().f.b("Retrieved last session number from database does not contain a valid (long) value", j3.e);
            }
            rjy i = j().i(str5, "_s");
            if (i != null) {
                j = i.c;
                aG().k.b("Backfill the session number. Last used session number", Long.valueOf(j));
            } else {
                j = 0;
            }
            L(new UserAttributeParcel("_sno", j2, Long.valueOf(j + 1), str4), appMetadata);
        }
        String str6 = appMetadata.a;
        qnm.b(str6);
        String str7 = userAttributeParcel.f;
        qnm.b(str7);
        rpq rpqVar = new rpq(str6, str7, userAttributeParcel.b, userAttributeParcel.c, z);
        aG().k.c("Setting user property", l().e(rpqVar.c), z);
        j().s();
        try {
            axrp.b();
            if (this.i.g.o(rkg.av) && "_id".equals(rpqVar.c)) {
                j().v(appMetadata.a, "_lair");
            }
            c(appMetadata);
            boolean C = j().C(rpqVar);
            j().w();
            if (!C) {
                aG().c.c("Too many unique user properties are set. Ignoring user property", l().e(rpqVar.c), rpqVar.e);
                s().R(this.B, appMetadata.a, 9, null, null, 0);
            }
        } finally {
            j().t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0259, code lost:
        if (r6 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025b, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x027d, code lost:
        if (r6 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x08c6, code lost:
        if (r3 != null) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x08c8, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x08ec, code lost:
        if (r3 == null) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x08ef, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
        if (r13 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r13 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010f, code lost:
        if (r13 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:
        r29.r = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0887 A[Catch: all -> 0x0911, TryCatch #11 {all -> 0x0911, blocks: (B:128:0x0280, B:130:0x0286, B:132:0x0290, B:133:0x0294, B:135:0x029a, B:137:0x02ac, B:141:0x02b3, B:143:0x02b9, B:149:0x02da, B:146:0x02cc, B:148:0x02d4, B:150:0x02dd, B:152:0x02fa, B:156:0x0307, B:159:0x031d, B:161:0x037b, B:163:0x0392, B:165:0x03bb, B:166:0x03d0, B:168:0x03dc, B:169:0x03fd, B:170:0x0408, B:172:0x0415, B:316:0x07dc, B:317:0x07f4, B:319:0x0806, B:321:0x081b, B:323:0x0828, B:324:0x0837, B:320:0x0812, B:326:0x0871, B:175:0x042a, B:176:0x043a, B:179:0x0442, B:181:0x044a, B:183:0x0458, B:184:0x0463, B:186:0x0471, B:187:0x047d, B:189:0x0485, B:190:0x0491, B:192:0x0497, B:193:0x04a3, B:195:0x04aa, B:196:0x04b6, B:198:0x04da, B:199:0x04e6, B:201:0x04f5, B:202:0x0501, B:204:0x050f, B:205:0x051b, B:207:0x0521, B:208:0x052d, B:210:0x0533, B:211:0x053f, B:213:0x0545, B:214:0x0551, B:216:0x0557, B:217:0x0563, B:219:0x0580, B:220:0x058c, B:222:0x05a9, B:223:0x05b5, B:225:0x05bc, B:226:0x05c8, B:228:0x05cf, B:229:0x05db, B:231:0x05ef, B:233:0x05f6, B:235:0x05fe, B:237:0x060b, B:239:0x0611, B:240:0x061d, B:242:0x0623, B:243:0x062b, B:265:0x06c4, B:289:0x072c, B:312:0x07b3, B:292:0x0734, B:293:0x0738, B:295:0x073e, B:297:0x0746, B:299:0x0765, B:300:0x0772, B:302:0x0778, B:303:0x0786, B:305:0x078c, B:306:0x079a, B:308:0x07a0, B:310:0x07aa, B:268:0x06c9, B:269:0x06cd, B:271:0x06d3, B:273:0x06db, B:275:0x06ea, B:276:0x06f6, B:278:0x06fc, B:279:0x0708, B:281:0x070e, B:282:0x0710, B:284:0x0719, B:286:0x071f, B:287:0x0721, B:288:0x0724, B:247:0x063a, B:248:0x063e, B:250:0x0644, B:252:0x064c, B:254:0x0661, B:256:0x066d, B:258:0x068d, B:260:0x069b, B:262:0x06a7, B:264:0x06af, B:314:0x07c9, B:117:0x025b, B:330:0x0887, B:331:0x088a, B:332:0x088b, B:338:0x08c8, B:355:0x08f0, B:357:0x08f6, B:359:0x0900, B:343:0x08d3, B:364:0x090d, B:365:0x0910), top: B:385:0x00d2, inners: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a A[Catch: all -> 0x0915, TryCatch #14 {all -> 0x0915, blocks: (B:3:0x000c, B:5:0x0019, B:9:0x002a, B:11:0x0030, B:13:0x003e, B:15:0x0046, B:17:0x004c, B:19:0x0053, B:21:0x0061, B:23:0x006b, B:25:0x007c, B:27:0x009a, B:29:0x00a0, B:30:0x00a3, B:32:0x00af, B:33:0x00c4, B:35:0x00d4, B:37:0x00da, B:42:0x00f0, B:56:0x0112, B:60:0x011a, B:61:0x011d, B:62:0x011e, B:66:0x0145, B:70:0x014d, B:77:0x018f), top: B:387:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            Method dump skipped, instructions count: 2335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpn.M():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:320|(1:322)(1:347)|323|324|(2:326|(1:328)(7:329|330|(1:332)|64|(0)(0)|67|(0)(0)))|333|334|335|336|337|338|339|330|(0)|64|(0)(0)|67|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(62:(2:76|(5:78|(1:80)|81|82|83)(1:84))(1:291)|85|(2:87|(5:89|(1:91)|92|93|94))|95|96|(1:98)|99|(1:105)|106|(6:107|108|109|110|111|112)|113|(1:115)|116|(2:118|(1:124)(3:121|122|123))(1:283)|125|(1:127)|128|(1:130)|131|(1:133)|134|(1:136)|137|(1:139)|140|(4:142|(1:146)|147|(1:153))(2:278|(1:282))|154|(1:156)|157|(4:162|(4:165|(3:167|168|(3:170|171|(3:173|174|176)(1:268))(1:270))(1:275)|269|163)|276|177)|277|(3:180|(1:182)|183)|184|(2:186|(2:190|(1:192)))|193|(1:195)|196|(2:198|(1:200)(2:201|202))|203|(5:205|(1:207)|208|(1:210)|211)|212|(1:216)|217|(1:219)|220|(3:223|224|221)|225|226|227|228|229|230|231|(10:247|(2:248|(2:250|(1:252))(3:254|255|(1:259)))|253|234|235|236|(1:238)(2:243|244)|239|240|241)|233|234|235|236|(0)(0)|239|240|241) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02ed, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ef, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02f0, code lost:
        r21 = "raw_events";
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02f4, code lost:
        r10.aG().c.c("Error pruning currencies. appId", defpackage.rks.a(r4), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0841, code lost:
        if (r12.size() != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0bab, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0bac, code lost:
        r3.aG().c.c("Error storing raw event. appId", defpackage.rks.a(r9.a), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0328 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0372 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ce A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0549 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0580 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05eb A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x063c A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0658 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0674 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0691 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06bb A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x070b A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0767 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0796 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07ee A[Catch: all -> 0x0c19, TRY_LEAVE, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0846 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0879 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0934 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x094e A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0970 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0a12 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0a3a A[Catch: all -> 0x0c19, TRY_LEAVE, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0aee A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0b94 A[Catch: SQLiteException -> 0x0bab, all -> 0x0c19, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x0bab, blocks: (B:308:0x0b83, B:310:0x0b94), top: B:343:0x0b83, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c6 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0248 A[Catch: all -> 0x0c19, TryCatch #4 {all -> 0x0c19, blocks: (B:41:0x0155, B:43:0x0167, B:45:0x0173, B:46:0x017e, B:49:0x018a, B:51:0x0194, B:56:0x01a0, B:112:0x035c, B:121:0x0394, B:123:0x03ce, B:125:0x03d3, B:126:0x03e8, B:130:0x03f9, B:132:0x0412, B:134:0x0417, B:135:0x042e, B:142:0x0458, B:146:0x0479, B:147:0x048e, B:150:0x049d, B:153:0x04ba, B:154:0x04ce, B:156:0x04d8, B:158:0x04e6, B:160:0x04ec, B:161:0x04f5, B:162:0x0502, B:164:0x0529, B:174:0x0549, B:175:0x055c, B:177:0x0580, B:180:0x05a4, B:183:0x05e1, B:185:0x05fa, B:187:0x063c, B:188:0x0650, B:190:0x0658, B:191:0x066c, B:193:0x0674, B:194:0x0688, B:196:0x0691, B:197:0x06a2, B:199:0x06bb, B:200:0x06d0, B:202:0x070b, B:204:0x0717, B:206:0x071f, B:207:0x0733, B:209:0x073f, B:211:0x074b, B:213:0x0753, B:219:0x078e, B:221:0x0796, B:222:0x07a6, B:224:0x07c7, B:227:0x07cf, B:228:0x07e8, B:230:0x07ee, B:232:0x0802, B:234:0x080e, B:236:0x081b, B:240:0x0831, B:241:0x083d, B:245:0x0846, B:247:0x0855, B:248:0x085b, B:249:0x0860, B:251:0x0879, B:253:0x088b, B:255:0x088f, B:257:0x08aa, B:258:0x08c2, B:260:0x0934, B:261:0x0946, B:263:0x094e, B:266:0x095c, B:267:0x0963, B:268:0x0964, B:270:0x0970, B:272:0x0990, B:273:0x099b, B:275:0x09d0, B:276:0x09d5, B:277:0x09e1, B:279:0x09e7, B:281:0x09f1, B:282:0x0a08, B:284:0x0a12, B:285:0x0a29, B:286:0x0a34, B:288:0x0a3a, B:291:0x0a9c, B:292:0x0ada, B:293:0x0ae4, B:307:0x0b3b, B:308:0x0b83, B:310:0x0b94, B:324:0x0bea, B:313:0x0ba8, B:315:0x0bac, B:296:0x0aee, B:297:0x0af2, B:299:0x0af8, B:302:0x0b07, B:304:0x0b29, B:319:0x0bc1, B:320:0x0bd2, B:323:0x0bd5, B:214:0x0767, B:216:0x0773, B:218:0x077b, B:184:0x05eb, B:171:0x0535, B:115:0x0372, B:116:0x0378, B:118:0x037e, B:120:0x038e, B:62:0x01bc, B:64:0x01c6, B:66:0x01e5, B:73:0x0206, B:81:0x0242, B:83:0x0248, B:85:0x0256, B:87:0x0262, B:90:0x026e, B:92:0x0278, B:95:0x027f, B:108:0x031e, B:110:0x0328, B:96:0x02af, B:97:0x02cf, B:99:0x02e5, B:107:0x0303, B:106:0x02f4, B:89:0x0268, B:76:0x0214, B:80:0x0238), top: B:338:0x0155, inners: #0, #5, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void N(com.google.android.gms.measurement.internal.EventParcel r36, com.google.android.gms.measurement.internal.AppMetadata r37) {
        /*
            Method dump skipped, instructions count: 3109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpn.N(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:319:0x0b1a, code lost:
        if (r8 > (defpackage.rjp.v() + r6)) goto L343;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0409 A[Catch: all -> 0x0c7b, TryCatch #3 {all -> 0x0c7b, blocks: (B:3:0x000d, B:5:0x0022, B:8:0x002a, B:9:0x0056, B:12:0x006b, B:15:0x0093, B:17:0x00c4, B:20:0x00d3, B:22:0x00e1, B:216:0x0701, B:24:0x010e, B:26:0x0120, B:29:0x0141, B:31:0x014b, B:33:0x015b, B:35:0x0167, B:37:0x0175, B:38:0x0180, B:39:0x0185, B:42:0x019f, B:111:0x0409, B:112:0x041d, B:115:0x0427, B:121:0x0446, B:118:0x0437, B:143:0x04c0, B:145:0x04d0, B:148:0x04e3, B:150:0x04ff, B:152:0x050b, B:204:0x068f, B:206:0x069d, B:208:0x06a7, B:215:0x06ec, B:209:0x06bc, B:211:0x06ce, B:212:0x06e2, B:159:0x0535, B:161:0x0549, B:164:0x055c, B:166:0x0578, B:168:0x0584, B:176:0x05ad, B:178:0x05c3, B:180:0x05d3, B:183:0x05e4, B:185:0x0600, B:187:0x0647, B:189:0x064c, B:191:0x0652, B:193:0x065c, B:195:0x0661, B:197:0x0667, B:199:0x0671, B:201:0x0682, B:125:0x044e, B:141:0x04a8, B:133:0x0482, B:136:0x0492, B:138:0x0498, B:140:0x04a2, B:128:0x045c, B:130:0x0468, B:68:0x0200, B:71:0x020e, B:73:0x021a, B:77:0x0275, B:74:0x0242, B:76:0x0252, B:81:0x0286, B:83:0x02cc, B:84:0x0310, B:86:0x0339, B:88:0x033f, B:91:0x034f, B:93:0x037a, B:94:0x0391, B:96:0x039b, B:98:0x03a7, B:102:0x03b6, B:99:0x03ad, B:105:0x03bd, B:108:0x03c4, B:109:0x03f4, B:221:0x0719, B:223:0x0727, B:225:0x0730, B:236:0x076d, B:226:0x0744, B:228:0x074d, B:230:0x0753, B:233:0x075d, B:235:0x0767, B:237:0x0770, B:238:0x0784, B:241:0x078c, B:243:0x079e, B:244:0x07ab, B:246:0x07b3, B:250:0x07e0, B:252:0x07ff, B:254:0x080f, B:256:0x0815, B:258:0x081f, B:259:0x0871, B:261:0x087d, B:263:0x0889, B:264:0x088d, B:265:0x0890, B:266:0x0893, B:267:0x08b9, B:269:0x08c5, B:271:0x08d7, B:272:0x08ea, B:274:0x08f8, B:275:0x090b, B:276:0x090e, B:278:0x097d, B:279:0x0980, B:281:0x098e, B:301:0x0a6b, B:303:0x0a77, B:305:0x0a88, B:307:0x0a8e, B:312:0x0ad1, B:316:0x0af2, B:318:0x0b0e, B:321:0x0b37, B:322:0x0b3b, B:323:0x0b43, B:325:0x0b7e, B:326:0x0b89, B:328:0x0b9a, B:332:0x0bae, B:334:0x0bc1, B:320:0x0b1c, B:308:0x0aa1, B:310:0x0aab, B:311:0x0abe, B:335:0x0bd3, B:336:0x0bea, B:339:0x0bf2, B:340:0x0bf7, B:341:0x0c07, B:343:0x0c21, B:344:0x0c38, B:346:0x0c41, B:348:0x0c47, B:356:0x0c63, B:355:0x0c54, B:282:0x09a3, B:284:0x09af, B:286:0x09b9, B:288:0x09dc, B:294:0x09ea, B:296:0x0a0b, B:298:0x0a3e, B:300:0x0a64, B:299:0x0a4f, B:295:0x09fa, B:287:0x09cb, B:247:0x07b8, B:249:0x07be, B:357:0x0c6b), top: B:370:0x000d, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04d0 A[Catch: all -> 0x0c7b, TryCatch #3 {all -> 0x0c7b, blocks: (B:3:0x000d, B:5:0x0022, B:8:0x002a, B:9:0x0056, B:12:0x006b, B:15:0x0093, B:17:0x00c4, B:20:0x00d3, B:22:0x00e1, B:216:0x0701, B:24:0x010e, B:26:0x0120, B:29:0x0141, B:31:0x014b, B:33:0x015b, B:35:0x0167, B:37:0x0175, B:38:0x0180, B:39:0x0185, B:42:0x019f, B:111:0x0409, B:112:0x041d, B:115:0x0427, B:121:0x0446, B:118:0x0437, B:143:0x04c0, B:145:0x04d0, B:148:0x04e3, B:150:0x04ff, B:152:0x050b, B:204:0x068f, B:206:0x069d, B:208:0x06a7, B:215:0x06ec, B:209:0x06bc, B:211:0x06ce, B:212:0x06e2, B:159:0x0535, B:161:0x0549, B:164:0x055c, B:166:0x0578, B:168:0x0584, B:176:0x05ad, B:178:0x05c3, B:180:0x05d3, B:183:0x05e4, B:185:0x0600, B:187:0x0647, B:189:0x064c, B:191:0x0652, B:193:0x065c, B:195:0x0661, B:197:0x0667, B:199:0x0671, B:201:0x0682, B:125:0x044e, B:141:0x04a8, B:133:0x0482, B:136:0x0492, B:138:0x0498, B:140:0x04a2, B:128:0x045c, B:130:0x0468, B:68:0x0200, B:71:0x020e, B:73:0x021a, B:77:0x0275, B:74:0x0242, B:76:0x0252, B:81:0x0286, B:83:0x02cc, B:84:0x0310, B:86:0x0339, B:88:0x033f, B:91:0x034f, B:93:0x037a, B:94:0x0391, B:96:0x039b, B:98:0x03a7, B:102:0x03b6, B:99:0x03ad, B:105:0x03bd, B:108:0x03c4, B:109:0x03f4, B:221:0x0719, B:223:0x0727, B:225:0x0730, B:236:0x076d, B:226:0x0744, B:228:0x074d, B:230:0x0753, B:233:0x075d, B:235:0x0767, B:237:0x0770, B:238:0x0784, B:241:0x078c, B:243:0x079e, B:244:0x07ab, B:246:0x07b3, B:250:0x07e0, B:252:0x07ff, B:254:0x080f, B:256:0x0815, B:258:0x081f, B:259:0x0871, B:261:0x087d, B:263:0x0889, B:264:0x088d, B:265:0x0890, B:266:0x0893, B:267:0x08b9, B:269:0x08c5, B:271:0x08d7, B:272:0x08ea, B:274:0x08f8, B:275:0x090b, B:276:0x090e, B:278:0x097d, B:279:0x0980, B:281:0x098e, B:301:0x0a6b, B:303:0x0a77, B:305:0x0a88, B:307:0x0a8e, B:312:0x0ad1, B:316:0x0af2, B:318:0x0b0e, B:321:0x0b37, B:322:0x0b3b, B:323:0x0b43, B:325:0x0b7e, B:326:0x0b89, B:328:0x0b9a, B:332:0x0bae, B:334:0x0bc1, B:320:0x0b1c, B:308:0x0aa1, B:310:0x0aab, B:311:0x0abe, B:335:0x0bd3, B:336:0x0bea, B:339:0x0bf2, B:340:0x0bf7, B:341:0x0c07, B:343:0x0c21, B:344:0x0c38, B:346:0x0c41, B:348:0x0c47, B:356:0x0c63, B:355:0x0c54, B:282:0x09a3, B:284:0x09af, B:286:0x09b9, B:288:0x09dc, B:294:0x09ea, B:296:0x0a0b, B:298:0x0a3e, B:300:0x0a64, B:299:0x0a4f, B:295:0x09fa, B:287:0x09cb, B:247:0x07b8, B:249:0x07be, B:357:0x0c6b), top: B:370:0x000d, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0535 A[Catch: all -> 0x0c7b, TryCatch #3 {all -> 0x0c7b, blocks: (B:3:0x000d, B:5:0x0022, B:8:0x002a, B:9:0x0056, B:12:0x006b, B:15:0x0093, B:17:0x00c4, B:20:0x00d3, B:22:0x00e1, B:216:0x0701, B:24:0x010e, B:26:0x0120, B:29:0x0141, B:31:0x014b, B:33:0x015b, B:35:0x0167, B:37:0x0175, B:38:0x0180, B:39:0x0185, B:42:0x019f, B:111:0x0409, B:112:0x041d, B:115:0x0427, B:121:0x0446, B:118:0x0437, B:143:0x04c0, B:145:0x04d0, B:148:0x04e3, B:150:0x04ff, B:152:0x050b, B:204:0x068f, B:206:0x069d, B:208:0x06a7, B:215:0x06ec, B:209:0x06bc, B:211:0x06ce, B:212:0x06e2, B:159:0x0535, B:161:0x0549, B:164:0x055c, B:166:0x0578, B:168:0x0584, B:176:0x05ad, B:178:0x05c3, B:180:0x05d3, B:183:0x05e4, B:185:0x0600, B:187:0x0647, B:189:0x064c, B:191:0x0652, B:193:0x065c, B:195:0x0661, B:197:0x0667, B:199:0x0671, B:201:0x0682, B:125:0x044e, B:141:0x04a8, B:133:0x0482, B:136:0x0492, B:138:0x0498, B:140:0x04a2, B:128:0x045c, B:130:0x0468, B:68:0x0200, B:71:0x020e, B:73:0x021a, B:77:0x0275, B:74:0x0242, B:76:0x0252, B:81:0x0286, B:83:0x02cc, B:84:0x0310, B:86:0x0339, B:88:0x033f, B:91:0x034f, B:93:0x037a, B:94:0x0391, B:96:0x039b, B:98:0x03a7, B:102:0x03b6, B:99:0x03ad, B:105:0x03bd, B:108:0x03c4, B:109:0x03f4, B:221:0x0719, B:223:0x0727, B:225:0x0730, B:236:0x076d, B:226:0x0744, B:228:0x074d, B:230:0x0753, B:233:0x075d, B:235:0x0767, B:237:0x0770, B:238:0x0784, B:241:0x078c, B:243:0x079e, B:244:0x07ab, B:246:0x07b3, B:250:0x07e0, B:252:0x07ff, B:254:0x080f, B:256:0x0815, B:258:0x081f, B:259:0x0871, B:261:0x087d, B:263:0x0889, B:264:0x088d, B:265:0x0890, B:266:0x0893, B:267:0x08b9, B:269:0x08c5, B:271:0x08d7, B:272:0x08ea, B:274:0x08f8, B:275:0x090b, B:276:0x090e, B:278:0x097d, B:279:0x0980, B:281:0x098e, B:301:0x0a6b, B:303:0x0a77, B:305:0x0a88, B:307:0x0a8e, B:312:0x0ad1, B:316:0x0af2, B:318:0x0b0e, B:321:0x0b37, B:322:0x0b3b, B:323:0x0b43, B:325:0x0b7e, B:326:0x0b89, B:328:0x0b9a, B:332:0x0bae, B:334:0x0bc1, B:320:0x0b1c, B:308:0x0aa1, B:310:0x0aab, B:311:0x0abe, B:335:0x0bd3, B:336:0x0bea, B:339:0x0bf2, B:340:0x0bf7, B:341:0x0c07, B:343:0x0c21, B:344:0x0c38, B:346:0x0c41, B:348:0x0c47, B:356:0x0c63, B:355:0x0c54, B:282:0x09a3, B:284:0x09af, B:286:0x09b9, B:288:0x09dc, B:294:0x09ea, B:296:0x0a0b, B:298:0x0a3e, B:300:0x0a64, B:299:0x0a4f, B:295:0x09fa, B:287:0x09cb, B:247:0x07b8, B:249:0x07be, B:357:0x0c6b), top: B:370:0x000d, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x068f A[Catch: all -> 0x0c7b, TryCatch #3 {all -> 0x0c7b, blocks: (B:3:0x000d, B:5:0x0022, B:8:0x002a, B:9:0x0056, B:12:0x006b, B:15:0x0093, B:17:0x00c4, B:20:0x00d3, B:22:0x00e1, B:216:0x0701, B:24:0x010e, B:26:0x0120, B:29:0x0141, B:31:0x014b, B:33:0x015b, B:35:0x0167, B:37:0x0175, B:38:0x0180, B:39:0x0185, B:42:0x019f, B:111:0x0409, B:112:0x041d, B:115:0x0427, B:121:0x0446, B:118:0x0437, B:143:0x04c0, B:145:0x04d0, B:148:0x04e3, B:150:0x04ff, B:152:0x050b, B:204:0x068f, B:206:0x069d, B:208:0x06a7, B:215:0x06ec, B:209:0x06bc, B:211:0x06ce, B:212:0x06e2, B:159:0x0535, B:161:0x0549, B:164:0x055c, B:166:0x0578, B:168:0x0584, B:176:0x05ad, B:178:0x05c3, B:180:0x05d3, B:183:0x05e4, B:185:0x0600, B:187:0x0647, B:189:0x064c, B:191:0x0652, B:193:0x065c, B:195:0x0661, B:197:0x0667, B:199:0x0671, B:201:0x0682, B:125:0x044e, B:141:0x04a8, B:133:0x0482, B:136:0x0492, B:138:0x0498, B:140:0x04a2, B:128:0x045c, B:130:0x0468, B:68:0x0200, B:71:0x020e, B:73:0x021a, B:77:0x0275, B:74:0x0242, B:76:0x0252, B:81:0x0286, B:83:0x02cc, B:84:0x0310, B:86:0x0339, B:88:0x033f, B:91:0x034f, B:93:0x037a, B:94:0x0391, B:96:0x039b, B:98:0x03a7, B:102:0x03b6, B:99:0x03ad, B:105:0x03bd, B:108:0x03c4, B:109:0x03f4, B:221:0x0719, B:223:0x0727, B:225:0x0730, B:236:0x076d, B:226:0x0744, B:228:0x074d, B:230:0x0753, B:233:0x075d, B:235:0x0767, B:237:0x0770, B:238:0x0784, B:241:0x078c, B:243:0x079e, B:244:0x07ab, B:246:0x07b3, B:250:0x07e0, B:252:0x07ff, B:254:0x080f, B:256:0x0815, B:258:0x081f, B:259:0x0871, B:261:0x087d, B:263:0x0889, B:264:0x088d, B:265:0x0890, B:266:0x0893, B:267:0x08b9, B:269:0x08c5, B:271:0x08d7, B:272:0x08ea, B:274:0x08f8, B:275:0x090b, B:276:0x090e, B:278:0x097d, B:279:0x0980, B:281:0x098e, B:301:0x0a6b, B:303:0x0a77, B:305:0x0a88, B:307:0x0a8e, B:312:0x0ad1, B:316:0x0af2, B:318:0x0b0e, B:321:0x0b37, B:322:0x0b3b, B:323:0x0b43, B:325:0x0b7e, B:326:0x0b89, B:328:0x0b9a, B:332:0x0bae, B:334:0x0bc1, B:320:0x0b1c, B:308:0x0aa1, B:310:0x0aab, B:311:0x0abe, B:335:0x0bd3, B:336:0x0bea, B:339:0x0bf2, B:340:0x0bf7, B:341:0x0c07, B:343:0x0c21, B:344:0x0c38, B:346:0x0c41, B:348:0x0c47, B:356:0x0c63, B:355:0x0c54, B:282:0x09a3, B:284:0x09af, B:286:0x09b9, B:288:0x09dc, B:294:0x09ea, B:296:0x0a0b, B:298:0x0a3e, B:300:0x0a64, B:299:0x0a4f, B:295:0x09fa, B:287:0x09cb, B:247:0x07b8, B:249:0x07be, B:357:0x0c6b), top: B:370:0x000d, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean O(long r39) {
        /*
            Method dump skipped, instructions count: 3207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpn.O(long):boolean");
    }

    public final boolean P() {
        v();
        x();
        return j().a("select count(1) > 0 from raw_events", null) != 0 || !TextUtils.isEmpty(j().m());
    }

    final boolean Q() {
        FileLock fileLock;
        v();
        if (!f().o(rkg.ad) || (fileLock = this.y) == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(b().getFilesDir(), this.b.l()), "rw").getChannel();
                this.z = channel;
                FileLock tryLock = channel.tryLock();
                this.y = tryLock;
                if (tryLock != null) {
                    aG().k.a("Storage concurrent access okay");
                    return true;
                }
                aG().c.a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                aG().c.b("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                aG().c.b("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                aG().f.b("Storage lock already acquired", e3);
                return false;
            }
        }
        aG().k.a("Storage concurrent access okay");
        return true;
    }

    public final void T() {
        qnm.b(this.i);
    }

    public final void V() {
        rjm rjmVar = this.i.f;
    }

    final long a() {
        T();
        long currentTimeMillis = System.currentTimeMillis();
        ron ronVar = this.g;
        ronVar.V();
        ronVar.n();
        long a = ronVar.e.a();
        if (a == 0) {
            a = ronVar.N().B().nextInt(86400000) + 1;
            ronVar.e.b(a);
        }
        return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
    }

    @Override // defpackage.rml
    public final rks aG() {
        rlx rlxVar = this.i;
        qnm.b(rlxVar);
        return rlxVar.aG();
    }

    @Override // defpackage.rml
    public final rlu aH() {
        rlx rlxVar = this.i;
        qnm.b(rlxVar);
        return rlxVar.aH();
    }

    public final Context b() {
        return this.i.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rix c(AppMetadata appMetadata) {
        v();
        x();
        qnm.b(appMetadata);
        qnm.l(appMetadata.a);
        rix f = j().f(appMetadata.a);
        rjq c = h(appMetadata.a).c(rjq.b(appMetadata.v));
        String d = c.g() ? this.g.d(appMetadata.a) : "";
        if (f == null) {
            f = new rix(this.i, appMetadata.a);
            if (c.h()) {
                f.z(t(c));
            }
            if (c.g()) {
                f.Q(d);
            }
        } else if (!c.g() || d == null || d.equals(f.t())) {
            if (TextUtils.isEmpty(f.n()) && c.h()) {
                f.z(t(c));
            }
        } else {
            f.Q(d);
            f.z(t(c));
            axrp.b();
            if (f().o(rkg.av) && !"00000000-0000-0000-0000-000000000000".equals(this.g.c(appMetadata.a, c).first) && j().j(appMetadata.a, "_id") != null && j().j(appMetadata.a, "_lair") == null) {
                T();
                j().C(new rpq(appMetadata.a, "auto", "_lair", System.currentTimeMillis(), 1L));
            }
        }
        f.J(appMetadata.b);
        f.w(appMetadata.q);
        axtf.b();
        if (f().p(f.m(), rkg.ae)) {
            f.I(appMetadata.u);
        }
        if (!TextUtils.isEmpty(appMetadata.k)) {
            f.H(appMetadata.k);
        }
        long j = appMetadata.e;
        if (j != 0) {
            f.K(j);
        }
        if (!TextUtils.isEmpty(appMetadata.c)) {
            f.B(appMetadata.c);
        }
        f.C(appMetadata.j);
        String str = appMetadata.d;
        if (str != null) {
            f.A(str);
        }
        f.E(appMetadata.f);
        f.P(appMetadata.h);
        if (!TextUtils.isEmpty(appMetadata.g)) {
            f.L(appMetadata.g);
        }
        if (!f().o(rkg.an)) {
            f.y(appMetadata.l);
        }
        f.x(appMetadata.o);
        Boolean bool = appMetadata.r;
        f.a.r();
        f.k |= !rps.al(f.b, bool);
        f.b = bool;
        f.F(appMetadata.s);
        f.a.r();
        if (f.k) {
            j().x(f);
        }
        return f;
    }

    public final AppMetadata d(String str) {
        rix f = j().f(str);
        if (f == null || TextUtils.isEmpty(f.p())) {
            aG().j.b("No app data available; dropping", str);
            return null;
        }
        Boolean W = W(f);
        if (W == null || W.booleanValue()) {
            String s2 = f.s();
            String p = f.p();
            long b = f.b();
            String o = f.o();
            long g = f.g();
            long d = f.d();
            boolean S = f.S();
            String q = f.q();
            long a = f.a();
            boolean R = f.R();
            String l = f.l();
            Boolean k = f.k();
            long e = f.e();
            List u = f.u();
            axtf.b();
            return new AppMetadata(str, s2, p, b, o, g, d, (String) null, S, false, q, a, 0L, 0, R, false, l, k, e, u, f().p(str, rkg.ae) ? f.r() : null, h(str).f());
        }
        aG().c.b("App version does not match; dropping. appId", rks.a(str));
        return null;
    }

    public final rjl e() {
        rjl rjlVar = this.e;
        R(rjlVar);
        return rjlVar;
    }

    public final rjp f() {
        rlx rlxVar = this.i;
        qnm.b(rlxVar);
        return rlxVar.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rjq h(String str) {
        String str2;
        v();
        x();
        rjq rjqVar = (rjq) this.A.get(str);
        if (rjqVar == null) {
            rjt j = j();
            qnm.b(str);
            j.n();
            j.V();
            Cursor cursor = null;
            try {
                try {
                    cursor = j.d().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                    } else {
                        if (cursor != null) {
                            cursor.close();
                        }
                        str2 = "G1";
                    }
                    rjq b = rjq.b(str2);
                    J(str, b);
                    return b;
                } catch (SQLiteException e) {
                    j.aG().c.c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                    throw e;
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return rjqVar;
    }

    public final rjt j() {
        rjt rjtVar = this.b;
        R(rjtVar);
        return rjtVar;
    }

    public final rjw k() {
        return this.i.c();
    }

    public final rkn l() {
        return this.i.f();
    }

    public final rkx m() {
        rkx rkxVar = this.t;
        R(rkxVar);
        return rkxVar;
    }

    public final rkz n() {
        rkz rkzVar = this.c;
        if (rkzVar != null) {
            return rkzVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final rlp o() {
        rlp rlpVar = this.a;
        R(rlpVar);
        return rlpVar;
    }

    public final rpd p() {
        rpd rpdVar = this.d;
        R(rpdVar);
        return rpdVar;
    }

    public final rpp r() {
        rpp rppVar = this.u;
        R(rppVar);
        return rppVar;
    }

    public final rps s() {
        rlx rlxVar = this.i;
        qnm.b(rlxVar);
        return rlxVar.q();
    }

    final String t(rjq rjqVar) {
        if (rjqVar.h()) {
            byte[] bArr = new byte[16];
            s().B().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String u(AppMetadata appMetadata) {
        try {
            return (String) aH().b(new rpj(this, appMetadata)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            aG().c.c("Failed to get app instance id. appId", rks.a(appMetadata.a), e);
            return null;
        }
    }

    public final void v() {
        aH().n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w() {
        v();
        x();
        if (!this.v) {
            this.v = true;
            if (!Q()) {
                return;
            }
            FileChannel fileChannel = this.z;
            v();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                aG().c.a("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i = allocate.getInt();
                    } else if (read != -1) {
                        aG().f.b("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e) {
                    aG().c.b("Failed to read from channel", e);
                }
            }
            int f = this.i.d().f();
            v();
            if (i > f) {
                aG().c.c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(f));
            } else if (i >= f) {
            } else {
                FileChannel fileChannel2 = this.z;
                v();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    aG().c.a("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(f);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        f().o(rkg.am);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            aG().c.b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        aG().k.c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(f));
                        return;
                    } catch (IOException e2) {
                        aG().c.b("Failed to write to channel", e2);
                    }
                }
                aG().c.c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(f));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x() {
        if (this.j) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }

    public final void y() {
        v();
        if (this.w || this.o || this.x) {
            aG().k.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.w), Boolean.valueOf(this.o), Boolean.valueOf(this.x));
            return;
        }
        aG().k.a("Stopping uploading service(s)");
        List<Runnable> list = this.l;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
        List list2 = this.l;
        qnm.b(list2);
        list2.clear();
    }

    final void z(rix rixVar) {
        afw afwVar;
        v();
        axtf.b();
        if (!f().p(rixVar.m(), rkg.ae)) {
            if (TextUtils.isEmpty(rixVar.s()) && TextUtils.isEmpty(rixVar.l())) {
                String m = rixVar.m();
                qnm.b(m);
                D(m, 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(rixVar.s()) && TextUtils.isEmpty(rixVar.r()) && TextUtils.isEmpty(rixVar.l())) {
            String m2 = rixVar.m();
            qnm.b(m2);
            D(m2, 204, null, null, null);
            return;
        }
        rpe rpeVar = this.C;
        Uri.Builder builder = new Uri.Builder();
        String s2 = rixVar.s();
        if (TextUtils.isEmpty(s2)) {
            axtf.b();
            if (!rpeVar.J().p(rixVar.m(), rkg.ae)) {
                s2 = rixVar.l();
            } else {
                s2 = rixVar.r();
                if (TextUtils.isEmpty(s2)) {
                    s2 = rixVar.l();
                }
            }
        }
        Uri.Builder encodedAuthority = builder.scheme((String) rkg.e.a()).encodedAuthority((String) rkg.f.a());
        String valueOf = String.valueOf(s2);
        Uri.Builder appendQueryParameter = encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", rixVar.n()).appendQueryParameter("platform", "android");
        rpeVar.J().y();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(43009L));
        axua.b();
        if (rpeVar.J().p(rixVar.m(), rkg.au)) {
            builder.appendQueryParameter("runtime_version", "0");
        }
        String uri = builder.build().toString();
        try {
            String m3 = rixVar.m();
            qnm.b(m3);
            URL url = new URL(uri);
            aG().k.b("Fetching remote configuration", m3);
            rqb c = o().c(m3);
            rlp o = o();
            o.n();
            String str = (String) o.e.get(m3);
            if (c == null || TextUtils.isEmpty(str)) {
                afwVar = null;
            } else {
                afw afwVar2 = new afw();
                afwVar2.put("If-Modified-Since", str);
                afwVar = afwVar2;
            }
            this.w = true;
            rkx m4 = m();
            rpi rpiVar = new rpi(this);
            m4.n();
            m4.V();
            m4.aH().e(new rkw(m4, m3, url, null, afwVar, rpiVar));
        } catch (MalformedURLException unused) {
            aG().c.c("Failed to parse config URL. Not fetching. appId", rks.a(rixVar.m()), uri);
        }
    }
}
