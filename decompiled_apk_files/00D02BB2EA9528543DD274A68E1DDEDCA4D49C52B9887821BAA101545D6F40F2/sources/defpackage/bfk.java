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
/* renamed from: bfk  reason: default package */
/* loaded from: classes3.dex */
public final class bfk implements bel, bct {
    public final bdn a;
    final Object b = new Object();
    String c;
    final Map<String, bbq> d;
    final Map<String, bgh> e;
    final Set<bgh> f;
    final bem g;
    public bfj h;
    public final bif i;
    private final Context j;

    static {
        bbz.f("SystemFgDispatcher");
    }

    public bfk(Context context) {
        this.j = context;
        bdn g = bdn.g(context);
        this.a = g;
        bif bifVar = g.k;
        this.i = bifVar;
        this.c = null;
        this.d = new LinkedHashMap();
        this.f = new HashSet();
        this.e = new HashMap();
        this.g = new bem(context, bifVar, this);
        g.e.d(this);
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // defpackage.bel
    public final void Ni(List<String> list) {
    }

    @Override // defpackage.bel
    public final void Nj(List<String> list) {
        if (!list.isEmpty()) {
            for (String str : list) {
                bbz.e().a(new Throwable[0]);
                bdn bdnVar = this.a;
                bdnVar.k.a(new bhk(bdnVar, str, true));
            }
        }
    }

    @Override // defpackage.bct
    public final void a(String str, boolean z) {
        Map.Entry<String, bbq> entry;
        synchronized (this.b) {
            bgh remove = this.e.remove(str);
            if (remove != null && this.f.remove(remove)) {
                this.g.a(this.f);
            }
        }
        bbq remove2 = this.d.remove(str);
        if (str.equals(this.c) && this.d.size() > 0) {
            Iterator<Map.Entry<String, bbq>> it = this.d.entrySet().iterator();
            Map.Entry<String, bbq> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.c = entry.getKey();
            if (this.h != null) {
                bbq value = entry.getValue();
                this.h.a(value.a, value.b, value.c);
                this.h.c(value.a);
            }
        }
        if (remove2 == null || this.h == null) {
            return;
        }
        bbz.e().a(new Throwable[0]);
        this.h.c(remove2.a);
    }

    public final void b() {
        this.h = null;
        synchronized (this.b) {
            this.g.b();
        }
        this.a.e.e(this);
    }

    public final void c(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        bbz.e().a(new Throwable[0]);
        if (notification == null || this.h == null) {
            return;
        }
        this.d.put(stringExtra, new bbq(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.c)) {
            this.c = stringExtra;
            this.h.a(intExtra, intExtra2, notification);
            return;
        }
        this.h.b(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, bbq> entry : this.d.entrySet()) {
            i |= entry.getValue().b;
        }
        bbq bbqVar = this.d.get(this.c);
        if (bbqVar == null) {
            return;
        }
        this.h.a(bbqVar.a, i, bbqVar.c);
    }
}
