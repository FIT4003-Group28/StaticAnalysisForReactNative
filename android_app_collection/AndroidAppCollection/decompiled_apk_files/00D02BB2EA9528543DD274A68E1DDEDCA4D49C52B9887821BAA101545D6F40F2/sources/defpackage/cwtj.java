package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: cwtj  reason: default package */
/* loaded from: classes.dex */
final class cwtj implements degu<Void> {
    static final cwtj a = new cwtj();

    private cwtj() {
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        boolean z = th instanceof CancellationException;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r1) {
    }
}
