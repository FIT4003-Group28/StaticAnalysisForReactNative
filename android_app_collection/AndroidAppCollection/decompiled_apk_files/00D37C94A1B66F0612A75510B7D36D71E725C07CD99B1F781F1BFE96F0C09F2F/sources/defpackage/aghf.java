package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aghf  reason: default package */
/* loaded from: classes.dex */
public final class aghf {
    private final SharedPreferences a;
    private final zdu b;
    private final Map c = new HashMap();

    public aghf(SharedPreferences sharedPreferences, zdu zduVar) {
        this.a = sharedPreferences;
        this.b = zduVar;
    }

    public final synchronized pde a(File file) {
        String absolutePath = file.getAbsolutePath();
        if (!this.c.containsKey(absolutePath)) {
            pdx pdxVar = new pdx(file, new pdv(), this.b.b(this.a).getEncoded(), true);
            this.c.put(absolutePath, pdxVar);
            return pdxVar;
        }
        return (pde) this.c.get(absolutePath);
    }

    public final synchronized void b() {
        for (pde pdeVar : this.c.values()) {
            pdeVar.j();
        }
        this.c.clear();
    }
}
