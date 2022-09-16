package defpackage;
/* compiled from: PG */
/* renamed from: aqyd  reason: default package */
/* loaded from: classes2.dex */
public final class aqyd extends aopi implements aoqv {
    public static final aqyd a;
    private static volatile aorb i;
    public int b;
    public apzg d;
    public boolean e;
    public aunb g;
    public apzg h;
    private aoux j;
    private aunb k;
    private aunb l;
    private byte m = 2;
    public aopu c = emptyProtobufList();
    public aoob f = aoob.b;

    static {
        aqyd aqydVar = new aqyd();
        a = aqydVar;
        aopi.registerDefaultInstance(aqyd.class, aqydVar);
    }

    private aqyd() {
    }

    public final void a() {
        aopu aopuVar = this.c;
        if (!aopuVar.c()) {
            this.c = aopi.mutableCopy(aopuVar);
        }
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0007\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0002\u0004ည\u0003\u0006ဇ\u0001\u0007ᐉ\u0004\bᐉ\u0005\u000bᐉ\b\fᐉ\t", new Object[]{"b", "c", aunb.class, "d", "j", "f", "e", "k", "l", "g", "h"});
            case 3:
                return new aqyd();
            case 4:
                return new aopa((byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqyd.class) {
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
