package defpackage;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amak  reason: default package */
/* loaded from: classes.dex */
public final class amak implements amag {
    public static final amzy a = amzy.l("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl");
    public final List b = new ArrayList();
    private final alzw c;
    private final azqb d;
    private final ankw e;

    public amak(alzw alzwVar, ampq ampqVar, ankw ankwVar) {
        this.c = alzwVar;
        this.d = (azqb) ((ampv) ampqVar).a;
        this.e = ankwVar;
    }

    @Override // defpackage.amag
    public final void a(amaf amafVar) {
        uwp.f();
        synchronized (this.b) {
            this.b.add(amafVar);
        }
    }

    @Override // defpackage.amag
    public final void b(amaf amafVar) {
        uwp.f();
        synchronized (this.b) {
            this.b.remove(amafVar);
        }
    }

    @Override // defpackage.amag
    public final amuk c() {
        return (amuk) this.d.get();
    }

    @Override // defpackage.amag
    public final ankt d(final AccountId accountId, final List list, Intent intent) {
        amlp l = amna.l("Validate Requirements");
        try {
            ankt i = anii.i(this.c.a(accountId), ammo.c(new anir() { // from class: amaj
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    List<amae> list2 = list;
                    final AccountId accountId2 = accountId;
                    ValidationResult validationResult = (ValidationResult) obj;
                    ArrayList arrayList = new ArrayList(list2.size());
                    for (final amae amaeVar : list2) {
                        arrayList.add(new aniq() { // from class: amah
                            @Override // defpackage.aniq
                            public final ankt a() {
                                return amae.this.a(accountId2);
                            }
                        });
                    }
                    return anii.h(answ.l(arrayList, akxb.g, anjk.a), ammo.a(aiyy.t), anjk.a);
                }
            }), anjk.a);
            l.a(i);
            l.close();
            return i;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.amag
    public final ankt e() {
        return anlz.v(ammo.b(new aniq() { // from class: amai
            @Override // defpackage.aniq
            public final ankt a() {
                amuk o;
                ankt q;
                amak amakVar = amak.this;
                synchronized (amakVar.b) {
                    o = amuk.o(amakVar.b);
                }
                ArrayList arrayList = new ArrayList(o.size());
                int size = o.size();
                for (int i = 0; i < size; i++) {
                    try {
                        q = ((amaf) o.get(i)).g();
                    } catch (Throwable th) {
                        ((amzw) ((amzw) ((amzw) amak.a.f()).h(th)).i("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl", "lambda$notifyRequirementStateChanged$6", (char) 195, "AccountRequirementManagerImpl.java")).q("OnRequirementStateChanged observer failed.");
                        q = anlz.q(null);
                    }
                    arrayList.add(q);
                }
                return anlz.j(arrayList).a(almu.o(), anjk.a);
            }
        }), this.e);
    }
}
