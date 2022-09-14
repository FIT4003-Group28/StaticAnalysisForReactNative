package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: avom  reason: default package */
/* loaded from: classes3.dex */
public final class avom {
    public final dzsj<avoj> a;
    public final dzsj<avop> b;
    public final dzsj<avpo> c;
    public final dzsj<avpn> d;
    public final dzsj<bvoh> e;
    public final dzsj<Context> f;

    public avom(dzsj<avoj> dzsjVar, dzsj<avop> dzsjVar2, dzsj<avpo> dzsjVar3, dzsj<avpn> dzsjVar4, dzsj<bvoh> dzsjVar5, dzsj<Context> dzsjVar6) {
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
