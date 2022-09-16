package defpackage;
/* compiled from: PG */
/* renamed from: asgs  reason: default package */
/* loaded from: classes2.dex */
public final class asgs extends aopi implements aoqv {
    private static volatile aorb C;
    public static final asgs a;
    public boolean A;
    public atcp B;
    private asag D;
    public int b;
    public int c;
    public aroy d;
    public int i;
    public boolean j;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean p;
    public int q;
    public boolean r;
    public asgo s;
    public asgp u;
    public long v;
    public asge z;
    private byte E = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String k = "";
    public aopq o = emptyIntList();
    public String t = "";
    public String w = "";
    public String x = "";
    public String y = "";

    static {
        asgs asgsVar = new asgs();
        a = asgsVar;
        aopi.registerDefaultInstance(asgs.class, asgsVar);
    }

    private asgs() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.E);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.E = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001a\u0000\u0002\u00010\u001a\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0006ဈ\u0004\u0007ဋ\u0006\bဈ\u0005\tဇ\b\nဇ\f\u000bᐉ\r\u000f\u0016\u0010ဈ\t\u0018ဇ\u000b\u0019ဇ\n\u001aဇ\u0018\u001cဌ\u001a\u001eဇ\u001b$ဉ\u001f%ဈ 'ဉ\")ဃ#+ဈ%,ဈ&-ဈ'.ဉ(/ဇ)0ဉ*", new Object[]{"b", "c", "d", "e", "f", "g", "i", "h", "j", "n", "D", "o", "k", "m", "l", "p", "q", apiv.d, "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B"});
            case 3:
                return new asgs();
            case 4:
                return new aopa((float[][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = C;
                if (aorbVar == null) {
                    synchronized (asgs.class) {
                        aorbVar = C;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            C = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
