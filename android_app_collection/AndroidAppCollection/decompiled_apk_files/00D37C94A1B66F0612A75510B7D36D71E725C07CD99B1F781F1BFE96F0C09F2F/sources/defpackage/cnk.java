package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
/* compiled from: PG */
/* renamed from: cnk  reason: default package */
/* loaded from: classes2.dex */
public final class cnk implements cil {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public cnk(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.cil
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.cil
    public final void b() {
    }

    @Override // defpackage.cil
    public final void c() {
    }

    @Override // defpackage.cil
    public final void d(cfv cfvVar, cik cikVar) {
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
            cikVar.g(new FileNotFoundException(sb.toString()));
            return;
        }
        cikVar.f(new File(str));
    }

    @Override // defpackage.cil
    public final int e() {
        return 1;
    }
}
