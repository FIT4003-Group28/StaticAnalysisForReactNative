package defpackage;
/* compiled from: PG */
/* renamed from: akdl  reason: default package */
/* loaded from: classes2.dex */
final class akdl implements degu<Boolean> {
    final /* synthetic */ String a;
    final /* synthetic */ akdv b;

    public akdl(akdv akdvVar, String str) {
        this.b = akdvVar;
        this.a = str;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.e(this.a, null);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.b.e(this.a, null);
        } else if (!this.b.h.a()) {
        } else {
            this.b.h.b().a().k();
        }
    }
}
