package j$.util.function;

import j$.util.function.Predicate;
/* loaded from: classes5.dex */
public interface Predicate {
    Predicate and(Predicate predicate);

    Predicate negate();

    Predicate or(Predicate predicate);

    boolean test(Object obj);

    /* renamed from: j$.util.function.Predicate$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ boolean lambda$and$0(Predicate predicate, Predicate predicate2, Object obj) {
            return predicate.test(obj) && predicate2.test(obj);
        }

        public static Predicate $default$negate(final Predicate predicate) {
            return new Predicate() { // from class: j$.util.function.Predicate$$ExternalSyntheticLambda1
                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return predicate2.getClass();
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate negate() {
                    return Predicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate or(Predicate predicate2) {
                    return predicate2.getClass();
                }

                @Override // j$.util.function.Predicate
                public final boolean test(Object obj) {
                    return Predicate.CC.lambda$negate$1(Predicate.this, obj);
                }
            };
        }

        public static /* synthetic */ boolean lambda$negate$1(Predicate predicate, Object obj) {
            return !predicate.test(obj);
        }

        public static /* synthetic */ boolean lambda$or$2(Predicate predicate, Predicate predicate2, Object obj) {
            return predicate.test(obj) || predicate2.test(obj);
        }
    }
}
