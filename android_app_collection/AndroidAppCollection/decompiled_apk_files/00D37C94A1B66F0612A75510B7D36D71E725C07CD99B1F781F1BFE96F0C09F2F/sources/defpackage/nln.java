package defpackage;
/* compiled from: PG */
/* renamed from: nln  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nln {
    public final /* synthetic */ nlr a;

    public /* synthetic */ nln(nlr nlrVar) {
        this.a = nlrVar;
    }

    public final void a(long j) {
        nlr nlrVar = this.a;
        if (j <= 0) {
            fkz fkzVar = nlrVar.g;
            fkzVar.a.setVisibility(0);
            fkzVar.b.setVisibility(0);
            fkzVar.d.afterTextChanged(fkzVar.c.mo589getText());
            nlrVar.d();
            return;
        }
        fkz fkzVar2 = nlrVar.g;
        fkzVar2.a.setVisibility(8);
        fkzVar2.b.setVisibility(8);
        nlrVar.j = j;
        nlrVar.i.setEnabled(true);
    }
}
