package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qlr  reason: default package */
/* loaded from: classes4.dex */
public abstract class qlr {
    private final qlm a;
    public final qlh g;

    static {
        new qpu("Session");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public qlr(Context context, String str, String str2) {
        qlm qlmVar = new qlm(this);
        this.a = qlmVar;
        this.g = qmd.d(context, str, str2, qlmVar);
    }

    public long a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Bundle bundle) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(Bundle bundle) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void h(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void i(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(Bundle bundle) {
        throw null;
    }

    public final rad m() {
        qlh qlhVar = this.g;
        if (qlhVar != null) {
            try {
                return qlhVar.g();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(int i) {
        qlh qlhVar = this.g;
        if (qlhVar != null) {
            try {
                qlhVar.h(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final boolean o() {
        qnm.g("Must be called from the main thread.");
        qlh qlhVar = this.g;
        if (qlhVar != null) {
            try {
                return qlhVar.i();
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
