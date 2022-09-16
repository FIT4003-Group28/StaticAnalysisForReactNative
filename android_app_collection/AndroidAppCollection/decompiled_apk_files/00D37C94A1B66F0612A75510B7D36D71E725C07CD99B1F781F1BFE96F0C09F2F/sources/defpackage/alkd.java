package defpackage;

import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: alkd  reason: default package */
/* loaded from: classes.dex */
final class alkd extends Property {
    public alkd(Class cls) {
        super(cls, "paddingStart");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(lj.i((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        lj.Y(view, ((Float) obj2).intValue(), view.getPaddingTop(), lj.h(view), view.getPaddingBottom());
    }
}
