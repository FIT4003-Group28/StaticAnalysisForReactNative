package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qup  reason: default package */
/* loaded from: classes4.dex */
public final class qup implements qwm {
    public final qsn a;
    public final qtp b;
    final /* synthetic */ quq e;
    public qxk f = null;
    public Set c = null;
    public boolean d = false;

    public qup(quq quqVar, qsn qsnVar, qtp qtpVar) {
        this.e = quqVar;
        this.a = qsnVar;
        this.b = qtpVar;
    }

    @Override // defpackage.qwm
    public final void a(ConnectionResult connectionResult) {
        this.e.o.post(new quo(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        qum qumVar = (qum) this.e.l.get(this.b);
        if (qumVar != null) {
            qnm.f(qumVar.l.o);
            qsn qsnVar = qumVar.b;
            String name = qsnVar.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(valueOf).length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            qsnVar.f(sb.toString());
            qumVar.i(connectionResult);
        }
    }

    public final void c() {
        qxk qxkVar;
        if (!this.d || (qxkVar = this.f) == null) {
            return;
        }
        this.a.B(qxkVar, this.c);
    }
}
