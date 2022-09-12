package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csms  reason: default package */
/* loaded from: classes5.dex */
public final class csms extends cskz {
    final /* synthetic */ csmu a;

    public csms(csmu csmuVar) {
        this.a = csmuVar;
    }

    @Override // defpackage.cskz
    public final void b(double d) {
        csmu csmuVar = this.a;
        csmuVar.b = (float) d;
        csmuVar.invalidateSelf();
    }
}
