package defpackage;
/* compiled from: PG */
/* renamed from: aqfw  reason: default package */
/* loaded from: classes2.dex */
public final class aqfw extends aopi implements aoqv {
    public static final aqfw a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public aqky d;
    public ates e;
    public long f;
    public apzg g;
    public String h;
    private apok j;
    private apok k;
    private aoux l;
    private apzg m;
    private byte n = 2;

    static {
        aqfw aqfwVar = new aqfw();
        a = aqfwVar;
        aopi.registerDefaultInstance(aqfw.class, aqfwVar);
    }

    private aqfw() {
        aoob aoobVar = aoob.b;
        this.h = "";
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0007ᐉ\u0002\bᐉ\b\tဈ\t\nဂ\u0003\u000bᐉ\n", new Object[]{"b", "c", "d", "j", "k", "l", "e", "g", "h", "f", "m"});
            case 3:
                return new aqfw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqfw.class) {
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
