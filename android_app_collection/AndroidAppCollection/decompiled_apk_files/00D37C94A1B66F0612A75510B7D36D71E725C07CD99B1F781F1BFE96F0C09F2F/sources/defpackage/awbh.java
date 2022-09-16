package defpackage;
/* compiled from: PG */
/* renamed from: awbh  reason: default package */
/* loaded from: classes2.dex */
public final class awbh extends aopd implements aope {
    private static volatile aorb B;
    public static final awbh a;
    public aunb A;
    private aoux C;
    private apmg D;
    private apzg E;
    public int b;
    public arag c;
    public arag d;
    public avhn e;
    public arag f;
    public apuq g;
    public arag h;
    public arag i;
    public arag j;
    public apzg k;
    public awbg m;
    public ates n;
    public boolean o;
    public apmg s;
    public apmg t;
    public arag u;
    public avss v;
    public awbi x;
    public avxe y;
    public aunb z;
    private byte F = 2;
    public aopu p = emptyProtobufList();
    public aoob q = aoob.b;
    public String r = "";
    public aopu w = emptyProtobufList();

    static {
        awbh awbhVar = new awbh();
        a = awbhVar;
        aopi.registerDefaultInstance(awbh.class, awbhVar);
    }

    private awbh() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.F);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.F = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001b\u0000\u0001\u0001 \u001b\u0000\u0002\u0016\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\t\bᐉ\n\tᐉ\u000b\nဇ\f\fᐉ\u000f\rည\u0011\u000eဈ\u0012\u000fЛ\u0010ᐉ\u0005\u0011ᐉ\u0013\u0012ᐉ\u0014\u0013ᐉ\u0015\u0014ᐉ\u0016\u0015ᐉ\b\u0017ᐉ\u0017\u0019Л\u001aဉ\u0019\u001bဉ\u001a\u001dᐉ\u001b\u001fᐉ\u001d ᐉ\u001e", new Object[]{"b", "c", "d", "e", "f", "h", "i", "k", "m", "n", "o", "C", "q", "r", "p", avhc.class, "g", "D", "s", "t", "u", "j", "v", "w", aplw.class, "x", "y", "z", "E", "A"});
            case 3:
                return new awbh();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = B;
                if (aorbVar == null) {
                    synchronized (awbh.class) {
                        aorbVar = B;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            B = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
