package defpackage;
/* compiled from: PG */
/* renamed from: aqpe  reason: default package */
/* loaded from: classes2.dex */
public final class aqpe {
    private final dzsj<gga> a;
    private final dzsj<apyx> b;
    private final dzsj<dxio<aqwq>> c;
    private final dzsj<dxio<aqci>> d;

    public aqpe(dzsj<gga> dzsjVar, dzsj<apyx> dzsjVar2, dzsj<dxio<aqwq>> dzsjVar3, dzsj<dxio<aqci>> dzsjVar4) {
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

    public final aqpd a(btlu btluVar, String str, String str2, Runnable runnable) {
        gga a = this.a.a();
        b(a, 1);
        apyx a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        b(btluVar, 5);
        b(str, 6);
        b(str2, 7);
        b(runnable, 8);
        return new aqpd(a, a2, a3, a4, btluVar, str, str2, runnable);
    }
}
