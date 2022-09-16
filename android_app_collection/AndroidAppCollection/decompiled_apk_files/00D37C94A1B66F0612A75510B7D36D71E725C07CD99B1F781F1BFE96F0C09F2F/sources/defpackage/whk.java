package defpackage;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
/* compiled from: PG */
/* renamed from: whk  reason: default package */
/* loaded from: classes4.dex */
public final class whk implements amae {
    private final afvn a;
    private final ambo b;

    public whk(afvn afvnVar, ambo amboVar) {
        this.a = afvnVar;
        this.b = amboVar;
    }

    @Override // defpackage.amae
    public final ankt a(AccountId accountId) {
        final afvm c = this.a.c();
        return amnt.e(anii.h(this.b.a.b(accountId), amcf.b, anjk.a), new ampg() { // from class: whj
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                afvm afvmVar = afvm.this;
                ambn ambnVar = (ambn) obj;
                if (!wey.c(afvmVar).equals(ambnVar.b.c) || !wey.b(afvmVar).equals(ambnVar.b.i)) {
                    throw new alzz(new whi());
                }
                return ValidationResult.d();
            }
        }, anjk.a);
    }
}
