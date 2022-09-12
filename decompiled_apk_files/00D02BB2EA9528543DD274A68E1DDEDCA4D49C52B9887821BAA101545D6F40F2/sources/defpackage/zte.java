package defpackage;

import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zte  reason: default package */
/* loaded from: classes7.dex */
public final class zte implements vtl {
    final /* synthetic */ ztf a;

    public zte(ztf ztfVar) {
        this.a = ztfVar;
    }

    @Override // defpackage.vtl
    public final void a(Drawable drawable) {
        bvrj.UI_THREAD.c();
        ztf ztfVar = this.a;
        if (this != ztfVar.c) {
            return;
        }
        ztfVar.c(drawable);
    }
}
