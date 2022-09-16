package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: gz  reason: default package */
/* loaded from: classes.dex */
public abstract class gz {
    private final fq a;
    private final ClassLoader b;
    int e;
    int f;
    int g;
    int h;
    public int i;
    public boolean j;
    public String l;
    public int m;
    public CharSequence n;
    public int o;
    public CharSequence p;
    public ArrayList<String> q;
    public ArrayList<String> r;
    public final ArrayList<gy> d = new ArrayList<>();
    boolean k = true;
    public boolean s = false;

    public gz(fq fqVar, ClassLoader classLoader) {
        this.a = fqVar;
        this.b = classLoader;
    }

    public final void A(fd fdVar) {
        v(new gy(7, fdVar));
    }

    public final void B() {
        if (!this.j) {
            this.k = false;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void D(int i, Class<? extends fd> cls, Bundle bundle) {
        fq fqVar = this.a;
        if (fqVar != null) {
            ClassLoader classLoader = this.b;
            if (classLoader == null) {
                throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
            }
            fd c = fqVar.c(classLoader, cls.getName());
            if (bundle != null) {
                c.B(bundle);
            }
            x(i, c, null);
            return;
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    public final void E(int i, fd fdVar) {
        C(i, fdVar, null);
    }

    public void d(int i, fd fdVar, String str, int i2) {
        throw null;
    }

    public abstract int f();

    public abstract void g();

    public abstract void h();

    public boolean q() {
        throw null;
    }

    public abstract void r();

    public void s(fd fdVar) {
        throw null;
    }

    public void t(fd fdVar) {
        throw null;
    }

    public void u(fd fdVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(gy gyVar) {
        this.d.add(gyVar);
        gyVar.c = this.e;
        gyVar.d = this.f;
        gyVar.e = this.g;
        gyVar.f = this.h;
    }

    public final void w(int i, fd fdVar) {
        d(i, fdVar, null, 1);
    }

    public final void x(int i, fd fdVar, String str) {
        d(i, fdVar, str, 1);
    }

    public final void y(fd fdVar, String str) {
        d(0, fdVar, str, 1);
    }

    public final void z(String str) {
        if (this.k) {
            this.j = true;
            this.l = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void C(int i, fd fdVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        d(i, fdVar, str, 2);
    }
}
