package defpackage;

import android.view.View;
import android.widget.TimePicker;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cbpf  reason: default package */
/* loaded from: classes4.dex */
final class cbpf implements cqkn<cbrm> {
    final /* synthetic */ cbpg a;

    public cbpf(cbpg cbpgVar) {
        this.a = cbpgVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(cbrm cbrmVar, View view) {
        cbrm cbrmVar2 = cbrmVar;
        WeakReference<TimePicker> weakReference = this.a.a;
        dbsk.s(weakReference);
        TimePicker timePicker = weakReference.get();
        if (timePicker != null) {
            cbrmVar2.c().onTimeChanged(timePicker, timePicker.getCurrentHour().intValue(), timePicker.getCurrentMinute().intValue());
            cbrmVar2.f();
        }
    }
}
