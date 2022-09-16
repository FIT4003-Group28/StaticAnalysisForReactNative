package defpackage;
/* compiled from: PG */
/* renamed from: aqtc  reason: default package */
/* loaded from: classes2.dex */
public final class aqtc extends aopd implements aope {
    public static final aqtc a;
    private static volatile aorb i;
    public boolean b;
    public boolean c;
    public aozc f;
    public boolean g;
    public aqte h;
    private int j;
    private apzg k;
    private byte m = 2;
    public String d = "";
    public String e = "";

    static {
        aqtc aqtcVar = new aqtc();
        a = aqtcVar;
        aopi.registerDefaultInstance(aqtc.class, aqtcVar);
    }

    private aqtc() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0004\u0013\b\u0000\u0000\u0001\u0004ᐉ\u0006\tဇ\u0002\nဇ\t\rဈ\f\u000fဈ\r\u0011ဉ\u0010\u0012ဇ\u0011\u0013ဉ\u0012", new Object[]{"j", "k", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqtc();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqtc.class) {
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
