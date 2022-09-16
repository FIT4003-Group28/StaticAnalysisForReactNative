package defpackage;
/* compiled from: PG */
/* renamed from: asag  reason: default package */
/* loaded from: classes2.dex */
public final class asag extends aopi implements aoqv {
    public static final asag a;
    private static volatile aorb t;
    public int b;
    public aroy c;
    public boolean e;
    public boolean f;
    public atyj g;
    public boolean h;
    public int j;
    public aopq l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public asah q;
    public asal r;
    public asai s;
    private byte u = 2;
    public String d = "";
    public String i = "";
    public String k = "";

    static {
        asag asagVar = new asag();
        a = asagVar;
        aopi.registerDefaultInstance(asag.class, asagVar);
    }

    private asag() {
        aoob aoobVar = aoob.b;
        this.l = emptyIntList();
        this.m = "";
        this.n = "";
        this.o = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.u = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u001c\u0011\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ᐉ\u0004\u0005ဇ\u0003\bဇ\u0005\tဈ\b\nင\t\fဈ\u000b\u000f\u0016\u0013ဈ\u0010\u0016ဈ\u0013\u0017ဈ\u0014\u0019ဇ\u0015\u001aဉ\u0016\u001bဉ\u0017\u001cဉ\u0018", new Object[]{"b", "c", "d", "e", "g", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s"});
            case 3:
                return new asag();
            case 4:
                return new aopa((char[][]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (asag.class) {
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
