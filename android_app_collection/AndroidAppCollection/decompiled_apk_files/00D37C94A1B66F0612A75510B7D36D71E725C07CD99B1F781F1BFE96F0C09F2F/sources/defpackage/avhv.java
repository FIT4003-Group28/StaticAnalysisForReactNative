package defpackage;
/* compiled from: PG */
/* renamed from: avhv  reason: default package */
/* loaded from: classes2.dex */
public final class avhv extends aopi implements aoqv {
    public static final avhv a;
    private static volatile aorb n;
    public int b;
    public apzg i;
    private aoux o;
    private byte p = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public aoob m = aoob.b;

    static {
        avhv avhvVar = new avhv();
        a = avhvVar;
        aopi.registerDefaultInstance(avhv.class, avhvVar);
    }

    private avhv() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0016\f\u0000\u0000\u0002\u0001ဈ\u0000\u0006ဈ\u000b\u0007ဈ\f\tဈ\u0011\nᐉ\u0013\u000bည\u0014\fဈ\u0006\rᐉ\b\u000eဈ\u0003\u000fဈ\u0004\u0015ဈ\u0001\u0016ဈ\u0007", new Object[]{"b", "c", "j", "k", "l", "o", "m", "g", "i", "e", "f", "d", "h"});
            case 3:
                return new avhv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (avhv.class) {
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
