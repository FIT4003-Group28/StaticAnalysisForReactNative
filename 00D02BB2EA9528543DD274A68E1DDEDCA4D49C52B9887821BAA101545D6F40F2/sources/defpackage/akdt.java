package defpackage;
/* compiled from: PG */
/* renamed from: akdt  reason: default package */
/* loaded from: classes2.dex */
final class akdt implements akey {
    final /* synthetic */ akdv a;
    private final akey b;

    public akdt(akdv akdvVar, akey akeyVar) {
        this.a = akdvVar;
        this.b = akeyVar;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        if (z) {
            this.a.p(true);
        }
        this.b.a(z);
    }

    @Override // defpackage.akey
    public final void b() {
        this.b.b();
    }
}
