package defpackage;
/* compiled from: PG */
/* renamed from: aqnv  reason: default package */
/* loaded from: classes2.dex */
public final class aqnv extends aopi implements aoqv {
    public static final aqnv a;
    public static final aopg b;
    private static volatile aorb i;
    public int c;
    public aqnr d;
    public aqnw e;
    public String f;
    public aqnp g;
    public aqns h;
    private awmt j;
    private awmh k;
    private byte l = 2;

    static {
        aqnv aqnvVar = new aqnv();
        a = aqnvVar;
        aopi.registerDefaultInstance(aqnv.class, aqnvVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqnvVar, aqnvVar, null, 355246692, aosj.MESSAGE, aqnv.class);
    }

    private aqnv() {
        emptyProtobufList();
        emptyProtobufList();
        this.f = "";
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0003$\u0007\u0000\u0000\u0002\u0003ဈ\u0012\u0006ᐉ\u0007\u000fဉ\u000b\u0011ဉ\u0011 ဉ\f#ဉ\u001d$ᐉ\u001e", new Object[]{"c", "f", "j", "d", "e", "k", "g", "h"});
            case 3:
                return new aqnv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqnv.class) {
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
