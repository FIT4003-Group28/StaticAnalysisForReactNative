package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: asxk  reason: default package */
/* loaded from: classes2.dex */
public final class asxk implements asmo {
    public final atyz<aszm, crqd> a;
    public final atzg b;
    private final asxw c;
    private final asxv d = new asxj(this);

    public asxk(cqat cqatVar, ckcw ckcwVar, asmn asmnVar, asxw asxwVar, btrm btrmVar, broq broqVar, akox akoxVar, bvrb bvrbVar, akfa akfaVar, bvjj bvjjVar, dxio<cref> dxioVar, Context context, atzg atzgVar, brcw brcwVar, btvo btvoVar, atyq atyqVar) {
        this.a = new atyz<>(asmnVar, asxwVar, new asxl(ckcwVar, broqVar, akoxVar, akfaVar, bvjjVar, dxioVar, context, 20, brcwVar, btvoVar, false, null), cqatVar, btrmVar, bvrbVar, atzgVar, asxi.a);
        this.b = atzgVar;
        this.c = asxwVar;
    }

    @Override // defpackage.asmo
    public final void NZ(@dzsi Bundle bundle) {
        this.b.NZ(bundle);
        this.a.NZ(bundle);
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
        this.a.Qp();
        this.b.Qp();
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void b() {
        this.c.F(this.d);
        this.b.b();
        this.a.b();
    }

    @Override // defpackage.asmo
    public final void c() {
        this.a.c();
        this.b.c();
        this.c.G(this.d);
    }
}
