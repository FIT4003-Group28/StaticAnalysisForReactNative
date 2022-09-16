package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: axph  reason: default package */
/* loaded from: classes2.dex */
public final class axph {
    private final File a;
    private final List b;

    public axph() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        this.a = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.b = new ArrayList();
    }

    public final void a() {
        for (axpg axpgVar : this.b) {
            try {
                axpq.l(axpgVar.b);
            } catch (Exception e) {
                axpq.h.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
            if (!axpgVar.a.delete()) {
                throw new Exception("could not delete temporary file");
                break;
            }
        }
        this.b.clear();
    }

    public final axpg b() {
        axpg axpgVar = new axpg(this.a);
        this.b.add(axpgVar);
        return axpgVar;
    }
}
