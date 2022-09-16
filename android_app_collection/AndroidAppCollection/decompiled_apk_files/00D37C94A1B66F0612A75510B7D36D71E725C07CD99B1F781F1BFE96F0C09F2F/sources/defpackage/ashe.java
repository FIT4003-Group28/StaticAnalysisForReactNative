package defpackage;

import com.google.protos.youtube.api.innertube.CompleteTransactionActionOuterClass$CompleteTransactionAction;
/* compiled from: PG */
/* renamed from: ashe  reason: default package */
/* loaded from: classes2.dex */
public final class ashe extends aopi implements aoqv {
    public static final ashe a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public arpa e;
    public apzg f;
    private arbf h;
    private aoux i;
    public int c = 0;
    private byte j = 2;

    static {
        ashe asheVar = new ashe();
        a = asheVar;
        aopi.registerDefaultInstance(ashe.class, asheVar);
    }

    private ashe() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001̉\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0005ᐉ\u0006\u0007ᐉ\u0003̉ᐉ\u0004", new Object[]{"d", "c", "b", "e", CompleteTransactionActionOuterClass$CompleteTransactionAction.class, auvw.class, "i", "f", "h"});
            case 3:
                return new ashe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (ashe.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
