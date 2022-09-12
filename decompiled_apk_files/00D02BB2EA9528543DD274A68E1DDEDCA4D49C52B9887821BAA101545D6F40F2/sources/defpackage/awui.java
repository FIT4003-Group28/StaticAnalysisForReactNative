package defpackage;

import android.widget.NumberPicker;
/* compiled from: PG */
/* renamed from: awui  reason: default package */
/* loaded from: classes3.dex */
final class awui implements NumberPicker.OnValueChangeListener {
    final /* synthetic */ awul a;

    public awui(awul awulVar) {
        this.a = awulVar;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        this.a.a = i2;
    }
}
