package defpackage;
/* compiled from: PG */
/* renamed from: auag  reason: default package */
/* loaded from: classes2.dex */
public final class auag extends aopi implements aoqv {
    public static final auag a;
    private static volatile aorb e;
    public int b;
    private arag g;
    private apok h;
    private byte i = 2;
    public String c = "";
    public String d = "";
    private String f = "";

    static {
        auag auagVar = new auag();
        a = auagVar;
        aopi.registerDefaultInstance(auag.class, auagVar);
    }

    private auag() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "f", "g", "h"});
            case 3:
                return new auag();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auag.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
