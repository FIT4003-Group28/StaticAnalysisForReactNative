package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.i;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p0 {

    /* renamed from: h  reason: collision with root package name */
    private static int f9261h;
    private static PendingIntent i;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9263b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f9264c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f9265d;

    /* renamed from: f  reason: collision with root package name */
    private Messenger f9267f;

    /* renamed from: g  reason: collision with root package name */
    private i f9268g;

    /* renamed from: a  reason: collision with root package name */
    private final a.e.g<String, c.e.a.b.g.i<Bundle>> f9262a = new a.e.g<>();

    /* renamed from: e  reason: collision with root package name */
    private Messenger f9266e = new Messenger(new a(Looper.getMainLooper()));

    /* loaded from: classes.dex */
    class a extends c.e.a.b.d.d.e {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            p0.this.a(message);
        }
    }

    public p0(Context context, f0 f0Var) {
        this.f9263b = context;
        this.f9264c = f0Var;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f9265d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Bundle a(c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            return (Bundle) hVar.b();
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(hVar.a());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public static synchronized String a() {
        String num;
        synchronized (p0.class) {
            int i2 = f9261h;
            f9261h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    public static synchronized void a(Context context, Intent intent) {
        synchronized (p0.class) {
            if (i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", i);
        }
    }

    private void a(Bundle bundle, String str) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f9264c.d() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        a(this.f9263b, intent);
        a(intent, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new i.b());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof i) {
                        this.f9268g = (i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f9267f = (Messenger) parcelableExtra;
                    }
                }
                b((Intent) message.obj);
                return;
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void a(c.e.a.b.g.i iVar) {
        if (iVar.b((Exception) new IOException("TIMEOUT"))) {
            Log.w("FirebaseInstanceId", "No response");
        }
    }

    private void a(String str, Bundle bundle) {
        synchronized (this.f9262a) {
            c.e.a.b.g.i<Bundle> remove = this.f9262a.remove(str);
            if (remove != null) {
                remove.a((c.e.a.b.g.i<Bundle>) bundle);
                return;
            }
            String valueOf = String.valueOf(str);
            Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
        }
    }

    private void b(Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            if (!Log.isLoggable("FirebaseInstanceId", 3)) {
                return;
            }
            String valueOf = String.valueOf(action);
            Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
            return;
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        if (stringExtra == null) {
            a(intent);
            return;
        }
        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
        if (!matcher.matches()) {
            if (!Log.isLoggable("FirebaseInstanceId", 3)) {
                return;
            }
            String valueOf2 = String.valueOf(stringExtra);
            Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Unexpected response string: ".concat(valueOf2) : new String("Unexpected response string: "));
            return;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        Bundle extras = intent.getExtras();
        extras.putString("registration_id", group2);
        a(group, extras);
    }

    private static boolean b(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ c.e.a.b.g.h c(Bundle bundle) {
        return b(bundle) ? c.e.a.b.g.k.a((Object) null) : c.e.a.b.g.k.a(bundle);
    }

    private c.e.a.b.g.h<Bundle> d(Bundle bundle) {
        final String a2 = a();
        final c.e.a.b.g.i<Bundle> iVar = new c.e.a.b.g.i<>();
        synchronized (this.f9262a) {
            this.f9262a.put(a2, iVar);
        }
        a(bundle, a2);
        final ScheduledFuture<?> schedule = this.f9265d.schedule(new Runnable(iVar) { // from class: com.google.firebase.iid.m0

            /* renamed from: b  reason: collision with root package name */
            private final c.e.a.b.g.i f9247b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9247b = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p0.a(this.f9247b);
            }
        }, 30L, TimeUnit.SECONDS);
        iVar.a().a(h.a(), new c.e.a.b.g.c(this, a2, schedule) { // from class: com.google.firebase.iid.n0

            /* renamed from: a  reason: collision with root package name */
            private final p0 f9252a;

            /* renamed from: b  reason: collision with root package name */
            private final String f9253b;

            /* renamed from: c  reason: collision with root package name */
            private final ScheduledFuture f9254c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9252a = this;
                this.f9253b = a2;
                this.f9254c = schedule;
            }

            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                this.f9252a.a(this.f9253b, this.f9254c, hVar);
            }
        });
        return iVar.a();
    }

    private c.e.a.b.g.h<Bundle> e(final Bundle bundle) {
        return !this.f9264c.e() ? c.e.a.b.g.k.a((Exception) new IOException("MISSING_INSTANCEID_SERVICE")) : d(bundle).b(h.a(), new c.e.a.b.g.a(this, bundle) { // from class: com.google.firebase.iid.l0

            /* renamed from: a  reason: collision with root package name */
            private final p0 f9244a;

            /* renamed from: b  reason: collision with root package name */
            private final Bundle f9245b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9244a = this;
                this.f9245b = bundle;
            }

            @Override // c.e.a.b.g.a
            public final Object a(c.e.a.b.g.h hVar) {
                return this.f9244a.a(this.f9245b, hVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Bundle> a(Bundle bundle) {
        return this.f9264c.c() >= 12000000 ? y.a(this.f9263b).b(1, bundle).a(h.a(), k0.f9242a) : e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ c.e.a.b.g.h a(Bundle bundle, c.e.a.b.g.h hVar) {
        return (hVar.e() && b((Bundle) hVar.b())) ? d(bundle).a(h.a(), o0.f9259a) : hVar;
    }

    void a(Intent intent) {
        String stringExtra = intent.getStringExtra("error");
        if (stringExtra == null) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Unexpected response, no error or registration id ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(stringExtra);
            Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
        }
        if (!stringExtra.startsWith("|")) {
            synchronized (this.f9262a) {
                for (int i2 = 0; i2 < this.f9262a.size(); i2++) {
                    a(this.f9262a.b(i2), intent.getExtras());
                }
            }
            return;
        }
        String[] split = stringExtra.split("\\|");
        if (split.length <= 2 || !"ID".equals(split[1])) {
            String valueOf3 = String.valueOf(stringExtra);
            Log.w("FirebaseInstanceId", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
            return;
        }
        String str = split[2];
        String str2 = split[3];
        if (str2.startsWith(":")) {
            str2 = str2.substring(1);
        }
        a(str, intent.putExtra("error", str2).getExtras());
    }

    protected void a(Intent intent, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
        sb.append("|ID|");
        sb.append(str);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f9266e);
        if (this.f9267f != null || this.f9268g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                if (this.f9267f != null) {
                    this.f9267f.send(obtain);
                    return;
                } else {
                    this.f9268g.a(obtain);
                    return;
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Messenger failed, fallback to startService");
                }
            }
        }
        if (this.f9264c.d() == 2) {
            this.f9263b.sendBroadcast(intent);
        } else {
            this.f9263b.startService(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, ScheduledFuture scheduledFuture, c.e.a.b.g.h hVar) {
        synchronized (this.f9262a) {
            this.f9262a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
