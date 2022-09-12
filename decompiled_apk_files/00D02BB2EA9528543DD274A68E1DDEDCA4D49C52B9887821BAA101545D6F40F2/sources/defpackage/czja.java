package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: czja  reason: default package */
/* loaded from: classes5.dex */
public final class czja extends czjc implements cziq, czip {
    private final FileInputStream a;
    private final File b;

    public czja(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.czip
    public final FileChannel a() {
        return this.a.getChannel();
    }

    @Override // defpackage.cziq
    public final File c() {
        return this.b;
    }
}
