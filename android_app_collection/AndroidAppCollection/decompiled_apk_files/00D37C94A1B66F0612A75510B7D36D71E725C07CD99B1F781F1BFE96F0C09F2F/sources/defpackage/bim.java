package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bim  reason: default package */
/* loaded from: classes2.dex */
public final class bim extends AsyncTask {
    final /* synthetic */ bio a;
    final /* synthetic */ bin b;

    public bim(bin binVar, bio bioVar) {
        this.b = binVar;
        this.a = bioVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Bitmap[] bitmapArr = (Bitmap[]) objArr;
        try {
            return this.b.b();
        } catch (Exception e) {
            Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.a.a((biq) obj);
    }
}
