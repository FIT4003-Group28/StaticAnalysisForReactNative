package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: vre  reason: default package */
/* loaded from: classes7.dex */
public class vre {
    private final dzsj<Activity> a;

    public vre(dzsj<Activity> dzsjVar) {
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

    public final vrd a(List<dowm> list, boolean z, cjtd cjtdVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(list, 2);
        b(cjtdVar, 4);
        return new vrd(activity, list, z, cjtdVar);
    }
}
