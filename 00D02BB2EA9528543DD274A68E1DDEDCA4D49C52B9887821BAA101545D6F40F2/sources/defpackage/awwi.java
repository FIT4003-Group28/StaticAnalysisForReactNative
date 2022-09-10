package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: awwi  reason: default package */
/* loaded from: classes.dex */
public final class awwi implements awwb {
    private final awwb a;
    private final dcep<awvv<?>> b;

    public awwi(awwb awwbVar, Set<awvv<?>> set) {
        this.a = awwbVar;
        this.b = dcep.K(set);
    }

    @Override // defpackage.awwb
    public final <P extends dssj> dbsg<P> a(awvv<P> awvvVar) {
        return this.b.contains(awvvVar) ? this.a.a(awvvVar) : dbpy.a;
    }

    @Override // defpackage.awwb
    public final long b(awvv<?> awvvVar) {
        if (this.b.contains(awvvVar)) {
            return this.a.b(awvvVar);
        }
        return -1L;
    }

    @Override // defpackage.awwb
    public final awwa c(awvv<?> awvvVar) {
        return this.b.contains(awvvVar) ? this.a.c(awvvVar) : awwa.NOT_REQUESTED;
    }

    @Override // defpackage.awwb
    @dzsi
    public final String d() {
        return this.a.d();
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof awwb) {
            return awvz.a(this, (awwb) obj);
        }
        return false;
    }

    public final int hashCode() {
        return awvz.b(this);
    }
}
