package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: uho  reason: default package */
/* loaded from: classes4.dex */
public final class uho implements uhf {
    private final uhj a;

    public uho(uhj uhjVar) {
        this.a = uhjVar;
    }

    @Override // defpackage.uhf
    public final fi a(String str, ucp ucpVar, List list, boolean z, uip uipVar) {
        int i = 1;
        if (uid.c()) {
            uhj uhjVar = this.a;
            aqxo.p(list != null);
            aqxo.p(!list.isEmpty());
            fi fiVar = new fi(uhjVar.a);
            fiVar.G = 2;
            fiVar.r(uhjVar.d.a.intValue());
            int a = aolu.a(((ucw) Collections.max(list, utr.b)).d.l);
            if (a != 0) {
                i = a;
            }
            fiVar.k = uhj.g(i);
            String c = uhjVar.c(ucpVar, list);
            if (!TextUtils.isEmpty(c)) {
                fiVar.t(c);
            }
            if (uhjVar.d.c != null) {
                fiVar.z = uhjVar.a.getResources().getColor(uhjVar.d.c.intValue());
            }
            uhjVar.c.d(fiVar, (ucw) list.get(0));
            uhjVar.e(fiVar, ucpVar, list.size());
            fiVar.g = uhjVar.b.d(str, ucpVar, list, uipVar);
            fiVar.m(uhjVar.b.e(str, ucpVar, list));
            return fiVar;
        } else if (list.size() == 1) {
            return (fi) this.a.a(str, ucpVar, (ucw) list.get(0), z, ubz.b(), uipVar).first;
        } else {
            uhj uhjVar2 = this.a;
            aqxo.p(list != null);
            aqxo.p(list.size() >= 2);
            fj fjVar = new fj();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aolz aolzVar = ((ucw) it.next()).d;
                if (aolzVar.d.isEmpty()) {
                    fjVar.c(uhjVar2.b(R.string.chime_notification_title, aolzVar.c));
                } else {
                    fjVar.c(uhjVar2.b(R.string.combined_notification_text, aolzVar.c, aolzVar.d));
                }
            }
            fi fiVar2 = new fi(uhjVar2.a);
            fiVar2.k(uhjVar2.a.getString(uhjVar2.d.b.intValue()));
            fiVar2.j(uhjVar2.a.getResources().getQuantityString(R.plurals.public_notification_text, list.size(), Integer.valueOf(list.size())));
            fiVar2.r(uhjVar2.d.a.intValue());
            fiVar2.s(fjVar);
            String c2 = uhjVar2.c(ucpVar, list);
            if (!TextUtils.isEmpty(c2)) {
                fiVar2.t(c2);
            }
            if (uhjVar2.d.c != null) {
                fiVar2.z = uhjVar2.a.getResources().getColor(uhjVar2.d.c.intValue());
            }
            uhjVar2.f(fiVar2, ((ucw) list.get(0)).d, z);
            uhjVar2.e(fiVar2, ucpVar, list.size());
            fiVar2.g = uhjVar2.b.d(str, ucpVar, list, null);
            fiVar2.m(uhjVar2.b.e(str, ucpVar, list));
            return fiVar2;
        }
    }

    @Override // defpackage.uhf
    public final Pair b(String str, ucp ucpVar, ucw ucwVar, boolean z, ubz ubzVar, uip uipVar) {
        return this.a.a(str, ucpVar, ucwVar, z, ubzVar, uipVar);
    }
}
