package defpackage;
/* compiled from: PG */
/* renamed from: aqzx  reason: default package */
/* loaded from: classes2.dex */
public final class aqzx extends aopd implements aope {
    private static volatile aorb D;
    public static final aopr a = new uil(20);
    public static final aqzx b;
    public int A;
    public appr B;
    public float C;
    public int c;
    public int d;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public aqzy m;
    public aqzy n;
    public long o;
    public long p;
    public int t;
    public int u;
    public apip v;
    public aqzw w;
    public aqzz x;
    public double y;
    public double z;
    private byte E = 2;
    public String e = "";
    public String f = "";
    public String q = "";
    public aopq r = emptyIntList();
    public String s = "";

    static {
        aqzx aqzxVar = new aqzx();
        b = aqzxVar;
        aopi.registerDefaultInstance(aqzx.class, aqzxVar);
    }

    private aqzx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.E);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.E = b2;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\u0019\u0000\u0001\u0001/\u0019\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0005ဈ\u0002\u0006င\u0003\u0007င\u0005\bင\u0006\tဉ\b\nဉ\t\u000bဂ\n\fဂ\u000b\u0017ဈ\r\u0018\u001e\u0019င\u0007\u001aဈ\u000e\u001bဌ\u000f\u001cဉ\u0012\u001fင\u0004!ဉ\u0013\"ဉ\u0014#က\u0015%ဌ\u0011&က\u0017)ဌ\u0019*ဉ\u001a/ခ\u001f", new Object[]{"c", "d", "e", "f", "g", "i", "j", "m", "n", "o", "p", "q", "r", ason.a(), "k", "s", "t", aqyp.k, "v", "h", "w", "x", "y", "u", auwh.k, "z", "A", aqyp.i, "B", "C"});
            case 3:
                return new aqzx();
            case 4:
                return new aopc(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = D;
                if (aorbVar == null) {
                    synchronized (aqzx.class) {
                        aorbVar = D;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            D = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
