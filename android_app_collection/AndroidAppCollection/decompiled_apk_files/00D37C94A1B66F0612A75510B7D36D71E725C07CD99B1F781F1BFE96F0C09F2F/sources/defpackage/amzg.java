package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amzg  reason: default package */
/* loaded from: classes.dex */
class amzg extends amzh implements amxc {
    private static final long serialVersionUID = 0;
    transient Map a;

    public amzg(amxc amxcVar) {
        super(amxcVar, null);
    }

    public amxc b() {
        return (amxc) this.f;
    }

    @Override // defpackage.amxc
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = b().equals(obj);
        }
        return equals;
    }

    @Override // defpackage.amxc
    public final int g() {
        throw null;
    }

    @Override // defpackage.amxc
    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = b().hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.amxc
    public final void m() {
        throw null;
    }

    @Override // defpackage.amxc
    public final boolean o(Object obj) {
        boolean o;
        synchronized (this.g) {
            o = b().o(obj);
        }
        return o;
    }

    @Override // defpackage.amxc
    public final boolean p(Object obj, Object obj2) {
        boolean p;
        synchronized (this.g) {
            p = b().p(obj, obj2);
        }
        return p;
    }

    @Override // defpackage.amxc
    public final Collection q() {
        throw null;
    }

    @Override // defpackage.amxc
    public final Map r() {
        Map map;
        synchronized (this.g) {
            if (this.a == null) {
                this.a = new amyw(b().r(), this.g);
            }
            map = this.a;
        }
        return map;
    }

    @Override // defpackage.amxc
    public final Set s() {
        throw null;
    }
}
