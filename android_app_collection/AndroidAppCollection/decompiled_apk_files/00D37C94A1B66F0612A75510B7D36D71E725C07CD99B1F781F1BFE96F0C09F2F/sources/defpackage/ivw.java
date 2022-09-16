package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.mdx.MdxSmartRemoteMealbarController;
/* compiled from: PG */
/* renamed from: ivw  reason: default package */
/* loaded from: classes3.dex */
final class ivw implements yiw {
    final /* synthetic */ MdxSmartRemoteMealbarController a;

    public ivw(MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController) {
        this.a = mdxSmartRemoteMealbarController;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        adig adigVar = (adig) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        adig adigVar = (adig) obj;
        Boolean bool = (Boolean) obj2;
        Intent c = aefn.c(this.a.a);
        c.putExtra("com.google.android.libraries.youtube.mdx.smartremote.startingUiMode", 3);
        c.putExtra("com.google.android.libraries.youtube.mdx.smartremote.dialogStyle", this.a.h.a);
        this.a.a.startActivity(c);
    }
}
