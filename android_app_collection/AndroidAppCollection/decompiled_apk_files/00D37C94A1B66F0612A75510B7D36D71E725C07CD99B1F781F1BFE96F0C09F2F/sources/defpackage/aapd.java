package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aapd  reason: default package */
/* loaded from: classes.dex */
public abstract class aapd {
    public static aadd e;
    private String a;
    private final Boolean c;
    private final aaqf d;
    protected Map f;
    public byte[] g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public final String l;
    public final String m;
    public final afvm n;
    public final Optional o;
    public yre p;
    public ytz q;
    private int s;
    private volatile aopa t;
    public int r = 1;
    private final Object b = new Object();

    public aapd(String str, aaqf aaqfVar, afvm afvmVar, int i, boolean z, Optional optional, String str2, Boolean bool) {
        this.s = 1;
        this.m = str;
        aaqfVar.getClass();
        this.d = aaqfVar;
        afvmVar.getClass();
        this.n = afvmVar;
        this.s = i;
        this.i = z;
        this.l = str2;
        this.c = bool;
        this.o = optional;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i) {
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public static String g(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void r(String... strArr) {
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                i++;
            }
        }
        if (i == 1) {
            z = true;
        }
        aqxo.y(z);
    }

    public String b() {
        return "NO_CACHE_KEY_VALUE";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r1.d == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.afrt e() {
        /*
            r3 = this;
            afrt r0 = new afrt
            r0.<init>()
            java.lang.String r1 = r3.m
            java.lang.String r2 = "serviceName"
            r0.c(r2, r1)
            aadd r1 = defpackage.aapd.e
            if (r1 == 0) goto L1e
            arhd r1 = r1.a()
            athe r1 = r1.f
            if (r1 != 0) goto L1a
            athe r1 = defpackage.athe.a
        L1a:
            boolean r1 = r1.d
            if (r1 != 0) goto L29
        L1e:
            byte[] r1 = r3.g
            if (r1 != 0) goto L24
            byte[] r1 = defpackage.aadi.b
        L24:
            java.lang.String r2 = "clickTrackingParams"
            r0.e(r2, r1)
        L29:
            afvm r1 = r3.n
            java.lang.String r1 = r1.b()
            java.lang.String r2 = "identity"
            r0.c(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aapd.e():afrt");
    }

    public amuk f() {
        return amuk.q();
    }

    public Map h() {
        if (this.f == null) {
            this.f = new HashMap();
        }
        return this.f;
    }

    public final void i() {
        k(aadi.b);
    }

    public final void j(aoob aoobVar) {
        aqxo.p(aoobVar != null);
        this.g = aoobVar.I();
    }

    public final void k(byte[] bArr) {
        bArr.getClass();
        this.g = bArr;
    }

    public final void l(String str) {
        zgh.m(str);
        this.a = str;
    }

    public final boolean m() {
        return this.c != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean n() {
        return true;
    }

    public final boolean o() {
        return this.s == 3;
    }

    public final boolean p() {
        return this.s != 1;
    }

    public final void q(int i) {
        if (i == 1 || !"NO_CACHE_KEY_VALUE".equals(b())) {
            this.s = i;
            return;
        }
        throw new UnsupportedOperationException("You must override getCacheKey() in order to use forced caching.");
    }

    public final aopa s() {
        if (this.t == null) {
            synchronized (this.b) {
                if (this.t == null) {
                    aopa a = this.d.a();
                    arpd arpdVar = ((aroy) a.instance).e;
                    if (arpdVar == null) {
                        arpdVar = arpd.a;
                    }
                    aopa mo52toBuilder = arpdVar.mo52toBuilder();
                    if (this.n.w()) {
                        String e2 = this.n.e();
                        mo52toBuilder.copyOnWrite();
                        arpd arpdVar2 = (arpd) mo52toBuilder.instance;
                        arpdVar2.b |= 8;
                        arpdVar2.c = e2;
                    }
                    Boolean bool = this.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        mo52toBuilder.copyOnWrite();
                        arpd arpdVar3 = (arpd) mo52toBuilder.instance;
                        arpdVar3.b |= 4096;
                        arpdVar3.e = booleanValue;
                    }
                    a.copyOnWrite();
                    aroy aroyVar = (aroy) a.instance;
                    arpd arpdVar4 = (arpd) mo52toBuilder.mo39build();
                    arpdVar4.getClass();
                    aroyVar.e = arpdVar4;
                    aroyVar.b |= 4;
                    if (this.g != null) {
                        aopa createBuilder = aros.a.createBuilder();
                        aoob x = aoob.x(this.g);
                        createBuilder.copyOnWrite();
                        aros arosVar = (aros) createBuilder.instance;
                        arosVar.b |= 1;
                        arosVar.c = x;
                        a.copyOnWrite();
                        aroy aroyVar2 = (aroy) a.instance;
                        aros arosVar2 = (aros) createBuilder.mo39build();
                        arosVar2.getClass();
                        aroyVar2.g = arosVar2;
                        aroyVar2.b |= 32;
                    }
                    if (!TextUtils.isEmpty(this.a)) {
                        String str = this.a;
                        a.copyOnWrite();
                        aroy aroyVar3 = (aroy) a.instance;
                        str.getClass();
                        aroyVar3.b |= 64;
                        aroyVar3.h = str;
                    }
                    arow arowVar = ((aroy) a.instance).c;
                    if (arowVar == null) {
                        arowVar = arow.a;
                    }
                    aopa mo52toBuilder2 = arowVar.mo52toBuilder();
                    int i = this.r;
                    if (i != 1) {
                        mo52toBuilder2.copyOnWrite();
                        arow arowVar2 = (arow) mo52toBuilder2.instance;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        arowVar2.z = i2;
                        arowVar2.c |= 131072;
                    }
                    String str2 = this.k;
                    if (str2 != null) {
                        mo52toBuilder2.copyOnWrite();
                        arow arowVar3 = (arow) mo52toBuilder2.instance;
                        arowVar3.b |= 2097152;
                        arowVar3.m = str2;
                    }
                    a.copyOnWrite();
                    aroy aroyVar4 = (aroy) a.instance;
                    arow arowVar4 = (arow) mo52toBuilder2.mo39build();
                    arowVar4.getClass();
                    aroyVar4.c = arowVar4;
                    aroyVar4.b |= 1;
                    if (this.j) {
                        aroz arozVar = ((aroy) a.instance).f;
                        if (arozVar == null) {
                            arozVar = aroz.a;
                        }
                        aopa mo52toBuilder3 = arozVar.mo52toBuilder();
                        mo52toBuilder3.copyOnWrite();
                        aroz arozVar2 = (aroz) mo52toBuilder3.instance;
                        arozVar2.b |= 8192;
                        arozVar2.c = true;
                        a.copyOnWrite();
                        aroy aroyVar5 = (aroy) a.instance;
                        aroz arozVar3 = (aroz) mo52toBuilder3.mo39build();
                        arozVar3.getClass();
                        aroyVar5.f = arozVar3;
                        aroyVar5.b |= 16;
                    }
                    this.t = a;
                }
            }
        }
        return this.t;
    }
}
