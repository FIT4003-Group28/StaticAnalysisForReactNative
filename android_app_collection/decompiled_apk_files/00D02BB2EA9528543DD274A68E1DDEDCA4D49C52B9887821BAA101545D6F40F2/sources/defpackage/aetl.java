package defpackage;
/* compiled from: PG */
/* renamed from: aetl  reason: default package */
/* loaded from: classes2.dex */
public final class aetl {
    private final dzsj<aeso> a;

    public aetl(dzsj<aeso> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final aetk a(cqrp cqrpVar, cqrp cqrpVar2, ckgj ckgjVar, ddho ddhoVar) {
        aeso a = this.a.a();
        b(a, 1);
        b(cqrpVar, 2);
        b(cqrpVar2, 3);
        b(ckgjVar, 4);
        b(ddhoVar, 5);
        return new aetk(a, cqrpVar, cqrpVar2, ckgjVar, ddhoVar);
    }
}
