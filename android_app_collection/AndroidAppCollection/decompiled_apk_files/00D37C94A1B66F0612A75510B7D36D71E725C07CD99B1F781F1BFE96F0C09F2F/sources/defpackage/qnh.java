package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: qnh  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class qnh implements qtf {
    public final /* synthetic */ qnl a;
    private final /* synthetic */ int b;

    public /* synthetic */ qnh(qnl qnlVar, int i) {
        this.b = i;
        this.a = qnlVar;
    }

    @Override // defpackage.qtf
    public final void a(qte qteVar) {
        if (this.b == 0) {
            qnl qnlVar = this.a;
            Status a = ((qoe) qteVar).a();
            int i = a.g;
            if (i != 0) {
                qnlVar.a.d(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(i), a.h), new Object[0]);
            }
            qnlVar.i = null;
            if (qnlVar.h.isEmpty()) {
                return;
            }
            qnlVar.h();
            return;
        }
        qnl qnlVar2 = this.a;
        Status a2 = ((qoe) qteVar).a();
        int i2 = a2.g;
        if (i2 != 0) {
            qnlVar2.a.d(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(i2), a2.h), new Object[0]);
        }
        qnlVar2.j = null;
        if (qnlVar2.h.isEmpty()) {
            return;
        }
        qnlVar2.h();
    }
}
