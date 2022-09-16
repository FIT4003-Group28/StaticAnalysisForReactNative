package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
/* compiled from: PG */
/* renamed from: crxv  reason: default package */
/* loaded from: classes5.dex */
public final class crxv {
    public final crxu a;
    public final Context b;

    public crxv(Context context) {
        this.b = context;
        this.a = new crxu(context);
    }

    public static final void a(Uri uri) {
        new File(uri.getPath()).delete();
    }
}
