package defpackage;
/* compiled from: PG */
/* renamed from: atqk  reason: default package */
/* loaded from: classes2.dex */
public final class atqk extends aopi implements aoqv {
    public static final atqk a;
    private static volatile aorb k;
    public boolean b;
    public aopq c = emptyIntList();
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private int l;
    private int m;

    static {
        atqk atqkVar = new atqk();
        a = atqkVar;
        aopi.registerDefaultInstance(atqk.class, atqkVar);
    }

    private atqk() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0002\u0004D\t\u0000\u0001\u0000\u0004ဇ\u0003\u0006\u0016\tင\u0007\u0016ဇ\u0014\u0019ဇ\u0016\u001fဇ\u001f!ဇ!Bဇ=Dဇ?", new Object[]{"l", "m", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new atqk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (atqk.class) {
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
