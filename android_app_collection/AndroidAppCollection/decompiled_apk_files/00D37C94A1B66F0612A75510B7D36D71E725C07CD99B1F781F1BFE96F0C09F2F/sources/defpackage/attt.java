package defpackage;
/* compiled from: PG */
/* renamed from: attt  reason: default package */
/* loaded from: classes2.dex */
public final class attt extends aopi implements aoqv {
    private static volatile aorb G;
    public static final aopr a = new asvu(5);
    public static final attt b;
    public long A;
    public boolean B;
    public aqke D;
    public int E;
    public boolean F;
    private int H;
    public int c;
    public boolean d;
    public boolean f;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;
    private byte I = 2;
    public aopq e = emptyIntList();
    public aopu g = emptyProtobufList();
    public aopq C = emptyIntList();

    static {
        attt atttVar = new attt();
        b = atttVar;
        aopi.registerDefaultInstance(attt.class, atttVar);
    }

    private attt() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.I);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.I = b2;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\u001d\u0000\u0002\u0001@\u001d\u0000\u0003\u0001\u0001ဇ\u0000\u0006\u0016\u0014ဇ\u0011\u0018Л\u001aဇ\u0013\u001bဇ\u0014\u001dဇ\u0016\u001fဇ\u0018\"ဇ\u001b%ဇ\u001e'ဇ (င!)ခ\"-ဇ%.ဇ&0ဇ(1ဇ)2ဇ*4ဇ+7ဇ-8ဇ.9ဇ/:ဂ0;ဂ1<ဇ2=\u001e>ဉ3?င4@ဇ5", new Object[]{"H", "c", "d", "e", "f", "g", aqzx.class, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", apgc.a(), "D", "E", "F"});
            case 3:
                return new attt();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = G;
                if (aorbVar == null) {
                    synchronized (attt.class) {
                        aorbVar = G;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            G = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
