package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
/* compiled from: PG */
/* renamed from: com  reason: default package */
/* loaded from: classes2.dex */
public final class com implements cnr {
    private final Context a;
    private final Class b;

    public com(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.cnr
    public final cnq c(cny cnyVar) {
        return new coo(this.a, cnyVar.a(File.class, this.b), cnyVar.a(Uri.class, this.b), this.b);
    }

    @Override // defpackage.cnr
    public final void d() {
    }
}
