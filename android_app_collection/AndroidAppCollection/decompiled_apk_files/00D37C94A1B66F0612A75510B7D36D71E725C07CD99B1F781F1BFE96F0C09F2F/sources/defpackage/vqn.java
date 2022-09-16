package defpackage;

import android.util.Property;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vqn  reason: default package */
/* loaded from: classes4.dex */
public final class vqn extends Property {
    public vqn() {
        super(Float.TYPE, "transitionProgress");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((vqj) obj).a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((vqj) obj).d(((Float) obj2).floatValue());
    }
}
