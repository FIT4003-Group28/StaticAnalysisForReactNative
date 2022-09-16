package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hhg  reason: default package */
/* loaded from: classes3.dex */
public class hhg implements ampg {
    @Override // defpackage.ampg
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        axca axcaVar;
        axbk axbkVar = (axbk) obj;
        aopa createBuilder = aqsp.a.createBuilder();
        if (axbkVar.c == 1 && axij.j(1) == 2) {
            ampg ampgVar = hhr.a;
            if (axbkVar.c == 1) {
                axcaVar = (axca) axbkVar.d;
            } else {
                axcaVar = axca.a;
            }
            Object apply = ampgVar.apply(axcaVar);
            createBuilder.copyOnWrite();
            aqsp aqspVar = (aqsp) createBuilder.instance;
            apply.getClass();
            aqspVar.c = apply;
            aqspVar.b = 1;
        }
        return (aqsp) createBuilder.mo39build();
    }
}
