package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.Feature;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qxb  reason: default package */
/* loaded from: classes4.dex */
public abstract class qxb extends qwr implements qsn {
    public final qwu H;
    private final Set a;
    private final Account b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qxb(android.content.Context r10, android.os.Looper r11, int r12, defpackage.qwu r13, defpackage.qub r14, defpackage.qvh r15) {
        /*
            r9 = this;
            qxd r3 = defpackage.qxd.a(r10)
            qrq r4 = defpackage.qrq.a
            defpackage.qnm.b(r14)
            defpackage.qnm.b(r15)
            qwz r6 = new qwz
            r6.<init>(r14)
            qxa r7 = new qxa
            r7.<init>(r15)
            java.lang.String r8 = r13.f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.H = r13
            android.accounts.Account r10 = r13.a
            r9.b = r10
            java.util.Set r10 = r13.c
            java.util.Iterator r11 = r10.iterator()
        L2b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L46
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L3e
            goto L2b
        L3e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L46:
            r9.a = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxb.<init>(android.content.Context, android.os.Looper, int, qwu, qub, qvh):void");
    }

    @Override // defpackage.qwr
    public final Account C() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final Set F() {
        return this.a;
    }

    @Override // defpackage.qwr
    public final Feature[] M() {
        return new Feature[0];
    }

    @Override // defpackage.qwr, defpackage.qsn
    public int a() {
        throw null;
    }

    @Override // defpackage.qsn
    public final Set u() {
        return j() ? this.a : Collections.emptySet();
    }
}
