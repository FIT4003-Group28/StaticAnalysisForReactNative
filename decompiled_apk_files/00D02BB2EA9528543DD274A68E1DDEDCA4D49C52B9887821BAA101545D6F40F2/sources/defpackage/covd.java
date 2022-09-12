package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: covd  reason: default package */
/* loaded from: classes5.dex */
final class covd extends AsyncTask<Void, Void, Bitmap> {
    final covc a;
    final ParcelFileDescriptor b;
    final int c;
    final int d;
    final int e;
    final /* synthetic */ cove f;

    public covd(cove coveVar, covc covcVar, ParcelFileDescriptor parcelFileDescriptor, int i, int i2, int i3) {
        this.f = coveVar;
        this.a = covcVar;
        this.b = parcelFileDescriptor;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
        Bitmap h;
        try {
            cove coveVar = this.f;
            ParcelFileDescriptor parcelFileDescriptor = this.b;
            int i = this.c;
            Bitmap g = cove.g(parcelFileDescriptor, i, this.d, this.e, (int) ((i * coveVar.f) / coveVar.g));
            if (g == null) {
                h = null;
            } else {
                int i2 = this.c;
                cove coveVar2 = this.f;
                h = cove.h(g, i2, coveVar2.f / coveVar2.g);
            }
            if (h != null) {
                this.f.d.put(this.a.f, h);
            }
            return h;
        } finally {
            ParcelFileDescriptor parcelFileDescriptor2 = this.b;
            if (parcelFileDescriptor2 != null) {
                try {
                    parcelFileDescriptor2.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        Object tag = this.a.e.getTag();
        covc covcVar = this.a;
        if (tag != covcVar) {
            return;
        }
        this.f.a(covcVar, bitmap2);
    }
}
