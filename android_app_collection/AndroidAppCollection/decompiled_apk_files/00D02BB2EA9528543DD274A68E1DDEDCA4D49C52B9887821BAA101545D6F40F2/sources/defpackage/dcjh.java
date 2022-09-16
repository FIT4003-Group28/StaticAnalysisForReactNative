package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcjh  reason: default package */
/* loaded from: classes5.dex */
enum dcjh implements dbrn<Map.Entry<?, ?>, Object> {
    KEY,
    VALUE;

    @Override // defpackage.dbrn
    public final /* synthetic */ Object a(Map.Entry<?, ?> entry) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw null;
            }
            return entry.getValue();
        }
        return entry.getKey();
    }
}
