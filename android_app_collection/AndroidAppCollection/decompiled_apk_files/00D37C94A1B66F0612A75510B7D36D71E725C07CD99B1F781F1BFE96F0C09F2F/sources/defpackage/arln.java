package defpackage;
/* compiled from: PG */
/* renamed from: arln  reason: default package */
/* loaded from: classes2.dex */
public final class arln extends aopi implements aoqv {
    public static final arln a;
    private static volatile aorb e;
    public Object c;
    public int b = 0;
    public aopu d = aopi.emptyProtobufList();

    static {
        arln arlnVar = new arln();
        a = arlnVar;
        aopi.registerDefaultInstance(arln.class, arlnVar);
    }

    private arln() {
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0001\u0000\u0001\ue62aꗧ\n\u0000\u0001\u0000\u0001\u001a\uec71㻕ြ\u0000ﻷ籜ြ\u0000\uf239缚ြ\u0000\ue779輆ြ\u0000\ue17a鄭ြ\u0000\ue8c6鈳ြ\u0000\uf646鲵ြ\u0000\ue9c1鴌ြ\u0000\ue62aꗧြ\u0000", new Object[]{"c", "b", "d", avow.class, aowr.class, aprt.class, aovm.class, arns.class, avyv.class, awhd.class, avjw.class, arly.class});
            case 3:
                return new arln();
            case 4:
                return new aopa((int[][][]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arln.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
