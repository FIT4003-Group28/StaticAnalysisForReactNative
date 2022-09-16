package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vuh  reason: default package */
/* loaded from: classes7.dex */
public final class vuh extends akvn<aktd> {
    final /* synthetic */ vui a;
    final /* synthetic */ vuj b;

    public vuh(vuj vujVar, vui vuiVar) {
        this.b = vujVar;
        this.a = vuiVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        vuj vujVar;
        btrm btrmVar;
        vui vuiVar = this.a;
        alav a = alav.a(vuiVar.a, vuiVar.c, ((aktd) obj).g());
        if (a == null || (btrmVar = (vujVar = this.b).o) == null) {
            return;
        }
        if (this.a.e) {
            this.b.o.b(new alho(a));
        } else {
            btrmVar.b(new alco(vujVar.n));
        }
    }
}
