package defpackage;

import com.google.apps.tiktok.account.AccountId;
/* compiled from: PG */
/* renamed from: amct  reason: default package */
/* loaded from: classes.dex */
public final class amct {
    public final ankw a;
    public final vne b;

    public amct(vne vneVar, ankw ankwVar) {
        this.b = vneVar;
        this.a = ankwVar;
    }

    public static ambn a(amds amdsVar) {
        AccountId b = AccountId.b(amdsVar.c);
        ambp ambpVar = amdsVar.d;
        if (ambpVar == null) {
            ambpVar = ambp.a;
        }
        int k = answ.k(amdsVar.e);
        if (k == 0) {
            k = 1;
        }
        return ambn.a(b, ambpVar, k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amds b(amdp amdpVar, AccountId accountId) {
        try {
            int a = accountId.a();
            aoqp aoqpVar = amdpVar.d;
            Integer valueOf = Integer.valueOf(a);
            if (aoqpVar.containsKey(valueOf)) {
                return (amds) aoqpVar.get(valueOf);
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new amcn(e);
        }
    }
}
