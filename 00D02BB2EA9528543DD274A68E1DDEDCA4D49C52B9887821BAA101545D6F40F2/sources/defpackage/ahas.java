package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ahas  reason: default package */
/* loaded from: classes2.dex */
public class ahas {
    private final dzsj<Activity> a;

    public ahas(dzsj<Activity> dzsjVar) {
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

    public final ahar a(CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi jic jicVar, @dzsi ahaq ahaqVar, cjtd cjtdVar, CharSequence charSequence3, @dzsi CharSequence charSequence4, ahhv ahhvVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(charSequence, 2);
        b(cjtdVar, 6);
        b(charSequence3, 7);
        b(ahhvVar, 9);
        return new ahar(activity, charSequence, charSequence2, jicVar, ahaqVar, cjtdVar, charSequence3, charSequence4, ahhvVar, true);
    }
}
