package defpackage;

import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: cnpc  reason: default package */
/* loaded from: classes5.dex */
public final class cnpc extends cnpl {
    public final SparseArray<cnpb> a;

    private cnpc(cnrx cnrxVar) {
        super(cnrxVar, cnmq.a);
        this.a = new SparseArray<>();
        this.e.b("AutoManageHelper", this);
    }

    public static cnpc a(cnrw cnrwVar) {
        cnrx m = m(cnrwVar);
        cnpc cnpcVar = (cnpc) m.a("AutoManageHelper", cnpc.class);
        return cnpcVar != null ? cnpcVar : new cnpc(m);
    }

    private final cnpb o(int i) {
        if (this.a.size() <= i) {
            return null;
        }
        SparseArray<cnpb> sparseArray = this.a;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    public final void b(int i) {
        cnpb cnpbVar = this.a.get(i);
        this.a.remove(i);
        if (cnpbVar != null) {
            cnpbVar.b.unregisterConnectionFailedListener(cnpbVar);
            cnpbVar.b.disconnect();
        }
    }

    @Override // defpackage.cnpl, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c() {
        super.c();
        boolean z = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        sb.toString();
        if (this.c.get() == null) {
            for (int i = 0; i < this.a.size(); i++) {
                cnpb o = o(i);
                if (o != null) {
                    o.b.connect();
                }
            }
        }
    }

    @Override // defpackage.cnpl, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d() {
        super.d();
        for (int i = 0; i < this.a.size(); i++) {
            cnpb o = o(i);
            if (o != null) {
                o.b.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.a.size(); i++) {
            cnpb o = o(i);
            if (o != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(o.a);
                printWriter.println(":");
                o.b.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnpl
    public final void f(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            new Exception();
            return;
        }
        cnpb cnpbVar = this.a.get(i);
        if (cnpbVar == null) {
            return;
        }
        b(i);
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = cnpbVar.c;
        if (onConnectionFailedListener == null) {
            return;
        }
        onConnectionFailedListener.Pi(connectionResult);
    }

    @Override // defpackage.cnpl
    protected final void g() {
        for (int i = 0; i < this.a.size(); i++) {
            cnpb o = o(i);
            if (o != null) {
                o.b.connect();
            }
        }
    }
}
