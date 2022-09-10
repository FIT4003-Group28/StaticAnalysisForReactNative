package defpackage;
/* compiled from: PG */
/* renamed from: bbhw  reason: default package */
/* loaded from: classes3.dex */
public final class bbhw {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<bbfg> c;
    public final dzsj<bbib> d;
    public final dzsj<bbhy> e;
    public final dzsj<dxio<bbdv>> f;
    public final dzsj<dxio<bber>> g;
    public final dzsj<affz> h;
    public final dzsj<cjqy> i;

    public bbhw(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bbfg> dzsjVar3, dzsj<bbib> dzsjVar4, dzsj<bbhy> dzsjVar5, dzsj<dxio<bbdv>> dzsjVar6, dzsj<dxio<bber>> dzsjVar7, dzsj<affz> dzsjVar8, dzsj<cjqy> dzsjVar9) {
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
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
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
