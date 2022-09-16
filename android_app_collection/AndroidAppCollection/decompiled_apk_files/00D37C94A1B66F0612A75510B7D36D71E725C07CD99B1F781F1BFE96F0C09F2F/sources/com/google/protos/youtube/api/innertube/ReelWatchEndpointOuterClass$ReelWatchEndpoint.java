package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReelWatchEndpointOuterClass$ReelWatchEndpoint extends aopi implements aoqv {
    public static final ReelWatchEndpointOuterClass$ReelWatchEndpoint a;
    public static final aopg reelWatchEndpoint;
    private static volatile aorb y;
    public int b;
    public int c;
    public int f;
    public avhn h;
    public apzg i;
    public aunb j;
    public boolean k;
    public atub l;
    public int m;
    public aunb p;
    public auku q;
    public apzg r;
    public awem t;
    public apzg u;
    public aweh v;
    public aunb w;
    public int x;
    private apzg z;
    private byte A = 2;
    public String d = "";
    public String e = "";
    public String g = "";
    public String n = "";
    public String o = "";
    public String s = "";

    static {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = new ReelWatchEndpointOuterClass$ReelWatchEndpoint();
        a = reelWatchEndpointOuterClass$ReelWatchEndpoint;
        aopi.registerDefaultInstance(ReelWatchEndpointOuterClass$ReelWatchEndpoint.class, reelWatchEndpointOuterClass$ReelWatchEndpoint);
        reelWatchEndpoint = aopi.newSingularGeneratedExtension(apzg.a, reelWatchEndpointOuterClass$ReelWatchEndpoint, reelWatchEndpointOuterClass$ReelWatchEndpoint, null, 139608561, aosj.MESSAGE, ReelWatchEndpointOuterClass$ReelWatchEndpoint.class);
    }

    private ReelWatchEndpointOuterClass$ReelWatchEndpoint() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.A = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0001\u0001\ue8f4☔\u0017\u0000\u0000\b\u0001ဈ\u0001\u0002ဈ\u0003\u0003ဋ\u0004\u0004ဈ\u0005\u0005ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\nဇ\t\u000bဈ\u000e\fဌ\u000b\rဈ\f\u000eᐉ\u000f\u000fဌ\u0000\u0010ဉ\u0010\u0011ᐉ\u0011\u0012ဈ\u0012\u0014ဉ\u0014\u0016ᐉ\u0015\u0017ဉ\u0016\u0019ᐉ\u0018\u001aဌ\u0019ϩᐉ\r\ue8f4☔ဉ\n", new Object[]{"b", "d", "e", "f", "g", "h", "i", "j", "k", "o", "m", aulk.b, "n", "p", "c", auii.u, "q", "r", "s", "t", "u", "v", "w", "x", auii.t, "z", "l"});
            case 3:
                return new ReelWatchEndpointOuterClass$ReelWatchEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = y;
                if (aorbVar == null) {
                    synchronized (ReelWatchEndpointOuterClass$ReelWatchEndpoint.class) {
                        aorbVar = y;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            y = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
