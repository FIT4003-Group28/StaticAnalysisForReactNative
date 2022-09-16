package defpackage;
/* compiled from: PG */
/* renamed from: akgz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akgz implements aniq {
    public final /* synthetic */ akhc a;
    public final /* synthetic */ akhr b;
    private final /* synthetic */ int c;

    public /* synthetic */ akgz(akhc akhcVar, akhr akhrVar) {
        this.a = akhcVar;
        this.b = akhrVar;
    }

    public /* synthetic */ akgz(akhc akhcVar, akhr akhrVar, int i) {
        this.c = i;
        this.a = akhcVar;
        this.b = akhrVar;
    }

    @Override // defpackage.aniq
    public final ankt a() {
        if (this.c == 0) {
            akhc akhcVar = this.a;
            return anlz.q(akhcVar.b.a(this.b));
        }
        akhc akhcVar2 = this.a;
        return anlz.q(akhcVar2.c.a(this.b));
    }
}
