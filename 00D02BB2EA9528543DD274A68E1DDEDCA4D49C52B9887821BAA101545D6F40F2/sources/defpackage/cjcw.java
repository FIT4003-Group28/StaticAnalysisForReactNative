package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cjcw  reason: default package */
/* loaded from: classes4.dex */
public class cjcw {
    private final dzsj<Activity> a;

    public cjcw(dzsj<Activity> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
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

    public final cjcv a(boolean z, dbsg<String> dbsgVar, String str, cjct cjctVar, @dzsi cjtd cjtdVar, cjcs cjcsVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(dbsgVar, 3);
        b(str, 4);
        b(cjctVar, 5);
        b(cjcsVar, 7);
        return new cjcv(activity, z, dbsgVar, str, cjctVar, cjtdVar, cjcsVar);
    }
}
