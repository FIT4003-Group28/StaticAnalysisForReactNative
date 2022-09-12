package defpackage;

import java.util.Objects;
import java.util.function.Predicate;
/* renamed from: aqc  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aqc implements Predicate {
    static final Predicate a = new aqc();

    private aqc() {
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return Objects.nonNull((aqn) obj);
    }
}
