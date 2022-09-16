package defpackage;
/* compiled from: PG */
/* renamed from: axtj  reason: default package */
/* loaded from: classes3.dex */
final class axtj implements btzi<dvvi, dvvm> {
    final /* synthetic */ axtk a;

    public axtj(axtk axtkVar) {
        this.a = axtkVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvvi> btzrVar, btzy btzyVar) {
        c();
        deig<String> deigVar = this.a.a;
        String valueOf = String.valueOf(btzyVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Status: ");
        sb.append(valueOf);
        deigVar.k(new axtb(sb.toString()));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvvi> btzrVar, dvvm dvvmVar) {
        dvvm dvvmVar2 = dvvmVar;
        c();
        dvvl b = dvvl.b(dvvmVar2.b);
        if (b == null) {
            b = dvvl.UNKNOWN;
        }
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        if (b.ordinal() == 1) {
            this.a.a.j(dvvmVar2.f);
            return;
        }
        deig<String> deigVar = this.a.a;
        int i = b.h;
        StringBuilder sb = new StringBuilder(19);
        sb.append("Status: ");
        sb.append(i);
        deigVar.k(new axtb(sb.toString()));
    }

    final void c() {
        synchronized (this.a.a) {
            this.a.c = true;
        }
    }
}
