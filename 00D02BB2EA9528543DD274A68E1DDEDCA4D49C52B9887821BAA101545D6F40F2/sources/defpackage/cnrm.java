package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnrm  reason: default package */
/* loaded from: classes.dex */
public final class cnrm implements cnuc {
    public final cnnz a;
    public final cnpa<?> b;
    final /* synthetic */ cnrn e;
    public cnvj f = null;
    public Set<Scope> c = null;
    public boolean d = false;

    public cnrm(cnrn cnrnVar, cnnz cnnzVar, cnpa<?> cnpaVar) {
        this.e = cnrnVar;
        this.a = cnnzVar;
        this.b = cnpaVar;
    }

    @Override // defpackage.cnuc
    public final void a(ConnectionResult connectionResult) {
        this.e.n.post(new cnrl(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        cnrj<?> cnrjVar = this.e.k.get(this.b);
        if (cnrjVar != null) {
            cnwc.j(cnrjVar.j.n);
            cnnz cnnzVar = cnrjVar.b;
            String name = cnnzVar.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(valueOf).length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            cnnzVar.h(sb.toString());
            cnrjVar.Pi(connectionResult);
        }
    }

    public final void c() {
        cnvj cnvjVar;
        if (!this.d || (cnvjVar = this.f) == null) {
            return;
        }
        this.a.A(cnvjVar, this.c);
    }
}
