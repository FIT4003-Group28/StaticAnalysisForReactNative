package defpackage;
/* compiled from: PG */
/* renamed from: avzj  reason: default package */
/* loaded from: classes2.dex */
public final class avzj extends aopi implements aoqv {
    public static final avzj a;
    private static volatile aorb b;
    private aoux A;
    private avzh B;
    private avzl C;
    private ates D;
    private apzg E;
    private byte F = 2;
    private int c;
    private int d;
    private arag e;
    private arag f;
    private arag g;
    private avzm h;
    private avaz i;
    private arag j;
    private arag k;
    private arag l;
    private arag m;
    private arag n;
    private arag o;
    private arag p;
    private avzk q;
    private arag r;
    private apmg s;
    private apmg t;
    private apmn u;
    private asow v;
    private apoq w;
    private avzi x;
    private aunb y;
    private aunb z;

    static {
        avzj avzjVar = new avzj();
        a = avzjVar;
        aopi.registerDefaultInstance(avzj.class, avzjVar);
    }

    private avzj() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.F);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.F = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001b\u0000\u0002\u0001/\u001b\u0000\u0000\u001b\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\n\nᐉ\f\fᐉ\u000e\u0010ᐉ\u0013\u0017ᐉ\u0011\u0018ᐉ\u001a\u001bᐉ\u000b ᐉ\"!ᐉ\u0004\"ᐉ#%ᐉ$&ᐉ%'ᐉ\u001b(ᐉ\u0015)ᐉ\u0016*ᐉ\u001c+ᐉ\u0017,ᐉ .ᐉ\u001d/ᐉ\u001e", new Object[]{"c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "o", "p", "r", "q", "v", "n", "B", "h", "C", "D", "E", "w", "s", "t", "x", "u", "A", "y", "z"});
            case 3:
                return new avzj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avzj.class) {
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
