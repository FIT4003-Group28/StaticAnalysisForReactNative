package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: lze  reason: default package */
/* loaded from: classes3.dex */
final class lze implements yiw {
    final /* synthetic */ lzf a;
    private final /* synthetic */ int b;

    public lze(lzf lzfVar) {
        this.a = lzfVar;
    }

    public lze(lzf lzfVar, int i) {
        this.b = i;
        this.a = lzfVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        if (this.b == 0) {
            Uri uri = (Uri) obj;
            this.a.b((Bitmap) obj2);
            return;
        }
        Uri uri2 = (Uri) obj;
        this.a.c((Bitmap) obj2);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        if (this.b == 0) {
            Uri uri = (Uri) obj;
            zep.d("Error retrieving app thumbnail", exc);
            this.a.b(null);
            return;
        }
        Uri uri2 = (Uri) obj;
        zep.d("Error retrieving rating image", exc);
        this.a.c(null);
    }
}
