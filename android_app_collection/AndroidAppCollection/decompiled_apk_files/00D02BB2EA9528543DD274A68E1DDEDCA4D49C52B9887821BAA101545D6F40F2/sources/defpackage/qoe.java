package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qoe  reason: default package */
/* loaded from: classes7.dex */
public final class qoe implements degu<amte> {
    final /* synthetic */ qoj a;

    public qoe(qoj qojVar) {
        this.a = qojVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dcdc<zdu> dcdcVar;
        try {
            this.a.B = null;
            qom qomVar = this.a.D;
            if (qomVar != null && (th instanceof qsk) && ((dcdcVar = qomVar.a.n) == null || dcdcVar.isEmpty())) {
                qomVar.a.n();
            }
            boolean z = th instanceof qsl;
            if (z) {
                qoj qojVar = this.a;
                if (!qojVar.K().booleanValue() && !qojVar.N().isEmpty()) {
                    Executor executor = qojVar.c;
                    Context context = qojVar.b;
                    cjxu.h(executor, context, context.getString(R.string.COMMUTE_CONNECTION_FAILED_TOAST));
                }
            }
            qoj qojVar2 = this.a;
            qojVar2.u = false;
            qojVar2.v = z;
            qojVar2.w = th instanceof qsk;
            qojVar2.R();
            this.a.p.a();
        } finally {
            this.a.B = null;
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi amte amteVar) {
        amte amteVar2 = amteVar;
        try {
            if (amteVar2 != null) {
                qoj qojVar = this.a;
                if (qojVar.u) {
                    ckcv ckcvVar = qojVar.B;
                    if (ckcvVar != null) {
                        ckcvVar.a((ckcr) qojVar.i.a(ckeo.B));
                    }
                    ckcp ckcpVar = (ckcp) qojVar.i.a(ckeo.C);
                    dwbc dwbcVar = amteVar2.a.a;
                    int i = dwbcVar.bE;
                    if (i == -1) {
                        i = dsst.a.b(dwbcVar).e(dwbcVar);
                        dwbcVar.bE = i;
                    }
                    ckcpVar.a(i);
                }
                this.a.P(amteVar2);
                qoj qojVar2 = this.a;
                qojVar2.z = qojVar2.g.e();
                this.a.f.e();
                this.a.O(amteVar2);
            } else {
                a(new NullPointerException());
            }
        } finally {
            this.a.B = null;
        }
    }
}
