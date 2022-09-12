package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: cmmp  reason: default package */
/* loaded from: classes5.dex */
public final class cmmp {
    public final File a;
    public final File b;

    public cmmp(File file) {
        this.a = file;
        this.b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public final boolean a() {
        return this.a.exists() || this.b.exists();
    }
}
