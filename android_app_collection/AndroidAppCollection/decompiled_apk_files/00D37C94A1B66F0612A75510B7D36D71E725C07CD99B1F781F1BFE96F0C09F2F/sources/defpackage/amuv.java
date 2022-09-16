package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: amuv  reason: default package */
/* loaded from: classes.dex */
final class amuv extends amuk {
    final /* synthetic */ amuk a;

    public amuv(amuk amukVar) {
        this.a = amukVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((Map.Entry) this.a.get(i)).getValue();
    }

    @Override // defpackage.amub
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
