package defpackage;
/* compiled from: PG */
/* renamed from: aryo  reason: default package */
/* loaded from: classes2.dex */
public final class aryo extends aopi implements aoqv {
    public static final aryo a;
    private static volatile aorb i;
    public int b;
    public aroy c;
    public long e;
    public long f;
    public int g;
    public float h;
    private byte j = 2;
    public aopu d = emptyProtobufList();

    static {
        aryo aryoVar = new aryo();
        a = aryoVar;
        aopi.registerDefaultInstance(aryo.class, aryoVar);
    }

    private aryo() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဃ\u0001\u0004ဃ\u0002\u0005ဋ\u0003\u0006ခ\u0004", new Object[]{"b", "c", "d", arym.class, "e", "f", "g", "h"});
            case 3:
                return new aryo();
            case 4:
                return new aopa((boolean[][]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aryo.class) {
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
