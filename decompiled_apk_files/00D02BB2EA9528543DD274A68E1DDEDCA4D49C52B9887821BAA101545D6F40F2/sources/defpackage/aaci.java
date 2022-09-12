package defpackage;
/* compiled from: PG */
/* renamed from: aaci  reason: default package */
/* loaded from: classes2.dex */
public final class aaci {
    private final dzsj<butr> a;
    private final dzsj<bvrb> b;

    public aaci(dzsj<butr> dzsjVar, dzsj<bvrb> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final aach a(aacf aacfVar) {
        butr a = this.a.a();
        b(a, 1);
        bvrb a2 = this.b.a();
        b(a2, 2);
        b(aacfVar, 3);
        return new aach(a, a2, aacfVar);
    }
}
