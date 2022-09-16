package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amuh  reason: default package */
/* loaded from: classes.dex */
public final class amuh extends amuk {
    private final transient amuk a;

    public amuh(amuk amukVar) {
        this.a = amukVar;
    }

    private final int F(int i) {
        return (size() - 1) - i;
    }

    private final int G(int i) {
        return size() - i;
    }

    @Override // defpackage.amuk
    public final amuk a() {
        return this.a;
    }

    @Override // defpackage.amuk
    public final amuk c(int i, int i2) {
        aqxo.x(i, i2, size());
        return this.a.subList(G(i2), G(i)).a();
    }

    @Override // defpackage.amuk, defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        aqxo.G(i, size());
        return this.a.get(F(i));
    }

    @Override // defpackage.amuk, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return F(lastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.amub
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.amuk, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            return F(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.amuk, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
