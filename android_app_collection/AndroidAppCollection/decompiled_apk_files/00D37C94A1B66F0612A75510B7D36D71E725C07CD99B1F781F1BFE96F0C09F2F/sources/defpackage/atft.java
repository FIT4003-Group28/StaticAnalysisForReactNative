package defpackage;
/* compiled from: PG */
/* renamed from: atft  reason: default package */
/* loaded from: classes2.dex */
public final class atft extends aopi implements aoqv {
    public static final atft a;
    private static volatile aorb m;
    public int b;
    public int c;
    public avhn d;
    public arag g;
    public arag h;
    public arag i;
    public arhs j;
    public apzg k;
    private aunb n;
    private aoux o;
    private byte p = 2;
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public aoob l = aoob.b;

    static {
        atft atftVar = new atft();
        a = atftVar;
        aopi.registerDefaultInstance(atft.class, atftVar);
    }

    private atft() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\n\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tည\t\nЛ\u000bЛ\fᐉ\u0006", new Object[]{"b", "c", atdq.h, "d", "g", "h", "i", "j", "k", "o", "l", "e", avhc.class, "f", aplw.class, "n"});
            case 3:
                return new atft();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (atft.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
