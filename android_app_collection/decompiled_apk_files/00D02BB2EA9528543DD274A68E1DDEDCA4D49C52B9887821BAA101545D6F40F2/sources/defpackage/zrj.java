package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: zrj  reason: default package */
/* loaded from: classes7.dex */
public class zrj {
    public final dzsj<vxo> a;
    public final dzsj<Activity> b;
    public final dzsj<vpd> c;
    public final dzsj<cklf> d;
    public final dzsj<vrk> e;
    public final dzsj<vre> f;
    public final dzsj<vrr> g;

    public zrj(dzsj<vxo> dzsjVar, dzsj<Activity> dzsjVar2, dzsj<vpd> dzsjVar3, dzsj<cklf> dzsjVar4, dzsj<vrk> dzsjVar5, dzsj<vre> dzsjVar6, dzsj<vrr> dzsjVar7) {
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
