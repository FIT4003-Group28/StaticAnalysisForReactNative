package defpackage;
/* compiled from: PG */
/* renamed from: csna  reason: default package */
/* loaded from: classes5.dex */
final class csna extends cskz {
    final /* synthetic */ csnb a;

    public csna(csnb csnbVar) {
        this.a = csnbVar;
    }

    @Override // defpackage.cskz
    public final void b(double d) {
        csnb csnbVar = this.a;
        csnbVar.g = (float) d;
        csnbVar.invalidateSelf();
    }
}
