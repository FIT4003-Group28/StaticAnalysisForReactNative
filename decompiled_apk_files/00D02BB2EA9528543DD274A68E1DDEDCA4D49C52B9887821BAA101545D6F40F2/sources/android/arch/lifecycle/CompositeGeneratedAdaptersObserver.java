package android.arch.lifecycle;
/* compiled from: PG */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements l {
    private final g[] a;

    public CompositeGeneratedAdaptersObserver(g[] gVarArr) {
        this.a = gVarArr;
    }

    @Override // defpackage.l
    public final void MV(m mVar, i iVar) {
        new y();
        for (g gVar : this.a) {
            gVar.a();
        }
        for (g gVar2 : this.a) {
            gVar2.a();
        }
    }
}
