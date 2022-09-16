package defpackage;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ady  reason: default package */
/* loaded from: classes.dex */
public final class ady extends ac {
    public Executor a;
    public adu d;
    public ads e;
    public DialogInterface.OnClickListener f;
    public CharSequence g;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public t n;
    public t o;
    public t p;
    public t q;
    public t r;
    public t t;
    public t v;
    public t w;
    public adg x;
    private ada y;
    private aea z;
    public int h = 0;
    public boolean s = true;
    public int u = 0;

    public static void r(t tVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            tVar.k(obj);
        } else {
            tVar.i(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        adu aduVar = this.d;
        if (aduVar != null) {
            return acy.b(aduVar, this.e);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ada e() {
        if (this.y == null) {
            this.y = new ada(new adw(this));
        }
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aea f() {
        if (this.z == null) {
            this.z = new aea();
        }
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence g() {
        CharSequence charSequence = this.g;
        if (charSequence != null) {
            return charSequence;
        }
        adu aduVar = this.d;
        if (aduVar == null) {
            return null;
        }
        CharSequence charSequence2 = aduVar.c;
        return charSequence2 != null ? charSequence2 : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence h() {
        adu aduVar = this.d;
        if (aduVar != null) {
            return aduVar.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence i() {
        adu aduVar = this.d;
        if (aduVar != null) {
            return aduVar.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Executor j() {
        Executor executor = this.a;
        return executor != null ? executor : new rzw(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(adb adbVar) {
        if (this.o == null) {
            this.o = new t();
        }
        r(this.o, adbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(boolean z) {
        if (this.q == null) {
            this.q = new t();
        }
        r(this.q, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(adr adrVar) {
        if (this.n == null) {
            this.n = new t();
        }
        r(this.n, adrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z) {
        if (this.t == null) {
            this.t = new t();
        }
        r(this.t, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(CharSequence charSequence) {
        if (this.w == null) {
            this.w = new t();
        }
        r(this.w, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(int i) {
        if (this.v == null) {
            this.v = new t();
        }
        r(this.v, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(boolean z) {
        if (this.r == null) {
            this.r = new t();
        }
        r(this.r, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final adg t() {
        if (this.x == null) {
            this.x = new adg();
        }
        return this.x;
    }
}
