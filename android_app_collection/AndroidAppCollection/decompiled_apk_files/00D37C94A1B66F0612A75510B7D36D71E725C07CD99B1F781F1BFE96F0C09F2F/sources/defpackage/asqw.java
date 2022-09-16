package defpackage;
/* compiled from: PG */
/* renamed from: asqw  reason: default package */
/* loaded from: classes2.dex */
public final class asqw extends aopi implements aoqv {
    public static final asqw a;
    private static volatile aorb h;
    public int b;
    public aunb d;
    public arag e;
    public aunb f;
    private arag i;
    private aunb j;
    private aunb k;
    private byte l = 2;
    public String c = "";
    public aopu g = emptyProtobufList();

    static {
        asqw asqwVar = new asqw();
        a = asqwVar;
        aopi.registerDefaultInstance(asqw.class, asqwVar);
    }

    private asqw() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0007\u0001ဈ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bЛ\rᐉ\u0002", new Object[]{"b", "c", "d", "e", "f", "j", "k", "g", aunb.class, "i"});
            case 3:
                return new asqw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asqw.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
