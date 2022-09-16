package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: xfw  reason: default package */
/* loaded from: classes4.dex */
final class xfw implements yiw {
    final /* synthetic */ xfx a;

    public xfw(xfx xfxVar) {
        this.a = xfxVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((Uri) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Couldn't retrieve thumbnail from [uri=");
        sb.append(valueOf);
        sb.append("]");
        zep.d(sb.toString(), exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        kkz kkzVar = (kkz) this.a.a;
        kkzVar.f.setImageBitmap(bitmap);
        kkzVar.f.setVisibility(bitmap != null ? 0 : 4);
        if (!TextUtils.isEmpty(kkzVar.r)) {
            kkzVar.f.setContentDescription(kkzVar.r);
        }
    }
}
