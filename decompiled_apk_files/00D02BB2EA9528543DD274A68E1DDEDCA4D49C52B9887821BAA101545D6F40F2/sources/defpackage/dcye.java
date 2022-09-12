package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dcye  reason: default package */
/* loaded from: classes5.dex */
abstract class dcye extends dcyk {
    private final int[] a;

    public dcye(dcxj dcxjVar, List<dcxn> list, int i, int i2) {
        super(dcxjVar);
        this.a = new int[i2 - i];
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i3 < iArr.length) {
                iArr[i3] = list.get(i3 + i).a.b;
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dcyk
    public final int e() {
        return this.a.length;
    }

    @Override // defpackage.dcyk
    public final int f(int i) {
        return this.a[i];
    }
}
