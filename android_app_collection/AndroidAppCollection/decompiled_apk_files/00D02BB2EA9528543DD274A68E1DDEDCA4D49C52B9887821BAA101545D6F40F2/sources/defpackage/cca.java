package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
/* compiled from: PG */
/* renamed from: cca  reason: default package */
/* loaded from: classes4.dex */
class cca<DataT> implements caq<Uri, DataT> {
    private final Context a;
    private final Class<DataT> b;

    public cca(Context context, Class<DataT> cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.caq
    public final cap<Uri, DataT> a(caz cazVar) {
        return new cce(this.a, cazVar.g(File.class, this.b), cazVar.g(Uri.class, this.b), this.b);
    }

    @Override // defpackage.caq
    public final void b() {
    }
}
