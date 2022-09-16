package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: btn  reason: default package */
/* loaded from: classes2.dex */
public final class btn implements bso, bqv {
    public static final String a = bqf.b("SystemFgDispatcher");
    public final brq b;
    final Object c = new Object();
    String d;
    final Map e;
    final Map f;
    final Set g;
    final bsp h;
    public btm i;
    public final bwn j;
    private final Context k;

    public btn(Context context) {
        this.k = context;
        brq h = brq.h(context);
        this.b = h;
        bwn bwnVar = h.j;
        this.j = bwnVar;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashSet();
        this.f = new HashMap();
        this.h = new bsp(context, bwnVar, this);
        h.f.b(this);
    }

    public static Intent b(Context context, String str, bpz bpzVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", bpzVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", bpzVar.b);
        intent.putExtra("KEY_NOTIFICATION", bpzVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, bpz bpzVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", bpzVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", bpzVar.b);
        intent.putExtra("KEY_NOTIFICATION", bpzVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // defpackage.bqv
    public final void a(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            bum bumVar = (bum) this.f.remove(str);
            if (bumVar != null && this.g.remove(bumVar)) {
                this.h.a(this.g);
            }
        }
        bpz bpzVar = (bpz) this.e.remove(str);
        if (str.equals(this.d) && this.e.size() > 0) {
            Iterator it = this.e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.d = (String) entry.getKey();
            if (this.i != null) {
                bpz bpzVar2 = (bpz) entry.getValue();
                this.i.c(bpzVar2.a, bpzVar2.b, bpzVar2.c);
                this.i.a(bpzVar2.a);
            }
        }
        btm btmVar = this.i;
        if (bpzVar == null || btmVar == null) {
            return;
        }
        bqf a2 = bqf.a();
        String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(bpzVar.a), str, Integer.valueOf(bpzVar.b));
        a2.d(new Throwable[0]);
        btmVar.a(bpzVar.a);
    }

    @Override // defpackage.bso
    public final void e(List list) {
    }

    @Override // defpackage.bso
    public final void f(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                bqf a2 = bqf.a();
                String.format("Constraints unmet for WorkSpec %s", str);
                a2.d(new Throwable[0]);
                brq brqVar = this.b;
                brqVar.j.a(new bvp(brqVar, str, true));
            }
        }
    }

    public final void g(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        bqf a2 = bqf.a();
        String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2));
        a2.d(new Throwable[0]);
        if (notification == null || this.i == null) {
            return;
        }
        this.e.put(stringExtra, new bpz(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.d)) {
            this.d = stringExtra;
            this.i.c(intExtra, intExtra2, notification);
            return;
        }
        this.i.b(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry entry : this.e.entrySet()) {
            i |= ((bpz) entry.getValue()).b;
        }
        bpz bpzVar = (bpz) this.e.get(this.d);
        if (bpzVar == null) {
            return;
        }
        this.i.c(bpzVar.a, i, bpzVar.c);
    }

    public final void h() {
        this.i = null;
        synchronized (this.c) {
            this.h.b();
        }
        this.b.f.c(this);
    }
}
