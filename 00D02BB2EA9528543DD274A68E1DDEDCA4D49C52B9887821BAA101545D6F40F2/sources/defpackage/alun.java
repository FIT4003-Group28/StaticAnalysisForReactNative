package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: alun  reason: default package */
/* loaded from: classes.dex */
public final class alun extends afho {
    public static final dbsl<afga> k = alum.a;
    public final eeu a;
    public final akox i;
    public final dxio<araj> j;
    private final gga l;
    private final dxio<ahjq> m;
    private final bvrb n;

    public alun(Intent intent, @dzsi String str, gga ggaVar, afih afihVar, afhe afheVar, eeu eeuVar, akox akoxVar, dxio<ahjq> dxioVar, bvrb bvrbVar, dxio<araj> dxioVar2, dxio<afwr> dxioVar3) {
        super(intent, str, afid.MAP_ONLY_ACTION, ggaVar, eeuVar, afihVar, afheVar, dxioVar3);
        this.l = ggaVar;
        this.a = eeuVar;
        this.i = akoxVar;
        this.m = dxioVar;
        this.n = bvrbVar;
        this.j = dxioVar2;
    }

    @Override // defpackage.afho
    public final void e(afia afiaVar, String str) {
        final akyc i = akyt.i(afhj.c(afiaVar, this.i, this.m.a()), (float) afhj.d(afiaVar, this.i, this.l.getResources(), this.m.a()));
        this.n.b(new Runnable(this, i) { // from class: alul
            private final alun a;
            private final akyc b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                alun alunVar = this.a;
                akyc akycVar = this.b;
                if (alunVar.a.b()) {
                    alunVar.j.a().m().h(amwd.OFF);
                }
                alunVar.i.p(akycVar);
            }
        }, bvrj.UI_THREAD);
    }
}
