package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: clz  reason: default package */
/* loaded from: classes2.dex */
public final class clz implements cls {
    private final long a;
    private final cmb b;

    public clz(Context context, long j) {
        cmb cmbVar = new cmb(context);
        this.a = j;
        this.b = cmbVar;
    }

    @Override // defpackage.cls
    public final clt a() {
        cmb cmbVar = this.b;
        File cacheDir = cmbVar.a.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, cmbVar.b);
        if (file == null) {
            return null;
        }
        if (!file.isDirectory() && !file.mkdirs()) {
            return null;
        }
        return new cma(file, this.a);
    }
}
