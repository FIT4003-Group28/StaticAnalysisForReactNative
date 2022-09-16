package defpackage;
/* compiled from: PG */
/* renamed from: aqfy  reason: default package */
/* loaded from: classes2.dex */
public final class aqfy extends aopi implements aoqv {
    public static final aqfy a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public aqky d;
    public long e;
    public apzg f;
    public String g;
    private apok i;
    private apok j;
    private aoux k;
    private byte l = 2;

    static {
        aqfy aqfyVar = new aqfy();
        a = aqfyVar;
        aopi.registerDefaultInstance(aqfy.class, aqfyVar);
    }

    private aqfy() {
        aoob aoobVar = aoob.b;
        this.g = "";
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0007ᐉ\u0007\bဈ\b\tဂ\u0004", new Object[]{"b", "c", "d", "i", "j", "k", "f", "g", "e"});
            case 3:
                return new aqfy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqfy.class) {
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
