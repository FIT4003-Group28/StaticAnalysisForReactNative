package defpackage;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: tzi  reason: default package */
/* loaded from: classes4.dex */
public final class tzi {
    public static Uri a(Context context, Uri uri) {
        try {
            String readlink = Os.readlink(uwv.c(uri, context).getAbsolutePath());
            if (readlink == null) {
                throw new IOException("Unable to read symlink");
            }
            vjf a = vjg.a(context);
            a.b(readlink);
            return a.a();
        } catch (ErrnoException | vjt e) {
            throw new IOException("Unable to read symlink", e);
        }
    }

    public static void b(Context context, Uri uri, Uri uri2) {
        try {
            Os.symlink(uwv.c(uri2, context).getAbsolutePath(), uwv.c(uri, context).getAbsolutePath());
        } catch (ErrnoException | vjt e) {
            throw new IOException("Unable to create symlink", e);
        }
    }
}
