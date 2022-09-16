package defpackage;
/* compiled from: PG */
/* renamed from: awid  reason: default package */
/* loaded from: classes2.dex */
public final class awid extends aopi implements aoqv {
    public static final awid a;
    private static volatile aorb k;
    public int b;
    public arag c;
    public awie d;
    public arag e;
    public awic f;
    public aopu g;
    public arag h;
    public aopu i;
    public aoob j;
    private apzg l;
    private aoux m;
    private byte n = 2;

    static {
        awid awidVar = new awid();
        a = awidVar;
        aopi.registerDefaultInstance(awid.class, awidVar);
    }

    private awid() {
        emptyProtobufList();
        this.g = emptyProtobufList();
        this.i = emptyProtobufList();
        this.j = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0002\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003\bᐉ\u0004\tᐉ\u0006\nည\u0007\u000bЛ\fЛ\rᐉ\u0005", new Object[]{"b", "c", "d", "l", "e", "f", "m", "j", "g", arag.class, "i", arag.class, "h"});
            case 3:
                return new awid();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (awid.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
