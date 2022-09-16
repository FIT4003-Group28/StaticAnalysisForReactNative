package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: vqf  reason: default package */
/* loaded from: classes4.dex */
final class vqf extends Property {
    public vqf(Class cls) {
        super(cls, "textPaintAlpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((vqg) obj).b());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((vqg) obj).f(((Integer) obj2).intValue());
    }
}
