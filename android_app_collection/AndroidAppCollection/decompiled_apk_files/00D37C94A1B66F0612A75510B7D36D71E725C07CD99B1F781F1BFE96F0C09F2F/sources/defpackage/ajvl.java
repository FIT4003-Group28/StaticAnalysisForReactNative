package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajvl  reason: default package */
/* loaded from: classes.dex */
public final class ajvl implements yiw {
    final /* synthetic */ ajvg a;
    final /* synthetic */ ajvm b;
    final /* synthetic */ ajvo c;

    public ajvl(ajvm ajvmVar, ajvo ajvoVar, ajvg ajvgVar) {
        this.b = ajvmVar;
        this.c = ajvoVar;
        this.a = ajvgVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        this.b.a.put((Uri) obj, new WeakReference(bitmap));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.c.d(this.a, bitmap);
        } else {
            this.b.b.execute(new ajvk(this, bitmap));
        }
    }
}
