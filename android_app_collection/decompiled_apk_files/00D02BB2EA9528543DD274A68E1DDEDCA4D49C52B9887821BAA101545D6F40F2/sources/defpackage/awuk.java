package defpackage;

import android.widget.NumberPicker;
/* compiled from: PG */
/* renamed from: awuk  reason: default package */
/* loaded from: classes3.dex */
final class awuk implements NumberPicker.OnValueChangeListener {
    final /* synthetic */ awul a;

    public awuk(awul awulVar) {
        this.a = awulVar;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        this.a.c = i2;
    }
}
