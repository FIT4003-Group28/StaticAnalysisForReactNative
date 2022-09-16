package defpackage;
/* compiled from: PG */
/* renamed from: asfu  reason: default package */
/* loaded from: classes2.dex */
public final class asfu extends aopi implements aoqv {
    public static final asfu a;
    private static volatile aorb f;
    public arpa b;
    private int g;
    private aunb h;
    private aoux i;
    private byte j = 2;
    public aopu c = emptyProtobufList();
    public String d = "";
    public aoob e = aoob.b;

    static {
        asfu asfuVar = new asfu();
        a = asfuVar;
        aopi.registerDefaultInstance(asfu.class, asfuVar);
    }

    private asfu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0004\u0004ည\u0005\u0005ဈ\u0001\u0006ᐉ\u0002", new Object[]{"g", "b", "c", aunb.class, "i", "e", "d", "h"});
            case 3:
                return new asfu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asfu.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
