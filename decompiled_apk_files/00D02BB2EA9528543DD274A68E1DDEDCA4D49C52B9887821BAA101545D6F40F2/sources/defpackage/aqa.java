package defpackage;

import android.media.MediaRoute2Info;
import java.util.function.Predicate;
/* renamed from: aqa  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aqa implements Predicate {
    static final Predicate a = new aqa();

    private aqa() {
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return !((MediaRoute2Info) obj).isSystemRoute();
    }
}
