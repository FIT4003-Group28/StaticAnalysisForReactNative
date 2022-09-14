package defpackage;

import android.app.Application;
import java.io.Serializable;
/* compiled from: PG */
@Deprecated
/* renamed from: bzwg  reason: default package */
/* loaded from: classes.dex */
public final class bzwg {
    private final Application a;
    private final bwsa b;

    public bzwg(Application application, bwsa bwsaVar) {
        this.a = application;
        application.getPackageManager();
        this.b = bwsaVar;
    }

    public final <T extends Serializable> bzwh<T> a(String str, Class<T> cls) {
        return b(str, cls, null);
    }

    public final <T extends Serializable> bzwh<T> b(String str, Class<T> cls, @dzsi auub auubVar) {
        return new bzwh<>(this.a, this.b, str, cls, auubVar);
    }
}
