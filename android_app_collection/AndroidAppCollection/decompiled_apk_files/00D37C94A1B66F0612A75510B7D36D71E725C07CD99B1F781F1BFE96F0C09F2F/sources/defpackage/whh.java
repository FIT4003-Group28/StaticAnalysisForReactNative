package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: PG */
/* renamed from: whh  reason: default package */
/* loaded from: classes4.dex */
public final class whh implements amam, aman {
    public final ambz a;
    public final ambo b;
    public final amgj c;
    public final afvn d;
    private final amcj e;
    private final whe f;

    public whh(ambz ambzVar, ambo amboVar, amgj amgjVar, afvn afvnVar, amcj amcjVar, whe wheVar) {
        this.a = ambzVar;
        this.b = amboVar;
        this.c = amgjVar;
        this.d = afvnVar;
        this.e = amcjVar;
        this.f = wheVar;
    }

    @Override // defpackage.amal
    public final ankt a(amaq amaqVar) {
        this.f.a(aowo.ACCOUNT_SELECTOR_EVENT_TYPE_AUTO, aowm.ACCOUNT_SELECTOR_EVENT_API_GET_SELECTION, aown.ACCOUNT_SELECTOR_EVENT_RESULT_INITIATED);
        return anii.i(anii.i(anko.q(this.e.a()), ammo.c(new whg(this, 1)), anjk.a), ammo.c(new whg(this)), anjk.a);
    }

    @Override // defpackage.amam
    public final ankt b(final AccountId accountId) {
        this.f.a(aowo.ACCOUNT_SELECTOR_EVENT_TYPE_AUTO, aowm.ACCOUNT_SELECTOR_EVENT_API_USE_SELECTION, aown.ACCOUNT_SELECTOR_EVENT_RESULT_INITIATED);
        final amdf amdfVar = (amdf) this.a.b;
        return anii.i(amdfVar.h.a(), ammo.c(new anir() { // from class: amda
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                final amdf amdfVar2 = amdf.this;
                final AccountId accountId2 = accountId;
                amds b = amct.b((amdp) obj, accountId2);
                int k = answ.k(b.e);
                if (k == 0 || k != 2) {
                    final ambr a = ambr.a(accountId2, amdf.a(b).b);
                    Set<ambu> set = (Set) ((axov) amdfVar2.c).a;
                    ArrayList arrayList = new ArrayList(set.size());
                    for (ambu ambuVar : set) {
                        try {
                            arrayList.add(ambuVar.a());
                        } catch (Exception e) {
                            arrayList.add(anlz.p(e));
                        }
                    }
                    return anii.i(anlz.l(arrayList).b(ammo.b(new aniq() { // from class: amcw
                        @Override // defpackage.aniq
                        public final ankt a() {
                            return amdf.this.h.b(new amcr(accountId2, 3), anjk.a);
                        }
                    }), anjk.a), ammo.c(new anir() { // from class: amdb
                        @Override // defpackage.anir
                        public final ankt a(Object obj2) {
                            final amdf amdfVar3 = amdf.this;
                            return amdf.b((Set) ((axov) amdfVar3.g).a).b(ammo.b(new aniq() { // from class: amcx
                                @Override // defpackage.aniq
                                public final ankt a() {
                                    return amdf.b((Set) amdf.this.d.get()).a(gbb.u, anjk.a);
                                }
                            }), anjk.a);
                        }
                    }), anjk.a);
                }
                return anlz.q(null);
            }
        }), anjk.a);
    }
}
