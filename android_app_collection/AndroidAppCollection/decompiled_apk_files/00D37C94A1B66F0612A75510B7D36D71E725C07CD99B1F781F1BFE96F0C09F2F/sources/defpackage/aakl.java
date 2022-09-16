package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aakl  reason: default package */
/* loaded from: classes.dex */
public final class aakl {
    public final azqb a;
    public final Map b;

    public aakl(azqb azqbVar) {
        this.b = new HashMap();
        this.a = azqbVar;
    }

    public aakl(azqb azqbVar, Map map) {
        this.a = azqbVar;
        this.b = map;
    }

    private static String c(afvm afvmVar) {
        String b = afvmVar.b();
        return TextUtils.isEmpty(b) ? "default.entitystore" : b.concat(".entitystore");
    }

    public final synchronized vno a(afvm afvmVar, vor vorVar) {
        final String c = c(afvmVar);
        vno vnoVar = (vno) this.b.get(c);
        if (vnoVar != null) {
            return vnoVar;
        }
        vnq vnqVar = (vnq) this.a.get();
        Context context = (Context) vnqVar.a.get();
        context.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) vnqVar.b.get();
        scheduledExecutorService.getClass();
        voj vojVar = (voj) vnqVar.c.get();
        vojVar.getClass();
        vno vnoVar2 = new vno(new vok(context, scheduledExecutorService, vojVar, new aniq() { // from class: vnp
            @Override // defpackage.aniq
            public final ankt a() {
                return anlz.q(c);
            }
        }, vorVar));
        this.b.put(c, vnoVar2);
        return vnoVar2;
    }

    public final void b(Context context, afvm afvmVar) {
        String c = c(afvmVar);
        final aaht aahtVar = new aaht(c);
        File parentFile = context.getDatabasePath("ignore").getParentFile();
        parentFile.getClass();
        parentFile.listFiles(new FileFilter() { // from class: aahs
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                if (aahtVar.accept(file)) {
                    file.delete();
                    return false;
                }
                return false;
            }
        });
        synchronized (this) {
            vno vnoVar = (vno) this.b.get(c);
            if (vnoVar != null) {
                vnoVar.a.onLowMemory();
            }
        }
    }
}
