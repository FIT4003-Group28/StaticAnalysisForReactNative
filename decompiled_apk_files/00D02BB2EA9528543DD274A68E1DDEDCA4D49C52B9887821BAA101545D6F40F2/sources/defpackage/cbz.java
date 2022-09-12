package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cbz  reason: default package */
/* loaded from: classes.dex */
public final class cbz implements cap<Uri, InputStream> {
    private final Context a;

    public cbz(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(Uri uri) {
        Uri uri2 = uri;
        return bvc.a(uri2) && bvc.b(uri2);
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao<InputStream> b(Uri uri, int i, int i2, bua buaVar) {
        Long l;
        Uri uri2 = uri;
        if (!bvc.c(i, i2) || (l = (Long) buaVar.c(cep.a)) == null || l.longValue() != -1) {
            return null;
        }
        ciy ciyVar = new ciy(uri2);
        Context context = this.a;
        return new cao<>(ciyVar, bvf.f(context, uri2, new bve(context.getContentResolver())));
    }
}
