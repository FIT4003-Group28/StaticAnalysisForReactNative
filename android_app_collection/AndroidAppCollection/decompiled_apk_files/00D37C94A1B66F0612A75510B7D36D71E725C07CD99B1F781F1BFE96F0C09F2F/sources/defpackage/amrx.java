package defpackage;
/* compiled from: PG */
/* renamed from: amrx  reason: default package */
/* loaded from: classes.dex */
public abstract class amrx implements amxv {
    @Override // defpackage.amxv
    public void a(amxt amxtVar) {
        throw null;
    }

    @Override // defpackage.amxv
    public void b(amxt amxtVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amxv)) {
            return false;
        }
        return d().equals(((amxv) obj).d());
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final String toString() {
        return d().toString();
    }
}
