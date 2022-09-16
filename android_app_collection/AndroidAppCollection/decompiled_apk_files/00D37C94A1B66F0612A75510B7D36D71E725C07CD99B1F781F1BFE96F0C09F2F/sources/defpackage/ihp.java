package defpackage;
/* compiled from: PG */
/* renamed from: ihp  reason: default package */
/* loaded from: classes3.dex */
public final class ihp extends aars {
    public final afvn a;
    public gtc b;
    public final aarl c;
    private final aaqj g;
    private final aacz h;

    public ihp(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar, aacz aaczVar) {
        super(aaqfVar, yqwVar);
        this.a = afvnVar;
        aaqjVar.getClass();
        this.g = aaqjVar;
        this.h = aaczVar;
        this.c = c(arty.a, aaqjVar, fdj.m, iho.a);
    }

    public final ihq a() {
        ihq ihqVar = new ihq(this.e, this.a.c());
        if (this.h.b() != null) {
            atfw atfwVar = this.h.b().k;
            if (atfwVar == null) {
                atfwVar = atfw.a;
            }
            apgt apgtVar = atfwVar.v;
            if (apgtVar == null) {
                apgtVar = apgt.a;
            }
            ihqVar.i = apgtVar.c;
        }
        return ihqVar;
    }

    public final void b(ihn ihnVar, afzf afzfVar) {
        this.f.a(this.g.a(ihnVar, artv.a, afzfVar, fdj.l, iho.b));
    }
}
