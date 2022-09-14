package defpackage;

import android.media.MediaRoute2Info;
import java.util.Objects;
import java.util.function.Predicate;
/* renamed from: arr  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class arr implements Predicate {
    static final Predicate a = new arr();

    private arr() {
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return Objects.nonNull((MediaRoute2Info) obj);
    }
}
