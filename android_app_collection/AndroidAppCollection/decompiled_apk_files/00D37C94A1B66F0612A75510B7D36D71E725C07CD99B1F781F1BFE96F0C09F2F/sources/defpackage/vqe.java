package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: vqe  reason: default package */
/* loaded from: classes4.dex */
final class vqe extends Property {
    public vqe(Class cls) {
        super(cls, "backgroundPaintAlpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((vqg) obj).a());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((vqg) obj).c(((Integer) obj2).intValue());
    }
}
