package defpackage;
/* compiled from: PG */
/* renamed from: aprz  reason: default package */
/* loaded from: classes2.dex */
public final class aprz extends aopi implements aoqv {
    public static final aprz a;
    private static volatile aorb i;
    public int b;
    public avhn f;
    public int g;
    public int h;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        aprz aprzVar = new aprz();
        a = aprzVar;
        aopi.registerDefaultInstance(aprz.class, aprzVar);
    }

    private aprz() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aprz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aprz.class) {
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
