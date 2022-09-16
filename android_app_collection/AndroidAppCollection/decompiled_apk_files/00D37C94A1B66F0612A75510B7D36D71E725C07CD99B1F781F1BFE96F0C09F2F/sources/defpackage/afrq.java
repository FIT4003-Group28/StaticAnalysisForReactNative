package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afrq  reason: default package */
/* loaded from: classes.dex */
public final class afrq implements yiw {
    final /* synthetic */ afrs a;

    public afrq(afrs afrsVar) {
        this.a = afrsVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        this.a.b.post(new Runnable() { // from class: afro
            @Override // java.lang.Runnable
            public final void run() {
                afrq afrqVar = afrq.this;
                afrs afrsVar = afrqVar.a;
                afrsVar.b.setImageDrawable(new ColorDrawable(zhn.j(afrsVar.a, R.attr.ytIcon1).orElse(0)));
                afrqVar.a.b.invalidate();
            }
        });
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        final Bitmap bitmap = (Bitmap) obj2;
        this.a.b.post(new Runnable() { // from class: afrp
            @Override // java.lang.Runnable
            public final void run() {
                afrq afrqVar = afrq.this;
                afrqVar.a.b.setImageBitmap(bitmap);
                afrqVar.a.b.invalidate();
            }
        });
    }
}
