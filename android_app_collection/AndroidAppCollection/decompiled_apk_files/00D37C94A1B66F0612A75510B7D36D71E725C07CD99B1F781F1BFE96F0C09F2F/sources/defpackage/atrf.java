package defpackage;
/* compiled from: PG */
/* renamed from: atrf  reason: default package */
/* loaded from: classes2.dex */
public final class atrf extends aopi implements aoqv {
    public static final atrf a;
    private static volatile aorb h;
    public int b;
    public int c;
    public atrc e;
    private byte i = 2;
    public String d = "";
    public aopu f = emptyProtobufList();
    public aopu g = emptyProtobufList();

    static {
        atrf atrfVar = new atrf();
        a = atrfVar;
        aopi.registerDefaultInstance(atrf.class, atrfVar);
    }

    private atrf() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0003\u0001ဌ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004Л\u0005Л", new Object[]{"b", "c", atqy.h, "d", "e", "f", atrf.class, "g", atrf.class});
            case 3:
                return new atrf();
            case 4:
                return new aopa((short[]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atrf.class) {
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
