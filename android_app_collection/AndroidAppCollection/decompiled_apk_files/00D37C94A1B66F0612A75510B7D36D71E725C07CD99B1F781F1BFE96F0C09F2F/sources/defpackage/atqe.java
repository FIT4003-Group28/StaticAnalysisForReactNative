package defpackage;
/* compiled from: PG */
/* renamed from: atqe  reason: default package */
/* loaded from: classes2.dex */
public final class atqe extends aopi implements aoqv {
    public static final atqe a;
    private static volatile aorb g;
    public int b;
    public avhn d;
    public boolean f;
    private arag h;
    private byte i = 2;
    public String c = "";
    public String e = "";

    static {
        atqe atqeVar = new atqe();
        a = atqeVar;
        aopi.registerDefaultInstance(atqe.class, atqeVar);
    }

    private atqe() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဇ\u0004\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f", "h"});
            case 3:
                return new atqe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atqe.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
