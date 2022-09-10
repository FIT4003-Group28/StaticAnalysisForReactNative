package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bcpy  reason: default package */
/* loaded from: classes3.dex */
public final class bcpy implements jco {
    final /* synthetic */ bcpz a;

    public bcpy(bcpz bcpzVar) {
        this.a = bcpzVar;
    }

    @Override // defpackage.jco
    public final void a(int i, boolean z) {
        bcpz bcpzVar = this.a;
        if (bcpzVar.aD && i >= bcpzVar.an.d() - 2) {
            bcpz bcpzVar2 = this.a;
            bcpzVar2.an.h(bcpzVar2.g);
        }
    }

    @Override // defpackage.jco
    public final void b(int i) {
    }
}
