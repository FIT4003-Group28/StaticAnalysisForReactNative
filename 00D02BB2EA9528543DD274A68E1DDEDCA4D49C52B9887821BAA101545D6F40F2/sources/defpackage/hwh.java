package defpackage;
/* compiled from: PG */
/* renamed from: hwh  reason: default package */
/* loaded from: classes.dex */
public final class hwh {
    private static btvo a;
    private static akwu b;

    private hwh() {
    }

    public static akwu a(btvo btvoVar) {
        akwu akwuVar;
        synchronized (hwh.class) {
            if (btvoVar != a) {
                hwg hwgVar = new hwg(btvoVar);
                a = btvoVar;
                b = hwgVar;
            }
            akwuVar = b;
            dbsk.s(akwuVar);
        }
        return akwuVar;
    }
}
