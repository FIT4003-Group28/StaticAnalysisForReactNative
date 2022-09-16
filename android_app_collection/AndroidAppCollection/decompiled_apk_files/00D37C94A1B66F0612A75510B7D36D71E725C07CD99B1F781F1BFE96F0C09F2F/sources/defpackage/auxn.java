package defpackage;
/* compiled from: PG */
/* renamed from: auxn  reason: default package */
/* loaded from: classes2.dex */
public final class auxn extends aopd implements aope {
    public static final auxn a;
    private static volatile aorb i;
    public int b;
    public apzg e;
    public boolean h;
    private aoux j;
    private byte k = 2;
    public aopu c = emptyProtobufList();
    public String d = "";
    public String f = "";
    public aoob g = aoob.b;

    static {
        auxn auxnVar = new auxn();
        a = auxnVar;
        aopi.registerDefaultInstance(auxn.class, auxnVar);
    }

    private auxn() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0003\u0001Л\u0002ဈ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0003\u0005ည\u0004\u0006ဈ\u0002\bဇ\u0005", new Object[]{"b", "c", aunb.class, "d", "e", "j", "g", "f", "h"});
            case 3:
                return new auxn();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (auxn.class) {
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
