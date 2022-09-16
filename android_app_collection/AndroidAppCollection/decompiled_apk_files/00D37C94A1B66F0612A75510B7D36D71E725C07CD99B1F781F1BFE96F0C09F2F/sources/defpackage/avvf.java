package defpackage;
/* compiled from: PG */
/* renamed from: avvf  reason: default package */
/* loaded from: classes2.dex */
public final class avvf extends aopi implements aoqv {
    private static volatile aorb F;
    public static final avvf a;
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public long E;
    private int G;
    private int H;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public String p = "";
    public int q;
    public boolean r;
    public long s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        avvf avvfVar = new avvf();
        a = avvfVar;
        aopi.registerDefaultInstance(avvf.class, avvfVar);
    }

    private avvf() {
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
                return newMessageInfo(a, "\u0001\u001d\u0000\u0003\t[\u001d\u0000\u0000\u0000\tဇ\u0004\nဇ\u0005\rဇ\u000e\u0010ဇ\u0011\u0012ဇ\u0012\u0017ဇ\u0017#ဇ\u001d+ဂ%,ဂ&-ဂ'/င)0င*1င+3င.5ဇ0<ဂ7?ဇ:Eဇ@LဇEMဇFOဇHQဇJRဇKSဈ,WဇOXဇPYငQZဇR[ဂS", new Object[]{"G", "H", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "p", "A", "B", "C", "D", "E"});
            case 3:
                return new avvf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = F;
                if (aorbVar == null) {
                    synchronized (avvf.class) {
                        aorbVar = F;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            F = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
