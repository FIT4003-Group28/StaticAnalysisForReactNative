package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* renamed from: czws  reason: default package */
/* loaded from: classes.dex */
public final class czws extends ViewOutlineProvider {
    final /* synthetic */ Chip a;

    public czws(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        czwv czwvVar = this.a.d;
        if (czwvVar != null) {
            czwvVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
