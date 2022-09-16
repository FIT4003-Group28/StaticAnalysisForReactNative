package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.util.regex.Matcher;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qrk  reason: default package */
/* loaded from: classes4.dex */
public final class qrk extends rfm {
    final /* synthetic */ qrl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrk(qrl qrlVar, Looper looper) {
        super(looper);
        this.a = qrlVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        qrl qrlVar = this.a;
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("Rpc", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new qqr());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof CloudMessagingMessengerCompat) {
                qrlVar.e = (CloudMessagingMessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                qrlVar.d = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(intent2.getAction())) {
            return;
        }
        String stringExtra = intent2.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent2.getStringExtra("unregistered");
        }
        if (stringExtra == null) {
            String stringExtra2 = intent2.getStringExtra("error");
            if (stringExtra2 == null) {
                String valueOf = String.valueOf(intent2.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Unexpected response, no error or registration id ");
                sb.append(valueOf);
                Log.w("Rpc", sb.toString());
                return;
            } else if (stringExtra2.startsWith("|")) {
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !"ID".equals(split[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                qrlVar.c(str, intent2.putExtra("error", str2).getExtras());
                return;
            } else {
                synchronized (qrlVar.c) {
                    int i = 0;
                    while (true) {
                        agd agdVar = qrlVar.c;
                        if (i < agdVar.j) {
                            qrlVar.c((String) agdVar.f(i), intent2.getExtras());
                            i++;
                        }
                    }
                }
                return;
            }
        }
        Matcher matcher = qrl.b.matcher(stringExtra);
        if (!matcher.matches()) {
            return;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        if (group == null) {
            return;
        }
        Bundle extras = intent2.getExtras();
        extras.putString("registration_id", group2);
        qrlVar.c(group, extras);
    }
}
