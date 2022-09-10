package defpackage;

import java.io.File;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: awch  reason: default package */
/* loaded from: classes.dex */
public final class awch implements avyy {
    private final avpn a;

    public awch(avpn avpnVar) {
        this.a = avpnVar;
    }

    @Override // defpackage.avyy
    public final File a(avze avzeVar) {
        return this.a.a("routing", avzeVar);
    }

    @Override // defpackage.avyy
    public final File b(avze avzeVar) {
        return this.a.b("routing", avzeVar);
    }

    @Override // defpackage.avyy
    public final Collection<dlrl> c(Iterable<btlu> iterable) {
        return this.a.f("routing", iterable);
    }

    @Override // defpackage.avyy
    public final void d(dlrl dlrlVar) {
        this.a.g("routing", dlrlVar);
    }
}
