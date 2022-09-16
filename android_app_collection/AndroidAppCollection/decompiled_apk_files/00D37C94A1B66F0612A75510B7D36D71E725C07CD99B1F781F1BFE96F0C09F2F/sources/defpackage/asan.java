package defpackage;
/* compiled from: PG */
/* renamed from: asan  reason: default package */
/* loaded from: classes2.dex */
public final class asan extends aopi implements aoqv {
    public static final asan a;
    private static volatile aorb n;
    public int b;
    public long c;
    public aopu f;
    public String g;
    public String h;
    public String i;
    public aopu j;
    public String k;
    public String l;
    public float m;
    private byte o = 2;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();

    static {
        asan asanVar = new asan();
        a = asanVar;
        aopi.registerDefaultInstance(asan.class, asanVar);
    }

    private asan() {
        emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = emptyProtobufList();
        this.k = "";
        this.l = "";
    }

    public final void a() {
        aopu aopuVar = this.e;
        if (!aopuVar.c()) {
            this.e = aopi.mutableCopy(aopuVar);
        }
    }

    public final void b() {
        aopu aopuVar = this.d;
        if (!aopuVar.c()) {
            this.d = aopi.mutableCopy(aopuVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0004\u0003\u0001ဂ\u0000\u0002Л\u0003Л\u0004ဈ\u0001\u0005ဈ\u0002\u0007ဈ\u0004\b\u001b\u000bဈ\u0006\rခ\u0007\u000eဈ\u0005\u0010Л", new Object[]{"b", "c", "d", aqzx.class, "e", aqzx.class, "g", "h", "i", "j", asoo.class, "l", "m", "k", "f", atfm.class});
            case 3:
                return new asan();
            case 4:
                return new aopa((char[]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (asan.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
