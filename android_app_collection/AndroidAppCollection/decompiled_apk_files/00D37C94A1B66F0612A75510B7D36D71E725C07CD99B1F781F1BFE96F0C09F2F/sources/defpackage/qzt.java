package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: qzt  reason: default package */
/* loaded from: classes4.dex */
public final class qzt {
    public final File a;
    public final File b;

    public qzt(File file) {
        this.a = file;
        this.b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public qzt(File file, String str) {
        this.a = file;
        this.b = new File(file, str);
    }
}
