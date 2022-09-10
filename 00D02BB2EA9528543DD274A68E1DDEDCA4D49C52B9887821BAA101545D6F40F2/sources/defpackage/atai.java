package defpackage;

import android.content.Context;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: atai  reason: default package */
/* loaded from: classes2.dex */
public final class atai extends atcy {
    private final atyz<atlq, crqf> a;
    private final atzg c;

    public atai(cqat cqatVar, ckcw ckcwVar, atcu atcuVar, atcw atcwVar, btrm btrmVar, broq broqVar, akox akoxVar, bvrb bvrbVar, akfa akfaVar, bvjj bvjjVar, dxio<cref> dxioVar, Context context, atzg atzgVar, int i, brcw brcwVar, btvo btvoVar, atyq atyqVar) {
        super(atcuVar, atcwVar);
        this.a = new atyz<>(atcuVar, atcwVar, new ataj(ckcwVar, broqVar, akoxVar, akfaVar, bvjjVar, dxioVar, context, i, brcwVar, btvoVar, false, null), cqatVar, btrmVar, bvrbVar, atzgVar, atah.a);
        this.c = atzgVar;
    }

    @Override // defpackage.atcy, defpackage.asmo
    public final void NZ(@dzsi Bundle bundle) {
        this.c.NZ(bundle);
        this.a.NZ(bundle);
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        this.c.g(atlqVar, atlqVar2);
        this.a.g(atlqVar, atlqVar2);
    }

    @Override // defpackage.atcy, defpackage.asmo
    public final void Qp() {
        this.a.Qp();
        this.c.Qp();
    }

    @Override // defpackage.atcy, defpackage.asmo
    public final void b() {
        this.c.b();
        this.a.b();
    }

    @Override // defpackage.atcy, defpackage.asmo
    public final void c() {
        this.a.c();
        this.c.c();
    }
}
