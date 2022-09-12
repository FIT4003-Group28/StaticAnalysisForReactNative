package defpackage;

import android.database.Cursor;
/* renamed from: btoj  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class btoj implements dbrn {
    static final dbrn a = new btoj();

    private btoj() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Integer.valueOf(((Cursor) obj).getCount());
    }
}
