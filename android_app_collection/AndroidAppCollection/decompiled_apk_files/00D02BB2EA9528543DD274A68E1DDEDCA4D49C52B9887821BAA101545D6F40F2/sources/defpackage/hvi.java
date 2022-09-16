package defpackage;

import java.util.Map;
/* renamed from: hvi  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class hvi implements dbsl {
    static final dbsl a = new hvi();

    private hvi() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        int i = hvk.b;
        return entry == null || ((Integer) entry.getValue()).intValue() < 0;
    }
}
