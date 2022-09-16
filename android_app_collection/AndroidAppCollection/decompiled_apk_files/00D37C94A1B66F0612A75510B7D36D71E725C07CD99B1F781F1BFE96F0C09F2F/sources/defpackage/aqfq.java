package defpackage;
/* compiled from: PG */
/* renamed from: aqfq  reason: default package */
/* loaded from: classes2.dex */
public final class aqfq extends aopi implements aoqv {
    public static final aqfq a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aunb e;
    private aunb f;
    private aunb g;
    private aunb h;
    private apzg i;
    private arag j;
    private arag k;
    private arag l;
    private apzg m;
    private arag n;
    private aoux o;
    private aunb p;
    private byte q = 2;

    static {
        aqfq aqfqVar = new aqfq();
        a = aqfqVar;
        aopi.registerDefaultInstance(aqfq.class, aqfqVar);
    }

    private aqfq() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.q = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\b\u001a\r\u0000\u0000\r\bᐉ\u0007\tᐉ\b\nᐉ\u0001\rᐉ\t\u000eᐉ\u000f\u0011ᐉ\u000b\u0013ᐉ\u0003\u0014ᐉ\u0004\u0015ᐉ\f\u0016ᐉ\u0005\u0017ᐉ\n\u0018ᐉ\r\u001aᐉ\u0006", new Object[]{"c", "i", "j", "d", "k", "p", "m", "e", "f", "n", "g", "l", "o", "h"});
            case 3:
                return new aqfq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqfq.class) {
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
