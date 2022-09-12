package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: bzn  reason: default package */
/* loaded from: classes.dex */
final class bzn implements buj<ByteBuffer> {
    private final File a;

    public bzn(File file) {
        this.a = file;
    }

    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super ByteBuffer> buiVar) {
        try {
            buiVar.f(cjb.a(this.a));
        } catch (IOException e) {
            buiVar.g(e);
        }
    }

    @Override // defpackage.buj
    public final void b() {
    }

    @Override // defpackage.buj
    public final void c() {
    }

    @Override // defpackage.buj
    public final Class<ByteBuffer> d() {
        return ByteBuffer.class;
    }

    @Override // defpackage.buj
    public final int e() {
        return 1;
    }
}
