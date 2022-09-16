package defpackage;
/* compiled from: PG */
/* renamed from: aurf  reason: default package */
/* loaded from: classes2.dex */
public final class aurf extends aopi implements aoqv {
    public static final aurf a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public arag d;
    public apzg e;
    public aurl f;
    private arag h;
    private aoux i;
    private byte j = 2;

    static {
        aurf aurfVar = new aurf();
        a = aurfVar;
        aopi.registerDefaultInstance(aurf.class, aurfVar);
    }

    private aurf() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0005\u0004ᐉ\u0002\u0005ᐉ\u0006\bᐉ\t\nᐉ\u0003", new Object[]{"b", "c", "e", "d", "f", "i", "h"});
            case 3:
                return new aurf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aurf.class) {
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
