package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bfrp  reason: default package */
/* loaded from: classes3.dex */
public class bfrp {
    public final dzsj<Activity> a;
    public final dzsj<btvo> b;
    public final dzsj<bfrl> c;
    public final dzsj<bfrj> d;
    public final dzsj<afec> e;
    public final dzsj<dxio<cwv>> f;

    public bfrp(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<bfrl> dzsjVar3, dzsj<bfrj> dzsjVar4, dzsj<afec> dzsjVar5, dzsj<dxio<cwv>> dzsjVar6) {
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