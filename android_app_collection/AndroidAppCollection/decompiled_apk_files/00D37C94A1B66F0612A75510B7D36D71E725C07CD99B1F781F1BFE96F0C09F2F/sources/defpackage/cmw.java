package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cmw  reason: default package */
/* loaded from: classes2.dex */
final class cmw implements cil {
    private final File a;

    public cmw(File file) {
        this.a = file;
    }

    @Override // defpackage.cil
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.cil
    public final void b() {
    }

    @Override // defpackage.cil
    public final void c() {
    }

    @Override // defpackage.cil
    public final void d(cfv cfvVar, cik cikVar) {
        try {
            cikVar.f(cus.b(this.a));
        } catch (IOException e) {
            cikVar.g(e);
        }
    }

    @Override // defpackage.cil
    public final int e() {
        return 1;
    }
}
