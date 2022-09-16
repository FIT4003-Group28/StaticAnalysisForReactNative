package defpackage;
/* compiled from: PG */
/* renamed from: aqlo  reason: default package */
/* loaded from: classes2.dex */
public final class aqlo extends aopi implements aoqv {
    public static final aqlo a;
    private static volatile aorb b;
    private int c;
    private aqls d;
    private aqlq e;
    private aoux f;
    private aunb g;
    private aunb h;
    private aunb i;
    private aunb j;
    private aunb k;
    private byte l = 2;

    static {
        aqlo aqloVar = new aqlo();
        a = aqloVar;
        aopi.registerDefaultInstance(aqlo.class, aqloVar);
    }

    private aqlo() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000e\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\tᐉ\u0007\u000bᐉ\b\fᐉ\t\rᐉ\n\u000eᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new aqlo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqlo.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
