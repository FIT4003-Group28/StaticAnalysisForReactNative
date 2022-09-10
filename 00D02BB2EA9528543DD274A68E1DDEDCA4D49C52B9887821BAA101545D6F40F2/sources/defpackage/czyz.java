package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czyz  reason: default package */
/* loaded from: classes5.dex */
public final class czyz extends Property<ExtendedFloatingActionButton, Float> {
    final /* synthetic */ czza a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czyz(czza czzaVar, Class cls) {
        super(cls, "LABEL_OPACITY_PROPERTY");
        this.a = czzaVar;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
        ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
        return Float.valueOf(czum.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton2.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton2.n.getColorForState(extendedFloatingActionButton2.getDrawableState(), this.a.a.n.getDefaultColor()))));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
        ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
        Float f2 = f;
        int colorForState = extendedFloatingActionButton2.n.getColorForState(extendedFloatingActionButton2.getDrawableState(), this.a.a.n.getDefaultColor());
        ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (czum.a(0.0f, Color.alpha(colorForState) / 255.0f, f2.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
        if (f2.floatValue() == 1.0f) {
            extendedFloatingActionButton2.b(extendedFloatingActionButton2.n);
        } else {
            extendedFloatingActionButton2.b(valueOf);
        }
    }
}
