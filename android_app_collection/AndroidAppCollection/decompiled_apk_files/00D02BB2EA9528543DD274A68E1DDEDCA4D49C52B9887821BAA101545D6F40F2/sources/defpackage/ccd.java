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
/* renamed from: ccd  reason: default package */
/* loaded from: classes4.dex */
final class ccd<DataT> implements buj<DataT> {
    private static final String[] a = {"_data"};
    private final Context b;
    private final cap<File, DataT> c;
    private final cap<Uri, DataT> d;
    private final Uri e;
    private final int f;
    private final int g;
    private final bua h;
    private final Class<DataT> i;
    private volatile boolean j;
    private volatile buj<DataT> k;

    public ccd(Context context, cap<File, DataT> capVar, cap<Uri, DataT> capVar2, Uri uri, int i, int i2, bua buaVar, Class<DataT> cls) {
        this.b = context.getApplicationContext();
        this.c = capVar;
        this.d = capVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = buaVar;
        this.i = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [buj<DataT>, buj] */
    /* JADX WARN: Type inference failed for: r1v6, types: [buj<Data>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super DataT> buiVar) {
        Uri uri;
        cao<DataT> b;
        try {
            buj<DataT> bujVar = (buj<DataT>) false;
            if (!Environment.isExternalStorageLegacy()) {
                if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri = MediaStore.setRequireOriginal(this.e);
                } else {
                    uri = this.e;
                }
                b = this.d.b(uri, this.f, this.g, this.h);
            } else {
                cap<File, DataT> capVar = this.c;
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
                                b = capVar.b(file, this.f, this.g, this.h);
                            }
                        } catch (Throwable th) {
                            th = th;
                            bujVar = (buj<DataT>) query;
                            if (bujVar != 0) {
                                bujVar.close();
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
            if (b != null) {
                bujVar = b.c;
            }
            if (bujVar == 0) {
                String valueOf3 = String.valueOf(this.e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 29);
                sb3.append("Failed to build fetcher for: ");
                sb3.append(valueOf3);
                buiVar.g(new IllegalArgumentException(sb3.toString()));
                return;
            }
            this.k = (buj<DataT>) bujVar;
            if (this.j) {
                c();
            } else {
                ((buj) bujVar).a(broVar, buiVar);
            }
        } catch (FileNotFoundException e) {
            buiVar.g(e);
        }
    }

    @Override // defpackage.buj
    public final void b() {
        buj<DataT> bujVar = this.k;
        if (bujVar != null) {
            bujVar.b();
        }
    }

    @Override // defpackage.buj
    public final void c() {
        this.j = true;
        buj<DataT> bujVar = this.k;
        if (bujVar != null) {
            bujVar.c();
        }
    }

    @Override // defpackage.buj
    public final Class<DataT> d() {
        return this.i;
    }

    @Override // defpackage.buj
    public final int e() {
        return 1;
    }
}
