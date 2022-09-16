package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: ambz  reason: default package */
/* loaded from: classes.dex */
public final class ambz {
    public final amct a;
    public final amcv b;

    public ambz(amct amctVar, amcv amcvVar) {
        this.a = amctVar;
        this.b = amcvVar;
    }

    public final ankt a(final String str, final String str2) {
        amct amctVar = this.a;
        return anii.h(amctVar.b.a(), new ampg() { // from class: amcs
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                String str3 = str;
                String str4 = str2;
                for (amds amdsVar : Collections.unmodifiableMap(((amdp) obj).d).values()) {
                    ambp ambpVar = amdsVar.d;
                    if (ambpVar == null) {
                        ambpVar = ambp.a;
                    }
                    if (ambpVar.i.equals(str3)) {
                        ambp ambpVar2 = amdsVar.d;
                        if (ambpVar2 == null) {
                            ambpVar2 = ambp.a;
                        }
                        if (ambpVar2.c.equals(str4)) {
                            return AccountId.b(amdsVar.c);
                        }
                    }
                }
                throw new amcn(str3.length() != 0 ? "No account is found for ".concat(str3) : new String("No account is found for "));
            }
        }, amctVar.a);
    }

    public final ankt b(AccountId accountId) {
        return anii.h(this.a.b.a(), new amcr(accountId), anjk.a);
    }

    public final ankt c() {
        amct amctVar = this.a;
        return anii.h(amctVar.b.a(), amcf.d, amctVar.a);
    }
}
