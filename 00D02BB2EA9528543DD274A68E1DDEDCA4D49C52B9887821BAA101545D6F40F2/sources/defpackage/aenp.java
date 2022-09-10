package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aenp  reason: default package */
/* loaded from: classes2.dex */
public class aenp {
    private final dzsj<Activity> a;

    public aenp(dzsj<Activity> dzsjVar) {
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

    public final aeno a(int i, aekz aekzVar, @dzsi cqsn cqsnVar, @dzsi cqsn cqsnVar2, int i2, eapg eapgVar, eapg eapgVar2, eapg eapgVar3) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(aekzVar, 3);
        b(eapgVar, 7);
        b(eapgVar2, 8);
        b(eapgVar3, 9);
        return new aeno(activity, i, aekzVar, cqsnVar, cqsnVar2, i2, eapgVar, eapgVar2, eapgVar3);
    }
}
