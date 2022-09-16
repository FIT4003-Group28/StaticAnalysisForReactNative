package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cnuw  reason: default package */
/* loaded from: classes.dex */
public abstract class cnuw<T extends IInterface> extends cnui<T> implements cnnz, cnux {
    private final Set<Scope> a;
    public final cnum s;
    private final Account t;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cnuw(android.content.Context r10, android.os.Looper r11, int r12, defpackage.cnum r13, defpackage.cnpv r14, defpackage.cnsi r15) {
        /*
            r9 = this;
            cnva r3 = defpackage.cnva.a(r10)
            cnmq r4 = defpackage.cnmq.a
            defpackage.cnwc.a(r14)
            defpackage.cnwc.a(r15)
            cnuu r6 = new cnuu
            r6.<init>(r14)
            cnuv r7 = new cnuv
            r7.<init>(r15)
            java.lang.String r8 = r13.f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.s = r13
            android.accounts.Account r10 = r13.a
            r9.t = r10
            java.util.Set<com.google.android.gms.common.api.Scope> r10 = r13.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnuw.<init>(android.content.Context, android.os.Looper, int, cnum, cnpv, cnsi):void");
    }

    @Override // defpackage.cnui
    public final Account H() {
        return this.t;
    }

    @Override // defpackage.cnui
    public final Feature[] I() {
        return new Feature[0];
    }

    @Override // defpackage.cnui
    protected final Set<Scope> N() {
        return this.a;
    }

    @Override // defpackage.cnnz
    public final Set<Scope> v() {
        return j() ? this.a : Collections.emptySet();
    }
}
