package defpackage;
/* compiled from: PG */
/* renamed from: akdk  reason: default package */
/* loaded from: classes2.dex */
final class akdk implements degu<Boolean> {
    final /* synthetic */ akez a;
    final /* synthetic */ akdv b;

    public akdk(akdv akdvVar, akez akezVar) {
        this.b = akdvVar;
        this.a = akezVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.b.r(this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.b.b.r(this.a);
        }
    }
}
