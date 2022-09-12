package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cmxi  reason: default package */
/* loaded from: classes5.dex */
final class cmxi extends cmxh {
    final WeakReference<View> c;

    public cmxi(View view, int i, long j) {
        super(i, j);
        this.c = new WeakReference<>(view);
    }
}
