package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: vjx  reason: default package */
/* loaded from: classes4.dex */
public final class vjx extends vka implements vjm, vjl {
    private final FileInputStream a;
    private final File b;

    public vjx(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.vjl
    public final FileChannel a() {
        return this.a.getChannel();
    }

    @Override // defpackage.vjm
    public final File c() {
        return this.b;
    }
}
