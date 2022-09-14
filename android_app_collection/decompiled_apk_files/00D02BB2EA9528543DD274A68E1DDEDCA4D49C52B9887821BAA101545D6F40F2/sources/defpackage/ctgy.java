package defpackage;

import android.database.Cursor;
/* renamed from: ctgy  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctgy implements dbrn {
    static final dbrn a = new ctgy();

    private ctgy() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Integer.valueOf(((Cursor) obj).getCount());
    }
}
