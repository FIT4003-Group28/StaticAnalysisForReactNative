package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cvof  reason: default package */
/* loaded from: classes5.dex */
public final class cvof implements cvnq {
    private final cvot a;
    private final cvkf b;
    private final cvlr c;

    public cvof(cvkf cvkfVar, cvot cvotVar, cvlr cvlrVar) {
        this.b = cvkfVar;
        this.a = cvotVar;
        this.c = cvlrVar;
    }

    @Override // defpackage.cvnq
    public final void a(String str, dssj dssjVar, dssj dssjVar2) {
        cvlw.a("BatchUpdateThreadStateCallback", "Successfully updated thread state for account: %s.", str);
        ArrayList arrayList = new ArrayList();
        for (dryh dryhVar : ((dryj) dssjVar).c) {
            cvlp a = this.c.a(drwv.SUCCEED_TO_UPDATE_THREAD_STATE);
            a.j(str);
            a.q(dryhVar.b);
            a.a();
            dsef dsefVar = dryhVar.c;
            if (dsefVar == null) {
                dsefVar = dsef.f;
            }
            int a2 = dsdz.a(dsefVar.e);
            if (a2 != 0 && a2 == 3) {
                arrayList.addAll(dryhVar.b);
            }
        }
        if (!arrayList.isEmpty()) {
            try {
                this.a.d(this.b.b(str), arrayList, 0);
            } catch (cvke unused) {
                cvlw.e("BatchUpdateThreadStateCallback", "Account not found in scheduled callback.", new Object[0]);
            }
        }
    }

    @Override // defpackage.cvnq
    public final void b(String str, @dzsi dssj dssjVar) {
        cvlw.f("BatchUpdateThreadStateCallback", "Failed to updated thread state for account: %s.", str);
        if (dssjVar != null) {
            for (dryh dryhVar : ((dryj) dssjVar).c) {
                cvlp b = this.c.b(17);
                b.j(str);
                b.q(dryhVar.b);
                b.a();
            }
        }
    }
}
