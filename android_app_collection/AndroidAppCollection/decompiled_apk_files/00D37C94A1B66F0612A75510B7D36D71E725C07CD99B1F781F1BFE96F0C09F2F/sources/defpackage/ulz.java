package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
/* compiled from: PG */
/* renamed from: ulz  reason: default package */
/* loaded from: classes4.dex */
public final class ulz implements ankb {
    final /* synthetic */ uoq a;

    public ulz(uoq uoqVar) {
        this.a = uoqVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        Log.w("AvatarRetriever", "Failed to load avatar.", th);
        this.a.a(null);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.a((Bitmap) obj);
    }
}
