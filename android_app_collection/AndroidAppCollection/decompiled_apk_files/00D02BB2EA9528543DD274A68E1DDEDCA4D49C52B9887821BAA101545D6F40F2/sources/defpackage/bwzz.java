package defpackage;

import java.util.Comparator;
/* renamed from: bwzz  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bwzz implements Comparator {
    static final Comparator a = new bwzz();

    private bwzz() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        dhpf dhpfVar = (dhpf) obj;
        dhpf dhpfVar2 = (dhpf) obj2;
        dwfr dwfrVar = bxaf.a;
        int i = dhpfVar.b;
        int i2 = dhpfVar2.b;
        if (i <= i2) {
            if (i < i2) {
                return -1;
            }
            int i3 = dhpfVar.c;
            int i4 = dhpfVar2.c;
            if (i3 <= i4) {
                if (i3 < i4) {
                    return -1;
                }
                int i5 = dhpfVar.d;
                int i6 = dhpfVar2.d;
                if (i5 <= i6) {
                    if (i5 < i6) {
                        return -1;
                    }
                    int i7 = dhpfVar.e;
                    int i8 = dhpfVar2.e;
                    if (i7 <= i8) {
                        if (i7 < i8) {
                            return -1;
                        }
                        int i9 = dhpfVar.f;
                        int i10 = dhpfVar2.f;
                        if (i9 <= i10) {
                            return i9 < i10 ? -1 : 0;
                        }
                    }
                }
            }
        }
        return 1;
    }
}
