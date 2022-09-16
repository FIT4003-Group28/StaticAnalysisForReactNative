package defpackage;
/* compiled from: PG */
/* renamed from: khw  reason: default package */
/* loaded from: classes3.dex */
final class khw implements ffm {
    final /* synthetic */ khy a;

    public khw(khy khyVar) {
        this.a = khyVar;
    }

    @Override // defpackage.ffm
    public final void a(long j) {
        for (ffm ffmVar : this.a.b) {
            ffmVar.a(j);
        }
    }

    @Override // defpackage.ffm
    public final void b(long j, boolean z) {
        for (ffm ffmVar : this.a.b) {
            ffmVar.b(j, z);
        }
    }
}
