package defpackage;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
/* compiled from: PG */
/* renamed from: agvw  reason: default package */
/* loaded from: classes.dex */
public final class agvw {
    public final SharedPreferences a;
    public final afvn b;
    public final azqb c;
    private final aacz d;

    public agvw(SharedPreferences sharedPreferences, aacz aaczVar, afvn afvnVar, azqb azqbVar) {
        this.a = sharedPreferences;
        this.d = aaczVar;
        this.b = afvnVar;
        this.c = azqbVar;
    }

    public final long a() {
        agpz a;
        aghe b = ((agrf) this.c.get()).a().b();
        if (b == null || (a = b.a()) == null) {
            return 0L;
        }
        return Math.max(0L, a.a());
    }

    public final long b() {
        aghe b = ((agrf) this.c.get()).a().b();
        if (b == null) {
            return 0L;
        }
        return c(b.d());
    }

    public final long c(File file) {
        if (file == null) {
            return 0L;
        }
        return zgt.B(this.d.b(), file);
    }

    public final long d() {
        File d;
        aghe b = ((agrf) this.c.get()).a().b();
        long j = 0;
        if (b == null || (d = b.d()) == null) {
            return 0L;
        }
        apyy b2 = this.d.b();
        if (d.exists()) {
            try {
                StatFs statFs = new StatFs(d.getAbsolutePath());
                j = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            } catch (IllegalArgumentException unused) {
            }
        }
        return zgt.A(j, b2);
    }
}
