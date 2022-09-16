package defpackage;
/* compiled from: PG */
/* renamed from: ayqn  reason: default package */
/* loaded from: classes2.dex */
final class ayqn implements ayqe {
    final aypx a;

    public ayqn(aypx aypxVar) {
        this.a = aypxVar;
    }

    @Override // defpackage.ayqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length != 2) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Array of size 2 expected but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        return this.a.a(objArr[0], objArr[1]);
    }
}
