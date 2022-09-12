package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* renamed from: czwr  reason: default package */
/* loaded from: classes.dex */
public final class czwr extends dadf {
    final /* synthetic */ Chip a;

    public czwr(Chip chip) {
        this.a = chip;
    }

    @Override // defpackage.dadf
    public final void a(Typeface typeface, boolean z) {
        Chip chip = this.a;
        czwv czwvVar = chip.d;
        chip.setText(czwvVar.t ? czwvVar.d : chip.getText());
        this.a.requestLayout();
        this.a.invalidate();
    }

    @Override // defpackage.dadf
    public final void b(int i) {
    }
}
