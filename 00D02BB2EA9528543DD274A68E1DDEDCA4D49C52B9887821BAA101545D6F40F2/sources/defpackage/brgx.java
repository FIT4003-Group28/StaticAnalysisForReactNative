package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: brgx  reason: default package */
/* loaded from: classes.dex */
public final class brgx extends brhd {
    public static final dbsl<afga> i = brgw.a;
    public final afhe a;
    private final gga k;

    public brgx(Intent intent, @dzsi String str, gga ggaVar, afih afihVar, afhe afheVar, eeu eeuVar, cjqy cjqyVar, asik asikVar, dxio<ckcw> dxioVar, dxio<begg> dxioVar2, asim asimVar, dxio<brba> dxioVar3, dxio<ascb> dxioVar4, dxio<ahjq> dxioVar5, akpm akpmVar, dxio<afwr> dxioVar6, afhj afhjVar, cklq cklqVar) {
        super(intent, str, ggaVar, afihVar, afheVar, eeuVar, cjqyVar, asikVar, dxioVar, dxioVar2, asimVar, dxioVar3, dxioVar4, dxioVar5, akpmVar, dxioVar6, afhjVar, cklqVar);
        this.a = afheVar;
        this.k = ggaVar;
    }

    @Override // defpackage.afho, defpackage.afhx
    public final void a() {
        final String stringExtra = this.f.getStringExtra("query");
        if (dbsj.d(stringExtra)) {
            return;
        }
        afhz afhzVar = new afhz();
        afhzVar.a = afib.SEARCH;
        afhzVar.b = stringExtra;
        afhzVar.N = this.f.getBooleanExtra("GMM_ENABLE_ONE_BACK_TAP", false);
        final afia a = afhzVar.a();
        if (a != null) {
            a.f();
        }
        this.k.B(new Runnable(this, stringExtra, a) { // from class: brgv
            private final brgx a;
            private final String b;
            private final afia c;

            {
                this.a = this;
                this.b = stringExtra;
                this.c = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                brgx brgxVar = this.a;
                String str = this.b;
                afia afiaVar = this.c;
                String valueOf = String.valueOf(str);
                String str2 = brgxVar.a.a(valueOf.length() != 0 ? "com.google.android.gms.actions.SEARCH_ACTION?query=".concat(valueOf) : new String("com.google.android.gms.actions.SEARCH_ACTION?query="), brgxVar.g, afiaVar).a;
                afiaVar.f();
                brgxVar.e(afiaVar, str2);
            }
        });
    }

    @Override // defpackage.afhx
    public final afid j() {
        return afid.APP_SEARCH_ACTION;
    }
}
