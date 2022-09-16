package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: yvv  reason: default package */
/* loaded from: classes4.dex */
public final class yvv {
    public static yvs a(axnm axnmVar) {
        return b(axnmVar, yvt.a, yvu.a);
    }

    public static yvs b(axnm axnmVar, yvr yvrVar, yvw yvwVar) {
        axnmVar.getClass();
        yvrVar.getClass();
        yvwVar.getClass();
        return new yvq(axnmVar, yvrVar, yvwVar);
    }

    public static synchronized vjb c(Context context) {
        vjb vjbVar;
        synchronized (yvv.class) {
            sre.c();
            vjbVar = new vjb(Arrays.asList(vje.q(context).a()));
        }
        return vjbVar;
    }

    public static void d(SQLiteOpenHelper sQLiteOpenHelper, long j) {
        if (Build.VERSION.SDK_INT >= 27) {
            sQLiteOpenHelper.setIdleConnectionTimeout(j);
        }
    }
}
