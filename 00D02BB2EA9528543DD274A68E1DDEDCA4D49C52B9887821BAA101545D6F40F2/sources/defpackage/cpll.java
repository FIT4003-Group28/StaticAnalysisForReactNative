package defpackage;

import com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cpll  reason: default package */
/* loaded from: classes5.dex */
public final class cpll implements Runnable {
    final /* synthetic */ cplo a;

    public cpll(cplo cploVar) {
        this.a = cploVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cplo cploVar = this.a;
        final cplw cplwVar = cploVar.b;
        ArrayList<ReportAbuseCardConfigParcel> arrayList = cploVar.c.b;
        cplwVar.ae.removeAllViews();
        cplwVar.ai = 0;
        for (ReportAbuseCardConfigParcel reportAbuseCardConfigParcel : arrayList) {
            cplwVar.q(reportAbuseCardConfigParcel);
        }
        cplwVar.w();
        final ReportAbuseCardConfigParcel reportAbuseCardConfigParcel2 = arrayList.get(arrayList.size() - 1);
        cplwVar.aj.postDelayed(new Runnable(cplwVar, reportAbuseCardConfigParcel2) { // from class: cplq
            private final cplw a;
            private final ReportAbuseCardConfigParcel b;

            {
                this.a = cplwVar;
                this.b = reportAbuseCardConfigParcel2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cplw cplwVar2 = this.a;
                ReportAbuseCardConfigParcel reportAbuseCardConfigParcel3 = this.b;
                cplwVar2.ag.scrollTo(cplwVar2.ai * cplwVar2.g(), 0);
                cplwVar2.i(reportAbuseCardConfigParcel3);
            }
        }, 100L);
        this.a.f();
    }
}
