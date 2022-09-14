package c.e.a.a.i.w;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
/* loaded from: classes.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static s a(Context context, c.e.a.a.i.w.j.c cVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.g gVar, c.e.a.a.i.y.a aVar) {
        return Build.VERSION.SDK_INT >= 21 ? new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(context, cVar, gVar) : new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(context, cVar, aVar, gVar);
    }
}
