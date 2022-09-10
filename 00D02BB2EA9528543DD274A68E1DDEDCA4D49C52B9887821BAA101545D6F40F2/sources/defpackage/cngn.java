package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cngn  reason: default package */
/* loaded from: classes5.dex */
public final class cngn extends cnfq {
    public final InputConnection a;
    public volatile boolean b = true;
    private final cnfn c;

    public cngn(InputConnection inputConnection, cnfn cnfnVar) {
        this.a = inputConnection;
        this.c = cnfnVar;
    }

    @Override // defpackage.cnfr
    public final CharSequence b(int i, int i2) {
        if (!this.b) {
            return null;
        }
        return (CharSequence) cmyz.c(new cngd(this, i, i2), null);
    }

    @Override // defpackage.cnfr
    public final CharSequence c(int i, int i2) {
        if (!this.b) {
            return null;
        }
        return (CharSequence) cmyz.c(new cnge(this, i, i2), null);
    }

    @Override // defpackage.cnfr
    public final CharSequence d(int i) {
        if (!this.b) {
            return null;
        }
        return (CharSequence) cmyz.c(new cngf(this, i), null);
    }

    @Override // defpackage.cnfr
    public final int e(int i) {
        if (!this.b) {
            return 0;
        }
        return ((Integer) cmyz.c(new cngg(this, i), 0)).intValue();
    }

    @Override // defpackage.cnfr
    public final boolean f(int i, int i2) {
        return v(new cngh(this, i, i2));
    }

    @Override // defpackage.cnfr
    public final boolean g(CharSequence charSequence, int i) {
        return v(new cngi(this, charSequence, i));
    }

    @Override // defpackage.cnfr
    public final boolean h(int i, int i2) {
        return v(new cngj(this, i, i2));
    }

    @Override // defpackage.cnfr
    public final boolean i() {
        return v(new cngk(this));
    }

    @Override // defpackage.cnfr
    public final boolean j(CharSequence charSequence, int i) {
        return v(new cngl(this, charSequence, i));
    }

    @Override // defpackage.cnfr
    public final boolean k(int i, int i2) {
        return v(new cnft(this, i, i2));
    }

    @Override // defpackage.cnfr
    public final boolean l(int i) {
        return v(new cnfu(this, i));
    }

    @Override // defpackage.cnfr
    public final boolean m(int i) {
        return v(new cnfv(this, i));
    }

    @Override // defpackage.cnfr
    public final boolean n() {
        if (!this.b) {
            return false;
        }
        return ((Boolean) cmyz.c(new cnfw(this), null)).booleanValue();
    }

    @Override // defpackage.cnfr
    public final boolean o() {
        if (!this.b) {
            return false;
        }
        return ((Boolean) cmyz.c(new cnfx(this), null)).booleanValue();
    }

    @Override // defpackage.cnfr
    public final boolean p(KeyEvent keyEvent) {
        return v(new cnfy(this, keyEvent));
    }

    @Override // defpackage.cnfr
    public final boolean q(int i) {
        return v(new cnfz(this, i));
    }

    @Override // defpackage.cnfr
    public final boolean r(boolean z) {
        return v(new cnga(this, z));
    }

    @Override // defpackage.cnfr
    public final boolean s(String str, Bundle bundle) {
        return v(new cngb(this, str, bundle));
    }

    @Override // defpackage.cnfr
    public final void t() {
        throw new RemoteException("Deprecated Method");
    }

    @Override // defpackage.cnfr
    public final void u(cnfp cnfpVar) {
        this.c.setCarEditableListener(new cngm(cnfpVar));
    }

    public final boolean v(Callable<Boolean> callable) {
        if (!this.b) {
            return false;
        }
        cngc cngcVar = new cngc(this, callable);
        Looper mainLooper = Looper.getMainLooper();
        if (Looper.myLooper() == mainLooper) {
            cngcVar.run();
            return true;
        }
        new cojb(mainLooper).post(cngcVar);
        return true;
    }
}
