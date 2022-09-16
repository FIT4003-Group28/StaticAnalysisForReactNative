package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amuj  reason: default package */
/* loaded from: classes.dex */
public final class amuj extends amuk {
    final transient int a;
    final transient int b;
    final /* synthetic */ amuk c;

    public amuj(amuk amukVar, int i, int i2) {
        this.c = amukVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.amuk
    public final amuk c(int i, int i2) {
        aqxo.x(i, i2, this.b);
        amuk amukVar = this.c;
        int i3 = this.a;
        return amukVar.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.amub
    public final int d() {
        return this.c.e() + this.a + this.b;
    }

    @Override // defpackage.amub
    public final int e() {
        return this.c.e() + this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aqxo.G(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.amub
    public final boolean l() {
        return true;
    }

    @Override // defpackage.amub
    public final Object[] m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.amuk, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
