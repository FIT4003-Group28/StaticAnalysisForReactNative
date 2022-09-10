package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcof  reason: default package */
/* loaded from: classes5.dex */
final class dcof extends dcoy<Map.Entry, Map.Entry> {
    final /* synthetic */ dcog a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcof(dcog dcogVar, Iterator it) {
        super(it);
        this.a = dcogVar;
    }

    @Override // defpackage.dcoy
    public final /* bridge */ /* synthetic */ Map.Entry a(Map.Entry entry) {
        return new dcoe(this, entry);
    }
}
