package defpackage;

import com.google.android.gms.cast.internal.ApplicationStatus;
/* compiled from: PG */
/* renamed from: qpg  reason: default package */
/* loaded from: classes4.dex */
final class qpg implements Runnable {
    final /* synthetic */ qpj a;
    final /* synthetic */ ApplicationStatus b;

    public qpg(qpj qpjVar, ApplicationStatus applicationStatus) {
        this.a = qpjVar;
        this.b = applicationStatus;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        qpj qpjVar = this.a;
        String str = this.b.a;
        if (!qpl.j(str, qpjVar.e)) {
            qpjVar.e = str;
            z = true;
        } else {
            z = false;
        }
        tfo tfoVar = qpjVar.o;
        if (tfoVar != null && (z || qpjVar.g)) {
            tfoVar.d();
        }
        qpjVar.g = false;
    }
}
