package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.File;
/* compiled from: PG */
/* renamed from: cce  reason: default package */
/* loaded from: classes4.dex */
public final class cce<DataT> implements cap<Uri, DataT> {
    private final Context a;
    private final cap<File, DataT> b;
    private final cap<Uri, DataT> c;
    private final Class<DataT> d;

    public cce(Context context, cap<File, DataT> capVar, cap<Uri, DataT> capVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = capVar;
        this.c = capVar2;
        this.d = cls;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && bvc.a(uri);
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao b(Uri uri, int i, int i2, bua buaVar) {
        Uri uri2 = uri;
        return new cao(new ciy(uri2), new ccd(this.a, this.b, this.c, uri2, i, i2, buaVar, this.d));
    }
}
