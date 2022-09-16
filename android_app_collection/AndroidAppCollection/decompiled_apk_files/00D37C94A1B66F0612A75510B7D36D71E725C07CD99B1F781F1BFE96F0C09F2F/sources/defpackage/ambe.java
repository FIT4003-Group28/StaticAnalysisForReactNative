package defpackage;

import android.content.Intent;
import android.util.Pair;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ambe  reason: default package */
/* loaded from: classes.dex */
public final class ambe {
    public final ambz a;
    public final Set b;
    private final Map c;
    private final Map d;
    private final amag e;

    public ambe(ambz ambzVar, Map map, Map map2, Set set, amag amagVar) {
        this.a = ambzVar;
        this.c = map;
        this.d = map2;
        this.b = set;
        this.e = amagVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt a(final amaq amaqVar, List list) {
        Object obj;
        ArrayList arrayList = new ArrayList(((amxx) list).c);
        amzt listIterator = ((amuk) list).listIterator();
        while (listIterator.hasNext()) {
            Class cls = (Class) listIterator.next();
            if (aman.class.isAssignableFrom(cls)) {
                obj = this.c.get(cls);
            } else if (amap.class.isAssignableFrom(cls)) {
                obj = this.d.get(cls);
            } else {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("No selector registered for key: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            final azqb azqbVar = (azqb) obj;
            arrayList.add(new aniq() { // from class: amba
                @Override // defpackage.aniq
                public final ankt a() {
                    azqb azqbVar2 = azqb.this;
                    amaq amaqVar2 = amaqVar;
                    final amal amalVar = (amal) azqbVar2.get();
                    return anii.h(amalVar.a(amaqVar2), new ampg() { // from class: amay
                        @Override // defpackage.ampg
                        public final Object apply(Object obj2) {
                            return Pair.create(amal.this, obj2);
                        }
                    }, anjk.a);
                }
            });
        }
        return anii.i(answ.l(arrayList, akxb.h, anjk.a), ammo.c(new anir() { // from class: ambb
            @Override // defpackage.anir
            public final ankt a(Object obj2) {
                final ambe ambeVar = ambe.this;
                Pair pair = (Pair) obj2;
                if (pair != null) {
                    if (pair.first instanceof amao) {
                        Intent intent = (Intent) pair.second;
                        return anii.h(((amao) pair.first).b(), aiyy.u, anjk.a);
                    } else if (pair.first instanceof amam) {
                        final AccountId accountId = (AccountId) pair.second;
                        final amam amamVar = (amam) pair.first;
                        return anii.i(ambeVar.a.b(accountId), ammo.c(new anir() { // from class: ambd
                            @Override // defpackage.anir
                            public final ankt a(Object obj3) {
                                ambe ambeVar2 = ambe.this;
                                amam amamVar2 = amamVar;
                                AccountId accountId2 = accountId;
                                ambn ambnVar = (ambn) obj3;
                                if (!ambeVar2.b.contains(ambnVar.b.i)) {
                                    aqxo.z(ambnVar.c != 3, "Can't auto-select disabled accounts.");
                                }
                                return anii.h(amamVar2.b(accountId2), ammo.a(new amcr(accountId2, 1)), anjk.a);
                            }
                        }), anjk.a);
                    }
                }
                return anlz.q(new AccountActionResult(null, ambp.a, null, null));
            }
        }), anjk.a);
    }

    public final amuk b() {
        return this.e.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt c(final AccountId accountId, Intent intent) {
        return anii.i(this.e.d(accountId, b(), intent), ammo.c(new anir() { // from class: ambc
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                ambe ambeVar = ambe.this;
                AccountId accountId2 = accountId;
                final ValidationResult validationResult = (ValidationResult) obj;
                if (!validationResult.c()) {
                    aqxo.y(!validationResult.c());
                    return anlz.q(new AccountActionResult(accountId2, ambp.a, validationResult, null));
                }
                return anii.h(ambeVar.a.b(accountId2), ammo.a(new ampg() { // from class: amaz
                    @Override // defpackage.ampg
                    public final Object apply(Object obj2) {
                        ValidationResult validationResult2 = ValidationResult.this;
                        ambn ambnVar = (ambn) obj2;
                        AccountId accountId3 = ambnVar.a;
                        ambp ambpVar = ambnVar.b;
                        aqxo.z(validationResult2.c(), "Trying to propagate AccountInfo for invalid account.");
                        return new AccountActionResult(accountId3, ambpVar, validationResult2, null);
                    }
                }), anjk.a);
            }
        }), anjk.a);
    }
}
