package defpackage;
/* renamed from: ufe  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class ufe {
    public static boolean a(@dzsi dcdc<amvh> dcdcVar) {
        if (dcdcVar == null) {
            return false;
        }
        int size = dcdcVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (!dcdcVar.get(i2).equals(amvh.a)) {
                i++;
            }
        }
        return i >= 2;
    }
}
