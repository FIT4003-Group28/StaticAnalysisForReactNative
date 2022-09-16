package defpackage;
/* compiled from: PG */
/* renamed from: apzt  reason: default package */
/* loaded from: classes2.dex */
public final class apzt extends aopi implements aoqv {
    public static final apzt a;
    private static volatile aorb k;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private int l;

    static {
        apzt apztVar = new apzt();
        a = apztVar;
        aopi.registerDefaultInstance(apzt.class, apztVar);
    }

    private apzt() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u000b\u001f\t\u0000\u0000\u0000\u000bဇ\u0007\u0012ဇ\u000e\u0015ဇ\u0011\u0016ဇ\u0014\u0018ဇ\u0012\u0019ဇ\u0013\u001aဇ\u0016\u001dဇ\u001b\u001fဇ\u001c", new Object[]{"l", "b", "c", "d", "g", "e", "f", "h", "i", "j"});
            case 3:
                return new apzt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (apzt.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
