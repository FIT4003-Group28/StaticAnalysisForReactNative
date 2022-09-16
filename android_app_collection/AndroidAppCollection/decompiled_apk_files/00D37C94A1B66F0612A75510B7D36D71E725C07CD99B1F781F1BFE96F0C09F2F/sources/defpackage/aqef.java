package defpackage;
/* compiled from: PG */
/* renamed from: aqef  reason: default package */
/* loaded from: classes2.dex */
public final class aqef extends aopi implements aoqv {
    public static final aqef a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public arag d;
    public apok e;
    public boolean h;
    private arag j;
    private aoux k;
    private byte l = 2;
    public aoob f = aoob.b;
    public aopu g = emptyProtobufList();

    static {
        aqef aqefVar = new aqef();
        a = aqefVar;
        aopi.registerDefaultInstance(aqef.class, aqefVar);
    }

    private aqef() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ည\u0005\u0005ᐉ\u0002\u0006ᐉ\u0001\u0007Л\tဇ\u0007", new Object[]{"b", "j", "e", "k", "f", "d", "c", "g", apzg.class, "h"});
            case 3:
                return new aqef();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqef.class) {
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
