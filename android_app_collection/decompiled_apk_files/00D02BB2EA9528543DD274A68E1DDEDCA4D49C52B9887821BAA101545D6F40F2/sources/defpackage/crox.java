package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: crox  reason: default package */
/* loaded from: classes5.dex */
public final class crox {
    private final cqat c;
    @dzsi
    private String d;
    private final String e;
    @dzsi
    private String l;
    private boolean a = true;
    private boolean b = true;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private List<ddoj> m = new ArrayList();
    private dcou<String, ddoi, Long> n = dcbv.j();
    private int o = 0;
    private int p = 0;

    public crox(String str, cqat cqatVar) {
        this.e = str;
        this.c = cqatVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        r8.toString();
        r7 = defpackage.ddoj.e.bZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r7.c == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        r7.bF();
        r7.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        r2 = (defpackage.ddoj) r7.b;
        r2.b = r8.d;
        r3 = r2.a | 1;
        r2.a = r3;
        r2.a = r3 | 4;
        r2.d = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r8 != defpackage.ddoi.LOCAL) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        r8 = r6.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r7.c == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        r7.bF();
        r7.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        r0 = (defpackage.ddoj) r7.b;
        r0.a |= 2;
        r0.c = r8;
        r6.a = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
        if (r8 != defpackage.ddoi.NETWORK) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
        r8 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r7.c == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        r7.bF();
        r7.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
        r0 = (defpackage.ddoj) r7.b;
        r0.a |= 2;
        r0.c = r8;
        r6.b = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
        r6.m.add(r7.bK());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void q(java.lang.String r7, defpackage.ddoi r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            dcou<java.lang.String, ddoi, java.lang.Long> r0 = r6.n     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r0 = r0.b(r7, r8)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> Lb3
            r1 = 0
            if (r0 == 0) goto L3e
            cqat r2 = r6.c     // Catch: java.lang.Throwable -> Lb3
            long r2 = r2.e()     // Catch: java.lang.Throwable -> Lb3
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> Lb3
            long r2 = r2 - r4
            int r0 = (int) r2     // Catch: java.lang.Throwable -> Lb3
            dcou<java.lang.String, ddoi, java.lang.Long> r2 = r6.n     // Catch: java.lang.Throwable -> Lb3
            if (r7 == 0) goto L3f
            if (r8 != 0) goto L1f
            goto L3f
        L1f:
            r3 = r2
            dcoc r3 = (defpackage.dcoc) r3     // Catch: java.lang.Throwable -> Lb3
            java.util.Map<R, java.util.Map<C, V>> r3 = r3.b     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r3 = defpackage.dcjz.A(r3, r7)     // Catch: java.lang.Throwable -> Lb3
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> Lb3
            if (r3 != 0) goto L2d
            goto L3f
        L2d:
            r3.remove(r8)     // Catch: java.lang.Throwable -> Lb3
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L3f
            dcoc r2 = (defpackage.dcoc) r2     // Catch: java.lang.Throwable -> Lb3
            java.util.Map<R, java.util.Map<C, V>> r2 = r2.b     // Catch: java.lang.Throwable -> Lb3
            r2.remove(r7)     // Catch: java.lang.Throwable -> Lb3
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 <= 0) goto Lb1
            r8.toString()     // Catch: java.lang.Throwable -> Lb3
            ddoj r7 = defpackage.ddoj.e     // Catch: java.lang.Throwable -> Lb3
            dsqp r7 = r7.bZ()     // Catch: java.lang.Throwable -> Lb3
            ddog r7 = (defpackage.ddog) r7     // Catch: java.lang.Throwable -> Lb3
            boolean r2 = r7.c     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L55
            r7.bF()     // Catch: java.lang.Throwable -> Lb3
            r7.c = r1     // Catch: java.lang.Throwable -> Lb3
        L55:
            MessageType extends dsqw<MessageType, BuilderType> r2 = r7.b     // Catch: java.lang.Throwable -> Lb3
            ddoj r2 = (defpackage.ddoj) r2     // Catch: java.lang.Throwable -> Lb3
            int r3 = r8.d     // Catch: java.lang.Throwable -> Lb3
            r2.b = r3     // Catch: java.lang.Throwable -> Lb3
            int r3 = r2.a     // Catch: java.lang.Throwable -> Lb3
            r3 = r3 | 1
            r2.a = r3     // Catch: java.lang.Throwable -> Lb3
            r3 = r3 | 4
            r2.a = r3     // Catch: java.lang.Throwable -> Lb3
            r2.d = r0     // Catch: java.lang.Throwable -> Lb3
            ddoi r0 = defpackage.ddoi.LOCAL     // Catch: java.lang.Throwable -> Lb3
            if (r8 != r0) goto L87
            boolean r8 = r6.a     // Catch: java.lang.Throwable -> Lb3
            boolean r0 = r7.c     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L78
            r7.bF()     // Catch: java.lang.Throwable -> Lb3
            r7.c = r1     // Catch: java.lang.Throwable -> Lb3
        L78:
            MessageType extends dsqw<MessageType, BuilderType> r0 = r7.b     // Catch: java.lang.Throwable -> Lb3
            ddoj r0 = (defpackage.ddoj) r0     // Catch: java.lang.Throwable -> Lb3
            int r2 = r0.a     // Catch: java.lang.Throwable -> Lb3
            r2 = r2 | 2
            r0.a = r2     // Catch: java.lang.Throwable -> Lb3
            r0.c = r8     // Catch: java.lang.Throwable -> Lb3
            r6.a = r1     // Catch: java.lang.Throwable -> Lb3
            goto La4
        L87:
            ddoi r0 = defpackage.ddoi.NETWORK     // Catch: java.lang.Throwable -> Lb3
            if (r8 != r0) goto La4
            boolean r8 = r6.b     // Catch: java.lang.Throwable -> Lb3
            boolean r0 = r7.c     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L96
            r7.bF()     // Catch: java.lang.Throwable -> Lb3
            r7.c = r1     // Catch: java.lang.Throwable -> Lb3
        L96:
            MessageType extends dsqw<MessageType, BuilderType> r0 = r7.b     // Catch: java.lang.Throwable -> Lb3
            ddoj r0 = (defpackage.ddoj) r0     // Catch: java.lang.Throwable -> Lb3
            int r2 = r0.a     // Catch: java.lang.Throwable -> Lb3
            r2 = r2 | 2
            r0.a = r2     // Catch: java.lang.Throwable -> Lb3
            r0.c = r8     // Catch: java.lang.Throwable -> Lb3
            r6.b = r1     // Catch: java.lang.Throwable -> Lb3
        La4:
            java.util.List<ddoj> r8 = r6.m     // Catch: java.lang.Throwable -> Lb3
            dsqw r7 = r7.bK()     // Catch: java.lang.Throwable -> Lb3
            ddoj r7 = (defpackage.ddoj) r7     // Catch: java.lang.Throwable -> Lb3
            r8.add(r7)     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r6)
            return
        Lb1:
            monitor-exit(r6)
            return
        Lb3:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crox.q(java.lang.String, ddoi):void");
    }

    public final synchronized void a(@dzsi String str) {
        this.d = str;
    }

    public final synchronized void b(@dzsi String str) {
        this.l = str;
    }

    public final synchronized void c() {
        this.f++;
    }

    public final synchronized void d() {
        this.g++;
    }

    public final synchronized void e() {
        this.h++;
    }

    public final synchronized void f() {
        this.i++;
    }

    public final synchronized void g() {
        this.j++;
    }

    public final synchronized void h() {
        this.k++;
    }

    public final synchronized void i() {
        this.o++;
    }

    public final synchronized void j() {
        this.p++;
    }

    public final synchronized void k(String str) {
        if (!this.n.a(str, ddoi.LOCAL)) {
            this.n.e(str, ddoi.LOCAL, Long.valueOf(this.c.e()));
        }
    }

    public final synchronized void l(String str) {
        q(str, ddoi.LOCAL);
    }

    public final synchronized void m(String str) {
        if (!this.n.a(str, ddoi.NETWORK)) {
            this.n.e(str, ddoi.NETWORK, Long.valueOf(this.c.e()));
        }
    }

    public final synchronized void n(String str) {
        q(str, ddoi.NETWORK);
    }

    public final synchronized void o(ddnt ddntVar) {
        if (this.f == 0 && this.g == 0 && this.h == 0 && this.i == 0 && this.j == 0 && this.k == 0 && this.m.isEmpty() && this.o == 0 && this.p == 0) {
            return;
        }
        String str = this.d;
        if (str != null) {
            if (ddntVar.c) {
                ddntVar.bF();
                ddntVar.c = false;
            }
            ddom ddomVar = (ddom) ddntVar.b;
            ddom ddomVar2 = ddom.aj;
            str.getClass();
            ddomVar.b |= 32768;
            ddomVar.R = str;
        }
        String str2 = this.l;
        if (str2 != null) {
            if (ddntVar.c) {
                ddntVar.bF();
                ddntVar.c = false;
            }
            ddom ddomVar3 = (ddom) ddntVar.b;
            ddom ddomVar4 = ddom.aj;
            str2.getClass();
            ddomVar3.c |= 1;
            ddomVar3.Z = str2;
        }
        String valueOf = String.valueOf(this.e);
        if (ddntVar.c) {
            ddntVar.bF();
            ddntVar.c = false;
        }
        ddom ddomVar5 = (ddom) ddntVar.b;
        ddom ddomVar6 = ddom.aj;
        valueOf.getClass();
        int i = ddomVar5.b | ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        ddomVar5.b = i;
        ddomVar5.S = valueOf;
        int i2 = this.f;
        int i3 = i | 262144;
        ddomVar5.b = i3;
        ddomVar5.T = i2;
        int i4 = this.g;
        int i5 = i3 | ImageMetadata.LENS_APERTURE;
        ddomVar5.b = i5;
        ddomVar5.U = i4;
        int i6 = this.h;
        int i7 = i5 | ImageMetadata.SHADING_MODE;
        ddomVar5.b = i7;
        ddomVar5.V = i6;
        int i8 = this.i;
        int i9 = i7 | 4194304;
        ddomVar5.b = i9;
        ddomVar5.W = i8;
        int i10 = this.j;
        int i11 = i9 | 8388608;
        ddomVar5.b = i11;
        ddomVar5.X = i10;
        int i12 = this.k;
        ddomVar5.b = i11 | 16777216;
        ddomVar5.Y = i12;
        List<ddoj> list = this.m;
        ddom ddomVar7 = (ddom) ddntVar.b;
        dsrj<ddoj> dsrjVar = ddomVar7.ac;
        if (!dsrjVar.a()) {
            ddomVar7.ac = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, ddomVar7.ac);
        int i13 = this.o;
        if (ddntVar.c) {
            ddntVar.bF();
            ddntVar.c = false;
        }
        ddom ddomVar8 = (ddom) ddntVar.b;
        int i14 = ddomVar8.c | 2;
        ddomVar8.c = i14;
        ddomVar8.aa = i13;
        int i15 = this.p;
        ddomVar8.c = i14 | 4;
        ddomVar8.ab = i15;
    }

    public final synchronized void p() {
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.m = new ArrayList();
        this.n = dcbv.j();
        this.o = 0;
        this.p = 0;
    }

    public final synchronized String toString() {
        dbsb b;
        b = dbsc.b(this);
        b.b("TTS_ENGINE", this.d);
        b.b("TTS_LOCALE", this.e);
        b.f("SYNTHESIS_COUNT", this.f);
        b.f("NETWORK_SYNTHESIS_COUNT", this.g);
        b.f("SYNTHESIS_TIMEOUTS", this.h);
        b.f("VOICE_ALERTS_COUNT", this.i);
        b.f("LOCAL_ALERTS_PLAYED", this.j);
        b.f("NETWORK_ALERTS_PLAYED", this.k);
        b.f("TTS_CACHE_REQUEST_COUNT", this.o);
        b.f("TTS_CACHE_HIT_COUNT", this.p);
        b.b("VOICE_NAME", this.l);
        for (ddoj ddojVar : this.m) {
            Object[] objArr = new Object[3];
            ddoi b2 = ddoi.b(ddojVar.b);
            if (b2 == null) {
                b2 = ddoi.UNKNOWN_SYNTHESIS_TYPE;
            }
            objArr[0] = b2;
            objArr[1] = Boolean.valueOf(ddojVar.c);
            objArr[2] = Integer.valueOf(ddojVar.d);
            b.b("SYNTHESIS_EVENT", String.format("TYPE:%s;IS_INITIAL:%s;DURATION:%d", objArr));
        }
        b.c();
        return b.toString();
    }
}
