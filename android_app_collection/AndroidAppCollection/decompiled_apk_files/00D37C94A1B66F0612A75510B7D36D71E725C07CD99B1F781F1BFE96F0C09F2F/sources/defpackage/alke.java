package defpackage;

import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: alke  reason: default package */
/* loaded from: classes.dex */
final class alke extends Property {
    public alke(Class cls) {
        super(cls, "paddingEnd");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(lj.h((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        lj.Y(view, lj.i(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
    }
}
