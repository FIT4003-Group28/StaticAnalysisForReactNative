package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: twx  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class twx {
    public static tqy a(tqk tqkVar, int i) {
        aopa createBuilder = tqy.a.createBuilder();
        String str = tqkVar.d;
        createBuilder.copyOnWrite();
        tqy tqyVar = (tqy) createBuilder.instance;
        str.getClass();
        tqyVar.b |= 1;
        tqyVar.c = str;
        int i2 = tqkVar.e;
        createBuilder.copyOnWrite();
        tqy tqyVar2 = (tqy) createBuilder.instance;
        tqyVar2.b |= 2;
        tqyVar2.d = i2;
        String g = tzc.g(tqkVar);
        createBuilder.copyOnWrite();
        tqy tqyVar3 = (tqy) createBuilder.instance;
        g.getClass();
        tqyVar3.b |= 4;
        tqyVar3.e = g;
        createBuilder.copyOnWrite();
        tqy tqyVar4 = (tqy) createBuilder.instance;
        tqyVar4.f = i - 1;
        tqyVar4.b |= 8;
        if ((tqkVar.b & 32) != 0) {
            awxs awxsVar = tqkVar.h;
            if (awxsVar == null) {
                awxsVar = awxs.a;
            }
            createBuilder.copyOnWrite();
            tqy tqyVar5 = (tqy) createBuilder.instance;
            awxsVar.getClass();
            tqyVar5.g = awxsVar;
            tqyVar5.b |= 16;
        }
        return (tqy) createBuilder.mo39build();
    }

    public static tvg b(Context context, trv trvVar) {
        int i = context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", tvg.NEW_FILE_KEY.d);
        try {
            return tvg.a(i);
        } catch (IllegalArgumentException e) {
            trvVar.a(e, "FileKey version metadata corrupted with unknown version: %d", Integer.valueOf(i));
            context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
            return tvg.USE_CHECKSUM_ONLY;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    public static boolean d(Context context, tvg tvgVar) {
        tvgVar.name();
        int i = typ.a;
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", tvgVar.d).commit();
    }

    public static void e(Context context) {
        int i = typ.a;
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }

    public static boolean f(awxs awxsVar) {
        try {
            vks.a(awxsVar);
            return true;
        } catch (IllegalArgumentException e) {
            typ.i(e, "Invalid transform specification");
            return false;
        }
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static int i(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    public static int j(int i) {
        int[] iArr = {1, 2, 3, 4, 5};
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
