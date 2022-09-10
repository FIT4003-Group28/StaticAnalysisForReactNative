package defpackage;
/* compiled from: PG */
/* renamed from: bxba  reason: default package */
/* loaded from: classes4.dex */
final class bxba implements btzi<dwge, dwgl> {
    final /* synthetic */ ilo a;
    final /* synthetic */ bxbd b;

    public bxba(bxbd bxbdVar, ilo iloVar) {
        this.b = bxbdVar;
        this.a = iloVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwge> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwge> btzrVar, dwgl dwglVar) {
        dwgl dwglVar2 = dwglVar;
        if (dwglVar2.b.isEmpty()) {
            return;
        }
        this.b.m(this.a, dwglVar2.b.get(0));
    }
}
