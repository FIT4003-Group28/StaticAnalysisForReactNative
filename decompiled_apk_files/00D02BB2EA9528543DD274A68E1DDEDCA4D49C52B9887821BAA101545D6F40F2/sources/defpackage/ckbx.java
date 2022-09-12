package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: ckbx  reason: default package */
/* loaded from: classes4.dex */
final class ckbx {
    final Context a;

    public ckbx(Context context) {
        this.a = context;
    }

    public final File a() {
        File file = new File(this.a.getFilesDir().getParentFile(), "no_backup");
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str) {
        new File(a(), str).delete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(String str) {
        return new File(a(), str).exists();
    }
}
