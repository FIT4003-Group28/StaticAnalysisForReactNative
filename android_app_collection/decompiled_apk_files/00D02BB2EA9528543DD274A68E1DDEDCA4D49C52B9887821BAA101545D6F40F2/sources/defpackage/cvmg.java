package defpackage;

import android.accounts.Account;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvmg  reason: default package */
/* loaded from: classes5.dex */
public final class cvmg {
    private final cvmd a;
    private final cqat b;
    private final cvpk c;
    private final cvlr d;

    public cvmg(cvmd cvmdVar, cvlr cvlrVar, cvpk cvpkVar, cqat cqatVar) {
        this.a = cvmdVar;
        this.d = cvlrVar;
        this.c = cvpkVar;
        this.b = cqatVar;
    }

    public final void a(@dzsi cvkc cvkcVar, List<dscr> list, cvix cvixVar, cvlq cvlqVar) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (cvkcVar != null) {
            try {
                cmrh.f(this.c.a, new Account(cvkcVar.b(), "com.google"), "oauth2:https://www.googleapis.com/auth/notifications");
            } catch (IOException unused) {
                Object[] objArr = new Object[0];
                if (cvlw.b.a(3)) {
                    cvlx.b("BlockingNotificationReceiver", "IOException getting auth token.", objArr);
                }
            } catch (Exception unused2) {
                cvlw.e("BlockingNotificationReceiver", "Error getting auth token.", new Object[0]);
            }
        }
        z = true;
        cvlqVar.c = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        if (!z) {
            cvlp b = this.d.b(26);
            b.i(cvkcVar);
            b.l(list);
            b.p(cvlqVar);
            b.a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (dscr dscrVar : list) {
            arrayList.add(cvkj.v(dscrVar));
        }
        this.a.a(cvkcVar, arrayList, cvixVar, cvlqVar);
    }
}
