package defpackage;
/* compiled from: PG */
/* renamed from: bsmd  reason: default package */
/* loaded from: classes.dex */
public class bsmd {
    private final dzsj<dxio<aaap>> a;
    private final dzsj<dxio<brba>> b;
    private final dzsj<dxio<axwy>> c;

    public bsmd(dzsj<dxio<aaap>> dzsjVar, dzsj<dxio<brba>> dzsjVar2, dzsj<dxio<axwy>> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final bsmc a(djrm djrmVar, cjqm cjqmVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        b(djrmVar, 4);
        b(cjqmVar, 5);
        return new bsmc(a, a2, a3, djrmVar, cjqmVar);
    }
}
