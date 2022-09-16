package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;
/* compiled from: PG */
/* renamed from: zx  reason: default package */
/* loaded from: classes4.dex */
public final class zx extends Property {
    public zx(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).f(((Float) obj2).floatValue());
    }
}
