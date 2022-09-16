package defpackage;

import android.database.Cursor;
/* compiled from: PG */
/* renamed from: btos  reason: default package */
/* loaded from: classes4.dex */
public final class btos {
    private final int a;
    private final Cursor b;

    public btos(Cursor cursor) {
        this.a = cursor.getPosition();
        this.b = cursor;
    }

    public final <T> dbsg<T> a(btor<T> btorVar) {
        dbsk.m(this.a == this.b.getPosition(), "Cursor position has changed.");
        return btorVar.a(this.b);
    }
}
