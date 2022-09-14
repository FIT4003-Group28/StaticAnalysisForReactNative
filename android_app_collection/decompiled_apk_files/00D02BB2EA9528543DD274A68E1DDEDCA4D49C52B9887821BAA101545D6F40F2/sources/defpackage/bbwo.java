package defpackage;
/* compiled from: PG */
/* renamed from: bbwo  reason: default package */
/* loaded from: classes3.dex */
public final class bbwo {
    public final dzsj<gga> a;
    public final dzsj<bvrb> b;
    public final dzsj<bdup> c;
    public final dzsj<dxio<bbzd>> d;
    public final dzsj<dxio<bbzi>> e;

    public bbwo(dzsj<gga> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<bdup> dzsjVar3, dzsj<dxio<bbzd>> dzsjVar4, dzsj<dxio<bbzi>> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
