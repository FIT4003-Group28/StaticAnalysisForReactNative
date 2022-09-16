package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aafh  reason: default package */
/* loaded from: classes2.dex */
public class aafh {
    private final dzsj<Activity> a;

    public aafh(dzsj<Activity> dzsjVar) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aafg a(String str) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(str, 2);
        return new aafg(activity, str);
    }
}
