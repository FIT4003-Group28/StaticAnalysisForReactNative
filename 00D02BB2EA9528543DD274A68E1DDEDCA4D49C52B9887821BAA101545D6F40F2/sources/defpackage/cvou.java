package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvou  reason: default package */
/* loaded from: classes5.dex */
public final class cvou implements cvos {
    private final Context a;
    private final dbsg<cvtk> b;
    private final cvlr c;

    public cvou(Context context, dbsg dbsgVar, cvlr cvlrVar) {
        this.a = context;
        this.b = dbsgVar;
        this.c = cvlrVar;
    }

    private final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            this.a.startActivity(intent);
        }
    }

    private static String c(List<cvkj> list) {
        ArrayList arrayList = new ArrayList();
        for (cvkj cvkjVar : list) {
            arrayList.add(cvkjVar.a());
        }
        return TextUtils.join(", ", arrayList);
    }

    @dzsi
    private static String d(@dzsi cvkc cvkcVar) {
        if (cvkcVar == null) {
            return null;
        }
        return cvkcVar.b();
    }

    @Override // defpackage.cvos
    public final void a(cvlm cvlmVar) {
        dsbi dsbiVar;
        String b = cvlmVar.b();
        cvkc c = cvlmVar.c();
        List<cvkj> d = cvlmVar.d();
        if ("com.google.android.libraries.notifications.NOTIFICATION_CLICKED".equals(b)) {
            cvlw.c("EventCallbackHelper", "Notification clicked for account [%s], on threads [%s]", d(c), c(d));
            cvlp a = this.c.a(drwv.CLICKED);
            a.s(2);
            a.i(c);
            a.e(d);
            a.a();
            if (this.b.a()) {
                this.b.b().b(c, d);
            } else if (d.size() != 1) {
            } else {
                b(d.get(0).d().g);
            }
        } else if ("com.google.android.libraries.notifications.NOTIFICATION_DISMISSED".equals(b)) {
            cvlw.c("EventCallbackHelper", "Notification removed for account [%s], on threads [%s]", d(c), c(d));
            cvlp a2 = this.c.a(drwv.DISMISSED);
            a2.s(2);
            a2.i(c);
            a2.e(d);
            a2.a();
            if (!this.b.a()) {
                return;
            }
            this.b.b().c(c, d);
        } else if ("com.google.android.libraries.notifications.NOTIFICATION_EXPIRED".equals(b)) {
            cvlw.c("EventCallbackHelper", "Notification expired for account [%s], on threads [%s]", d(c), c(d));
            cvlp a3 = this.c.a(drwv.EXPIRED);
            a3.i(c);
            a3.e(d);
            a3.a();
            if (!this.b.a()) {
                return;
            }
            this.b.b().f();
        } else if (TextUtils.isEmpty(b)) {
        } else {
            dbsk.a(d.size() == 1);
            Iterator<cvkg> it = d.get(0).n().iterator();
            while (true) {
                if (!it.hasNext()) {
                    dsbiVar = null;
                    break;
                }
                cvkg next = it.next();
                if (b.equals(next.a())) {
                    dsbiVar = next.l();
                    break;
                }
            }
            cvkj cvkjVar = d.get(0);
            Object[] objArr = new Object[3];
            String str = "";
            objArr[0] = dsbiVar.b == 4 ? (String) dsbiVar.c : str;
            objArr[1] = d(c);
            objArr[2] = cvkjVar.a();
            cvlw.c("EventCallbackHelper", "Notification action [%s] clicked for account [%s], on thread [%s]", objArr);
            cvlp a4 = this.c.a(drwv.ACTION_CLICK);
            a4.s(2);
            if (dsbiVar.b == 4) {
                str = (String) dsbiVar.c;
            }
            a4.b(str);
            a4.i(c);
            a4.d(cvkjVar);
            a4.a();
            if (!this.b.a()) {
                b(dsbiVar.g);
            } else {
                this.b.b().d(c, cvkjVar, dsbiVar);
            }
        }
    }
}
