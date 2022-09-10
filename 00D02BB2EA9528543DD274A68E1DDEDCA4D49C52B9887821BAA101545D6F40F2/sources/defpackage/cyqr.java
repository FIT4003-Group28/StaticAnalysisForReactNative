package defpackage;

import android.content.Context;
import com.google.android.libraries.social.populous.storage.RoomDatabaseManager;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cyqr  reason: default package */
/* loaded from: classes5.dex */
public final class cyqr {
    public static RoomDatabaseManager a(Context context, String str, cyph cyphVar, Executor executor) {
        bk a;
        cyqw cyqwVar = new cyqw(cyphVar, new czgm(new czcn(Locale.getDefault())));
        if (str == null) {
            a = bj.b(context, RoomDatabaseManager.class);
        } else {
            a = bj.a(context, RoomDatabaseManager.class, str);
        }
        if (dyaz.a.a().j()) {
            a.a = executor;
            a.b = executor;
        }
        a.c(new cyqs(cyqwVar), new cyqt(cyqwVar), new cyqu(cyqwVar), new cyqv(cyqwVar));
        int[] iArr = {1, 2, 3, 4};
        if (a.g == null) {
            a.g = new HashSet(4);
        }
        for (int i = 0; i < 4; i++) {
            a.g.add(Integer.valueOf(iArr[i]));
        }
        a.e = true;
        a.f = true;
        a.b(new cyqq(cyphVar));
        return (RoomDatabaseManager) a.a();
    }
}
