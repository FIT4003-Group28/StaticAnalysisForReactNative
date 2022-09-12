package defpackage;

import java.util.List;
import java.util.Map;
/* renamed from: yst  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class yst implements dbrn {
    static final dbrn a = new yst();

    private yst() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return dbsi.a((String) entry.getKey(), (List) entry.getValue());
    }
}
