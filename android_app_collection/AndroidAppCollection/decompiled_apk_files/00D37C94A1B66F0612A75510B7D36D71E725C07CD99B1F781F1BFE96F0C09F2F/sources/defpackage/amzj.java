package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: amzj  reason: default package */
/* loaded from: classes.dex */
public class amzj extends amzc implements Set {
    private static final long serialVersionUID = 0;

    public amzj(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.amzc
    /* renamed from: b */
    public Set a() {
        return (Set) super.a();
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }
}
