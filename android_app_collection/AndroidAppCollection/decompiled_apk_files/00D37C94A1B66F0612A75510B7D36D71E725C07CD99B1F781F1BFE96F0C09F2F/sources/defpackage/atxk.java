package defpackage;
/* compiled from: PG */
/* renamed from: atxk  reason: default package */
/* loaded from: classes2.dex */
public final class atxk extends aopi implements aoqv {
    public static final atxk a;
    private static volatile aorb m;
    public int b;
    public apzg e;
    public arag f;
    public arhs g;
    public atxj h;
    public atxi i;
    public int k;
    public aunb l;
    private apzg n;
    private aoux o;
    private byte p = 2;
    public String c = "";
    public String d = "";
    public aoob j = aoob.b;

    static {
        atxk atxkVar = new atxk();
        a = atxkVar;
        aopi.registerDefaultInstance(atxk.class, atxkVar);
    }

    private atxk() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0007\u0001ဈ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0005ᐉ\u0006\u0006ဉ\u0007\u0007ᐉ\b\bᐉ\t\tည\n\nဈ\u0001\u000bဌ\u000b\fᐉ\f\u000eᐉ\u0003", new Object[]{"b", "c", "e", "f", "g", "h", "i", "o", "j", "d", "k", atxl.a(), "l", "n"});
            case 3:
                return new atxk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (atxk.class) {
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
