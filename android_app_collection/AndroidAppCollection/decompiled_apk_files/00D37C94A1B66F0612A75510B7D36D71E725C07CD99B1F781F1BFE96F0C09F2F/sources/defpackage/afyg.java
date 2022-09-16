package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: afyg  reason: default package */
/* loaded from: classes.dex */
public final class afyg extends aftf {
    @Override // defpackage.aftf
    public final yqv a(Uri uri) {
        return super.c(uri.buildUpon().appendQueryParameter("pseudo_head", "1").build());
    }

    @Override // defpackage.aftf, defpackage.aftr
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        return c((Uri) obj);
    }
}
