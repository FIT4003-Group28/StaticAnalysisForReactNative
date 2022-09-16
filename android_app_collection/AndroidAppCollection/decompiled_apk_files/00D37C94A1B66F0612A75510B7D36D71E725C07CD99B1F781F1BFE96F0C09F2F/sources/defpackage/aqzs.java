package defpackage;
/* compiled from: PG */
/* renamed from: aqzs  reason: default package */
/* loaded from: classes2.dex */
public final class aqzs extends aopi implements aoqv {
    public static final aqzs a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public int e;
    private apzg g;
    private arag h;
    private byte i = 2;
    public String d = "";

    static {
        aqzs aqzsVar = new aqzs();
        a = aqzsVar;
        aopi.registerDefaultInstance(aqzs.class, aqzsVar);
    }

    private aqzs() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ဈ\u0001\u0004ဋ\u0003\u0007ᐉ\u0006\tᐉ\b", new Object[]{"b", "c", "d", "e", "g", "h"});
            case 3:
                return new aqzs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqzs.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
