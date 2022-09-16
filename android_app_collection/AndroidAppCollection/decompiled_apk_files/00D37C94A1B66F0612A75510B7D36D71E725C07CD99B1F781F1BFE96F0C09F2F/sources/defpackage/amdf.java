package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amdf  reason: default package */
/* loaded from: classes.dex */
public final class amdf implements amcv {
    public final ankw a;
    public final ankw b;
    public final azqb c;
    public final azqb d;
    public final azqb e;
    public final azqb f;
    public final azqb g;
    public final vne h;

    public amdf(vne vneVar, ankw ankwVar, ankw ankwVar2, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.h = vneVar;
        this.a = ankwVar;
        this.b = ankwVar2;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.g = azqbVar5;
        this.e = azqbVar3;
        this.f = azqbVar4;
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

    public static ankg b(Set set) {
        ankt p;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                p = ((ambt) it.next()).a();
                arrayList.add(p);
            } catch (Exception e) {
                p = anlz.p(e);
            }
            amee.b(p, "AccountEnabledInterceptor Failed", new Object[0]);
        }
        return anlz.j(arrayList);
    }
}
