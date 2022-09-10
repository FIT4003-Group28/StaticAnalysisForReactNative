package defpackage;

import android.view.View;
import android.widget.TimePicker;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: bodm  reason: default package */
/* loaded from: classes3.dex */
final class bodm implements cqfc {
    final /* synthetic */ bodo a;

    public bodm(bodo bodoVar) {
        this.a = bodoVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        this.a.b = new WeakReference<>((TimePicker) view);
    }
}
