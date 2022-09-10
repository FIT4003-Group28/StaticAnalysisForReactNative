package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcdb  reason: default package */
/* loaded from: classes5.dex */
public final class dcdb extends dcdc {
    final transient int a;
    final transient int b;
    final /* synthetic */ dcdc c;

    public dcdb(dcdc dcdcVar, int i, int i2) {
        this.c = dcdcVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    @Override // defpackage.dcdc
    public final dcdc c(int i, int i2) {
        dbsk.u(i, i2, this.b);
        dcdc dcdcVar = this.c;
        int i3 = this.a;
        return dcdcVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        dbsk.z(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.dcdc, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.dccr
    public final Object[] x() {
        return this.c.x();
    }

    @Override // defpackage.dccr
    public final int y() {
        return this.c.y() + this.a;
    }

    @Override // defpackage.dccr
    public final int z() {
        return this.c.y() + this.a + this.b;
    }
}
