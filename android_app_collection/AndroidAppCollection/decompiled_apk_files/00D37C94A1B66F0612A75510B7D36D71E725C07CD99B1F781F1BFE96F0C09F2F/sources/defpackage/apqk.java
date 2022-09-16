package defpackage;
/* compiled from: PG */
/* renamed from: apqk  reason: default package */
/* loaded from: classes2.dex */
public final class apqk extends aopd implements aope {
    public static final apqk a;
    private static volatile aorb j;
    public int b;
    public apqm d;
    public int e;
    public apqj f;
    public aunb g;
    private aoux k;
    private byte m = 2;
    public aopu c = emptyProtobufList();
    public aoob h = aoob.b;
    public aopu i = emptyProtobufList();

    static {
        apqk apqkVar = new apqk();
        a = apqkVar;
        aopi.registerDefaultInstance(apqk.class, apqkVar);
    }

    private apqk() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0002\u0005\u0001Л\u0002ᐉ\u0000\u0005ဉ\u0004\u0006ᐉ\u0005\u0007ည\u0007\tဌ\u0001\nᐉ\u0006\u000bЛ", new Object[]{"b", "c", apql.class, "d", "f", "k", "h", "e", apog.i, "g", "i", avhn.class});
            case 3:
                return new apqk();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (apqk.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
