package defpackage;

import android.app.Application;
import android.view.View;
/* compiled from: PG */
/* renamed from: sev  reason: default package */
/* loaded from: classes7.dex */
public class sev {
    private final dzsj<Application> a;
    private final dzsj<cjqy> b;
    private final dzsj<cqat> c;

    public sev(dzsj<Application> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<cqat> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final seu a(String str, set setVar, @dzsi View.AccessibilityDelegate accessibilityDelegate, ddho ddhoVar, ddho ddhoVar2) {
        Application a = this.a.a();
        b(a, 1);
        cjqy a2 = this.b.a();
        b(a2, 2);
        cqat a3 = this.c.a();
        b(a3, 3);
        b(str, 4);
        b(setVar, 5);
        b(ddhoVar, 7);
        b(ddhoVar2, 8);
        return new seu(a, a2, a3, str, setVar, accessibilityDelegate, ddhoVar, ddhoVar2);
    }
}
