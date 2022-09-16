package defpackage;
/* compiled from: PG */
/* renamed from: artl  reason: default package */
/* loaded from: classes2.dex */
public final class artl extends aopi implements aoqv {
    public static final artl a;
    private static volatile aorb i;
    public int b;
    public arpa c;
    public aunb d;
    public aunb e;
    public aunb f;
    public int g;
    public int h;
    private auna j;
    private aoux k;
    private byte l = 2;

    static {
        artl artlVar = new artl();
        a = artlVar;
        aopi.registerDefaultInstance(artl.class, artlVar);
    }

    private artl() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0007ᐉ\b\bᐉ\u0004\tဋ\u0005\nဋ\u0006", new Object[]{"b", "c", "d", "e", "f", "k", "j", "g", "h"});
            case 3:
                return new artl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (artl.class) {
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
