package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.EventParcel;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: rmf  reason: default package */
/* loaded from: classes4.dex */
final class rmf implements Callable {
    final /* synthetic */ EventParcel a;
    final /* synthetic */ String b;
    final /* synthetic */ rki c;

    public rmf(rki rkiVar, EventParcel eventParcel, String str) {
        this.c = rkiVar;
        this.a = eventParcel;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        rpq rpqVar;
        rjy c;
        long j;
        byte[] bArr;
        this.c.a.w();
        rnl rnlVar = this.c.a.f;
        rpn.R(rnlVar);
        EventParcel eventParcel = this.a;
        String str = this.b;
        rnlVar.n();
        rlx.B();
        qnm.b(eventParcel);
        qnm.l(str);
        if (!rnlVar.J().p(str, rkg.V)) {
            rnlVar.aG().j.b("Generating ScionPayload disabled. packageName", str);
            bArr = new byte[0];
        } else if (!"_iap".equals(eventParcel.a) && !"_iapx".equals(eventParcel.a)) {
            rnlVar.aG().j.c("Generating a payload for this event is not available. package_name, event_name", str, eventParcel.a);
            return null;
        } else {
            aopa createBuilder = rqj.a.createBuilder();
            rnlVar.R().s();
            try {
                rix f = rnlVar.R().f(str);
                if (f == null) {
                    rnlVar.aG().j.b("Log and bundle not available. package_name", str);
                    bArr = new byte[0];
                } else if (f.S()) {
                    aopa createBuilder2 = rqk.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    rqk.d((rqk) createBuilder2.instance);
                    createBuilder2.copyOnWrite();
                    rqk.c((rqk) createBuilder2.instance);
                    if (!TextUtils.isEmpty(f.m())) {
                        String m = f.m();
                        createBuilder2.copyOnWrite();
                        rqk rqkVar = (rqk) createBuilder2.instance;
                        m.getClass();
                        rqkVar.b |= 4096;
                        rqkVar.r = m;
                    }
                    if (!TextUtils.isEmpty(f.o())) {
                        String o = f.o();
                        qnm.b(o);
                        createBuilder2.copyOnWrite();
                        rqk rqkVar2 = (rqk) createBuilder2.instance;
                        rqkVar2.b |= 2048;
                        rqkVar2.q = o;
                    }
                    if (!TextUtils.isEmpty(f.p())) {
                        String p = f.p();
                        qnm.b(p);
                        createBuilder2.copyOnWrite();
                        rqk rqkVar3 = (rqk) createBuilder2.instance;
                        rqkVar3.b |= 8192;
                        rqkVar3.s = p;
                    }
                    if (f.b() != -2147483648L) {
                        int b = (int) f.b();
                        createBuilder2.copyOnWrite();
                        rqk rqkVar4 = (rqk) createBuilder2.instance;
                        rqkVar4.b |= 33554432;
                        rqkVar4.F = b;
                    }
                    long g = f.g();
                    createBuilder2.copyOnWrite();
                    rqk rqkVar5 = (rqk) createBuilder2.instance;
                    rqkVar5.b |= 16384;
                    rqkVar5.t = g;
                    long e = f.e();
                    createBuilder2.copyOnWrite();
                    rqk rqkVar6 = (rqk) createBuilder2.instance;
                    rqkVar6.c |= 16;
                    rqkVar6.O = e;
                    String s = f.s();
                    String l = f.l();
                    axtf.b();
                    if (rnlVar.J().p(f.m(), rkg.ae)) {
                        String r = f.r();
                        if (!TextUtils.isEmpty(s)) {
                            createBuilder2.copyOnWrite();
                            rqk rqkVar7 = (rqk) createBuilder2.instance;
                            s.getClass();
                            rqkVar7.b |= 4194304;
                            rqkVar7.B = s;
                        } else if (!TextUtils.isEmpty(r)) {
                            createBuilder2.copyOnWrite();
                            rqk rqkVar8 = (rqk) createBuilder2.instance;
                            r.getClass();
                            rqkVar8.c |= 64;
                            rqkVar8.Q = r;
                        } else if (!TextUtils.isEmpty(l)) {
                            createBuilder2.copyOnWrite();
                            rqk rqkVar9 = (rqk) createBuilder2.instance;
                            l.getClass();
                            rqkVar9.c |= 4;
                            rqkVar9.L = l;
                        }
                    } else if (!TextUtils.isEmpty(s)) {
                        createBuilder2.copyOnWrite();
                        rqk rqkVar10 = (rqk) createBuilder2.instance;
                        s.getClass();
                        rqkVar10.b |= 4194304;
                        rqkVar10.B = s;
                    } else if (!TextUtils.isEmpty(l)) {
                        createBuilder2.copyOnWrite();
                        rqk rqkVar11 = (rqk) createBuilder2.instance;
                        l.getClass();
                        rqkVar11.c |= 4;
                        rqkVar11.L = l;
                    }
                    rjq h = rnlVar.j.h(str);
                    long d = f.d();
                    createBuilder2.copyOnWrite();
                    rqk rqkVar12 = (rqk) createBuilder2.instance;
                    rqkVar12.b |= 524288;
                    rqkVar12.y = d;
                    if (rnlVar.w.w() && rnlVar.J().q(((rqk) createBuilder2.instance).r) && h.g() && !TextUtils.isEmpty(null)) {
                        createBuilder2.copyOnWrite();
                        rqk rqkVar13 = (rqk) createBuilder2.instance;
                        throw null;
                    }
                    String f2 = h.f();
                    createBuilder2.copyOnWrite();
                    rqk rqkVar14 = (rqk) createBuilder2.instance;
                    f2.getClass();
                    rqkVar14.c |= 128;
                    rqkVar14.R = f2;
                    if (h.g()) {
                        Pair c2 = rnlVar.T().c(f.m(), h);
                        if (f.R() && !TextUtils.isEmpty((CharSequence) c2.first)) {
                            try {
                                String str2 = (String) c2.first;
                                Long.toString(eventParcel.d);
                                String a = rnl.a();
                                createBuilder2.copyOnWrite();
                                rqk rqkVar15 = (rqk) createBuilder2.instance;
                                a.getClass();
                                rqkVar15.b |= 65536;
                                rqkVar15.v = a;
                                if (c2.second != null) {
                                    boolean booleanValue = ((Boolean) c2.second).booleanValue();
                                    createBuilder2.copyOnWrite();
                                    rqk rqkVar16 = (rqk) createBuilder2.instance;
                                    rqkVar16.b |= 131072;
                                    rqkVar16.w = booleanValue;
                                }
                            } catch (SecurityException e2) {
                                rnlVar.aG().j.b("Resettable device id encryption failed", e2.getMessage());
                                bArr = new byte[0];
                            }
                        }
                    }
                    String b2 = rnlVar.K().b();
                    createBuilder2.copyOnWrite();
                    rqk rqkVar17 = (rqk) createBuilder2.instance;
                    b2.getClass();
                    rqkVar17.b |= 256;
                    rqkVar17.n = b2;
                    String c3 = rnlVar.K().c();
                    createBuilder2.copyOnWrite();
                    rqk rqkVar18 = (rqk) createBuilder2.instance;
                    c3.getClass();
                    rqkVar18.b |= 128;
                    rqkVar18.m = c3;
                    int a2 = (int) rnlVar.K().a();
                    createBuilder2.copyOnWrite();
                    rqk rqkVar19 = (rqk) createBuilder2.instance;
                    rqkVar19.b |= 1024;
                    rqkVar19.p = a2;
                    String d2 = rnlVar.K().d();
                    createBuilder2.copyOnWrite();
                    rqk rqkVar20 = (rqk) createBuilder2.instance;
                    d2.getClass();
                    rqkVar20.b |= 512;
                    rqkVar20.o = d2;
                    try {
                        if (h.h() && f.n() != null) {
                            qnm.b(f.n());
                            Long.toString(eventParcel.d);
                            String a3 = rnl.a();
                            createBuilder2.copyOnWrite();
                            rqk rqkVar21 = (rqk) createBuilder2.instance;
                            a3.getClass();
                            rqkVar21.b |= 262144;
                            rqkVar21.x = a3;
                        }
                        if (!TextUtils.isEmpty(f.q())) {
                            String q = f.q();
                            qnm.b(q);
                            createBuilder2.copyOnWrite();
                            rqk rqkVar22 = (rqk) createBuilder2.instance;
                            rqkVar22.b |= 16777216;
                            rqkVar22.E = q;
                        }
                        String m2 = f.m();
                        List q2 = rnlVar.R().q(m2);
                        Iterator it = q2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                rpqVar = null;
                                break;
                            }
                            rpqVar = (rpq) it.next();
                            if ("_lte".equals(rpqVar.c)) {
                                break;
                            }
                        }
                        if (rpqVar == null) {
                            rnlVar.Q();
                            rpq rpqVar2 = new rpq(m2, "auto", "_lte", System.currentTimeMillis(), 0L);
                            q2.add(rpqVar2);
                            rnlVar.R().C(rpqVar2);
                        }
                        rpp U = rnlVar.U();
                        U.aG().k.a("Checking account type status for ad personalization signals");
                        if (U.K().e()) {
                            String m3 = f.m();
                            qnm.b(m3);
                            if (f.R() && U.S().f(m3)) {
                                U.aG().j.a("Turning off ad personalization due to account type");
                                Iterator it2 = q2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((rpq) it2.next()).c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                U.Q();
                                q2.add(new rpq(m3, "auto", "_npa", System.currentTimeMillis(), 1L));
                            }
                        }
                        rqo[] rqoVarArr = new rqo[q2.size()];
                        for (int i = 0; i < q2.size(); i++) {
                            aopa createBuilder3 = rqo.a.createBuilder();
                            String str3 = ((rpq) q2.get(i)).c;
                            createBuilder3.copyOnWrite();
                            rqo rqoVar = (rqo) createBuilder3.instance;
                            str3.getClass();
                            rqoVar.b |= 2;
                            rqoVar.d = str3;
                            long j2 = ((rpq) q2.get(i)).d;
                            createBuilder3.copyOnWrite();
                            rqo rqoVar2 = (rqo) createBuilder3.instance;
                            rqoVar2.b |= 1;
                            rqoVar2.c = j2;
                            rnlVar.U().B(createBuilder3, ((rpq) q2.get(i)).e);
                            rqoVarArr[i] = (rqo) createBuilder3.mo39build();
                        }
                        List asList = Arrays.asList(rqoVarArr);
                        createBuilder2.copyOnWrite();
                        rqk rqkVar23 = (rqk) createBuilder2.instance;
                        rqkVar23.b();
                        aonk.addAll((Iterable) asList, (List) rqkVar23.f);
                        rkt b3 = rkt.b(eventParcel);
                        rnlVar.N().F(b3.d, rnlVar.R().e(str));
                        rnlVar.N().G(b3, rnlVar.J().c(str));
                        Bundle bundle = b3.d;
                        bundle.putLong("_c", 1L);
                        rnlVar.aG().j.a("Marking in-app purchase as real-time");
                        bundle.putLong("_r", 1L);
                        bundle.putString("_o", eventParcel.c);
                        if (rnlVar.N().aj(((rqk) createBuilder2.instance).r)) {
                            rnlVar.N().S(bundle, "_dbg", 1L);
                            rnlVar.N().S(bundle, "_r", 1L);
                        }
                        rjy i2 = rnlVar.R().i(str, eventParcel.a);
                        if (i2 == null) {
                            c = new rjy(str, eventParcel.a, eventParcel.d);
                            j = 0;
                        } else {
                            long j3 = i2.f;
                            c = i2.c(eventParcel.d);
                            j = j3;
                        }
                        rnlVar.R().y(c);
                        rjx rjxVar = new rjx(rnlVar.w, eventParcel.c, str, eventParcel.a, eventParcel.d, j, bundle);
                        rqf e3 = rqg.e();
                        long j4 = rjxVar.d;
                        e3.copyOnWrite();
                        ((rqg) e3.instance).C(j4);
                        String str4 = rjxVar.b;
                        e3.copyOnWrite();
                        ((rqg) e3.instance).z(str4);
                        long j5 = rjxVar.e;
                        e3.copyOnWrite();
                        ((rqg) e3.instance).B(j5);
                        Iterator it3 = rjxVar.f.iterator();
                        while (it3.hasNext()) {
                            String mo416next = ((rjz) it3).mo416next();
                            aopa createBuilder4 = rqi.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            rqi rqiVar = (rqi) createBuilder4.instance;
                            mo416next.getClass();
                            rqiVar.b |= 1;
                            rqiVar.c = mo416next;
                            Object b4 = rjxVar.f.b(mo416next);
                            if (b4 != null) {
                                rnlVar.U().A(createBuilder4, b4);
                                e3.e(createBuilder4);
                            }
                        }
                        createBuilder2.r(e3);
                        aopa createBuilder5 = rql.a.createBuilder();
                        aopa createBuilder6 = rqh.a.createBuilder();
                        long j6 = c.c;
                        createBuilder6.copyOnWrite();
                        rqh rqhVar = (rqh) createBuilder6.instance;
                        rqhVar.b |= 2;
                        rqhVar.d = j6;
                        String str5 = eventParcel.a;
                        createBuilder6.copyOnWrite();
                        rqh rqhVar2 = (rqh) createBuilder6.instance;
                        str5.getClass();
                        rqhVar2.b |= 1;
                        rqhVar2.c = str5;
                        createBuilder5.copyOnWrite();
                        rql rqlVar = (rql) createBuilder5.instance;
                        rqh rqhVar3 = (rqh) createBuilder6.mo39build();
                        rqhVar3.getClass();
                        aopu aopuVar = rqlVar.b;
                        if (!aopuVar.c()) {
                            rqlVar.b = aopi.mutableCopy(aopuVar);
                        }
                        rqlVar.b.add(rqhVar3);
                        createBuilder2.copyOnWrite();
                        rqk rqkVar24 = (rqk) createBuilder2.instance;
                        rql rqlVar2 = (rql) createBuilder5.mo39build();
                        rqlVar2.getClass();
                        rqkVar24.M = rqlVar2;
                        rqkVar24.c |= 8;
                        createBuilder2.q(rnlVar.j.e().a(f.m(), Collections.emptyList(), Collections.unmodifiableList(((rqk) createBuilder2.instance).f), Long.valueOf(((rqg) e3.instance).d()), Long.valueOf(((rqg) e3.instance).d())));
                        if (((rqg) e3.instance).t()) {
                            long d3 = ((rqg) e3.instance).d();
                            createBuilder2.copyOnWrite();
                            rqk rqkVar25 = (rqk) createBuilder2.instance;
                            rqkVar25.b |= 4;
                            rqkVar25.h = d3;
                            long d4 = ((rqg) e3.instance).d();
                            createBuilder2.copyOnWrite();
                            rqk rqkVar26 = (rqk) createBuilder2.instance;
                            rqkVar26.b |= 8;
                            rqkVar26.i = d4;
                        }
                        long h2 = f.h();
                        if (h2 != 0) {
                            createBuilder2.copyOnWrite();
                            rqk rqkVar27 = (rqk) createBuilder2.instance;
                            rqkVar27.b |= 32;
                            rqkVar27.k = h2;
                        }
                        long j7 = f.j();
                        if (j7 != 0) {
                            createBuilder2.copyOnWrite();
                            rqk rqkVar28 = (rqk) createBuilder2.instance;
                            rqkVar28.b |= 16;
                            rqkVar28.j = j7;
                        } else if (h2 != 0) {
                            createBuilder2.copyOnWrite();
                            rqk rqkVar29 = (rqk) createBuilder2.instance;
                            rqkVar29.b |= 16;
                            rqkVar29.j = h2;
                        }
                        f.v();
                        int i3 = (int) f.i();
                        createBuilder2.copyOnWrite();
                        rqk rqkVar30 = (rqk) createBuilder2.instance;
                        rqkVar30.b |= 1048576;
                        rqkVar30.z = i3;
                        rnlVar.J().y();
                        createBuilder2.copyOnWrite();
                        rqk rqkVar31 = (rqk) createBuilder2.instance;
                        rqkVar31.b |= 32768;
                        rqkVar31.u = 43009L;
                        rnlVar.Q();
                        long currentTimeMillis = System.currentTimeMillis();
                        createBuilder2.copyOnWrite();
                        rqk rqkVar32 = (rqk) createBuilder2.instance;
                        rqkVar32.b |= 2;
                        rqkVar32.g = currentTimeMillis;
                        boolean booleanValue2 = Boolean.TRUE.booleanValue();
                        createBuilder2.copyOnWrite();
                        rqk rqkVar33 = (rqk) createBuilder2.instance;
                        rqkVar33.b |= 8388608;
                        rqkVar33.C = booleanValue2;
                        createBuilder.X(createBuilder2);
                        f.O(((rqk) createBuilder2.instance).h);
                        f.M(((rqk) createBuilder2.instance).i);
                        rnlVar.R().x(f);
                        rnlVar.R().w();
                        rnlVar.R().t();
                        try {
                            return rnlVar.U().t(((rqj) createBuilder.mo39build()).toByteArray());
                        } catch (IOException e4) {
                            rnlVar.aG().c.c("Data loss. Failed to bundle and serialize. appId", rks.a(str), e4);
                            return null;
                        }
                    } catch (SecurityException e5) {
                        rnlVar.aG().j.b("app instance id encryption failed", e5.getMessage());
                        byte[] bArr2 = new byte[0];
                        rnlVar.R().t();
                        return bArr2;
                    }
                } else {
                    rnlVar.aG().j.b("Log and bundle disabled. package_name", str);
                    bArr = new byte[0];
                }
                rnlVar.R().t();
            } catch (Throwable th) {
                rnlVar.R().t();
                throw th;
            }
        }
        return bArr;
    }
}
