package defpackage;
/* compiled from: PG */
/* renamed from: assz  reason: default package */
/* loaded from: classes2.dex */
public final class assz extends aopi implements aoqv {
    public static final assz a;
    private static volatile aorb k;
    public avhn c;
    public int d;
    public int e;
    public int f;
    public int g;
    public apzg h;
    private int l;
    private aoux m;
    private byte n = 2;
    public String b = "";
    public String i = "";
    public aopu j = emptyProtobufList();

    static {
        assz asszVar = new assz();
        a = asszVar;
        aopi.registerDefaultInstance(assz.class, asszVar);
    }

    private assz() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ᐉ\u0006\bဈ\u0007\nЛ\u000bᐉ\t", new Object[]{"l", "b", "c", "d", "e", "f", "g", "h", "i", "j", avhn.class, "m"});
            case 3:
                return new assz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (assz.class) {
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
