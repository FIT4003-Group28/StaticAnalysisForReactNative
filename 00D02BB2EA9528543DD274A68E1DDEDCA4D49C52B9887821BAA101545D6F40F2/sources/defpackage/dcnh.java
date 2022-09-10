package defpackage;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcnh  reason: default package */
/* loaded from: classes5.dex */
public class dcnh<E> extends dbzc<E> implements Set<E> {
    public dcnh(Set<E> set, dbsl<? super E> dbslVar) {
        super(set, dbslVar);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return dcnm.s(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return dcnm.r(this);
    }
}
