package defpackage;

import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: bnw  reason: default package */
/* loaded from: classes2.dex */
final class bnw extends Property {
    public bnw(Class cls) {
        super(cls, "translationAlpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(bny.a((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        bny.c((View) obj, ((Float) obj2).floatValue());
    }
}
