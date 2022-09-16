package defpackage;
/* compiled from: PG */
/* renamed from: arej  reason: default package */
/* loaded from: classes2.dex */
public final class arej extends aopi implements aoqv {
    public static final arej a;
    private static volatile aorb n;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arag f;
    public arag g;
    public arag h;
    public apzg i;
    public arek j;
    public ates l;
    public aoob m;
    private arcq o;
    private aoux p;
    private byte q = 2;
    public aopu k = emptyProtobufList();

    static {
        arej arejVar = new arej();
        a = arejVar;
        aopi.registerDefaultInstance(arej.class, arejVar);
    }

    private arej() {
        emptyProtobufList();
        emptyProtobufList();
        this.m = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0002\u0015\r\u0000\u0001\f\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0007\tᐉ\u0002\nᐉ\r\u000bᐉ\b\fЛ\u000eည\u000e\u0010ᐉ\t\u0011ᐉ\n\u0014ᐉ\u0005\u0015ᐉ\u0006", new Object[]{"b", "c", "e", "f", "i", "d", "p", "j", "k", aplw.class, "m", "l", "o", "g", "h"});
            case 3:
                return new arej();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (arej.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
