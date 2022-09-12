package defpackage;

import android.util.Property;
import androidx.cardview.widget.CardView;
/* compiled from: PG */
/* renamed from: nuc  reason: default package */
/* loaded from: classes7.dex */
final class nuc extends Property<CardView, Float> {
    public nuc(Class cls) {
        super(cls, "radius");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(CardView cardView) {
        return Float.valueOf(cardView.e());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(CardView cardView, Float f) {
        cardView.setRadius(f.floatValue());
    }
}
