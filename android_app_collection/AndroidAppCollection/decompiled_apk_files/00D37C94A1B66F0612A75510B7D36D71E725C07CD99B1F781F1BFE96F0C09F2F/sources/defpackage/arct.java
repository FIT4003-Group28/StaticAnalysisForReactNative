package defpackage;
/* compiled from: PG */
/* renamed from: arct  reason: default package */
/* loaded from: classes2.dex */
public final class arct extends aopi implements aoqv {
    public static final arct a;
    private static volatile aorb l;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public avhn f;
    public boolean g;
    public apzg h;
    public apzg i;
    public String j;
    public String k;
    private byte m = 2;

    static {
        arct arctVar = new arct();
        a = arctVar;
        aopi.registerDefaultInstance(arct.class, arctVar);
    }

    private arct() {
        emptyProtobufList();
        this.j = "";
        this.k = "";
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0007ဇ\u0006\nᐉ\u0007\u000bᐉ\b\fဈ\t\rဈ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new arct();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (arct.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
