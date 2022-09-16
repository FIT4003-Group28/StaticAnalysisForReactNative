package defpackage;
/* compiled from: PG */
/* renamed from: arnt  reason: default package */
/* loaded from: classes2.dex */
public final class arnt extends aopi implements aoqv {
    public static final arnt a;
    private static volatile aorb h;
    public int b;
    public aroy c;
    public String g;
    private byte i = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        arnt arntVar = new arnt();
        a = arntVar;
        aopi.registerDefaultInstance(arnt.class, arntVar);
    }

    private arnt() {
        aopi.emptyProtobufList();
        this.g = "";
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0002\u0003ဈ\u0001\u0004ဈ\u0003\u000bဈ\n", new Object[]{"b", "c", "e", "d", "f", "g"});
            case 3:
                return new arnt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arnt.class) {
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
