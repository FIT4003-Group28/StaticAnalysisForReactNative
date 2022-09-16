package defpackage;
/* compiled from: PG */
/* renamed from: axoi  reason: default package */
/* loaded from: classes3.dex */
public class axoi {
    public final dzsj<dxio<ceet>> a;

    public axoi(dzsj<dxio<ceet>> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final axoh a(dqau dqauVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        b(dqauVar, 2);
        return new axoh(a, dqauVar);
    }
}
