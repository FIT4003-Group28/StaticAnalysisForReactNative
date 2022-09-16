package defpackage;

import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amyx  reason: default package */
/* loaded from: classes.dex */
final class amyx extends amti {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ amyy b;

    public amyx(amyy amyyVar, Map.Entry entry) {
        this.b = amyyVar;
        this.a = entry;
    }

    @Override // defpackage.amti
    protected final Map.Entry a() {
        return this.a;
    }

    @Override // defpackage.amti, defpackage.amtj
    protected final /* bridge */ /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.amti, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return ancv.h((Collection) this.a.getValue(), this.b.a.g);
    }
}
