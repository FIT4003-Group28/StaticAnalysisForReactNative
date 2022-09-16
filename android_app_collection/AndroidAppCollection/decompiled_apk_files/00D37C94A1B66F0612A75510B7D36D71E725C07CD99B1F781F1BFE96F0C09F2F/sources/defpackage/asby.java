package defpackage;
/* compiled from: PG */
/* renamed from: asby  reason: default package */
/* loaded from: classes2.dex */
public final class asby extends aopi implements aoqv {
    public static final asby a;
    private static volatile aorb p;
    public int b;
    public aroy c;
    public int g;
    public asbq h;
    public asbv i;
    public ascj j;
    public String k;
    public boolean l;
    public String m;
    public aopq n;
    public int o;
    private asag q;
    private byte r = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        asby asbyVar = new asby();
        a = asbyVar;
        aopi.registerDefaultInstance(asby.class, asbyVar);
    }

    private asby() {
        aoob aoobVar = aoob.b;
        this.k = "";
        this.m = "";
        this.n = emptyIntList();
        aopi.emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001$\u000e\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0004\bဈ\u0003\u000bဉ\u0005\fᐉ\u0007\u0010ဉ\n\u0011ဈ\f\u0014ဉ\u0006\u001aဇ\u0012\u001fဈ\u0017!\u0016$ဌ\u0018", new Object[]{"b", "c", "d", "e", "g", arpt.m, "f", "h", "q", "j", "k", "i", "l", "m", "n", "o", arka.a});
            case 3:
                return new asby();
            case 4:
                return new aopa((char[]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (asby.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
