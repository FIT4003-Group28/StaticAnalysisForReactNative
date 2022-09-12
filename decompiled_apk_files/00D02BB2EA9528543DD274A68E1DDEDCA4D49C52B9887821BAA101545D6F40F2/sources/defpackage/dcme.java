package defpackage;
/* compiled from: PG */
/* renamed from: dcme  reason: default package */
/* loaded from: classes5.dex */
final class dcme extends dccl {
    final /* synthetic */ dcmg a;

    public dcme(dcmg dcmgVar) {
        this.a = dcmgVar;
    }

    @Override // defpackage.dccl
    public final /* bridge */ /* synthetic */ dccr b() {
        return this.a;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        dbsk.z(i, size());
        long j = i;
        Integer num = (Integer) this.a.first();
        if (j >= 0) {
            return Integer.valueOf(decl.a(num.longValue() + j));
        }
        StringBuilder sb = new StringBuilder(57);
        sb.append("distance");
        sb.append(" cannot be negative but was: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
}
