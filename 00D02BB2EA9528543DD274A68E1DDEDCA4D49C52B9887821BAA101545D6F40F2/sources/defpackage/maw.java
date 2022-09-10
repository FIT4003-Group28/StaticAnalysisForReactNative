package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: maw  reason: default package */
/* loaded from: classes7.dex */
public final class maw implements mcj, atcv {
    private final mch<crqf> a;

    public maw(cqat cqatVar, final Context context, final btvo btvoVar, final akfa akfaVar, final bvjj bvjjVar, final dxio<cref> dxioVar, final broq broqVar, final ckcw ckcwVar, atcw atcwVar, final akox akoxVar, final brcw brcwVar, @dzsi final dxio<jzk> dxioVar2, koc kocVar) {
        String str = btvoVar.getVectorMapsParameters().h;
        int a = dujv.a(btvoVar.getAdsParameters().b);
        this.a = new mch<>(cqatVar, atcwVar, new dbty(ckcwVar, broqVar, akoxVar, akfaVar, bvjjVar, dxioVar, context, brcwVar, btvoVar, dxioVar2) { // from class: mav
            private final ckcw a;
            private final broq b;
            private final akox c;
            private final akfa d;
            private final bvjj e;
            private final dxio f;
            private final Context g;
            private final brcw h;
            private final btvo i;
            private final dxio j;

            {
                this.a = ckcwVar;
                this.b = broqVar;
                this.c = akoxVar;
                this.d = akfaVar;
                this.e = bvjjVar;
                this.f = dxioVar;
                this.g = context;
                this.h = brcwVar;
                this.i = btvoVar;
                this.j = dxioVar2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                ckcw ckcwVar2 = this.a;
                broq broqVar2 = this.b;
                akox akoxVar2 = this.c;
                akfa akfaVar2 = this.d;
                bvjj bvjjVar2 = this.e;
                dxio dxioVar3 = this.f;
                Context context2 = this.g;
                brcw brcwVar2 = this.h;
                btvo btvoVar2 = this.i;
                return new ataj(ckcwVar2, broqVar2, akoxVar2, akfaVar2, bvjjVar2, dxioVar3, context2, 9, brcwVar2, btvoVar2, btvoVar2.getEnrouteParameters().k, this.j);
            }
        }, new aluu(str, alxb.a(a == 0 ? 1 : a, context.getResources()), btvoVar.getCategoricalSearchParameters().u()), kocVar);
    }

    @Override // defpackage.asmo
    public final void NZ(Bundle bundle) {
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        this.a.a(atlqVar.m);
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void b() {
    }

    @Override // defpackage.asmo
    public final void c() {
    }

    @Override // defpackage.mcj
    public final mcp g(@dzsi mco mcoVar) {
        return this.a.b(mcoVar);
    }

    @Override // defpackage.mcj
    public final void h(mcp mcpVar) {
        this.a.c(mcpVar);
    }

    @Override // defpackage.mcj
    public final void i(mcp mcpVar) {
        this.a.d(mcpVar);
    }

    @Override // defpackage.mcj
    public final void j(mcp mcpVar) {
        this.a.e(mcpVar);
    }

    @Override // defpackage.mcj
    public final int k() {
        return 9;
    }
}
