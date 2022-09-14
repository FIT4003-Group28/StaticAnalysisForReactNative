package defpackage;
/* compiled from: PG */
/* renamed from: bpeb  reason: default package */
/* loaded from: classes3.dex */
public class bpeb {
    private final dzsj<ff> a;

    public bpeb(dzsj<ff> dzsjVar) {
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

    public final bpea a(boxf boxfVar) {
        b(boxfVar, 1);
        ff ffVar = (ff) ((dxjd) this.a).a;
        b(ffVar, 2);
        return new bpea(boxfVar, ffVar);
    }
}
