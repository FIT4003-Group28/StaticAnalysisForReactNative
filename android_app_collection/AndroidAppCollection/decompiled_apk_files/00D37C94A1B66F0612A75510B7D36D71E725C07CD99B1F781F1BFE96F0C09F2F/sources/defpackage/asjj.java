package defpackage;
/* compiled from: PG */
/* renamed from: asjj  reason: default package */
/* loaded from: classes2.dex */
public final class asjj extends aopi implements aoqv {
    private static volatile aorb I;
    public static final asjj a;
    public asjd A;
    public asjz B;
    public aska C;
    public aqcg D;
    public asjs E;
    public asjm F;
    public asjt G;
    public askc H;
    public int b;
    public int c;
    public asjf d;
    public asjk e;
    public aopu f = emptyProtobufList();
    public askf g;
    public asjn h;
    public asjo i;
    public asjp j;
    public asjh k;
    public asjc l;
    public asja m;
    public asjg n;
    public asji o;
    public asiw p;
    public asjr q;
    public asiz r;
    public asix s;
    public asit t;
    public asiy u;
    public asjq v;
    public asjb w;
    public askb x;
    public askg y;
    public asje z;

    static {
        asjj asjjVar = new asjj();
        a = asjjVar;
        aopi.registerDefaultInstance(asjj.class, asjjVar);
    }

    private asjj() {
    }

    public final void a() {
        aopu aopuVar = this.f;
        if (!aopuVar.c()) {
            this.f = aopi.mutableCopy(aopuVar);
        }
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
                return newMessageInfo(a, "\u0001\u001f\u0000\u0002\u0001?\u001f\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\nဉ\r\u000bဉ\u000e\fဉ\u000f\u000eဉ\u0011\u0017ဉ\u001a\u001dဉ\u001e\u001fဉ \"ဉ\"$ဉ$+ဉ*-ဉ+.ဉ,/ဉ-0ဉ.1ဉ/2ဉ03ဉ26ဉ57ဉ18ဉ69ဉ7=ဉ9>ဉ:?ဉ;", new Object[]{"b", "c", "d", "e", "f", aske.class, "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "B", "C", "A", "D", "E", "F", "G", "H"});
            case 3:
                return new asjj();
            case 4:
                return new aopa((byte[]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = I;
                if (aorbVar == null) {
                    synchronized (asjj.class) {
                        aorbVar = I;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            I = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
