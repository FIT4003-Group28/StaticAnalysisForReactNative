package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ljs  reason: default package */
/* loaded from: classes7.dex */
public final class ljs implements crzp<Boolean> {
    final /* synthetic */ lju a;

    public ljs(lju ljuVar) {
        this.a = ljuVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Boolean> crzmVar) {
        Boolean l = crzmVar.l();
        dbsk.s(l);
        boolean booleanValue = l.booleanValue();
        this.a.n.d.p().af(booleanValue);
        this.a.n.b.T(booleanValue);
    }
}
