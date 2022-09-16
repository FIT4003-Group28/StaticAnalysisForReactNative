package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
/* compiled from: PG */
/* renamed from: con  reason: default package */
/* loaded from: classes3.dex */
final class con implements cil {
    private static final String[] a = {"_data"};
    private final Context b;
    private final cnq c;
    private final cnq d;
    private final Uri e;
    private final int f;
    private final int g;
    private final cic h;
    private final Class i;
    private volatile boolean j;
    private volatile cil k;

    public con(Context context, cnq cnqVar, cnq cnqVar2, Uri uri, int i, int i2, cic cicVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = cnqVar;
        this.d = cnqVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = cicVar;
        this.i = cls;
    }

    @Override // defpackage.cil
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.cil
    public final void b() {
        this.j = true;
        cil cilVar = this.k;
        if (cilVar != null) {
            cilVar.b();
        }
    }

    @Override // defpackage.cil
    public final void c() {
        cil cilVar = this.k;
        if (cilVar != null) {
            cilVar.c();
        }
    }

    @Override // defpackage.cil
    public final void d(cfv cfvVar, cik cikVar) {
        Uri uri;
        cnp a2;
        try {
            cil cilVar = null;
            Cursor cursor = null;
            if (!Environment.isExternalStorageLegacy()) {
                if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri = MediaStore.setRequireOriginal(this.e);
                } else {
                    uri = this.e;
                }
                a2 = this.d.a(uri, this.f, this.g, this.h);
            } else {
                cnq cnqVar = this.c;
                Uri uri2 = this.e;
                try {
                    Cursor query = this.b.getContentResolver().query(uri2, a, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    String valueOf = String.valueOf(uri2);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                                    sb.append("File path was empty in media store for: ");
                                    sb.append(valueOf);
                                    throw new FileNotFoundException(sb.toString());
                                }
                                File file = new File(string);
                                query.close();
                                a2 = cnqVar.a(file, this.f, this.g, this.h);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    String valueOf2 = String.valueOf(uri2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb2.append("Failed to media store entry for: ");
                    sb2.append(valueOf2);
                    throw new FileNotFoundException(sb2.toString());
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a2 != null) {
                cilVar = a2.c;
            }
            if (cilVar == null) {
                String valueOf3 = String.valueOf(this.e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 29);
                sb3.append("Failed to build fetcher for: ");
                sb3.append(valueOf3);
                cikVar.g(new IllegalArgumentException(sb3.toString()));
                return;
            }
            this.k = cilVar;
            if (this.j) {
                b();
            } else {
                cilVar.d(cfvVar, cikVar);
            }
        } catch (FileNotFoundException e) {
            cikVar.g(e);
        }
    }

    @Override // defpackage.cil
    public final int e() {
        return 1;
    }
}
