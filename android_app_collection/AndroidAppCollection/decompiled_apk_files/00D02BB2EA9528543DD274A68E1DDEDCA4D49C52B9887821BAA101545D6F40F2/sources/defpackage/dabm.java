package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: dabm  reason: default package */
/* loaded from: classes5.dex */
final class dabm extends Property<dabq, Integer> {
    public dabm(Class cls) {
        super(cls, "displayedIndicatorColor");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Integer get(dabq dabqVar) {
        int i = dabq.l;
        return Integer.valueOf(dabqVar.e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(dabq dabqVar, Integer num) {
        int intValue = num.intValue();
        int i = dabq.l;
        dabqVar.k(intValue);
    }
}
