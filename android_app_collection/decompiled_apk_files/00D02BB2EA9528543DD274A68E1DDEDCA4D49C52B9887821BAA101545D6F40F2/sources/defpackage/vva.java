package defpackage;
/* compiled from: PG */
/* renamed from: vva  reason: default package */
/* loaded from: classes7.dex */
public final class vva {
    private final dzsj<vvb> a;

    public vva(dzsj<vvb> dzsjVar) {
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

    public final vuz a(dwao dwaoVar, dqvj dqvjVar) {
        b(this.a.a(), 1);
        b(dwaoVar, 2);
        b(dqvjVar, 3);
        return new vuz(dwaoVar, dqvjVar);
    }
}
