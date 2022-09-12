package defpackage;

import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: azkr  reason: default package */
/* loaded from: classes3.dex */
final class azkr implements azok<Void> {
    final /* synthetic */ azks a;

    public azkr(azks azksVar) {
        this.a = azksVar;
    }

    @Override // defpackage.azok
    public final /* bridge */ /* synthetic */ Void a() {
        SQLiteDatabase b = this.a.d.b(true);
        b.delete("sync_item", null, null);
        b.delete("sync_corpus", null, null);
        return null;
    }
}
