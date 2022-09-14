package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.cnpg;
/* compiled from: PG */
/* renamed from: cnou  reason: default package */
/* loaded from: classes.dex */
public final class cnou<A extends cnpg<? extends cnom, cnnq>> extends cnoy {
    protected final A a;

    public cnou(int i, A a) {
        super(i);
        cnwc.n(a, "Null methods are not runnable.");
        this.a = a;
    }

    @Override // defpackage.cnoy
    public final void c(Status status) {
        try {
            this.a.m(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.cnoy
    public final void d(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.a.m(new Status(10, sb.toString()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.cnoy
    public final void e(cnpy cnpyVar, boolean z) {
        A a = this.a;
        cnpyVar.a.put(a, Boolean.valueOf(z));
        a.k(new cnpw(cnpyVar, a));
    }

    @Override // defpackage.cnoy
    public final void f(cnrj<?> cnrjVar) {
        try {
            this.a.l(cnrjVar.b);
        } catch (RuntimeException e) {
            d(e);
        }
    }
}
