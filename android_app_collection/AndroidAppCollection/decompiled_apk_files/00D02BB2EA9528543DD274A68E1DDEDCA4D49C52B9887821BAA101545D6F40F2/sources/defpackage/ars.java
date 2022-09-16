package defpackage;

import android.media.MediaRoute2Info;
import java.util.function.Function;
/* renamed from: ars  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ars implements Function {
    static final Function a = new ars();

    private ars() {
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((MediaRoute2Info) obj).getId();
    }
}
