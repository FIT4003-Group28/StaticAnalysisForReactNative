package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: iwr  reason: default package */
/* loaded from: classes3.dex */
final class iwr implements iws {
    final /* synthetic */ iwt a;

    public iwr(iwt iwtVar) {
        this.a = iwtVar;
    }

    @Override // defpackage.iws
    public final void a() {
        this.a.d(false, Optional.empty());
    }

    @Override // defpackage.iws
    public final void b(Optional optional) {
        this.a.d(true, optional);
    }
}
