package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dccz  reason: default package */
/* loaded from: classes5.dex */
public final class dccz<E> extends dcdc<E> {
    private final transient dcdc<E> a;

    public dccz(dcdc<E> dcdcVar) {
        this.a = dcdcVar;
    }

    private final int H(int i) {
        return (size() - 1) - i;
    }

    private final int I(int i) {
        return size() - i;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return this.a.SI();
    }

    @Override // defpackage.dcdc
    public final dcdc<E> SL() {
        return this.a;
    }

    @Override // defpackage.dcdc
    public final dcdc<E> c(int i, int i2) {
        dbsk.u(i, i2, size());
        return this.a.subList(I(i2), I(i)).SL();
    }

    @Override // defpackage.dcdc, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List
    public final E get(int i) {
        dbsk.z(i, size());
        return this.a.get(H(i));
    }

    @Override // defpackage.dcdc, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return H(lastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.dcdc, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            return H(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.dcdc, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
