package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: qzx  reason: default package */
/* loaded from: classes4.dex */
public final class qzx {
    public final File a;
    public final File b;
    private final qzt c;

    public qzx(qzt qztVar, File file, File file2) {
        this.c = qztVar;
        this.a = file;
        this.b = file2;
    }

    public final File a() {
        return this.c.b;
    }

    public final File b() {
        return this.c.a;
    }

    public final boolean c() {
        return a().isFile() && this.a.isDirectory();
    }
}
