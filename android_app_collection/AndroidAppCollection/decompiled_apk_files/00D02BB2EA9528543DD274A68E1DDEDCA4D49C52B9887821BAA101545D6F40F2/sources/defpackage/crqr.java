package defpackage;

import defpackage.aryn;
/* compiled from: PG */
/* renamed from: crqr  reason: default package */
/* loaded from: classes5.dex */
public abstract class crqr<T extends aryn> extends crpu {
    public final T a;
    public final cray c;
    private boolean g;
    private boolean f = false;
    public boolean d = false;
    @dzsi
    public amuh e = null;

    public crqr(T t, cray crayVar) {
        this.a = t;
        this.c = crayVar;
    }

    @Override // defpackage.crqw
    public final crqv a() {
        return crqv.NAVIGATION_POI;
    }

    @Override // defpackage.crqw
    public final boolean b() {
        return true;
    }

    @Override // defpackage.crqw
    public final boolean c() {
        return true;
    }

    public final boolean d() {
        return this.f && this.e == null;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof crqr) {
            crqr crqrVar = (crqr) obj;
            if (crqrVar.getClass() == getClass() && dbsd.a(this.a, crqrVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        return this.f && !this.g;
    }

    public final boolean j() {
        return this.f || this.d;
    }

    public final boolean k() {
        return i() || d();
    }

    public final void l(@dzsi amuh amuhVar) {
        boolean z = true;
        this.f = true;
        this.g = true;
        this.e = amuhVar;
        if (amuhVar != null && !amuhVar.j()) {
            z = false;
        }
        dbsk.a(z);
    }

    public final void m() {
        this.f = true;
        this.g = false;
    }
}
