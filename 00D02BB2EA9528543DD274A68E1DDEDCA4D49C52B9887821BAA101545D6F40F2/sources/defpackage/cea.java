package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: cea  reason: default package */
/* loaded from: classes.dex */
public final class cea implements buc<Uri, Bitmap> {
    private final cex a;
    private final bxn b;

    public cea(cex cexVar, bxn bxnVar) {
        this.a = cexVar;
        this.b = bxnVar;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ boolean a(Uri uri, bua buaVar) {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ bxd<Bitmap> b(Uri uri, int i, int i2, bua buaVar) {
        bxd<Drawable> c = this.a.c(uri);
        if (c == null) {
            return null;
        }
        return cdn.a(this.b, c.b(), i, i2);
    }
}
