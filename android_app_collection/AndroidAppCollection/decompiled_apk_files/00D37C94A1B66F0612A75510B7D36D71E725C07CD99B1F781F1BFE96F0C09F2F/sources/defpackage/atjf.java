package defpackage;
/* compiled from: PG */
/* renamed from: atjf  reason: default package */
/* loaded from: classes2.dex */
public final class atjf extends aopi implements aoqv {
    public static final atjf a;
    private static volatile aorb k;
    public int b;
    public Object d;
    public Object f;
    public atje h;
    public boolean i;
    private aoux l;
    public int c = 0;
    public int e = 0;
    private byte m = 2;
    public aoob g = aoob.b;
    public String j = "";

    static {
        atjf atjfVar = new atjf();
        a = atjfVar;
        aopi.registerDefaultInstance(atjf.class, atjfVar);
    }

    private atjf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0002\u0001\u0001\r\t\u0000\u0000\u0006\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0001\u0004ᐼ\u0001\u0005ᐉ\u0004\u0006ည\u0005\u000bᐉ\n\fဇ\u000b\rဈ\f", new Object[]{"d", "c", "f", "e", "b", arhs.class, avhn.class, atjb.class, apzg.class, "l", "g", "h", "i", "j"});
            case 3:
                return new atjf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (atjf.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
