package defpackage;

import java.io.File;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: awdh  reason: default package */
/* loaded from: classes.dex */
public final class awdh implements avyy {
    private final avpn a;

    public awdh(avpn avpnVar) {
        this.a = avpnVar;
    }

    @Override // defpackage.avyy
    public final File a(avze avzeVar) {
        return this.a.a("search", avzeVar);
    }

    @Override // defpackage.avyy
    public final File b(avze avzeVar) {
        return this.a.b("search", avzeVar);
    }

    @Override // defpackage.avyy
    public final Collection<dlrl> c(Iterable<btlu> iterable) {
        return this.a.f("search", iterable);
    }

    @Override // defpackage.avyy
    public final void d(dlrl dlrlVar) {
        this.a.g("search", dlrlVar);
    }
}
