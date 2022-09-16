package defpackage;

import java.io.File;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yig  reason: default package */
/* loaded from: classes4.dex */
public final class yig {
    public final Executor a;

    public yig(Executor executor) {
        this.a = executor;
    }

    public final void a(File file) {
        try {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
            file.delete();
        } catch (Exception e) {
            String valueOf = String.valueOf(file.getPath());
            zep.d(valueOf.length() != 0 ? "Error attempting to delete ".concat(valueOf) : new String("Error attempting to delete "), e);
        }
    }
}
