package defpackage;

import android.view.View;
import android.widget.TimePicker;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cbpe  reason: default package */
/* loaded from: classes4.dex */
final class cbpe implements cqfc {
    final /* synthetic */ cbpg a;

    public cbpe(cbpg cbpgVar) {
        this.a = cbpgVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        this.a.a = new WeakReference<>((TimePicker) view);
    }
}
