package defpackage;

import android.app.Application;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: bbpv  reason: default package */
/* loaded from: classes3.dex */
public final class bbpv implements bbtk {
    private final Application a;

    public bbpv(Application application) {
        this.a = application;
    }

    @Override // defpackage.bbtk
    public final bbtj a(Uri uri) {
        return new bdki(bbtm.x(uri), this.a);
    }

    @Override // defpackage.bbtk
    public final bbtj b(bbtm bbtmVar) {
        return new bdki(bbtmVar, this.a);
    }
}
