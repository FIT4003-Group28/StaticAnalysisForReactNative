package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qok  reason: default package */
/* loaded from: classes4.dex */
public final class qok extends AsyncTask {
    private final qom a;
    private final qoj b;

    static {
        new qpu("FetchBitmapTask");
    }

    public qok(Context context, int i, int i2, qoj qojVar) {
        this.b = qojVar;
        this.a = qmd.e(context.getApplicationContext(), this, new qon(this), i, i2);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        qom qomVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length != 1 || (uri = uriArr[0]) == null || (qomVar = this.a) == null) {
            return null;
        }
        try {
            return qomVar.a(uri);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        qoj qojVar = this.b;
        if (qojVar != null) {
            qojVar.b = bitmap;
            qojVar.c = true;
            qoi qoiVar = qojVar.d;
            if (qoiVar != null) {
                qoiVar.a(qojVar.b);
            }
            qojVar.a = null;
        }
    }
}
