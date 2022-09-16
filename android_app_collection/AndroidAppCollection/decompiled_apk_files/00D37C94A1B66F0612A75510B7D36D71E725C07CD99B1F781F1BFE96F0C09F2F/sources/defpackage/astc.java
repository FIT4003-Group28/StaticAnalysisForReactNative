package defpackage;
/* compiled from: PG */
/* renamed from: astc  reason: default package */
/* loaded from: classes2.dex */
public final class astc extends aopi implements aoqv {
    public static final astc a;
    private static volatile aorb n;
    public int b;
    public arag d;
    public int e;
    public int f;
    public int g;
    public avhn h;
    public int i;
    public int j;
    public apzg k;
    private asqy o;
    private aoux p;
    private byte q = 2;
    public String c = "";
    public String l = "";
    public aoob m = aoob.b;

    static {
        astc astcVar = new astc();
        a = astcVar;
        aopi.registerDefaultInstance(astc.class, astcVar);
    }

    private astc() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0000\u0005\u0001ဈ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0006ဋ\u0004\u0007ဋ\u0005\bဋ\u0006\tᐉ\u0007\nဋ\b\u000bᐉ\n\fဈ\u000b\rဋ\t\u000eᐉ\f\u000fည\r", new Object[]{"b", "c", "d", "o", "e", "f", "g", "h", "i", "k", "l", "j", "p", "m"});
            case 3:
                return new astc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (astc.class) {
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
