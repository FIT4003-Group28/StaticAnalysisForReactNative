package defpackage;

import defpackage.dssj;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anlj  reason: default package */
/* loaded from: classes2.dex */
public final class anlj<P extends dssj> {
    public final boolean a;
    public final dcdc<P> b;
    public final dcdc<P> c;

    private anlj(boolean z, dcdc<P> dcdcVar, dcdc<P> dcdcVar2) {
        this.a = z;
        this.b = dcdcVar;
        this.c = dcdcVar2;
    }

    public static <P extends dssj> anlj<P> a(List<P> list, List<P> list2) {
        boolean[] zArr = new boolean[list.size()];
        boolean[] zArr2 = new boolean[list2.size()];
        int i = -1;
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                } else if (!zArr2[i3] && dbsd.a(list.get(i2), list2.get(i3))) {
                    zArr[i2] = true;
                    zArr2[i3] = true;
                    if (i3 < i) {
                        z = true;
                    } else {
                        i = i3;
                    }
                } else {
                    i3++;
                }
            }
        }
        return new anlj<>(z, b(zArr, list), b(zArr2, list2));
    }

    private static <P extends dssj> dcdc<P> b(boolean[] zArr, List<P> list) {
        dccx F = dcdc.F();
        for (int i = 0; i < zArr.length; i++) {
            if (!zArr[i]) {
                F.g(list.get(i));
            }
        }
        return F.f();
    }
}
