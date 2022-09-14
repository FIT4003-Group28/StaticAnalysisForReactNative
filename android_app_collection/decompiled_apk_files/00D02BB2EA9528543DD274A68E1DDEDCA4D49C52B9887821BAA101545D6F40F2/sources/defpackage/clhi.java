package defpackage;

import android.database.Cursor;
/* renamed from: clhi  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class clhi implements clhr {
    static final clhr a = new clhi();

    private clhi() {
    }

    @Override // defpackage.clhr
    public final Object a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
