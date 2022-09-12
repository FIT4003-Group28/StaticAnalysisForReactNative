package defpackage;

import android.database.Cursor;
/* renamed from: ctgj  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctgj implements dbrn {
    static final dbrn a = new ctgj();

    private ctgj() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Integer.valueOf(((Cursor) obj).getCount());
    }
}
