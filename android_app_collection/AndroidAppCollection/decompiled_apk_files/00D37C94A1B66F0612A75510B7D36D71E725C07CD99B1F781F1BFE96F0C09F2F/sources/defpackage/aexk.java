package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aexk  reason: default package */
/* loaded from: classes.dex */
public final class aexk implements aemh {
    private final aemh a;
    private final afbi b;
    private final aewx c;

    public aexk(aemh aemhVar, afbi afbiVar, aewx aewxVar) {
        this.a = aemhVar;
        this.b = afbiVar;
        this.c = aewxVar;
    }

    @Override // defpackage.aemh
    public final void a(aent aentVar, int i) {
        this.a.a(aentVar, i);
        if (i - 1 != 1) {
            this.b.p(Integer.valueOf(aentVar.d));
            this.c.aa();
            return;
        }
        this.b.q(Integer.valueOf(aentVar.d));
        this.c.aa();
    }
}
