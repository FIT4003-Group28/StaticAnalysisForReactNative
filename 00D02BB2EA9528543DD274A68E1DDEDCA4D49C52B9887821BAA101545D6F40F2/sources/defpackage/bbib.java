package defpackage;
/* compiled from: PG */
/* renamed from: bbib  reason: default package */
/* loaded from: classes3.dex */
public class bbib {
    public final dzsj<dxio<begg>> a;
    public final dzsj<dxio<bbdv>> b;
    public final dzsj<dxio<angp>> c;
    public final dzsj<bbif> d;
    public final dzsj<bbil> e;

    public bbib(dzsj<dxio<begg>> dzsjVar, dzsj<dxio<bbdv>> dzsjVar2, dzsj<dxio<angp>> dzsjVar3, dzsj<bbif> dzsjVar4, dzsj<bbil> dzsjVar5) {
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
