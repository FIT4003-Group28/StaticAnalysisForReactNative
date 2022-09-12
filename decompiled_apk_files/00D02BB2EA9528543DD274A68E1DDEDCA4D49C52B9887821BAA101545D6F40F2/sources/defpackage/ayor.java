package defpackage;
/* compiled from: PG */
/* renamed from: ayor  reason: default package */
/* loaded from: classes3.dex */
public final class ayor {
    private final dzsj<cqhn> a;

    public ayor(dzsj<cqhn> dzsjVar) {
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

    public final ayoq a(aymr aymrVar, aymr aymrVar2, cjtd cjtdVar, cjtd cjtdVar2, ayop ayopVar, ayop ayopVar2, ayoo ayooVar) {
        b(this.a.a(), 1);
        b(aymrVar, 2);
        b(aymrVar2, 3);
        b(cjtdVar, 4);
        b(cjtdVar2, 5);
        b(ayopVar, 6);
        b(ayopVar2, 7);
        b(ayooVar, 8);
        return new ayoq(aymrVar, aymrVar2, cjtdVar, cjtdVar2, ayopVar, ayopVar2, ayooVar);
    }
}
