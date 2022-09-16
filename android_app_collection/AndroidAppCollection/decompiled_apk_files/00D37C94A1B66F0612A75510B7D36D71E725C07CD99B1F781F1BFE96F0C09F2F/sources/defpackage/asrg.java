package defpackage;
/* compiled from: PG */
/* renamed from: asrg  reason: default package */
/* loaded from: classes2.dex */
public final class asrg extends aopi implements aoqv {
    public static final asrg a;
    private static volatile aorb i;
    public int b;
    public Object d;
    public arag f;
    public aunb g;
    public apzg h;
    public int c = 0;
    private byte j = 2;
    public String e = "";

    static {
        asrg asrgVar = new asrg();
        a = asrgVar;
        aopi.registerDefaultInstance(asrg.class, asrgVar);
    }

    private asrg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001ဈ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"d", "c", "b", "e", arhs.class, aunb.class, "f", "g", "h"});
            case 3:
                return new asrg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (asrg.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
