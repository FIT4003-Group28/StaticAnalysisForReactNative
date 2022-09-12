package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: coar  reason: default package */
/* loaded from: classes5.dex */
public final class coar {
    public final Context a;
    public final List<File> b = new ArrayList();

    public coar(Context context) {
        this.a = context;
    }

    public static File b(Context context) {
        return context.getDir("dg_cache", 0);
    }

    public static void f(File file, File file2) {
        if (file.renameTo(file2)) {
            return;
        }
        String valueOf = String.valueOf(file);
        String valueOf2 = String.valueOf(file2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22 + String.valueOf(valueOf2).length());
        sb.append("Failed to rename ");
        sb.append(valueOf);
        sb.append(" -> ");
        sb.append(valueOf2);
        sb.append(".");
        throw new coam(sb.toString());
    }

    public static final void g(coat coatVar) {
        File file = coatVar.c;
        try {
            if (!file.exists() && !file.createNewFile()) {
                String valueOf = String.valueOf(coatVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to touch last-used file for ");
                sb.append(valueOf);
                sb.append(".");
                throw new coam(sb.toString());
            }
            if (file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            String valueOf2 = String.valueOf(coatVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
            sb2.append("Failed to update last-used timestamp for ");
            sb2.append(valueOf2);
            sb2.append(".");
            throw new coam(sb2.toString());
        } catch (IOException e) {
            String valueOf3 = String.valueOf(coatVar);
            String valueOf4 = String.valueOf(e);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 37 + String.valueOf(valueOf4).length());
            sb3.append("Failed to touch last-used file for ");
            sb3.append(valueOf3);
            sb3.append(": ");
            sb3.append(valueOf4);
            throw new coam(sb3.toString());
        }
    }

    public final coat a(coau coauVar) {
        coat c = c(coauVar.a);
        if (!c.b()) {
            return null;
        }
        g(c);
        return c;
    }

    public final coat c(String str) {
        File file = new File(b(this.a), str);
        return new coat(new File(file, "the.apk"), new File(file, "opt"), new File(file, "t"));
    }

    public final coat d() {
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        return c(valueOf.length() != 0 ? "tmp_".concat(valueOf) : new String("tmp_"));
    }

    public final void e() {
        for (File file : this.b) {
            if (!coaf.a(file)) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Failed to clean up temporary file ");
                sb.append(valueOf);
                sb.append(".");
                sb.toString();
            }
        }
        this.b.clear();
    }
}
