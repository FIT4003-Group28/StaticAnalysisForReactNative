package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cbw  reason: default package */
/* loaded from: classes.dex */
public final class cbw implements caq<Uri, InputStream> {
    private final Context a;

    public cbw(Context context) {
        this.a = context;
    }

    @Override // defpackage.caq
    public final cap<Uri, InputStream> a(caz cazVar) {
        return new cbx(this.a);
    }

    @Override // defpackage.caq
    public final void b() {
    }
}
