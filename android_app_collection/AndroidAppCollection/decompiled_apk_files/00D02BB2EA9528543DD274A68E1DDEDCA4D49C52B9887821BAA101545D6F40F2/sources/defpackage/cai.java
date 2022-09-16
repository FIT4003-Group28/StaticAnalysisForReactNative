package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
/* compiled from: PG */
/* renamed from: cai  reason: default package */
/* loaded from: classes4.dex */
final class cai implements buj<File> {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public cai(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super File> buiVar) {
        Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Failed to find file path for: ");
            sb.append(valueOf);
            buiVar.g(new FileNotFoundException(sb.toString()));
            return;
        }
        buiVar.f(new File(str));
    }

    @Override // defpackage.buj
    public final void b() {
    }

    @Override // defpackage.buj
    public final void c() {
    }

    @Override // defpackage.buj
    public final Class<File> d() {
        return File.class;
    }

    @Override // defpackage.buj
    public final int e() {
        return 1;
    }
}
