package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alyy  reason: default package */
/* loaded from: classes.dex */
final class alyy {
    @dzsi
    public alyy[] a;
    final /* synthetic */ alyz b;
    @dzsi
    private Map<dxdd, alyv> c;

    public alyy(alyz alyzVar) {
        this.b = alyzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int c(int i, int i2, int i3) {
        int i4 = (i2 >> i3) & 1;
        return i4 + i4 + ((i >> i3) & 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final alyv a(dxdd dxddVar) {
        Map<dxdd, alyv> map = this.c;
        if (map == null) {
            return null;
        }
        return map.get(dxddVar);
    }

    public final void b(int i, int i2, int i3, dxdd dxddVar, alyv alyvVar) {
        if (i3 <= 0) {
            if (this.c == null) {
                this.c = new EnumMap(dxdd.class);
            }
            this.c.put(dxddVar, alyvVar);
            return;
        }
        int i4 = i3 - 1;
        int c = c(i, i2, i4);
        if (this.a == null) {
            this.a = new alyy[4];
        }
        alyy alyyVar = this.a[c];
        if (alyyVar == null) {
            alyyVar = new alyy(this.b);
            this.a[c] = alyyVar;
        }
        alyyVar.b(i, i2, i4, dxddVar, alyvVar);
    }
}
