package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: chht  reason: default package */
/* loaded from: classes4.dex */
public class chht {
    private final dzsj<Application> a;
    private final dzsj<dxio<apni>> b;

    public chht(dzsj<Application> dzsjVar, dzsj<dxio<apni>> dzsjVar2) {
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

    public final chhs a(dhpj dhpjVar) {
        b(dhpjVar, 1);
        Application a = this.a.a();
        b(a, 2);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 3);
        return new chhs(dhpjVar, a, a2);
    }
}
