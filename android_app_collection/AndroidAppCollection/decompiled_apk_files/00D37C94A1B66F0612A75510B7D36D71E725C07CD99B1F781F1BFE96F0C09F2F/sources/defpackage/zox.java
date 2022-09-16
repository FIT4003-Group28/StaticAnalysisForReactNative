package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: zox  reason: default package */
/* loaded from: classes4.dex */
public final class zox extends AsyncTask {
    private final znh a;
    private final zov b;

    public zox(znh znhVar, zov zovVar) {
        this.a = znhVar;
        this.b = zovVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Bitmap bitmap = ((Bitmap[]) objArr)[0];
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4);
        sb.append(valueOf);
        sb.append(".png");
        String sb2 = sb.toString();
        yuo yuoVar = new yuo();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, yuoVar);
        bitmap.recycle();
        this.a.b(sb2, yuoVar.toByteArray());
        aopa createBuilder = zqz.a.createBuilder();
        String a = zny.a(sb2);
        createBuilder.copyOnWrite();
        zqz zqzVar = (zqz) createBuilder.instance;
        a.getClass();
        zqzVar.b |= 1;
        zqzVar.c = a;
        int width = bitmap.getWidth();
        createBuilder.copyOnWrite();
        zqz zqzVar2 = (zqz) createBuilder.instance;
        zqzVar2.b |= 2;
        zqzVar2.d = width;
        int height = bitmap.getHeight();
        createBuilder.copyOnWrite();
        zqz zqzVar3 = (zqz) createBuilder.instance;
        zqzVar3.b |= 4;
        zqzVar3.e = height;
        return (zqz) createBuilder.mo39build();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.b.a((zqz) obj);
    }
}
