package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: czjb  reason: default package */
/* loaded from: classes5.dex */
public final class czjb extends czjd implements cziq, czip, cziy {
    private final FileOutputStream a;
    private final File b;

    public czjb(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.czip
    public final FileChannel a() {
        return this.a.getChannel();
    }

    @Override // defpackage.cziy
    public final void b() {
        this.a.getFD().sync();
    }

    @Override // defpackage.cziq
    public final File c() {
        return this.b;
    }
}
