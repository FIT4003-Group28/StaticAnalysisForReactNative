package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: vpe  reason: default package */
/* loaded from: classes4.dex */
final class vpe implements voz {
    int b = 0;
    double[] a = new double[5];

    @Override // defpackage.voz
    public final aoej a() {
        aopa createBuilder = aoeh.a.createBuilder();
        for (int i = 0; i < this.b; i++) {
            aopa createBuilder2 = aoeg.a.createBuilder();
            double d = this.a[i];
            createBuilder2.copyOnWrite();
            aoeg aoegVar = (aoeg) createBuilder2.instance;
            aoegVar.b |= 1;
            aoegVar.c = d;
            createBuilder2.copyOnWrite();
            aoeg aoegVar2 = (aoeg) createBuilder2.instance;
            aoegVar2.b |= 2;
            aoegVar2.d = 1L;
            createBuilder.copyOnWrite();
            aoeh aoehVar = (aoeh) createBuilder.instance;
            aoeg aoegVar3 = (aoeg) createBuilder2.mo39build();
            aoegVar3.getClass();
            aopu aopuVar = aoehVar.b;
            if (!aopuVar.c()) {
                aoehVar.b = aopi.mutableCopy(aopuVar);
            }
            aoehVar.b.add(aoegVar3);
        }
        aopa createBuilder3 = aoej.a.createBuilder();
        createBuilder3.copyOnWrite();
        aoej aoejVar = (aoej) createBuilder3.instance;
        aoeh aoehVar2 = (aoeh) createBuilder.mo39build();
        aoehVar2.getClass();
        aoejVar.c = aoehVar2;
        aoejVar.b = 3;
        return (aoej) createBuilder3.mo39build();
    }

    @Override // defpackage.voz
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        this.a[this.b] = d.doubleValue();
        this.b++;
    }

    public final String toString() {
        return ", count = " + this.b + ", value =" + Arrays.toString(this.a);
    }
}
