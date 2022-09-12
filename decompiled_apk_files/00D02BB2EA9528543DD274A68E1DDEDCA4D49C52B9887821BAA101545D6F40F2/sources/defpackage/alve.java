package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: alve  reason: default package */
/* loaded from: classes.dex */
public final class alve implements Comparator<alyh> {
    public int a;
    public int b;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(alyh alyhVar, alyh alyhVar2) {
        alyh alyhVar3 = alyhVar;
        alyh alyhVar4 = alyhVar2;
        int i = alyhVar3.a;
        int i2 = alyhVar4.a;
        if (i != i2) {
            return i2 - i;
        }
        int i3 = 536870912 >> i;
        return (Math.abs((alyhVar3.e + i3) - this.a) + Math.abs((alyhVar3.f + i3) - this.b)) - (Math.abs((alyhVar4.e + i3) - this.a) + Math.abs((alyhVar4.f + i3) - this.b));
    }
}
