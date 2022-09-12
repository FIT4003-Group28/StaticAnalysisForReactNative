package defpackage;
/* compiled from: PG */
/* renamed from: akdp  reason: default package */
/* loaded from: classes2.dex */
final class akdp implements akey {
    final /* synthetic */ akey a;

    public akdp(akey akeyVar) {
        this.a = akeyVar;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        bvrj.UI_THREAD.c();
        akey akeyVar = this.a;
        if (akeyVar != null) {
            akeyVar.a(z);
        }
    }

    @Override // defpackage.akey
    public final void b() {
        bvrj.UI_THREAD.c();
        akey akeyVar = this.a;
        if (akeyVar != null) {
            akeyVar.b();
        }
    }
}
