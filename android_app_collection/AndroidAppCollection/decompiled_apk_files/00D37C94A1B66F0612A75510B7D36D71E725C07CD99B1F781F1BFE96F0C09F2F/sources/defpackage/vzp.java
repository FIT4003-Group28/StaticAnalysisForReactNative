package defpackage;

import android.content.ContentValues;
/* compiled from: PG */
/* renamed from: vzp  reason: default package */
/* loaded from: classes4.dex */
final class vzp implements Runnable {
    final /* synthetic */ ContentValues a;
    final /* synthetic */ String[] b;
    final /* synthetic */ vzs c;

    public vzp(vzs vzsVar, ContentValues contentValues, String[] strArr) {
        this.c = vzsVar;
        this.a = contentValues;
        this.b = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.getWritableDatabase().update("identity", this.a, "account = ?", this.b);
        this.c.b.open();
    }
}
