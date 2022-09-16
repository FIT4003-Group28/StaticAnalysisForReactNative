package defpackage;
/* compiled from: PG */
/* renamed from: asfs  reason: default package */
/* loaded from: classes2.dex */
public final class asfs extends aopi implements aoqv {
    public static final asfs a;
    private static volatile aorb t;
    public int b;
    public String c = "";
    public String d = "";
    public aopt e = emptyLongList();
    public aopt f;
    public aopt g;
    public aopt h;
    public aopt i;
    public aopt j;
    public aopt k;
    public aopt l;
    public aopt m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;

    static {
        asfs asfsVar = new asfs();
        a = asfsVar;
        aopi.registerDefaultInstance(asfs.class, asfsVar);
    }

    private asfs() {
        emptyLongList();
        this.f = emptyLongList();
        this.g = emptyLongList();
        this.h = emptyLongList();
        this.i = emptyLongList();
        this.j = emptyLongList();
        this.k = emptyLongList();
        this.l = emptyLongList();
        this.m = emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0002A\u0011\u0000\t\u0000\u0002ဈ\u0001\u0003ဈ\u0000\u0004ဇ\b\u0005\u0015\u0006\u0015\u0007\u0015\b\u0015\t\u0015\n\u0015\fင\t\u000fဇ\u000b\u0012ဇ\r\u0015ဇ\u0013/ဇ\f:\u0015@\u0015A\u0015", new Object[]{"b", "d", "c", "n", "e", "g", "h", "i", "j", "k", "o", "p", "r", "s", "q", "f", "l", "m"});
            case 3:
                return new asfs();
            case 4:
                return new aopa((int[]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (asfs.class) {
                        aorbVar = t;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            t = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
