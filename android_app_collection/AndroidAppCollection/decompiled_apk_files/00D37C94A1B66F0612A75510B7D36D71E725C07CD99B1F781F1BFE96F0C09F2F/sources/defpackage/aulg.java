package defpackage;
/* compiled from: PG */
/* renamed from: aulg  reason: default package */
/* loaded from: classes2.dex */
public final class aulg extends aopi implements aoqv {
    public static final aulg a;
    private static volatile aorb f;
    public int b;
    public avhn c;
    public arag d;
    private arag g;
    private aoux h;
    private byte i = 2;
    public String e = "";

    static {
        aulg aulgVar = new aulg();
        a = aulgVar;
        aopi.registerDefaultInstance(aulg.class, aulgVar);
    }

    private aulg() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "g", "e", "h"});
            case 3:
                return new aulg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aulg.class) {
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
