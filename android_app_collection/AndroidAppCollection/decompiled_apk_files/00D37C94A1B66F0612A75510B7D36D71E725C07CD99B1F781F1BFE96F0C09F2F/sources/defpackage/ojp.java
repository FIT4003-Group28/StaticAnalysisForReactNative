package defpackage;

import com.google.android.libraries.youtube.player.model.WatchDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ojp  reason: default package */
/* loaded from: classes3.dex */
public final class ojp implements njc {
    final /* synthetic */ ojq a;

    public ojp(ojq ojqVar) {
        this.a = ojqVar;
    }

    @Override // defpackage.njc
    public final void aJ(ezu ezuVar) {
        WatchDescriptor watchDescriptor = ezuVar.a;
        this.a.b.n = watchDescriptor.g();
        this.a.b.n = watchDescriptor.g();
    }

    @Override // defpackage.njc
    public final void aL() {
        if (!this.a.t.f()) {
            this.a.j.f(new exd());
        }
        this.a.F.b();
    }
}
