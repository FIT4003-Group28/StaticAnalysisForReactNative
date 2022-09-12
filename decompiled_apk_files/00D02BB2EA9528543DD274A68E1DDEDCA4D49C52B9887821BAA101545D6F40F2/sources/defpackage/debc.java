package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: debc  reason: default package */
/* loaded from: classes6.dex */
final class debc extends dcbo {
    final /* synthetic */ Map.Entry a;

    public debc(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.dcbo, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbo
    protected final Map.Entry a() {
        return this.a;
    }

    @Override // defpackage.dcbo, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return new debk((List) this.a.getValue());
    }
}
