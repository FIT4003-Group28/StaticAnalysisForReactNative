package defpackage;
/* compiled from: PG */
/* renamed from: aurt  reason: default package */
/* loaded from: classes2.dex */
public final class aurt extends aopi implements aoqv {
    public static final aurt a;
    private static volatile aorb h;
    public int b;
    public int c;
    public arag d;
    public arag e;
    private aoux i;
    private aurl j;
    private apok k;
    private byte l = 2;
    public aopu f = emptyProtobufList();
    public aopu g = emptyProtobufList();

    static {
        aurt aurtVar = new aurt();
        a = aurtVar;
        aopi.registerDefaultInstance(aurt.class, aurtVar);
    }

    private aurt() {
        aoob aoobVar = aoob.b;
    }

    public final void a() {
        aopu aopuVar = this.f;
        if (!aopuVar.c()) {
            this.f = aopi.mutableCopy(aopuVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0002\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0006\u001b\u0007ᐉ\u0004\tᐉ\u0006\nဌ\u0000\u000bᐉ\u0007", new Object[]{"b", "d", "e", "f", aurp.class, "g", ausj.class, "i", "j", "c", aupm.m, "k"});
            case 3:
                return new aurt();
            case 4:
                return new aopa((float[][]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aurt.class) {
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
