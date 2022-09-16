package defpackage;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: aze  reason: default package */
/* loaded from: classes3.dex */
final class aze extends Property<View, Rect> {
    public aze(Class cls) {
        super(cls, "clipBounds");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Rect get(View view) {
        return od.aj(view);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(View view, Rect rect) {
        od.ai(view, rect);
    }
}
