package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cloudmessaging.CloudMessage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cnlo  reason: default package */
/* loaded from: classes5.dex */
public abstract class cnlo extends BroadcastReceiver {
    private final ExecutorService a;

    public cnlo() {
        coiz coizVar = coja.a;
        this.a = coiz.b(new cnxx("firebase-iid-executor"));
    }

    protected abstract int a(Context context, CloudMessage cloudMessage);

    protected void b(Context context, Bundle bundle) {
        throw null;
    }

    protected void c(Context context, Bundle bundle) {
        throw null;
    }

    public final int d(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            b(context, extras);
            return -1;
        } else if (!"com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            return 500;
        } else {
            c(context, extras);
            return -1;
        }
    }

    public final int e(Context context, Intent intent) {
        cpcq b;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            b = cpda.a(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            cnmb a = cnmb.a(context);
            b = a.b(new cnlx(a.c(), bundle));
        }
        int a2 = a(context, new CloudMessage(intent));
        try {
            cpda.e(b, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            sb.toString();
        }
        return a2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.a.execute(new Runnable(this, intent, context, isOrderedBroadcast, goAsync) { // from class: cnln
            private final cnlo a;
            private final Intent b;
            private final Context c;
            private final boolean d;
            private final BroadcastReceiver.PendingResult e;

            {
                this.a = this;
                this.b = intent;
                this.c = context;
                this.d = isOrderedBroadcast;
                this.e = goAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int e;
                cnlo cnloVar = this.a;
                Intent intent2 = this.b;
                Context context2 = this.c;
                boolean z = this.d;
                BroadcastReceiver.PendingResult pendingResult = this.e;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent3 != null) {
                        e = cnloVar.d(context2, intent3);
                    } else {
                        e = cnloVar.e(context2, intent2);
                    }
                    if (z) {
                        pendingResult.setResultCode(e);
                    }
                } finally {
                    pendingResult.finish();
                }
            }
        });
    }
}
