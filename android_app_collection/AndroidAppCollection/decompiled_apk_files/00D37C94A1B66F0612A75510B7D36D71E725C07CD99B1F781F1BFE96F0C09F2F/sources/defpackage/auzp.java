package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
/* compiled from: PG */
/* renamed from: auzp  reason: default package */
/* loaded from: classes2.dex */
public final class auzp extends aopi implements aoqv {
    public static final auzp a;
    public static final aopg b;
    private static volatile aorb d;
    private byte e = 2;
    public aopu c = emptyProtobufList();

    static {
        auzp auzpVar = new auzp();
        a = auzpVar;
        aopi.registerDefaultInstance(auzp.class, auzpVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, auzpVar, auzpVar, null, 355559704, aosj.MESSAGE, auzp.class);
    }

    private auzp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", ReelWatchEndpointOuterClass$ReelWatchEndpoint.class});
            case 3:
                return new auzp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auzp.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
