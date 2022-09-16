package defpackage;
/* compiled from: PG */
/* renamed from: auoy  reason: default package */
/* loaded from: classes2.dex */
public final class auoy extends aopd implements aope {
    public static final auoy a;
    private static volatile aorb i;
    public int b;
    public aupb e;
    public auoz g;
    public boolean h;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        auoy auoyVar = new auoy();
        a = auoyVar;
        aopi.registerDefaultInstance(auoy.class, auoyVar);
    }

    private auoy() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u000bဇ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new auoy();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (auoy.class) {
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
