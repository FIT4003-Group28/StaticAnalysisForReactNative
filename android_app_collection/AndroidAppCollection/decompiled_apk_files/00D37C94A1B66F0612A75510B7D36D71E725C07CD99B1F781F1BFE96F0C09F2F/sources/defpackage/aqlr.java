package defpackage;
/* compiled from: PG */
/* renamed from: aqlr  reason: default package */
/* loaded from: classes2.dex */
public final class aqlr extends aopi implements aoqv {
    public static final aqlr a;
    private static volatile aorb i;
    public int b;
    public Object d;
    public Object f;
    public apzg g;
    private arag j;
    private aunb k;
    private aoux l;
    public int c = 0;
    public int e = 0;
    private byte m = 2;
    public String h = "";

    static {
        aqlr aqlrVar = new aqlr();
        a = aqlrVar;
        aopi.registerDefaultInstance(aqlr.class, aqlrVar);
    }

    private aqlr() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0002\u0001\u0001\n\t\u0000\u0000\b\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\b\u0007ᐉ\u0006\bဈ\u0007\tᐼ\u0001\nᐼ\u0001", new Object[]{"d", "c", "f", "e", "b", arhs.class, avhn.class, "j", "g", "l", "k", "h", arhs.class, avhn.class});
            case 3:
                return new aqlr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqlr.class) {
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
