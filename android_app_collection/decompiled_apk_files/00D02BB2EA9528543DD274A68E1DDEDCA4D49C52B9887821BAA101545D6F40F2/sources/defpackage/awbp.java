package defpackage;

import java.io.File;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: awbp  reason: default package */
/* loaded from: classes.dex */
public final class awbp implements avyy {
    private final avpn a;

    public awbp(avpn avpnVar) {
        this.a = avpnVar;
    }

    @Override // defpackage.avyy
    public final File a(avze avzeVar) {
        return this.a.a("paint", avzeVar);
    }

    @Override // defpackage.avyy
    public final File b(avze avzeVar) {
        return this.a.b("paint", avzeVar);
    }

    @Override // defpackage.avyy
    public final Collection<dlrl> c(Iterable<btlu> iterable) {
        return this.a.f("paint", iterable);
    }

    @Override // defpackage.avyy
    public final void d(dlrl dlrlVar) {
        this.a.g("paint", dlrlVar);
    }
}
