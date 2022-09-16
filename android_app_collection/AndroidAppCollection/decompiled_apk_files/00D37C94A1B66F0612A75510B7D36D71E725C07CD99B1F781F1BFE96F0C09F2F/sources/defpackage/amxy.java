package defpackage;

import java.util.AbstractMap;
/* compiled from: PG */
/* renamed from: amxy  reason: default package */
/* loaded from: classes.dex */
final class amxy extends amuk {
    final /* synthetic */ amxz a;

    public amxy(amxz amxzVar) {
        this.a = amxzVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        aqxo.G(i, this.a.c);
        amxz amxzVar = this.a;
        Object[] objArr = amxzVar.a;
        int i2 = i + i;
        int i3 = amxzVar.b;
        Object obj = objArr[i2 + i3];
        obj.getClass();
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.amub
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }
}
