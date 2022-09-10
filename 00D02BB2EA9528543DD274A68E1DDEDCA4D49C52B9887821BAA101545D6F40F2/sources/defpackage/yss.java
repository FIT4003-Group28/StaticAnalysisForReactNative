package defpackage;

import java.util.Comparator;
/* renamed from: yss  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class yss implements Comparator {
    static final Comparator a = new yss();

    private yss() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ysx ysxVar = (ysx) obj;
        ysx ysxVar2 = (ysx) obj2;
        boolean z = false;
        boolean z2 = ysxVar.a().b == 1;
        if (ysxVar2.a().b == 1) {
            z = true;
        }
        if (z2 ^ z) {
            return ysxVar.a().b != 1 ? 1 : -1;
        }
        return (ysx.b(ysxVar.a()) > ysx.b(ysxVar2.a()) ? 1 : (ysx.b(ysxVar.a()) == ysx.b(ysxVar2.a()) ? 0 : -1));
    }
}
