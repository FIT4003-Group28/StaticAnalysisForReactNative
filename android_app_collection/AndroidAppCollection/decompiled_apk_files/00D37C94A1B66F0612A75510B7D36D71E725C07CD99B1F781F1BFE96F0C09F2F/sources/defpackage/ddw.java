package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ddw  reason: default package */
/* loaded from: classes3.dex */
public final class ddw extends dee {
    final ArrayList a;
    ddx b;
    public ddy c;
    public dec d;
    public dfj e;
    public dfj f;

    public ddw() {
        this.a = new ArrayList();
        throw null;
    }

    public final ArrayList a() {
        b();
        return this.a;
    }

    public final void b() {
        ddy ddyVar = this.c;
        if (ddyVar == null) {
            return;
        }
        this.a.add(new ded(new ddv(this.b, ddyVar), this.d, this.e, this.f));
        this.c = null;
        this.d = dee.h;
        this.e = null;
        this.f = null;
    }

    public ddw(Object obj) {
        this.a = new ArrayList();
        this.d = dee.h;
        this.b = new ddx(obj);
    }
}
