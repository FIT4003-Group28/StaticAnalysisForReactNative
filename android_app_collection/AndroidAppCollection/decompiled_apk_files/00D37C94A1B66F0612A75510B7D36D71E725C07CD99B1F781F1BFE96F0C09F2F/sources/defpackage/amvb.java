package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amvb  reason: default package */
/* loaded from: classes.dex */
public class amvb extends amrz implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient amup b;
    final transient int c;

    public amvb(amup amupVar, int i) {
        this.b = amupVar;
        this.c = i;
    }

    @Override // defpackage.amxc
    public final int g() {
        throw null;
    }

    @Override // defpackage.amrv
    public final /* bridge */ /* synthetic */ Collection h() {
        return new amva(this);
    }

    @Override // defpackage.amrv
    public final Map k() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.amrv
    public final Set l() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.amxc
    @Deprecated
    public final void m() {
        throw null;
    }

    @Override // defpackage.amxc
    public final boolean o(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.amrv, defpackage.amxc
    @Deprecated
    public final boolean p(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amrv, defpackage.amxc
    public final /* bridge */ /* synthetic */ Collection q() {
        throw null;
    }

    @Override // defpackage.amrv, defpackage.amxc
    public final /* bridge */ /* synthetic */ Map r() {
        return this.b;
    }

    @Override // defpackage.amrv, defpackage.amxc
    public final /* bridge */ /* synthetic */ Set s() {
        throw null;
    }

    @Override // defpackage.amrv
    public final boolean t(Object obj) {
        return obj != null && super.t(obj);
    }
}
