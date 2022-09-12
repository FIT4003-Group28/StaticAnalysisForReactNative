package defpackage;

import java.util.Date;
/* renamed from: bdkd  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdkd implements dbrn {
    static final dbrn a = new bdkd();

    private bdkd() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return new Date(((Long) obj).longValue());
    }
}
