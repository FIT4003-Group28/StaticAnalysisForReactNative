package defpackage;
/* compiled from: PG */
/* renamed from: atyl  reason: default package */
/* loaded from: classes2.dex */
final class atyl extends akvn<aktd> {
    final /* synthetic */ atym a;

    public atyl(atym atymVar) {
        this.a = atymVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        aktd aktdVar = (aktd) obj;
        synchronized (this.a.b) {
            aryn arynVar = this.a.c.get(aktdVar);
            if (arynVar != null) {
                this.a.a.b(arynVar);
            }
        }
    }
}
