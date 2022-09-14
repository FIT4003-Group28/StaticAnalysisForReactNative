package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cnmj  reason: default package */
/* loaded from: classes5.dex */
final class cnmj extends cojb {
    final /* synthetic */ cnmk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnmj(cnmk cnmkVar, Looper looper) {
        super(looper);
        this.a = cnmkVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        cnmk cnmkVar = this.a;
        if (message == null || !(message.obj instanceof Intent)) {
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new cnlm());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof CloudMessagingMessengerCompat) {
                cnmkVar.f = (CloudMessagingMessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                cnmkVar.e = (Messenger) parcelableExtra;
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
                sb.toString();
                return;
            } else if (stringExtra2.startsWith("|")) {
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !"ID".equals(split[1])) {
                    if (stringExtra2.length() != 0) {
                        return;
                    }
                    new String("Unexpected structured response ");
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                cnmkVar.a(str, intent2.putExtra("error", str2).getExtras());
                return;
            } else {
                synchronized (cnmkVar.b) {
                    int i = 0;
                    while (true) {
                        aim<String, cpct<Bundle>> aimVar = cnmkVar.b;
                        if (i < aimVar.j) {
                            cnmkVar.a(aimVar.i(i), intent2.getExtras());
                            i++;
                        }
                    }
                }
                return;
            }
        }
        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
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
        cnmkVar.a(group, extras);
    }
}
