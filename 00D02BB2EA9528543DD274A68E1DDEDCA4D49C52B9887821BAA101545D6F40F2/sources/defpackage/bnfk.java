package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bnfk  reason: default package */
/* loaded from: classes3.dex */
final class bnfk extends gt {
    private final List<bnfi> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnfk(List<bnfi> list, gn gnVar) {
        super(gnVar);
        dzvx.c(list, "tabFragments");
        this.a = list;
    }

    @Override // defpackage.bas
    public final int OV() {
        return this.a.size();
    }

    @Override // defpackage.gt
    public final fd a(int i) {
        return this.a.get(i).a;
    }
}
