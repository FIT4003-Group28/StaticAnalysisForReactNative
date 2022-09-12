package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcix  reason: default package */
/* loaded from: classes5.dex */
final class dcix implements dbrn {
    final /* synthetic */ dcjj a;

    public dcix(dcjj dcjjVar) {
        this.a = dcjjVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.a.a(entry.getKey(), entry.getValue());
    }
}
