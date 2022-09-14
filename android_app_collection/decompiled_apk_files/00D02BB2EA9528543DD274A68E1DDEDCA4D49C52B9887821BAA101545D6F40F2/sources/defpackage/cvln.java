package defpackage;

import android.text.TextUtils;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cvln  reason: default package */
/* loaded from: classes5.dex */
public final class cvln {
    private final cvkf a;
    private final cvki b;
    private final cvkk c;
    private final cvot d;
    private final Set<cvpv> e;
    private final cvlr f;

    public cvln(cvkf cvkfVar, cvki cvkiVar, cvkk cvkkVar, cvot cvotVar, cvlr cvlrVar, Set set) {
        this.a = cvkfVar;
        this.b = cvkiVar;
        this.c = cvkkVar;
        this.d = cvotVar;
        this.f = cvlrVar;
        this.e = set;
    }

    public final synchronized void a(@dzsi cvkc cvkcVar, boolean z) {
        String b = cvkcVar == null ? null : cvkcVar.b();
        cvlw.a("AccountCleanupUtil", "Notification data deleted: %s", b);
        if (!z) {
            cvlp a = this.f.a(drwv.NOTIFICATION_DATA_CLEANED);
            a.i(cvkcVar);
            a.a();
        } else if (cvkcVar == null) {
            this.f.a(drwv.ACCOUNT_DATA_CLEANED).a();
        } else {
            cvlw.a("AccountCleanupUtil", "Account deleted: %s", cvkcVar.b());
            if (!TextUtils.isEmpty(cvkcVar.c())) {
                cvlp a2 = this.f.a(drwv.ACCOUNT_DATA_CLEANED);
                a2.m(cvkcVar.c());
                a2.a();
            }
        }
        this.d.c(cvkcVar, 11);
        dcpd it = ((dcnn) this.e).iterator();
        while (it.hasNext()) {
            ((cvpv) it.next()).b(cvkcVar);
        }
        cvki cvkiVar = this.b;
        try {
            ((cvko) cvkiVar).a.deleteDatabase(((cvko) cvkiVar).d(b).getDatabaseName());
        } catch (cvke | RuntimeException unused) {
            cvlw.e("ChimeTaskDataStorageImpl", "Error deleting database for %s", b);
        }
        cvkk cvkkVar = this.c;
        try {
            ((cvkq) cvkkVar).a.deleteDatabase(((cvkq) cvkkVar).l(b).getDatabaseName());
        } catch (cvke | RuntimeException unused2) {
            cvlw.e("ChimeThreadStorageImpl", "Error deleting database for %s", b);
        }
        if (cvkcVar == null || !z) {
            return;
        }
        this.a.d(b);
    }
}
