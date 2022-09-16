package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aatf  reason: default package */
/* loaded from: classes.dex */
public final class aatf extends aaqs {
    public int A;
    private String B;
    private String C;
    private final String D;
    public final List a;
    public boolean b;
    public String c;
    public String d;
    public aqgj s;
    public arln t;
    public final List u;
    public atop v;
    public boolean w;
    public arls x;
    public aqmf y;
    public atcp z;

    public aatf(aaqf aaqfVar, afvm afvmVar, boolean z) {
        super("browse", aaqfVar, afvmVar, 3);
        this.a = new ArrayList();
        this.b = false;
        this.c = "";
        this.B = "";
        this.d = "";
        this.s = null;
        this.u = new ArrayList();
        this.A = 1;
        this.D = Locale.getDefault().toString();
        this.i = z;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopc aopcVar = (aopc) arlr.a.createBuilder();
        boolean z = this.b;
        aopcVar.copyOnWrite();
        arlr arlrVar = (arlr) aopcVar.instance;
        arlrVar.b |= 8192;
        arlrVar.i = z;
        boolean z2 = this.w;
        aopcVar.copyOnWrite();
        arlr arlrVar2 = (arlr) aopcVar.instance;
        arlrVar2.b |= 4194304;
        arlrVar2.m = z2;
        if (!TextUtils.isEmpty(this.c)) {
            String str = this.c;
            aopcVar.copyOnWrite();
            arlr arlrVar3 = (arlr) aopcVar.instance;
            str.getClass();
            arlrVar3.b |= 2;
            arlrVar3.d = str;
        }
        if (!TextUtils.isEmpty(this.B)) {
            String str2 = this.B;
            aopcVar.copyOnWrite();
            arlr arlrVar4 = (arlr) aopcVar.instance;
            str2.getClass();
            arlrVar4.b |= 16;
            arlrVar4.g = str2;
        }
        if (!TextUtils.isEmpty(this.d)) {
            String str3 = this.d;
            aopcVar.copyOnWrite();
            arlr arlrVar5 = (arlr) aopcVar.instance;
            str3.getClass();
            arlrVar5.b |= 8;
            arlrVar5.f = str3;
        }
        if (!TextUtils.isEmpty(this.C)) {
            String str4 = this.C;
            aopcVar.copyOnWrite();
            arlr arlrVar6 = (arlr) aopcVar.instance;
            str4.getClass();
            arlrVar6.b |= 4;
            arlrVar6.e = str4;
        }
        int i = this.A;
        if (i != 1) {
            aopcVar.copyOnWrite();
            arlr arlrVar7 = (arlr) aopcVar.instance;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            arlrVar7.p = i2;
            arlrVar7.b |= 8388608;
        }
        List list = this.u;
        aopcVar.copyOnWrite();
        arlr arlrVar8 = (arlr) aopcVar.instance;
        aopu aopuVar = arlrVar8.o;
        if (!aopuVar.c()) {
            arlrVar8.o = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) list, (List) arlrVar8.o);
        atop atopVar = this.v;
        if (atopVar != null) {
            aopcVar.copyOnWrite();
            arlr arlrVar9 = (arlr) aopcVar.instance;
            arlrVar9.h = atopVar;
            arlrVar9.b |= 2048;
        }
        if (!TextUtils.isEmpty(null)) {
            aopa createBuilder = aqzk.a.createBuilder();
            createBuilder.copyOnWrite();
            aqzk aqzkVar = (aqzk) createBuilder.instance;
            throw null;
        } else if (TextUtils.isEmpty(null)) {
            arln arlnVar = this.t;
            if (arlnVar != null) {
                aopcVar.copyOnWrite();
                arlr arlrVar10 = (arlr) aopcVar.instance;
                arlrVar10.j = arlnVar;
                arlrVar10.b |= 65536;
            }
            aqgj aqgjVar = this.s;
            if (aqgjVar != null) {
                aopcVar.copyOnWrite();
                arlr arlrVar11 = (arlr) aopcVar.instance;
                arlrVar11.k = aqgjVar;
                arlrVar11.b |= 2097152;
            }
            List list2 = this.a;
            aopcVar.copyOnWrite();
            arlr arlrVar12 = (arlr) aopcVar.instance;
            aopq aopqVar = arlrVar12.n;
            if (!aopqVar.c()) {
                arlrVar12.n = aopi.mutableCopy(aopqVar);
            }
            aonk.addAll((Iterable) list2, (List) arlrVar12.n);
            arls arlsVar = this.x;
            if (arlsVar != null) {
                aopcVar.copyOnWrite();
                arlr arlrVar13 = (arlr) aopcVar.instance;
                arlrVar13.r = arlsVar;
                arlrVar13.b |= 134217728;
            }
            aqmf aqmfVar = this.y;
            if (aqmfVar != null) {
                aopcVar.copyOnWrite();
                arlr arlrVar14 = (arlr) aopcVar.instance;
                arlrVar14.q = aqmfVar;
                arlrVar14.b |= 67108864;
            }
            atcp atcpVar = this.z;
            if (atcpVar != null) {
                aopcVar.copyOnWrite();
                arlr arlrVar15 = (arlr) aopcVar.instance;
                arlrVar15.s = atcpVar;
                arlrVar15.b |= 536870912;
            }
            return aopcVar;
        } else {
            aopa createBuilder2 = aqzl.a.createBuilder();
            createBuilder2.copyOnWrite();
            aqzl aqzlVar = (aqzl) createBuilder2.instance;
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    @Override // defpackage.aapd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            r6 = this;
            afrt r0 = r6.e()
            java.lang.String r1 = r6.c
            java.lang.String r2 = "browseId"
            r0.c(r2, r1)
            java.lang.String r1 = r6.D
            java.lang.String r2 = "language"
            r0.c(r2, r1)
            java.lang.String r1 = r6.B
            java.lang.String r2 = "continuation"
            r0.c(r2, r1)
            arln r1 = r6.t
            if (r1 == 0) goto L60
            int r2 = r1.b
            r3 = 347924010(0x14bce62a, float:1.9073933E-26)
            if (r2 != r3) goto L29
            java.lang.Object r1 = r1.c
            arly r1 = (defpackage.arly) r1
            goto L2b
        L29:
            arly r1 = defpackage.arly.a
        L2b:
            aopu r1 = r1.b
            int r1 = r1.size()
            if (r1 <= 0) goto L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            arln r2 = r6.t
            int r4 = r2.b
            if (r4 != r3) goto L43
            java.lang.Object r2 = r2.c
            arly r2 = (defpackage.arly) r2
            goto L45
        L43:
            arly r2 = defpackage.arly.a
        L45:
            aopu r2 = r2.b
            java.util.Iterator r2 = r2.iterator()
        L4b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            goto L4b
        L5b:
            java.lang.String r1 = r1.toString()
            goto L62
        L60:
            java.lang.String r1 = ""
        L62:
            java.lang.String r2 = "filteredBrowseParamsFormData"
            r0.c(r2, r1)
            java.lang.String r1 = r6.C
            java.lang.String r2 = "params"
            r0.c(r2, r1)
            java.lang.String r1 = r6.d
            java.lang.String r2 = "query"
            r0.c(r2, r1)
            boolean r1 = r6.b
            java.lang.String r2 = "offline"
            r0.d(r2, r1)
            java.lang.String r1 = "forceAdUrls"
            java.lang.String r2 = "null"
            r0.c(r1, r2)
            java.lang.String r1 = "forceAdKeyword"
            r3 = 0
            r0.c(r1, r3)
            java.lang.String r1 = "forceViralAdResponseUrl"
            r0.c(r1, r3)
            boolean r1 = r6.w
            java.lang.String r3 = "extendedPermissions"
            r0.d(r3, r1)
            atop r1 = r6.v
            if (r1 == 0) goto Lbd
            aopa r1 = r1.mo52toBuilder()
            r1.copyOnWrite()
            aopi r3 = r1.instance
            atop r3 = (defpackage.atop) r3
            int r4 = r3.b
            r4 = r4 & (-5)
            r3.b = r4
            r4 = 0
            r3.d = r4
            aopi r1 = r1.mo39build()
            atop r1 = (defpackage.atop) r1
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "browseNotificationsParams"
            r0.c(r3, r1)
        Lbd:
            java.lang.String r1 = r6.k
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto Lca
            java.lang.String r3 = "rawDeviceId"
            r0.c(r3, r1)
        Lca:
            java.lang.String r1 = "musicBrowseRequestDeepLinkUrl"
            r0.c(r1, r2)
            java.lang.String r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aatf.b():java.lang.String");
    }

    @Override // defpackage.aapd
    protected final void c() {
        r(this.c, this.B);
    }

    @Override // defpackage.aapd
    public final amuk f() {
        return amuk.r(this.c);
    }

    public final void t(String str) {
        this.c = g(str);
    }

    public final void u(ajfz ajfzVar) {
        this.B = g(ajfzVar.b());
        k(ajfzVar.d());
    }

    public final void v(String str) {
        this.C = g(str);
    }
}
