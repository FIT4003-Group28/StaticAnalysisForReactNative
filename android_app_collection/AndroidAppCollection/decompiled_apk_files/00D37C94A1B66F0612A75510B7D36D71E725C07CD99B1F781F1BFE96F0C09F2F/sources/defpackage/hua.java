package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hua  reason: default package */
/* loaded from: classes3.dex */
public final class hua implements yiw {
    final /* synthetic */ ImageView a;
    final /* synthetic */ View b;
    final /* synthetic */ axbl c;
    final /* synthetic */ hvg d;
    final /* synthetic */ hub e;

    public hua(hub hubVar, ImageView imageView, View view, axbl axblVar, hvg hvgVar) {
        this.e = hubVar;
        this.a = imageView;
        this.b = view;
        this.c = axblVar;
        this.d = hvgVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        this.e.e(this.a);
        hub hubVar = this.e;
        hxb.e(hubVar.d, hubVar.q, this.b, this.c, this.d);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        this.a.setImageBitmap((Bitmap) obj2);
        hub hubVar = this.e;
        hxb.e(hubVar.d, hubVar.q, this.b, this.c, this.d);
    }
}
