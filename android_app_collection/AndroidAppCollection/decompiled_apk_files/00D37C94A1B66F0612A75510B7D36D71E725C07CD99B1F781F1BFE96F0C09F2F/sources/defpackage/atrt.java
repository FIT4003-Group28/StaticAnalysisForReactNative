package defpackage;
/* compiled from: PG */
/* renamed from: atrt  reason: default package */
/* loaded from: classes2.dex */
public final class atrt extends aopi implements aoqv {
    public static final atrt a;
    private static volatile aorb n;
    public int b;
    public Object d;
    public avhn e;
    public avhu f;
    public avhn g;
    public arag h;
    public arag i;
    public apok j;
    public apok k;
    private aoux o;
    public int c = 0;
    private byte p = 2;
    public aopu l = emptyProtobufList();
    public aoob m = aoob.b;

    static {
        atrt atrtVar = new atrt();
        a = atrtVar;
        aopi.registerDefaultInstance(atrt.class, atrtVar);
    }

    private atrt() {
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
                return newMessageInfo(a, "\u0001\f\u0001\u0001\u0001\u000e\f\u0000\u0001\u000b\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐼ\u0000\u0004ᐉ\u0007\u0005ᐉ\b\bᐉ\t\tည\n\nᐉ\u0002\u000bЛ\fᐉ\u0001\rᐼ\u0000\u000eᐉ\u0004", new Object[]{"d", "c", "b", "e", "h", arag.class, "j", "k", "o", "m", "g", "l", attk.class, "f", aunb.class, "i"});
            case 3:
                return new atrt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (atrt.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
