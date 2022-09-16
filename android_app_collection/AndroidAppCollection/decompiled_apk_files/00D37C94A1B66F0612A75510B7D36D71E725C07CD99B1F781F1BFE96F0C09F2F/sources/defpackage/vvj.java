package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: vvj  reason: default package */
/* loaded from: classes4.dex */
final class vvj extends Property {
    public vvj() {
        super(Float.TYPE, "revealState");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = vvk.d;
        return Float.valueOf(((vvk) obj).c);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        vvk vvkVar = (vvk) obj;
        float floatValue = ((Float) obj2).floatValue();
        int i = vvk.d;
        vvkVar.c = floatValue;
        vvkVar.invalidateSelf();
    }
}
