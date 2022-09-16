package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: qtk  reason: default package */
/* loaded from: classes4.dex */
public final class qtk extends qto {
    protected final qtt a;

    public qtk(int i, qtt qttVar) {
        super(i);
        this.a = qttVar;
    }

    @Override // defpackage.qto
    public final void d(Status status) {
        try {
            this.a.k(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.qto
    public final void e(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.a.k(new Status(10, sb.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.qto
    public final void f(qum qumVar) {
        try {
            this.a.j(qumVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    @Override // defpackage.qto
    public final void g(que queVar, boolean z) {
        qtt qttVar = this.a;
        queVar.a.put(qttVar, Boolean.valueOf(z));
        qttVar.e(new quc(queVar, qttVar));
    }
}
