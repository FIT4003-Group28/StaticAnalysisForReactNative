package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dciz  reason: default package */
/* loaded from: classes5.dex */
public final class dciz implements dbrn<Map.Entry, Map.Entry> {
    final /* synthetic */ dcjj a;

    public dciz(dcjj dcjjVar) {
        this.a = dcjjVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map.Entry a(Map.Entry entry) {
        Map.Entry entry2 = entry;
        dcjj dcjjVar = this.a;
        dbsk.s(dcjjVar);
        dbsk.s(entry2);
        return new dciy(entry2, dcjjVar);
    }
}
