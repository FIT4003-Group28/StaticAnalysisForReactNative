package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: ciw  reason: default package */
/* loaded from: classes2.dex */
public final class ciw implements cin {
    public final cpz a;

    public ciw(InputStream inputStream, clb clbVar) {
        cpz cpzVar = new cpz(inputStream, clbVar);
        this.a = cpzVar;
        cpzVar.mark(5242880);
    }

    @Override // defpackage.cin
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.cin
    /* renamed from: c */
    public final InputStream a() {
        this.a.reset();
        return this.a;
    }
}
