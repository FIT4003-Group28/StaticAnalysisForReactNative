package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ckrl  reason: default package */
/* loaded from: classes.dex */
public final class ckrl extends afhx {
    public static final dbsl<afga> l = ckrk.a;
    @dzsi
    public final dmcf a;
    public final afia b;
    public final dxio<ckrb> c;
    public final afhe d;
    public final dxio<asik> e;
    public final dxio<brlz> i;
    public final dxio<akfa> j;
    public final dxio<ckcw> k;
    private final gga m;
    private final bvrb n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckrl(Intent intent, @dzsi String str, gga ggaVar, bvrb bvrbVar, dxio<ckrb> dxioVar, afhe afheVar, dxio<asik> dxioVar2, dxio<brlz> dxioVar3, dxio<akfa> dxioVar4, dxio<ckcw> dxioVar5) {
        super(intent, str, afid.VOICE_ACTION);
        afiw afiwVar = new afiw();
        this.m = ggaVar;
        this.n = bvrbVar;
        this.c = dxioVar;
        this.d = afheVar;
        this.e = dxioVar2;
        this.i = dxioVar3;
        this.j = dxioVar4;
        this.k = dxioVar5;
        afia b = afiwVar.b(intent, str);
        this.b = b;
        this.a = b != afia.R ? b.B : null;
    }

    @Override // defpackage.afhx
    public final void a() {
        fd K = this.m.K();
        if (K instanceof atct) {
            atct atctVar = (atct) K;
            if (this.a == dmcf.MY_LOCATION || this.a == dmcf.GO_BACK) {
                atctVar.aX().c = jjn.COLLAPSED;
            }
        }
        afia afiaVar = this.b;
        if (afiaVar == null || afiaVar.a != afib.VOICE) {
            return;
        }
        this.n.b(new Runnable(this) { // from class: ckrj
            private final ckrl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ckrl ckrlVar = this.a;
                ckrlVar.d.a(ckrlVar.f.getData().toString(), ckrlVar.g, ckrlVar.b);
                if (ckrlVar.e.a().a()) {
                    ((ckco) ckrlVar.k.a().a(ckee.x)).a(asij.a(6));
                    if (ckrlVar.a != null) {
                        ((ckco) ckrlVar.k.a().a(ckee.y)).a(ckrlVar.a.ab);
                    }
                } else if (ckrlVar.a != null) {
                    ((ckco) ckrlVar.k.a().a(ckhi.V)).a(ckrlVar.a.ab);
                }
                afia afiaVar2 = ckrlVar.b;
                if (ashb.a(ckrlVar.i.a().g, ckrlVar.e.a(), ckrlVar.j.a())) {
                    afhe afheVar = ckrlVar.d;
                    if (afiaVar2 != null && afiaVar2.B != null) {
                        cjqy cjqyVar = afheVar.a;
                        cjsx i = cjsy.i();
                        i.b(afhe.b.getOrDefault(afiaVar2.B, ddda.dD));
                        cjqyVar.k(i.a());
                    }
                }
                ckrlVar.c.a().p(ckrlVar.b);
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return ckri.g(this.a);
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return null;
    }
}
