package defpackage;
/* compiled from: PG */
/* renamed from: mch  reason: default package */
/* loaded from: classes3.dex */
public final class mch implements aimx {
    public boolean a;

    public final void b(boolean z) {
        this.a = !z;
    }

    @Override // defpackage.aimx
    public final void rj(aina ainaVar) {
        if (this.a) {
            ainaVar.T = true;
            ainaVar.t(new aimz() { // from class: mcg
                @Override // defpackage.aimz
                public final void a(afrt afrtVar) {
                    afrtVar.d("overrideMutedAtStart", mch.this.a);
                }
            });
        }
    }
}
