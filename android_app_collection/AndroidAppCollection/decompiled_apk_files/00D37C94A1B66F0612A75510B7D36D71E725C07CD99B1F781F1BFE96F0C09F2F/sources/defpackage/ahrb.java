package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ahrb  reason: default package */
/* loaded from: classes.dex */
final class ahrb implements yiw {
    final /* synthetic */ ahrc a;

    public ahrb(ahrc ahrcVar) {
        this.a = ahrcVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("Error requesting bitmap for autonav video thumbnail:");
        sb.append(valueOf);
        zep.b(sb.toString());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        ahni ahniVar = this.a.b;
        if (bitmap == null) {
            zep.b("Cannot set null bitmap.");
        } else {
            boolean z = true;
            if (ahniVar.i.getWidth() == bitmap.getWidth() && ahniVar.i.getHeight() == bitmap.getHeight()) {
                z = false;
            }
            ahniVar.j = z;
            ahniVar.i = bitmap;
            ahniVar.g();
        }
        float width = bitmap.getWidth() / bitmap.getHeight();
        this.a.b.rT(1.0f, 1.0f, 1.0f);
        if (width != 1.7777778f) {
            this.a.b.rT(1.0f / width, 1.0f, 1.0f);
        }
        this.a.b.l = false;
    }
}
