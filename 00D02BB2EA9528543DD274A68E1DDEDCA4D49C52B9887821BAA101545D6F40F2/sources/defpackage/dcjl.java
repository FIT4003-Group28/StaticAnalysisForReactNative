package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcjl  reason: default package */
/* loaded from: classes5.dex */
final class dcjl extends dcoy<Map.Entry, Map.Entry> {
    final /* synthetic */ dcjm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcjl(dcjm dcjmVar, Iterator it) {
        super(it);
        this.a = dcjmVar;
    }

    @Override // defpackage.dcoy
    public final /* bridge */ /* synthetic */ Map.Entry a(Map.Entry entry) {
        return new dcjk(this, entry);
    }
}
