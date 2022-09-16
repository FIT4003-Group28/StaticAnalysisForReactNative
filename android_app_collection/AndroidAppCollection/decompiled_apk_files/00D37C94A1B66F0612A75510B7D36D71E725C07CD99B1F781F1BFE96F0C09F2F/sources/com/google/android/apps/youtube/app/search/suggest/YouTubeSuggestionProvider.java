package com.google.android.apps.youtube.app.search.suggest;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import java.util.Collection;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubeSuggestionProvider extends ContentProvider {
    private final akib a() {
        return ((lbq) antz.u(getContext(), lbq.class)).am().a();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "vnd.android.cursor.dir/vnd.android.search.suggest";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        akib a = a();
        if (!a.a.f || a.c.c().g()) {
            return null;
        }
        a.h.a.getWritableDatabase().insert("suggestions", "query", contentValues);
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String lowerCase = (uri.getPathSegments() == null || uri.getLastPathSegment() == null || uri.getPathSegments().size() <= 1) ? "" : uri.getLastPathSegment().toLowerCase(Locale.getDefault());
        akhw akhwVar = new akhw();
        try {
            Collection<akhl> h = a().h(lowerCase);
            akhwVar.a.clear();
            for (akhl akhlVar : h) {
                akhwVar.a.add(akhlVar);
            }
        } catch (IOException e) {
            zep.n("error fetching suggestions", e);
        }
        return akhwVar;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
