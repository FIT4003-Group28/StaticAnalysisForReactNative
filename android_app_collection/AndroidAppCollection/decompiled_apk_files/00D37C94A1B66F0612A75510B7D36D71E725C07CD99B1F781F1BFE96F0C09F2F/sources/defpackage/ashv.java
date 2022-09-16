package defpackage;
/* compiled from: PG */
/* renamed from: ashv  reason: default package */
/* loaded from: classes2.dex */
public final class ashv extends aopi implements aoqv {
    public static final ashv a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public arag d;
    public arhs e;
    public arhs f;
    public boolean g;
    public aovs h;
    private byte j = 2;

    static {
        ashv ashvVar = new ashv();
        a = ashvVar;
        aopi.registerDefaultInstance(ashv.class, ashvVar);
    }

    private ashv() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0004\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ဇ\u0005\u0006ဉ\u0006\u0007ᐉ\u0002", new Object[]{"b", "c", "e", "f", "g", "h", "d"});
            case 3:
                return new ashv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (ashv.class) {
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
