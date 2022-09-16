package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amga  reason: default package */
/* loaded from: classes.dex */
public final class amga extends bqt {
    private static final amzy a = amzy.l("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory");
    private final Map b;
    private final amly c;

    public amga(Map map, amly amlyVar) {
        this.b = map;
        this.c = amlyVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [amln, amlv] */
    @Override // defpackage.bqt
    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        azqb azqbVar;
        ?? c = this.c.c("WorkerFactory.createWorker()");
        try {
            if (str.equals(TikTokListenableWorker.class.getName())) {
                afy afyVar = new afy(workerParameters.c.size());
                for (String str2 : workerParameters.c) {
                    if (str2.startsWith("TikTokWorker#")) {
                        afyVar.add(str2.replace("TikTokWorker#", ""));
                    }
                }
                String str3 = (String) arey.t(afyVar);
                azqbVar = (azqb) this.b.get(str3);
                if (azqbVar == null) {
                    ((amzw) ((amzw) a.f()).i("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 59, "TikTokWorkerFactory.java")).s("A worker with the `permanentTag` %s does not exist in this version of the application. This suggests that an app upgrade removed this worker and now work scheduled before the upgrade can't run. If this is surprising, refer to go/tiktok/dev/androidx/work#deprecating, then reach out to #tiktok on YAQS, or g/tiktok-users if the situation is still unclear.", str3);
                }
            } else {
                azqbVar = (azqb) this.b.get(str);
                if (azqbVar != null) {
                    Set set = workerParameters.c;
                    String valueOf = String.valueOf(str);
                    set.add(valueOf.length() != 0 ? "TikTokWorker#".concat(valueOf) : new String("TikTokWorker#"));
                }
            }
            if (azqbVar == null) {
                amna.i(c);
                return null;
            }
            TikTokListenableWorker tikTokListenableWorker = new TikTokListenableWorker(context, this.c, (amfw) azqbVar.get(), workerParameters);
            amna.i(c);
            return tikTokListenableWorker;
        } catch (Throwable th) {
            try {
                amna.i(c);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
