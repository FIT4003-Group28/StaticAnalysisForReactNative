package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: aqvx  reason: default package */
/* loaded from: classes2.dex */
public class aqvx {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;

    public aqvx(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final aqvw a(String str, String str2, Boolean bool, Boolean bool2, View.OnClickListener onClickListener, @dzsi cjtd cjtdVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqhn a = this.b.a();
        b(a, 2);
        b(str, 3);
        b(str2, 4);
        b(bool, 5);
        b(bool2, 6);
        b(onClickListener, 7);
        return new aqvw(activity, a, str, str2, bool, bool2, onClickListener, cjtdVar);
    }
}
