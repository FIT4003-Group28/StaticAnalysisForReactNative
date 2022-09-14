package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: kfb  reason: default package */
/* loaded from: classes7.dex */
final class kfb implements cmvr {
    final /* synthetic */ kfc a;

    public kfb(kfc kfcVar) {
        this.a = kfcVar;
    }

    @Override // defpackage.cmvr
    public final void a() {
    }

    @Override // defpackage.cnac
    public final void b(int i) {
        cmvq.b(this);
    }

    @Override // defpackage.cnac
    public final void c() {
        cmvq.a(this);
    }

    @Override // defpackage.cmvr
    public final void d() {
        kfc kfcVar = this.a;
        Intent intent = kfcVar.b;
        if (intent != null) {
            kfcVar.b = null;
            kfcVar.a(intent);
        }
    }
}
