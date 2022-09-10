package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aszt  reason: default package */
/* loaded from: classes2.dex */
public final class aszt<T> extends btrh<T> {
    private final int d;

    public aszt(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            aszs aszsVar = (aszs) this.a;
            Context context = aszsVar.c;
            btvo btvoVar = ((btvr) obj).a;
            akfa akfaVar = aszsVar.h;
            dzsj<ckrp> dzsjVar = aszsVar.d;
            brlz brlzVar = aszsVar.e;
            if (!aszsVar.y(astk.a(context, btvoVar, akfaVar, dzsjVar, brlzVar == null ? null : brlzVar.g, aszsVar.g), true)) {
                return;
            }
            aszsVar.z();
        } else if (i == 1) {
            aszs aszsVar2 = (aszs) this.a;
            aszsVar2.i = ((alid) obj).c;
            aszsVar2.z();
        } else if (i != 2) {
            aszs aszsVar3 = (aszs) this.a;
            if (!((crhd) obj).b()) {
                return;
            }
            aszsVar3.z();
        } else {
            aszs aszsVar4 = (aszs) this.a;
            asin asinVar = (asin) obj;
            aszsVar4.j = aszsVar4.g.a();
            aszsVar4.z();
        }
    }
}
