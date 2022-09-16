package defpackage;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: bnx  reason: default package */
/* loaded from: classes2.dex */
final class bnx extends Property {
    public bnx(Class cls) {
        super(cls, "clipBounds");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return lj.m((View) obj);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        lj.R((View) obj, (Rect) obj2);
    }
}
