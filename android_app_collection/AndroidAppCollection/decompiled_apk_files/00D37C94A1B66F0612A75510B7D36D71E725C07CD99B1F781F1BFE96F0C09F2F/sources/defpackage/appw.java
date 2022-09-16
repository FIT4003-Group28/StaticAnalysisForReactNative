package defpackage;
/* compiled from: PG */
/* renamed from: appw  reason: default package */
/* loaded from: classes2.dex */
public final class appw extends aopi implements aoqv {
    public static final appw a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aunb e;
    private aunb f;
    private apzg g;
    private aoux h;
    private byte i = 2;

    static {
        appw appwVar = new appw();
        a = appwVar;
        aopi.registerDefaultInstance(appw.class, appwVar);
    }

    private appw() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\b\bᐉ\u0004\nᐉ\u0002", new Object[]{"c", "d", "e", "h", "g", "f"});
            case 3:
                return new appw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (appw.class) {
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
