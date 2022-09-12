package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: czhs  reason: default package */
/* loaded from: classes.dex */
public final class czhs implements czhq {
    @Override // defpackage.czhh
    public final /* bridge */ /* synthetic */ String a() {
        return "corrupted-install";
    }

    @Override // defpackage.czhq
    public final boolean b(Throwable th) {
        return th instanceof UnsatisfiedLinkError;
    }

    @Override // defpackage.czhq
    public final ex c() {
        return new czhv();
    }

    @Override // defpackage.czhq
    public final File d(Context context) {
        return new File(context.getFilesDir(), "corrupted_install");
    }
}
