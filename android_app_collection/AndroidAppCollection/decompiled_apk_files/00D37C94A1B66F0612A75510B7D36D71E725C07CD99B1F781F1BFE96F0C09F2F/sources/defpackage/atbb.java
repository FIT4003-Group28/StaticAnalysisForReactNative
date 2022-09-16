package defpackage;
/* compiled from: PG */
/* renamed from: atbb  reason: default package */
/* loaded from: classes2.dex */
public final class atbb extends aopi implements aoqv {
    public static final atbb a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private atbc e;
    private atbc f;
    private aunb g;
    private aunb h;
    private byte i = 2;

    static {
        atbb atbbVar = new atbb();
        a = atbbVar;
        aopi.registerDefaultInstance(atbb.class, atbbVar);
    }

    private atbb() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0004\b\u0005\u0000\u0000\u0005\u0004ᐉ\u0000\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\u0001\bᐉ\u0002", new Object[]{"c", "d", "g", "h", "e", "f"});
            case 3:
                return new atbb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atbb.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
