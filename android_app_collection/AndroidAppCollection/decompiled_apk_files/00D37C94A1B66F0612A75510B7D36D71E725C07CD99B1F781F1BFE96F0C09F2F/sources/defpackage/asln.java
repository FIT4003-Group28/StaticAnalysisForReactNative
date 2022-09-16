package defpackage;
/* compiled from: PG */
/* renamed from: asln  reason: default package */
/* loaded from: classes2.dex */
public final class asln extends aopi implements aoqv {
    public static final asln a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public int d;
    public arag e;
    public aopu f;
    public aslk g;
    private apop i;
    private arag j;
    private arag k;
    private aunb l;
    private byte m = 2;

    static {
        asln aslnVar = new asln();
        a = aslnVar;
        aopi.registerDefaultInstance(asln.class, aslnVar);
    }

    private asln() {
        emptyProtobufList();
        this.f = emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\b\u0001ᐉ\u0000\u0003Л\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nဌ\u0001\u000bᐉ\b", new Object[]{"b", "c", "f", apok.class, "e", "i", "g", "j", "k", "d", asev.q, "l"});
            case 3:
                return new asln();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asln.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
