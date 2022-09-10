package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apiu  reason: default package */
/* loaded from: classes2.dex */
public final class apiu implements angt<aogb, aoge> {
    final /* synthetic */ apix a;

    public apiu(apix apixVar) {
        this.a = apixVar;
    }

    @Override // defpackage.angt
    public final void a(angu<aogb, aoge> anguVar) {
        angs<D> angsVar = ((aouv) anguVar).c;
        angr angrVar = angr.SUCCESS;
        int ordinal = ((angf) angsVar).a.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 4) {
            this.a.b.d(this);
            this.a.a.execute(new apit(this, angsVar));
        }
    }
}
