package defpackage;
/* compiled from: PG */
/* renamed from: aqmw  reason: default package */
/* loaded from: classes2.dex */
public final class aqmw extends aopi implements aoqv {
    public static final aqmw a;
    public static final aopg b;
    private static volatile aorb d;
    public aopu c;
    private int e;
    private apzg f;
    private byte g = 2;

    static {
        aqmw aqmwVar = new aqmw();
        a = aqmwVar;
        aopi.registerDefaultInstance(aqmw.class, aqmwVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, aqmwVar, aqmwVar, null, 167732284, aosj.MESSAGE, aqmw.class);
    }

    private aqmw() {
        emptyProtobufList();
        this.c = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0003Л", new Object[]{"e", "f", "c", apzg.class});
            case 3:
                return new aqmw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqmw.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
