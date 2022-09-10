package defpackage;
/* compiled from: PG */
/* renamed from: btxq  reason: default package */
/* loaded from: classes4.dex */
final class btxq {
    public static boolean a(@dzsi dwko dwkoVar) {
        if (dwkoVar == null) {
            return false;
        }
        for (dvox dvoxVar : dwkoVar.a) {
            for (dvdb dvdbVar : dvoxVar.e) {
                if (dvdbVar.a == 0) {
                    for (Integer num : dvdbVar.d) {
                        if (num.intValue() == dxdd.VECTOR_ATLAS.Z) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }
}
