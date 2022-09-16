package defpackage;
/* compiled from: PG */
/* renamed from: awel  reason: default package */
/* loaded from: classes2.dex */
public final class awel extends aopi implements aoqv {
    public static final awel a;
    private static volatile aorb x;
    public int b;
    public int e;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public String k;
    public awem l;
    public int m;
    public atub n;
    public aweo o;
    public awee p;
    public boolean r;
    public awed s;
    public int t;
    public boolean u;
    public aweh v;
    public aoob w;
    private awej y;
    public aoqp q = aoqp.a;
    private byte z = 2;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        awel awelVar = new awel();
        a = awelVar;
        aopi.registerDefaultInstance(awel.class, awelVar);
    }

    private awel() {
        emptyProtobufList();
        this.k = "";
        this.w = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.z = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0016\u0000\u0001\u0001\uf49c䄩\u0016\u0001\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0005ဈ\u0004\u0006ဇ\u0005\u0007ခ\u0007\bခ\b\tဈ\t\fဌ\r\u0010ဉ\u0014\u00122\u0014ဇ\u0018\u0015ᐉ\u0019\u0016ဌ\u001a\u0017ဇ\u001b\u0019ဇ\u0006\u001aဉ\u001d\u001cည\u001f\uf70f⁾ဉ\n\ue8f4☔ဉ\u000e\uf1b8㴗ဉ\u0011\uf49c䄩ᐉ\u0013", new Object[]{"b", "c", "d", "e", "f", "g", "i", "j", "k", "m", awbk.h, "p", "q", awek.a, "r", "s", "t", atqy.k, "u", "h", "v", "w", "l", "n", "o", "y"});
            case 3:
                return new awel();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = x;
                if (aorbVar == null) {
                    synchronized (awel.class) {
                        aorbVar = x;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            x = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
