package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* compiled from: PG */
/* renamed from: dccl  reason: default package */
/* loaded from: classes5.dex */
abstract class dccl<E> extends dcdc<E> {
    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return b().SI();
    }

    public abstract dccr<E> b();

    @Override // defpackage.dcdc, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return b().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return b().size();
    }

    @Override // defpackage.dcdc, defpackage.dccr
    Object writeReplace() {
        return new dcck(b());
    }
}
