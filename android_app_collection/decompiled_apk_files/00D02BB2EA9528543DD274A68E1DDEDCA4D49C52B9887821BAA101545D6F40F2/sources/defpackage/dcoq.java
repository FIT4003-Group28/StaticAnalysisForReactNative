package defpackage;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcoq  reason: default package */
/* loaded from: classes5.dex */
public class dcoq<E> extends dcoj<E> implements Set<E> {
    private static final long serialVersionUID = 0;

    public dcoq(Set<E> set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.dcoj
    /* renamed from: b */
    public Set<E> a() {
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
