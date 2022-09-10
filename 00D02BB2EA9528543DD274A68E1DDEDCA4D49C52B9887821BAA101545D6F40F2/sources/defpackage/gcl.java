package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gcl  reason: default package */
/* loaded from: classes.dex */
public final class gcl extends gh {
    final /* synthetic */ gcm a;

    public gcl(gcm gcmVar) {
        this.a = gcmVar;
    }

    @Override // defpackage.gh
    public final void c(fd fdVar, @dzsi Bundle bundle) {
        if (!this.a.c() || this.a.d()) {
            return;
        }
        this.a.a();
    }

    @Override // defpackage.gh
    public final void d(fd fdVar) {
        if (!this.a.c() || this.a.d()) {
            return;
        }
        fdVar.getClass();
        this.a.a();
    }

    @Override // defpackage.gh
    public final void h() {
        fd K = this.a.a.K();
        if (K != null) {
            K.getClass();
        }
    }
}
