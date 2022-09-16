package defpackage;
/* compiled from: PG */
/* renamed from: aqfz  reason: default package */
/* loaded from: classes2.dex */
public final class aqfz extends aopi implements aoqv {
    public static final aqfz a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public aqky d;
    public long e;
    public apzg f;
    public String g;
    private apok i;
    private arag j;
    private apzg k;
    private arag l;
    private aoux m;
    private ates n;
    private byte o = 2;

    static {
        aqfz aqfzVar = new aqfz();
        a = aqfzVar;
        aopi.registerDefaultInstance(aqfz.class, aqfzVar);
    }

    private aqfz() {
        aoob aoobVar = aoob.b;
        this.g = "";
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\b\u0006ᐉ\u0004\u0007ᐉ\n\bဈ\f\tဂ\u0005\nᐉ\u0006\u000bᐉ\u0007\fᐉ\u000b", new Object[]{"b", "c", "d", "i", "m", "j", "f", "g", "e", "k", "l", "n"});
            case 3:
                return new aqfz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqfz.class) {
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
