package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agcl  reason: default package */
/* loaded from: classes.dex */
public final class agcl implements agcp {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    private final Executor b;
    private final SharedPreferences c;
    private final yve d;

    public agcl(SharedPreferences sharedPreferences, yve yveVar, Executor executor) {
        executor.getClass();
        this.b = executor;
        this.c = sharedPreferences;
        this.d = yveVar;
    }

    @Override // defpackage.agcp
    public final void a(String str, boolean z) {
        this.c.edit().putBoolean(str, z).apply();
        if (!TextUtils.equals("video_notifications_enabled", str)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: agck
            @Override // java.lang.Runnable
            public final void run() {
                for (agco agcoVar : agcl.this.a) {
                    agcoVar.d();
                }
            }
        };
        if (ylr.e()) {
            runnable.run();
        } else {
            this.b.execute(runnable);
        }
    }

    @Override // defpackage.agcp
    public final void b(agco agcoVar) {
        this.a.add(agcoVar);
    }

    @Override // defpackage.agcp
    public final boolean c(String str, boolean z) {
        return this.c.getBoolean(str, z);
    }

    @Override // defpackage.agcp
    public final int d(String str) {
        awux awuxVar = (awux) this.d.c();
        String concat = str.length() != 0 ? "com.google.android.libraries.youtube.notification.badgecount.badgecount".concat(str) : new String("com.google.android.libraries.youtube.notification.badgecount.badgecount");
        concat.getClass();
        aoqp aoqpVar = awuxVar.l;
        if (aoqpVar.containsKey(concat)) {
            return ((Integer) aoqpVar.get(concat)).intValue();
        }
        return 0;
    }

    @Override // defpackage.agcp
    public final long e() {
        return ((awux) this.d.c()).f;
    }

    @Override // defpackage.agcp
    public final ampq f() {
        return (((awux) this.d.c()).b & 64) != 0 ? ampq.j(Boolean.valueOf(((awux) this.d.c()).i)) : amon.a;
    }

    @Override // defpackage.agcp
    public final ampq g(String str) {
        awux awuxVar = (awux) this.d.c();
        Map unmodifiableMap = Collections.unmodifiableMap(awuxVar.m);
        String valueOf = String.valueOf(str);
        if (unmodifiableMap.containsKey(valueOf.length() != 0 ? "com.google.android.libraries.youtube.notification.pref.notification_channel_importance".concat(valueOf) : new String("com.google.android.libraries.youtube.notification.pref.notification_channel_importance"))) {
            String valueOf2 = String.valueOf(str);
            String concat = valueOf2.length() != 0 ? "com.google.android.libraries.youtube.notification.pref.notification_channel_importance".concat(valueOf2) : new String("com.google.android.libraries.youtube.notification.pref.notification_channel_importance");
            concat.getClass();
            aoqp aoqpVar = awuxVar.m;
            boolean z = false;
            int intValue = aoqpVar.containsKey(concat) ? ((Integer) aoqpVar.get(concat)).intValue() : 0;
            String valueOf3 = String.valueOf(str);
            String concat2 = valueOf3.length() != 0 ? "com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled".concat(valueOf3) : new String("com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled");
            concat2.getClass();
            aoqp aoqpVar2 = awuxVar.n;
            if (aoqpVar2.containsKey(concat2)) {
                z = ((Boolean) aoqpVar2.get(concat2)).booleanValue();
            }
            return ampq.j(new agcn(intValue, z));
        }
        return amon.a;
    }

    @Override // defpackage.agcp
    public final ampq h() {
        return (((awux) this.d.c()).b & 16) != 0 ? ampq.j(Boolean.valueOf(((awux) this.d.c()).g)) : amon.a;
    }

    @Override // defpackage.agcp
    public final ampq i() {
        return (((awux) this.d.c()).b & 32) != 0 ? ampq.j(Long.valueOf(((awux) this.d.c()).h)) : amon.a;
    }

    @Override // defpackage.agcp
    public final ankt j(String str, int i) {
        return this.d.b(new uqi(str, i, 2));
    }

    @Override // defpackage.agcp
    public final ankt k(final agcm agcmVar) {
        return this.d.b(new ampg() { // from class: agcq
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                agcm agcmVar2 = agcm.this;
                aopa mo52toBuilder = ((awux) obj).mo52toBuilder();
                aqmf aqmfVar = agcmVar2.b;
                mo52toBuilder.copyOnWrite();
                awux awuxVar = (awux) mo52toBuilder.instance;
                awuxVar.c = aqmfVar;
                awuxVar.b |= 1;
                long j = agcmVar2.a;
                mo52toBuilder.copyOnWrite();
                awux awuxVar2 = (awux) mo52toBuilder.instance;
                awuxVar2.b |= 2;
                awuxVar2.d = j;
                return (awux) mo52toBuilder.mo39build();
            }
        });
    }

    @Override // defpackage.agcp
    public final ankt l(String str) {
        return this.d.b(new wdx(str, 18));
    }

    @Override // defpackage.agcp
    public final ankt m(long j) {
        return this.d.b(new fcp(j, 12));
    }

    @Override // defpackage.agcp
    public final ankt n(boolean z) {
        return this.d.b(new agcs(z, 1));
    }

    @Override // defpackage.agcp
    public final ankt o(final String str, final agcn agcnVar) {
        return this.d.b(new ampg() { // from class: agcr
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                String str2 = str;
                agcn agcnVar2 = agcnVar;
                aopa mo52toBuilder = ((awux) obj).mo52toBuilder();
                String valueOf = String.valueOf(str2);
                mo52toBuilder.bt(valueOf.length() != 0 ? "com.google.android.libraries.youtube.notification.pref.notification_channel_importance".concat(valueOf) : new String("com.google.android.libraries.youtube.notification.pref.notification_channel_importance"), agcnVar2.a);
                String valueOf2 = String.valueOf(str2);
                mo52toBuilder.bu(valueOf2.length() != 0 ? "com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled".concat(valueOf2) : new String("com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled"), agcnVar2.b);
                return (awux) mo52toBuilder.mo39build();
            }
        });
    }

    @Override // defpackage.agcp
    public final ankt p(boolean z) {
        return this.d.b(new agcs(z));
    }

    @Override // defpackage.agcp
    public final ankt q(long j) {
        return this.d.b(new fcp(j, 13));
    }

    @Override // defpackage.agcp
    public final ankt r(boolean z) {
        return this.d.b(new agcs(z, 2));
    }

    @Override // defpackage.agcp
    public final String s() {
        return ((awux) this.d.c()).e;
    }

    @Override // defpackage.agcp
    public final boolean t() {
        return ((awux) this.d.c()).k;
    }
}
