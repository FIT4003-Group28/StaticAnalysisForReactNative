package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: hos  reason: default package */
/* loaded from: classes3.dex */
public final class hos {
    public final Context a;
    public final hlj b;

    public hos(Context context, hlj hljVar) {
        this.a = context;
        this.b = hljVar;
    }

    public final FileOutputStream a(Uri uri) {
        FileOutputStream createOutputStream;
        AssetFileDescriptor a = vfq.a(this.a, uri, "w", vfp.a);
        if (a != null) {
            try {
                createOutputStream = a.createOutputStream();
            } catch (IOException e) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Unable to create stream");
                fileNotFoundException.initCause(e);
                vfq.c(a);
                throw fileNotFoundException;
            }
        } else {
            createOutputStream = null;
        }
        if (!(createOutputStream instanceof FileOutputStream)) {
            String valueOf = String.valueOf(createOutputStream.getClass().getName());
            throw new IOException(valueOf.length() != 0 ? "OutputStream instance is not FileOutputStream cls:".concat(valueOf) : new String("OutputStream instance is not FileOutputStream cls:"));
        }
        return createOutputStream;
    }
}
