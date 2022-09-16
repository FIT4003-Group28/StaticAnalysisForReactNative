package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: ajgq  reason: default package */
/* loaded from: classes.dex */
public final class ajgq {
    public final Context a;
    public final yme b;
    public volatile agp c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final aes e = new aes(this);
    private final ScheduledExecutorService f;
    private volatile ankt g;

    public ajgq(Context context, ScheduledExecutorService scheduledExecutorService, yme ymeVar) {
        this.a = context;
        this.f = scheduledExecutorService;
        this.b = ymeVar;
    }

    public final synchronized ankt a() {
        if (this.g != null && !this.g.isCancelled()) {
            return this.g;
        }
        this.g = anlz.x(aed.c(new agr() { // from class: ajgp
            @Override // defpackage.agr
            public final Object a(agp agpVar) {
                String str;
                ajgq ajgqVar = ajgq.this;
                ajgqVar.c = agpVar;
                try {
                    str = bact.a(ajgqVar.a);
                } catch (NullPointerException unused) {
                    str = null;
                }
                if (str == null) {
                    agpVar.b();
                } else {
                    Context context = ajgqVar.a;
                    aes aesVar = ajgqVar.e;
                    aesVar.a = context.getApplicationContext();
                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    if (!TextUtils.isEmpty(str)) {
                        intent.setPackage(str);
                    }
                    context.bindService(intent, aesVar, 33);
                    ajgqVar.d.set(true);
                }
                return null;
            }
        }), 1000L, TimeUnit.MILLISECONDS, this.f);
        return this.g;
    }

    public final void b() {
        apes apesVar = this.b.a().B;
        if (apesVar == null) {
            apesVar = apes.a;
        }
        if (apesVar.c) {
            a();
        }
    }
}
