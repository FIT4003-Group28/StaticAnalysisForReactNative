package defpackage;
/* compiled from: PG */
/* renamed from: dij  reason: default package */
/* loaded from: classes3.dex */
final class dij implements dmn {
    final /* synthetic */ dhv a;

    public dij(dhv dhvVar) {
        this.a = dhvVar;
    }

    @Override // defpackage.dmn
    public final void a(int i, int i2, int i3, int i4, int i5) {
        dhj dhjVar;
        dhv dhvVar = this.a;
        synchronized (dhvVar) {
            dhjVar = dhvVar.c;
        }
        if (dhjVar != null) {
            dhvVar.j(dhjVar, i, i2, i3, i4, i5);
        }
    }
}
