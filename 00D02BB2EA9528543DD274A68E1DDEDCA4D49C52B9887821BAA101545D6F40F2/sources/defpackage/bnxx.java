package defpackage;
/* compiled from: PG */
/* renamed from: bnxx  reason: default package */
/* loaded from: classes3.dex */
public final class bnxx {
    private final dzsj<buny> a;

    public bnxx(dzsj<buny> dzsjVar) {
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

    public final bnxw a(bokk bokkVar) {
        b(bokkVar, 1);
        buny a = this.a.a();
        b(a, 2);
        return new bnxw(bokkVar, a);
    }
}
