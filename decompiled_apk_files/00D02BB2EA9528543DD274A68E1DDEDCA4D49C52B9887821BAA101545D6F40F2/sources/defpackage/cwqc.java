package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: cwqc  reason: default package */
/* loaded from: classes5.dex */
final class cwqc extends Property<View, Integer> {
    public cwqc(Class cls) {
        super(cls, "backgroundColor");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Integer get(View view) {
        Drawable background = view.getBackground();
        return Integer.valueOf(background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(View view, Integer num) {
        view.setBackgroundColor(num.intValue());
    }
}
