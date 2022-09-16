package defpackage;

import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tix  reason: default package */
/* loaded from: classes4.dex */
public final class tix extends AsyncTask {
    final /* synthetic */ tiy a;
    private int b;
    private int c;

    public tix(tiy tiyVar) {
        this.a = tiyVar;
    }

    private final int b(String str) {
        Throwable th;
        Cursor cursor;
        if (tiy.c.contains(Build.MANUFACTURER)) {
            try {
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
            }
            return this.a.e.getApplicationInfo("com.google.android.googlequicksearchbox", 0).enabled ? 2 : 3;
        }
        try {
            try {
                cursor = this.a.d.getContentResolver().query(Uri.parse(str), null, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() != 0) {
                            if (!cursor.moveToFirst()) {
                                cursor.close();
                                return 16;
                            } else if (cursor.getType(0) != 3) {
                                cursor.close();
                                return 17;
                            } else {
                                try {
                                    int parseInt = Integer.parseInt(cursor.getString(0));
                                    if (parseInt > 12) {
                                        parseInt = 12;
                                    }
                                    if (tjw.c(parseInt) == 0) {
                                        cursor.close();
                                        return 14;
                                    }
                                    int c = tjw.c(parseInt);
                                    cursor.close();
                                    return c;
                                } catch (NumberFormatException e) {
                                    Log.e("LensSdkParamsReader", "Unable to parse Lens version code value.", e);
                                    cursor.close();
                                    return 18;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return 6;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (Exception e2) {
            Log.e("LensSdkParamsReader", "Failed to start Lens due to unexpected exception.", e2);
            return 6;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        this.b = b(tiy.a);
        this.c = b(tiy.b);
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void r2 = (Void) obj;
        a(this.b, this.c);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        new Handler(this.a.d.getMainLooper()).postDelayed(new tiw(this), 4000L);
    }

    public final void a(int i, int i2) {
        if (i != 0) {
            if (i2 == 0) {
                throw null;
            }
            tiy tiyVar = this.a;
            aopa mo52toBuilder = tiyVar.g.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            tjl tjlVar = (tjl) mo52toBuilder.instance;
            tjlVar.e = i - 2;
            tjlVar.b |= 4;
            mo52toBuilder.copyOnWrite();
            tjl tjlVar2 = (tjl) mo52toBuilder.instance;
            tjlVar2.f = i2 - 2;
            tjlVar2.b |= 8;
            tiyVar.g = (tjl) mo52toBuilder.mo39build();
            tiy tiyVar2 = this.a;
            tiyVar2.h = true;
            for (tiv tivVar : tiyVar2.f) {
                tivVar.a(this.a.g);
            }
            this.a.f.clear();
            return;
        }
        throw null;
    }
}
