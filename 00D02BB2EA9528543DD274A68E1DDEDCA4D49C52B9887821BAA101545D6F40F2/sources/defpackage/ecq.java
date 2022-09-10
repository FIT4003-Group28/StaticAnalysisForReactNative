package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: ecq  reason: default package */
/* loaded from: classes6.dex */
public class ecq {
    public final dzsj<cafi> a;
    public final dzsj<gga> b;
    public final dzsj<gfq> c;
    public final dzsj<Resources> d;
    public final dzsj<chnm> e;
    public final dzsj<ceet> f;

    public ecq(dzsj<cafi> dzsjVar, dzsj<gga> dzsjVar2, dzsj<gfq> dzsjVar3, dzsj<Resources> dzsjVar4, dzsj<chnm> dzsjVar5, dzsj<ceet> dzsjVar6) {
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
