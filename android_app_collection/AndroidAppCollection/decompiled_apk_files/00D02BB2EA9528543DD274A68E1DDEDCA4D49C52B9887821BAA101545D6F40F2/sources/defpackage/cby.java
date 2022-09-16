package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cby  reason: default package */
/* loaded from: classes.dex */
public final class cby implements caq<Uri, InputStream> {
    private final Context a;

    public cby(Context context) {
        this.a = context;
    }

    @Override // defpackage.caq
    public final cap<Uri, InputStream> a(caz cazVar) {
        return new cbz(this.a);
    }

    @Override // defpackage.caq
    public final void b() {
    }
}
