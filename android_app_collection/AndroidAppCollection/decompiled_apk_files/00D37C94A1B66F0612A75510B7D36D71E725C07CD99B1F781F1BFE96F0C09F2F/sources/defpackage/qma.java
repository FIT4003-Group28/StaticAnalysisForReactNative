package defpackage;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Map;
/* compiled from: PG */
/* renamed from: qma  reason: default package */
/* loaded from: classes4.dex */
public final class qma {
    private static final qpu a = new qpu("ApplicationAnalyticsUtils");
    private static final String b = "20.1.0";
    private final String c;
    private final Map d;
    private final Map e;

    public qma(Bundle bundle, String str) {
        this.c = str;
        this.d = tnk.l(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.e = tnk.l(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    public static void d(angb angbVar, boolean z) {
        aopa createBuilder = anga.a.createBuilder(((angc) angbVar.instance).a());
        createBuilder.copyOnWrite();
        anga angaVar = (anga) createBuilder.instance;
        angaVar.b |= 2;
        angaVar.d = z;
        angbVar.copyOnWrite();
        ((angc) angbVar.instance).p((anga) createBuilder.mo39build());
    }

    private static int e(int i) {
        return i + 10000;
    }

    public final angb a(qlz qlzVar) {
        long j;
        angb b2 = angc.b();
        long j2 = qlzVar.d;
        b2.copyOnWrite();
        ((angc) b2.instance).u(j2);
        int i = qlzVar.e;
        qlzVar.e = i + 1;
        b2.copyOnWrite();
        ((angc) b2.instance).r(i);
        String str = qlzVar.c;
        if (str != null) {
            b2.copyOnWrite();
            ((angc) b2.instance).s(str);
        }
        String str2 = qlzVar.h;
        if (str2 != null) {
            b2.copyOnWrite();
            ((angc) b2.instance).q(str2);
        }
        aopa createBuilder = anfz.a.createBuilder();
        String str3 = b;
        createBuilder.copyOnWrite();
        anfz anfzVar = (anfz) createBuilder.instance;
        str3.getClass();
        anfzVar.b |= 2;
        anfzVar.d = str3;
        String str4 = this.c;
        createBuilder.copyOnWrite();
        anfz anfzVar2 = (anfz) createBuilder.instance;
        str4.getClass();
        anfzVar2.b |= 1;
        anfzVar2.c = str4;
        b2.copyOnWrite();
        ((angc) b2.instance).m((anfz) createBuilder.mo39build());
        aopa createBuilder2 = anga.a.createBuilder();
        if (qlzVar.b != null) {
            aopa createBuilder3 = angd.a.createBuilder();
            String str5 = qlzVar.b;
            createBuilder3.copyOnWrite();
            angd angdVar = (angd) createBuilder3.instance;
            str5.getClass();
            angdVar.b |= 1;
            angdVar.c = str5;
            angd angdVar2 = (angd) createBuilder3.mo39build();
            createBuilder2.copyOnWrite();
            anga angaVar = (anga) createBuilder2.instance;
            angdVar2.getClass();
            angaVar.c = angdVar2;
            angaVar.b |= 1;
        }
        createBuilder2.copyOnWrite();
        anga angaVar2 = (anga) createBuilder2.instance;
        angaVar2.b |= 2;
        angaVar2.d = false;
        String str6 = qlzVar.f;
        if (str6 != null) {
            try {
                String replace = str6.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                a.e(e, "receiverSessionId %s is not valid for hash", str6);
                j = 0;
            }
            createBuilder2.copyOnWrite();
            anga angaVar3 = (anga) createBuilder2.instance;
            angaVar3.b |= 4;
            angaVar3.e = j;
        }
        int i2 = qlzVar.g;
        createBuilder2.copyOnWrite();
        anga angaVar4 = (anga) createBuilder2.instance;
        angaVar4.b |= 1024;
        angaVar4.h = i2;
        b2.copyOnWrite();
        ((angc) b2.instance).p((anga) createBuilder2.mo39build());
        return b2;
    }

    public final angc b(qlz qlzVar) {
        return (angc) a(qlzVar).mo39build();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.angc c(defpackage.qlz r5, int r6) {
        /*
            r4 = this;
            angb r5 = r4.a(r5)
            aopi r0 = r5.instance
            angc r0 = (defpackage.angc) r0
            anga r0 = r0.a()
            anga r1 = defpackage.anga.a
            aopa r0 = r1.createBuilder(r0)
            java.util.Map r1 = r4.e
            if (r1 == 0) goto L31
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L21
            goto L31
        L21:
            java.util.Map r1 = r4.e
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            defpackage.qnm.b(r1)
            int r1 = r1.intValue()
            goto L35
        L31:
            int r1 = e(r6)
        L35:
            r0.copyOnWrite()
            aopi r2 = r0.instance
            anga r2 = (defpackage.anga) r2
            int r3 = r2.b
            r3 = r3 | 64
            r2.b = r3
            r2.f = r1
            java.util.Map r1 = r4.d
            if (r1 == 0) goto L63
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L53
            goto L63
        L53:
            java.util.Map r6 = r4.d
            java.lang.Object r6 = r6.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            defpackage.qnm.b(r6)
            int r6 = r6.intValue()
            goto L67
        L63:
            int r6 = e(r6)
        L67:
            r0.copyOnWrite()
            aopi r1 = r0.instance
            anga r1 = (defpackage.anga) r1
            int r2 = r1.b
            r2 = r2 | 128(0x80, float:1.794E-43)
            r1.b = r2
            r1.g = r6
            aopi r6 = r0.mo39build()
            anga r6 = (defpackage.anga) r6
            r5.copyOnWrite()
            aopi r0 = r5.instance
            angc r0 = (defpackage.angc) r0
            defpackage.angc.f(r0, r6)
            aopi r5 = r5.mo39build()
            angc r5 = (defpackage.angc) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qma.c(qlz, int):angc");
    }
}
