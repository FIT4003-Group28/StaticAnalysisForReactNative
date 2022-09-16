package defpackage;
/* compiled from: PG */
/* renamed from: mbo  reason: default package */
/* loaded from: classes3.dex */
public final class mbo implements ezg {
    public final ezh a;
    private final axnm b;

    public mbo(ezh ezhVar, axnm axnmVar) {
        this.b = axnmVar;
        this.a = ezhVar;
    }

    public final void a() {
        if (this.a.g().b()) {
            ((frv) this.b.get()).h();
        } else {
            ((frv) this.b.get()).l();
        }
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        a();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
