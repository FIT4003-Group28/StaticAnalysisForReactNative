package defpackage;
/* compiled from: PG */
/* renamed from: anfc  reason: default package */
/* loaded from: classes.dex */
public final class anfc extends aopi implements aoqv {
    public static final anfc a;
    private static volatile aorb h;
    public int b;
    public anfe c;
    public int d;
    public anfe e;
    public long f;
    public boolean g;
    private byte i = 2;

    static {
        anfc anfcVar = new anfc();
        a = anfcVar;
        aopi.registerDefaultInstance(anfc.class, anfcVar);
    }

    private anfc() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", adzd.r, "e", "f", "g"});
            case 3:
                return new anfc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (anfc.class) {
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
