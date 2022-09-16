package defpackage;
/* compiled from: PG */
/* renamed from: aqgb  reason: default package */
/* loaded from: classes2.dex */
public final class aqgb extends aopi implements aoqv {
    public static final aqgb a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private aoux g;
    private aunb h;
    private byte i = 2;

    static {
        aqgb aqgbVar = new aqgb();
        a = aqgbVar;
        aopi.registerDefaultInstance(aqgb.class, aqgbVar);
    }

    private aqgb() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\f\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\nᐉ\b\fᐉ\t", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqgb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqgb.class) {
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
