package defpackage;
/* compiled from: PG */
/* renamed from: athk  reason: default package */
/* loaded from: classes2.dex */
public final class athk extends aopi implements aoqv {
    public static final athk a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public arhs f;
    public boolean g;
    public apzg h;
    public apzg i;
    public long k;
    public long l;
    private athl n;
    private byte o = 2;
    public aopu j = emptyProtobufList();

    static {
        athk athkVar = new athk();
        a = athkVar;
        aopi.registerDefaultInstance(athk.class, athkVar);
    }

    private athk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ဇ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\t\u001b\u000bဃ\n\fဃ\u000b\rᐉ\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "i", "n", "j", athy.class, "k", "l", "e"});
            case 3:
                return new athk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (athk.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
