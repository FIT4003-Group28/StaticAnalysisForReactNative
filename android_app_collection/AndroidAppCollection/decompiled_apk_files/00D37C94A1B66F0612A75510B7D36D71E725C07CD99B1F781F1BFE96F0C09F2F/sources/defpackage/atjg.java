package defpackage;
/* compiled from: PG */
/* renamed from: atjg  reason: default package */
/* loaded from: classes2.dex */
public final class atjg extends aopi implements aoqv {
    public static final atjg a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public arag f;
    public aunb g;
    public apzg h;
    private aoux j;
    private byte k = 2;

    static {
        atjg atjgVar = new atjg();
        a = atjgVar;
        aopi.registerDefaultInstance(atjg.class, atjgVar);
    }

    private atjg() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\bᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "j", "h"});
            case 3:
                return new atjg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (atjg.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
