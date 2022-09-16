package defpackage;
/* compiled from: PG */
/* renamed from: atbk  reason: default package */
/* loaded from: classes2.dex */
public final class atbk extends aopi implements aoqv {
    private static final atbk a;
    private static volatile aorb b;
    private int c;
    private int d;
    private aopu e = emptyProtobufList();

    static {
        atbk atbkVar = new atbk();
        a = atbkVar;
        aopi.registerDefaultInstance(atbk.class, atbkVar);
    }

    private atbk() {
    }

    public static atbj a() {
        return (atbj) a.createBuilder();
    }

    public static /* synthetic */ void c(atbk atbkVar, int i) {
        atbkVar.g(i);
    }

    public static /* synthetic */ void d(atbk atbkVar, atbi atbiVar) {
        atbkVar.e(atbiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(atbi atbiVar) {
        atbiVar.getClass();
        f();
        this.e.add(atbiVar);
    }

    private void f() {
        aopu aopuVar = this.e;
        if (!aopuVar.c()) {
            this.e = aopi.mutableCopy(aopuVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        this.c |= 1;
        this.d = i;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"c", "d", "e", atbi.class});
            case 3:
                return new atbk();
            case 4:
                return new atbj();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atbk.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
