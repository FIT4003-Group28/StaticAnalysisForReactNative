package defpackage;
/* compiled from: PG */
/* renamed from: astb  reason: default package */
/* loaded from: classes2.dex */
public final class astb extends aopi implements aoqv {
    public static final astb a;
    private static volatile aorb n;
    public int b;
    public arag d;
    public int e;
    public int f;
    public int g;
    public aqjv h;
    public avhn i;
    public int j;
    public int k;
    public apzg l;
    private asqy o;
    private aoux p;
    private byte q = 2;
    public String c = "";
    public String m = "";

    static {
        astb astbVar = new astb();
        a = astbVar;
        aopi.registerDefaultInstance(astb.class, astbVar);
    }

    private astb() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0006\u0001ဈ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0006ဋ\u0004\u0007ဋ\u0005\bဋ\u0006\tᐉ\b\nဋ\t\u000bᐉ\u000b\fဈ\f\rဋ\n\u000eᐉ\r\u0010ᐉ\u0007", new Object[]{"b", "c", "d", "o", "e", "f", "g", "i", "j", "l", "m", "k", "p", "h"});
            case 3:
                return new astb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (astb.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
