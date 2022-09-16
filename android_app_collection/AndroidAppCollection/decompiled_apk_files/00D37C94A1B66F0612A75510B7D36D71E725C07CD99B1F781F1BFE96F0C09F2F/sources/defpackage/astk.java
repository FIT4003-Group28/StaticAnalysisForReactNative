package defpackage;
/* compiled from: PG */
/* renamed from: astk  reason: default package */
/* loaded from: classes2.dex */
public final class astk extends aopi implements aoqv {
    public static final astk a;
    private static volatile aorb q;
    public int b;
    public asti c;
    public long d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public String o = "";
    public int p;

    static {
        astk astkVar = new astk();
        a = astkVar;
        aopi.registerDefaultInstance(astk.class, astkVar);
    }

    private astk() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rဈ\f\u000eဋ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
            case 3:
                return new astk();
            case 4:
                return new astj();
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (astk.class) {
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
