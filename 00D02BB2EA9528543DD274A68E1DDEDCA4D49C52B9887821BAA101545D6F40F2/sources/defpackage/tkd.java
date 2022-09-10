package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tkd  reason: default package */
/* loaded from: classes7.dex */
public final class tkd {
    private final dzsj<Activity> a;

    public tkd(dzsj<Activity> dzsjVar) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final tkc a(boolean z, boolean z2, int i, dbsg<amvh> dbsgVar, dcdc<amvh> dcdcVar, Runnable runnable) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        c(activity, 1);
        c(dbsgVar, 5);
        c(dcdcVar, 6);
        c(runnable, 7);
        return new tkc(activity, z, z2, i, dbsgVar, dcdcVar, runnable);
    }

    public final tkc b(amvh amvhVar, dcdc<amvh> dcdcVar, Runnable runnable) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        c(activity, 1);
        c(amvhVar, 2);
        c(dcdcVar, 3);
        c(runnable, 4);
        return new tkc(activity, amvhVar, dcdcVar, runnable);
    }
}
