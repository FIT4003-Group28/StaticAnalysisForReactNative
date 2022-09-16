package defpackage;
/* compiled from: PG */
/* renamed from: atof  reason: default package */
/* loaded from: classes2.dex */
public final class atof extends aopi implements aoqv {
    public static final atof a;
    private static volatile aorb i;
    public int b;
    public Object d;
    public boolean g;
    public boolean h;
    private aoux j;
    private arag k;
    public int c = 0;
    private byte l = 2;
    public String e = "";
    public aoob f = aoob.b;

    static {
        atof atofVar = new atof();
        a = atofVar;
        aopi.registerDefaultInstance(atof.class, atofVar);
    }

    private atof() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0002\u0001ဈ\u0000\u0002ည\u0002\u0003ᐉ\u0003\u0005ဇ\u0005\u0006ᐉ\u0001\u0007ဇ\u0006\b်\u0000\t့\u0000", new Object[]{"d", "c", "b", "e", "f", "k", "g", "j", "h"});
            case 3:
                return new atof();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (atof.class) {
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
