package defpackage;
/* compiled from: PG */
/* renamed from: atzr  reason: default package */
/* loaded from: classes2.dex */
public final class atzr extends aopi implements aoqv {
    public static final atzr a;
    private static volatile aorb g;
    public int b;
    public arag d;
    private byte h = 2;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        atzr atzrVar = new atzr();
        a = atzrVar;
        aopi.registerDefaultInstance(atzr.class, atzrVar);
    }

    private atzr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0003\u0002ᐉ\u0004\u0003ဈ\u0005\u0004ဈ\u0006", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new atzr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atzr.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
