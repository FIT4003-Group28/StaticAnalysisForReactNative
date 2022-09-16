package defpackage;
/* compiled from: PG */
/* renamed from: angk  reason: default package */
/* loaded from: classes.dex */
public final class angk extends aopi implements aoqv {
    public static final angk a;
    private static volatile aorb g;
    public int b;
    public long e;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public aopu f = emptyProtobufList();

    static {
        angk angkVar = new angk();
        a = angkVar;
        aopi.registerDefaultInstance(angk.class, angkVar);
    }

    private angk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"b", "c", "d", "e", "f", angj.class});
            case 3:
                return new angk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (angk.class) {
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
