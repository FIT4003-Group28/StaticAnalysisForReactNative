package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: hlj  reason: default package */
/* loaded from: classes3.dex */
public final class hlj {
    public final Context a;

    public hlj(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean b(vun vunVar, FileOutputStream fileOutputStream) {
        try {
            vunVar.c().a().k(fileOutputStream.getChannel());
            return true;
        } catch (IOException e) {
            afus.c(2, 24, "Failed to remux the media file", e);
            return false;
        }
    }

    public final boolean a(File file, long j, long j2, FileOutputStream fileOutputStream) {
        fileOutputStream.getClass();
        return b(vun.f(this.a, Uri.fromFile(file), j, j2), fileOutputStream);
    }
}
