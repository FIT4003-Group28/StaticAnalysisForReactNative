package defpackage;
/* compiled from: PG */
/* renamed from: angp  reason: default package */
/* loaded from: classes.dex */
public final class angp extends aopi implements aoqv {
    public static final angp a;
    private static volatile aorb r;
    public int b;
    public int c;
    public int d;
    public angn e;
    public long f;
    public angu g;
    public ango h;
    public angz i;
    public angt j;
    public angx k;
    public angm l;
    public angv m;
    public angs n;
    public angy o;
    public angq p;
    public angr q;

    static {
        angp angpVar = new angp();
        a = angpVar;
        aopi.registerDefaultInstance(angp.class, angpVar);
    }

    private angp() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\r\u0000\u0003\nC\r\u0000\u0000\u0000\nဉ\b\u0015ဂ\u0013 ဉ\u001e(ဉ&.ဉ,0ဉ.1ဉ/3ဉ16ဉ4?ဉ=@ဉ>Bဉ@CဉA", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case 3:
                return new angp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (angp.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
