package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alqy  reason: default package */
/* loaded from: classes.dex */
public final class alqy implements akyz {
    final /* synthetic */ akzh a;
    final /* synthetic */ alrc b;

    public alqy(alrc alrcVar, akzh akzhVar) {
        this.b = alrcVar;
        this.a = akzhVar;
    }

    @Override // defpackage.akyz
    public final float a(akra akraVar) {
        akyz akyzVar = this.a.d;
        if (akyzVar != null) {
            return akyzVar.a(akraVar);
        }
        return ((alqj) this.b.k()).q.a(akraVar);
    }

    @Override // defpackage.akyz
    public final float b() {
        akyz akyzVar = this.a.d;
        if (akyzVar != null) {
            return akyzVar.b();
        }
        return ((alqj) this.b.k()).q.b();
    }
}
