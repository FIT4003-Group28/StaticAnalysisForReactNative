package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: blf  reason: default package */
/* loaded from: classes3.dex */
public final class blf extends blh<bmt> {
    private final bmt e;

    public blf(List<bpt<bmt>> list) {
        super(list);
        int i = 0;
        bmt bmtVar = list.get(0).b;
        i = bmtVar != null ? bmtVar.a() : i;
        this.e = new bmt(new float[i], new int[i]);
    }

    @Override // defpackage.blc
    public final /* bridge */ /* synthetic */ Object i(bpt bptVar, float f) {
        bmt bmtVar = this.e;
        bmt bmtVar2 = (bmt) bptVar.b;
        bmt bmtVar3 = (bmt) bptVar.c;
        int length = bmtVar2.b.length;
        int length2 = bmtVar3.b.length;
        if (length == length2) {
            for (int i = 0; i < bmtVar2.b.length; i++) {
                bmtVar.a[i] = bpr.c(bmtVar2.a[i], bmtVar3.a[i], f);
                bmtVar.b[i] = bpm.a(f, bmtVar2.b[i], bmtVar3.b[i]);
            }
            return this.e;
        }
        StringBuilder sb = new StringBuilder(79);
        sb.append("Cannot interpolate between gradients. Lengths vary (");
        sb.append(length);
        sb.append(" vs ");
        sb.append(length2);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
