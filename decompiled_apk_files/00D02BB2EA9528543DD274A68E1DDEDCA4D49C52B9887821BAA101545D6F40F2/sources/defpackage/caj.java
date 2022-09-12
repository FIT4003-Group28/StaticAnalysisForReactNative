package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
/* compiled from: PG */
/* renamed from: caj  reason: default package */
/* loaded from: classes4.dex */
public final class caj implements cap<Uri, File> {
    private final Context a;

    public caj(Context context) {
        this.a = context;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(Uri uri) {
        return bvc.a(uri);
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao<File> b(Uri uri, int i, int i2, bua buaVar) {
        Uri uri2 = uri;
        return new cao<>(new ciy(uri2), new cai(this.a, uri2));
    }
}
