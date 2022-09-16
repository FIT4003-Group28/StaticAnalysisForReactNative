package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acia  reason: default package */
/* loaded from: classes.dex */
public final class acia implements yiw {
    final /* synthetic */ acid a;

    public acia(acid acidVar) {
        this.a = acidVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((Uri) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Error loading thumbnail from Uri: ");
        sb.append(valueOf);
        zep.l(sb.toString());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        final Bitmap bitmap = (Bitmap) obj2;
        this.a.b.post(new Runnable() { // from class: achz
            @Override // java.lang.Runnable
            public final void run() {
                acia aciaVar = acia.this;
                aciaVar.a.aq.setImageBitmap(bitmap);
            }
        });
        this.a.at = bitmap;
    }
}
