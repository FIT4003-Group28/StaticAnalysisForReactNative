package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.filament.R;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;
/* compiled from: PG */
/* renamed from: cphg  reason: default package */
/* loaded from: classes5.dex */
public class cphg extends Service implements cpgo, cpgg {
    private ComponentName a;
    private IBinder b;
    public cpgu c;
    public Intent d;
    public boolean f;
    private Looper h;
    public final Object e = new Object();
    public final cphp g = new cphp(new cpgs());

    @Override // defpackage.cpgo
    public final void RJ(List<NodeParcelable> list) {
    }

    public void a(cpgk cpgkVar) {
        throw null;
    }

    public void b(MessageEventParcelable messageEventParcelable) {
        throw null;
    }

    @Override // defpackage.cpgg
    public final void c(Channel channel) {
    }

    @Override // defpackage.cpgg
    public final void d(Channel channel) {
    }

    @Override // defpackage.cpgg
    public final void e(Channel channel) {
    }

    @Override // defpackage.cpgg
    public final void f(Channel channel) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction())) {
            return this.b;
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = new ComponentName(this, getClass().getName());
        if (this.h == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.h = handlerThread.getLooper();
        }
        this.c = new cpgu(this, this.h);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.a);
        this.b = new cphf(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.e) {
            this.f = true;
            cpgu cpguVar = this.c;
            if (cpguVar != null) {
                cpguVar.getLooper().quit();
                cpguVar.a();
            } else {
                String valueOf = String.valueOf(this.a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_textColorSearchUrl);
                sb.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        super.onDestroy();
    }
}
