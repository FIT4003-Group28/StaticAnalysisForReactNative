package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hsb  reason: default package */
/* loaded from: classes3.dex */
public final class hsb implements yiw {
    final /* synthetic */ ImageView a;
    final /* synthetic */ Context b;
    final /* synthetic */ hsc c;

    public hsb(hsc hscVar, ImageView imageView, Context context) {
        this.c = hscVar;
        this.a = imageView;
        this.b = context;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        this.c.v.d(new Runnable() { // from class: hrz
            @Override // java.lang.Runnable
            public final void run() {
                hsc hscVar = hsb.this.c;
                hscVar.v.g(hscVar.x);
            }
        });
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        final Drawable drawable = (Drawable) obj2;
        htd htdVar = this.c.v;
        final ImageView imageView = this.a;
        final Context context = this.b;
        htdVar.d(new Runnable() { // from class: hsa
            @Override // java.lang.Runnable
            public final void run() {
                hsb hsbVar = hsb.this;
                ImageView imageView2 = imageView;
                Drawable drawable2 = drawable;
                Context context2 = context;
                imageView2.setImageDrawable(drawable2);
                hsbVar.c.w = aakr.c(context2, imageView2);
                hsbVar.c.u.setVisibility(8);
                hsbVar.c.t.addView(imageView2);
            }
        });
    }
}
