package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: vjy  reason: default package */
/* loaded from: classes4.dex */
public final class vjy extends vkb implements vjm, vjl, vjv {
    private final FileOutputStream a;
    private final File b;

    public vjy(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.vjl
    public final FileChannel a() {
        return this.a.getChannel();
    }

    @Override // defpackage.vjv
    public final void b() {
        this.a.getFD().sync();
    }

    @Override // defpackage.vjm
    public final File c() {
        return this.b;
    }
}
