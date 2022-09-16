package defpackage;
/* compiled from: PG */
/* renamed from: autk  reason: default package */
/* loaded from: classes2.dex */
public final class autk extends aopi implements aoqv {
    public static final autk a;
    private static volatile aorb l;
    public int b;
    public arag f;
    public arag g;
    public autd h;
    public apzg i;
    private aoux m;
    private autn n;
    private autj o;
    private byte p = 2;
    public String c = "";
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aoob j = aoob.b;
    public aoob k = aoob.b;

    static {
        autk autkVar = new autk();
        a = autkVar;
        aopi.registerDefaultInstance(autk.class, autkVar);
    }

    private autk() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\u0011\f\u0000\u0002\t\u0002ဈ\u0001\u0003Л\u0004Л\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0005\bည\u0006\tည\u0007\nᐉ\b\u000bᐉ\u0004\u0010ᐉ\f\u0011ᐉ\r", new Object[]{"b", "c", "d", autg.class, "e", autg.class, "f", "g", "i", "j", "k", "m", "h", "n", "o"});
            case 3:
                return new autk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (autk.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
