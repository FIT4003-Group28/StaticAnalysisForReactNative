package defpackage;
/* compiled from: PG */
/* renamed from: sey  reason: default package */
/* loaded from: classes7.dex */
public final class sey {
    private final dzsj<gga> a;
    private final dzsj<eeu> b;
    private final dzsj<rzn> c;
    private final dzsj<ckcw> d;

    public sey(dzsj<gga> dzsjVar, dzsj<eeu> dzsjVar2, dzsj<rzn> dzsjVar3, dzsj<ckcw> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final sex a(rzp rzpVar) {
        gga a = this.a.a();
        b(a, 1);
        eeu a2 = this.b.a();
        b(a2, 2);
        rzn a3 = this.c.a();
        b(a3, 3);
        ckcw a4 = this.d.a();
        b(a4, 4);
        b(rzpVar, 5);
        return new sex(a, a2, a3, a4, rzpVar);
    }
}
