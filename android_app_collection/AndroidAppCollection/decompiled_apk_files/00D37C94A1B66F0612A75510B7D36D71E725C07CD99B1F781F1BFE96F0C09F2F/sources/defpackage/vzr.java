package defpackage;

import android.content.ContentValues;
/* compiled from: PG */
/* renamed from: vzr  reason: default package */
/* loaded from: classes4.dex */
final class vzr implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ContentValues b;
    final /* synthetic */ vzs c;

    public vzr(vzs vzsVar, String str, ContentValues contentValues) {
        this.c = vzsVar;
        this.a = str;
        this.b = contentValues;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.getWritableDatabase().insertWithOnConflict(this.a, null, this.b, 5);
        this.c.b.open();
    }
}
