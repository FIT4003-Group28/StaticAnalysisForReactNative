package defpackage;

import android.view.View;
import android.widget.TimePicker;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: bodn  reason: default package */
/* loaded from: classes3.dex */
final class bodn implements cqfc {
    final /* synthetic */ bodo a;

    public bodn(bodo bodoVar) {
        this.a = bodoVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        this.a.a = new WeakReference<>((TimePicker) view);
    }
}
