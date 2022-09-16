package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: allv  reason: default package */
/* loaded from: classes.dex */
final class allv extends Property {
    public allv(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = allw.a;
        return Float.valueOf(((allw) obj).i);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        int[] iArr = allw.a;
        ((allw) obj).i = floatValue;
    }
}
