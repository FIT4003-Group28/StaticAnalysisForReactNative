package defpackage;
/* compiled from: PG */
/* renamed from: arqz  reason: default package */
/* loaded from: classes2.dex */
public final class arqz extends aopi implements aoqv {
    public static final arqz a;
    private static volatile aorb i;
    public arpa b;
    public int c;
    public boolean e;
    public boolean h;
    private int j;
    private byte k = 2;
    public String d = "";
    public aoob f = aoob.b;
    public aopu g = emptyProtobufList();

    static {
        arqz arqzVar = new arqz();
        a = arqzVar;
        aopi.registerDefaultInstance(arqz.class, arqzVar);
    }

    private arqz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ည\u0004\u0006\u001b\u000bဇ\t", new Object[]{"j", "b", "c", aqvj.m, "d", "e", "f", "g", arqx.class, "h"});
            case 3:
                return new arqz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arqz.class) {
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
