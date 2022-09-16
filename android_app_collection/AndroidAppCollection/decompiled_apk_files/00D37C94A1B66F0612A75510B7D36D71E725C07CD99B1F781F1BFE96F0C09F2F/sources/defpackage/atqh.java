package defpackage;
/* compiled from: PG */
/* renamed from: atqh  reason: default package */
/* loaded from: classes2.dex */
public final class atqh extends aopi implements aoqv {
    public static final atqh a;
    private static volatile aorb n;
    public int b;
    public String c = "";
    public aopu d = aopi.emptyProtobufList();
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;

    static {
        atqh atqhVar = new atqh();
        a = atqhVar;
        aopi.registerDefaultInstance(atqh.class, atqhVar);
    }

    private atqh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003င\u0001\u0004င\u0002\u0005င\u0003\u0006င\u0004\u0007င\u0005\bင\u0006\tဌ\u0007\u000bဂ\t\fဌ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", attl.a(), "l", "m", atqy.n});
            case 3:
                return new atqh();
            case 4:
                return new aopa((short[]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (atqh.class) {
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
