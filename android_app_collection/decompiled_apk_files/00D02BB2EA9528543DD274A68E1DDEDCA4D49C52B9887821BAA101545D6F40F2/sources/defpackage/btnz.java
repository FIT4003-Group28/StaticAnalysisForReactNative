package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: btnz  reason: default package */
/* loaded from: classes.dex */
public final class btnz {
    public final ContentResolver a;

    @Deprecated
    public btnz(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public btnz(Context context) {
        this.a = context.getContentResolver();
    }

    @dzsi
    public static Cursor a(btny<Cursor> btnyVar) {
        try {
            return btnyVar.a();
        } catch (SQLiteException e) {
            throw new btnw(e);
        } catch (SecurityException e2) {
            e = e2;
            throw new btnv(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new btnv(e);
        }
    }

    @dzsi
    public final Cursor b(final Uri uri, @dzsi final String[] strArr, @dzsi final String[] strArr2) {
        return a(new btny(this, uri, strArr, strArr2) { // from class: btns
            private final btnz a;
            private final Uri b;
            private final String[] c;
            private final String[] d;

            {
                this.a = this;
                this.b = uri;
                this.c = strArr;
                this.d = strArr2;
            }

            @Override // defpackage.btny
            public final Object a() {
                btnz btnzVar = this.a;
                return btnzVar.a.query(this.b, this.c, "name=?", this.d, null);
            }
        });
    }
}
