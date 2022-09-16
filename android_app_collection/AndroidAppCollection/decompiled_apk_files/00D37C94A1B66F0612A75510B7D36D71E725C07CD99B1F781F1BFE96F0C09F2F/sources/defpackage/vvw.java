package defpackage;

import android.util.Property;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vvw  reason: default package */
/* loaded from: classes4.dex */
public final class vvw extends Property {
    final /* synthetic */ vvx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvw(vvx vvxVar) {
        super(Float.TYPE, "value");
        this.a = vvxVar;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((vvv) obj).a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((vvv) obj).a = ((Float) obj2).floatValue();
        this.a.invalidateSelf();
    }
}
