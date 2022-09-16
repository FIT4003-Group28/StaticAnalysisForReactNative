package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: almb  reason: default package */
/* loaded from: classes.dex */
final class almb extends Property {
    public almb(Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((almc) obj).c());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((almc) obj).e(((Float) obj2).floatValue());
    }
}
