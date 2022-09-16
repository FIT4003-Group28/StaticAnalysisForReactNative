package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: uhi  reason: default package */
/* loaded from: classes4.dex */
public final class uhi implements uhg {
    private final ampq a;
    private final ues b;

    public uhi(ampq ampqVar, ues uesVar) {
        this.a = ampqVar;
        this.b = uesVar;
    }

    private static String b(ucp ucpVar) {
        if (ucpVar == null) {
            return null;
        }
        return ucpVar.b;
    }

    private static String c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ucw) it.next()).a);
        }
        return TextUtils.join(", ", arrayList);
    }

    @Override // defpackage.uhg
    public final void a(ueb uebVar) {
        aols aolsVar;
        String i = uebVar.i();
        ucp c = uebVar.c();
        List j = uebVar.j();
        boolean k = uebVar.k();
        if ("com.google.android.libraries.notifications.NOTIFICATION_CLICKED".equals(i)) {
            uev.d("EventCallbackHelper", "Notification clicked for account [%s], on threads [%s]", b(c), c(j));
            uep a = this.b.a(aojw.CLICKED);
            ((ueu) a).w = 2;
            a.d(c);
            a.c(j);
            a.i();
            if (k) {
                uit uitVar = (uit) ((ampv) this.a).a;
            } else {
                uit uitVar2 = (uit) ((ampv) this.a).a;
            }
        } else if ("com.google.android.libraries.notifications.NOTIFICATION_DISMISSED".equals(i)) {
            uev.d("EventCallbackHelper", "Notification removed for account [%s], on threads [%s]", b(c), c(j));
            uep a2 = this.b.a(aojw.DISMISSED);
            ((ueu) a2).w = 2;
            a2.d(c);
            a2.c(j);
            a2.i();
            ((uit) ((ampv) this.a).a).c(j);
        } else if ("com.google.android.libraries.notifications.NOTIFICATION_EXPIRED".equals(i)) {
            uev.d("EventCallbackHelper", "Notification expired for account [%s], on threads [%s]", b(c), c(j));
            uep a3 = this.b.a(aojw.EXPIRED);
            a3.d(c);
            a3.c(j);
            a3.i();
            uit uitVar3 = (uit) ((ampv) this.a).a;
        } else if (TextUtils.isEmpty(i)) {
        } else {
            aqxo.p(j.size() == 1);
            Iterator it = ((ucw) j.get(0)).n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aolsVar = null;
                    break;
                }
                uct uctVar = (uct) it.next();
                if (i.equals(uctVar.a)) {
                    aolsVar = uctVar.b();
                    break;
                }
            }
            ucw ucwVar = (ucw) j.get(0);
            Object[] objArr = new Object[3];
            String str = "";
            objArr[0] = aolsVar.c == 4 ? (String) aolsVar.d : str;
            objArr[1] = b(c);
            objArr[2] = ucwVar.a;
            uev.d("EventCallbackHelper", "Notification action [%s] clicked for account [%s], on thread [%s]", objArr);
            uep a4 = this.b.a(aojw.ACTION_CLICK);
            ueu ueuVar = (ueu) a4;
            ueuVar.w = 2;
            if (aolsVar.c == 4) {
                str = (String) aolsVar.d;
            }
            ueuVar.h = str;
            a4.d(c);
            a4.b(ucwVar);
            a4.i();
            if (k) {
                uit uitVar4 = (uit) ((ampv) this.a).a;
            } else {
                ((uit) ((ampv) this.a).a).a(aolsVar);
            }
        }
    }
}
