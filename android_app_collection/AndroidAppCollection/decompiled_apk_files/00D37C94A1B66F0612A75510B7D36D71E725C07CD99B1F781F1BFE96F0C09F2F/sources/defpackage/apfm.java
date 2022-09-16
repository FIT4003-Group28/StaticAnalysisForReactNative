package defpackage;
/* compiled from: PG */
/* renamed from: apfm  reason: default package */
/* loaded from: classes.dex */
public final class apfm extends aopi implements aoqv {
    public static final apfm a;
    private static volatile aorb q;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public aopu i = emptyProtobufList();
    public boolean j;
    public float k;
    public float l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;

    static {
        apfm apfmVar = new apfm();
        a = apfmVar;
        aopi.registerDefaultInstance(apfm.class, apfmVar);
    }

    private apfm() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0002\u0018\u000e\u0000\u0001\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0006ဇ\u0004\u0007င\u0005\bင\u0006\t\u001b\nဇ\b\fခ\n\u0010ဇ\u000f\u0012ဇ\u0011\u0015ဇ\u0014\u0017ဇ\u0015\u0018ခ\u000b", new Object[]{"b", "c", "d", "e", apfa.e, "f", "g", "h", "i", apfl.class, "j", "k", "m", "n", "o", "p", "l"});
            case 3:
                return new apfm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (apfm.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
