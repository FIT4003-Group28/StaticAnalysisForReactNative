package defpackage;
/* compiled from: PG */
/* renamed from: ayqp  reason: default package */
/* loaded from: classes2.dex */
final class ayqp implements ayqe {
    final ayqd a;

    public ayqp(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.ayqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length != 4) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Array of size 4 expected but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        return this.a.a(objArr[0], objArr[1], objArr[2], objArr[3]);
    }
}
