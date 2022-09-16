package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: PG */
/* renamed from: mvj  reason: default package */
/* loaded from: classes3.dex */
public final class mvj {
    private static final vdw a = vdw.b();

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
        if (r5.m(r5.e(r8, null)) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mvi a(java.lang.String r8, defpackage.avvz r9) {
        /*
            boolean r0 = r8.isEmpty()
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L3d
            boolean r8 = r9.c
            if (r8 == 0) goto L11
            mvi r8 = defpackage.mvi.a()
            goto L3c
        L11:
            int r8 = r9.b
            r8 = r8 & r1
            if (r8 == 0) goto L1d
            arag r8 = r9.d
            if (r8 != 0) goto L1e
            arag r8 = defpackage.arag.a
            goto L1e
        L1d:
            r8 = r2
        L1e:
            int r0 = r9.b
            r0 = r0 & 4
            if (r0 == 0) goto L2b
            apzg r0 = r9.e
            if (r0 != 0) goto L2c
            apzg r0 = defpackage.apzg.a
            goto L2c
        L2b:
            r0 = r2
        L2c:
            int r1 = r9.b
            r1 = r1 & 8
            if (r1 == 0) goto L38
            asir r2 = r9.f
            if (r2 != 0) goto L38
            asir r2 = defpackage.asir.a
        L38:
            mvi r8 = defpackage.mvi.b(r8, r0, r2)
        L3c:
            return r8
        L3d:
            r0 = 0
            r3 = 0
        L3f:
            aopu r4 = r9.g
            int r4 = r4.size()
            if (r3 >= r4) goto Lbd
            aopu r4 = r9.g
            java.lang.Object r4 = r4.get(r3)
            avvy r4 = (defpackage.avvy) r4
            int r5 = r4.c
            r6 = 1
            if (r5 != r6) goto L5d
            java.lang.Object r5 = r4.d
            avvx r5 = (defpackage.avvx) r5
            boolean r6 = c(r8, r5)
            goto L8b
        L5d:
            if (r5 != r1) goto Lba
            java.lang.Object r5 = r4.d
            avvw r5 = (defpackage.avvw) r5
            int r5 = r5.b
            int r5 = defpackage.awwc.af(r5)
            if (r5 != 0) goto L6c
            r5 = 1
        L6c:
            int r5 = r5 + (-1)
            if (r5 == r6) goto L81
            if (r5 == r1) goto L74
        L72:
            r6 = 0
            goto L8b
        L74:
            vdw r5 = defpackage.mvj.a     // Catch: defpackage.vdv -> L72
            veb r7 = r5.e(r8, r2)     // Catch: defpackage.vdv -> L72
            boolean r5 = r5.m(r7)     // Catch: defpackage.vdv -> L72
            if (r5 == 0) goto L72
            goto L8b
        L81:
            java.util.regex.Pattern r5 = android.util.Patterns.EMAIL_ADDRESS
            java.util.regex.Matcher r5 = r5.matcher(r8)
            boolean r6 = r5.matches()
        L8b:
            if (r6 != 0) goto Lba
            int r8 = r4.b
            r8 = r8 & 4
            if (r8 == 0) goto L9a
            arag r8 = r4.e
            if (r8 != 0) goto L9b
            arag r8 = defpackage.arag.a
            goto L9b
        L9a:
            r8 = r2
        L9b:
            int r9 = r4.b
            r9 = r9 & 8
            if (r9 == 0) goto La8
            apzg r9 = r4.f
            if (r9 != 0) goto La9
            apzg r9 = defpackage.apzg.a
            goto La9
        La8:
            r9 = r2
        La9:
            int r0 = r4.b
            r0 = r0 & 16
            if (r0 == 0) goto Lb5
            asir r2 = r4.g
            if (r2 != 0) goto Lb5
            asir r2 = defpackage.asir.a
        Lb5:
            mvi r8 = defpackage.mvi.b(r8, r9, r2)
            return r8
        Lba:
            int r3 = r3 + 1
            goto L3f
        Lbd:
            mvi r8 = defpackage.mvi.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvj.a(java.lang.String, avvz):mvi");
    }

    public static void b(acti actiVar, acte acteVar, asir asirVar) {
        if (asirVar != null) {
            List asList = Arrays.asList(asirVar);
            aopa createBuilder = asjj.a.createBuilder();
            aopa createBuilder2 = asit.a.createBuilder();
            aopa createBuilder3 = asis.a.createBuilder();
            createBuilder3.ao(asList);
            createBuilder2.copyOnWrite();
            asit asitVar = (asit) createBuilder2.instance;
            asis asisVar = (asis) createBuilder3.mo39build();
            asisVar.getClass();
            asitVar.d = asisVar;
            asitVar.c = 1;
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asit asitVar2 = (asit) createBuilder2.mo39build();
            asitVar2.getClass();
            asjjVar.t = asitVar2;
            asjjVar.c |= 1024;
            actiVar.w(acteVar, (asjj) createBuilder.mo39build());
        }
    }

    private static boolean c(String str, avvx avvxVar) {
        int size = avvxVar.b.size();
        int ae = awwc.ae(avvxVar.c);
        if (ae == 0) {
            ae = 1;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            try {
                if (Pattern.compile((String) avvxVar.b.get(i)).matcher(str).find()) {
                    i2++;
                    if (ae == 2) {
                        break;
                    } else if (ae == 3) {
                        ae = 3;
                        break;
                    }
                } else {
                    continue;
                }
            } catch (PatternSyntaxException unused) {
            }
            i++;
        }
        if (ae != 2 || i2 <= 0) {
            if (ae == 3 && i2 == 0) {
                return true;
            }
            return ae == 4 && i2 < size;
        }
        return true;
    }
}
