package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: coat  reason: default package */
/* loaded from: classes5.dex */
public final class coat {
    public final File a;
    public final File b;
    public final File c;

    public coat(File file, File file2, File file3) {
        this.a = file;
        this.b = file2;
        this.c = file3;
    }

    public final File a() {
        return this.a.getParentFile();
    }

    public final boolean b() {
        File file;
        return this.a.isFile() && (file = this.b) != null && file.isDirectory();
    }
}
