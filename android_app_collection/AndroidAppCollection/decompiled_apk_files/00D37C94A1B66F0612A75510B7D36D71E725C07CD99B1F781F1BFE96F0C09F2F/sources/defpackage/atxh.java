package defpackage;
/* compiled from: PG */
/* renamed from: atxh  reason: default package */
/* loaded from: classes2.dex */
public final class atxh extends aopi implements aoqv {
    public static final atxh a;
    private static volatile aorb i;
    public int b;
    public apzg e;
    public aovs f;
    public arhs g;
    public int h;
    private aoux j;
    private byte k = 2;
    public String c = "";
    public String d = "";

    static {
        atxh atxhVar = new atxh();
        a = atxhVar;
        aopi.registerDefaultInstance(atxh.class, atxhVar);
    }

    private atxh() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0007ဌ\u0006\bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", atxl.a(), "j"});
            case 3:
                return new atxh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (atxh.class) {
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
