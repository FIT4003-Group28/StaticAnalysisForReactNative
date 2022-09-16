package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
/* compiled from: PG */
/* renamed from: arw  reason: default package */
/* loaded from: classes2.dex */
final class arw extends Handler {
    final /* synthetic */ arx a;
    private final aru b;

    public arw(arx arxVar) {
        this.a = arxVar;
        this.b = new aru(arxVar);
    }

    public final void a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                iz.c(data.getBundle("data_root_hints"));
                aru aruVar = this.b;
                String string = data.getString("data_package_name");
                int i = data.getInt("data_calling_pid");
                int i2 = data.getInt("data_calling_uid");
                arv arvVar = new arv(message.replyTo);
                arx arxVar = aruVar.a;
                if (string != null) {
                    for (String str : arxVar.getPackageManager().getPackagesForUid(i2)) {
                        if (str.equals(string)) {
                            aruVar.a.d.a(new arq(aruVar, arvVar, string, i, i2, 1));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
            case 2:
                aru aruVar2 = this.b;
                aruVar2.a.d.a(new arr(aruVar2, new arv(message.replyTo), 1));
                return;
            case 3:
                Bundle bundle = data.getBundle("data_options");
                iz.c(bundle);
                aru aruVar3 = this.b;
                aruVar3.a.d.a(new aro(aruVar3, new arv(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle));
                return;
            case 4:
                aru aruVar4 = this.b;
                aruVar4.a.d.a(new arp(aruVar4, new arv(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token")));
                return;
            case 5:
                aru aruVar5 = this.b;
                String string2 = data.getString("data_media_item_id");
                ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                arv arvVar2 = new arv(message.replyTo);
                if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                    return;
                }
                aruVar5.a.d.a(new ars(aruVar5, arvVar2, string2, resultReceiver, 1));
                return;
            case 6:
                iz.c(data.getBundle("data_root_hints"));
                aru aruVar6 = this.b;
                aruVar6.a.d.a(new arq(aruVar6, new arv(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid")));
                return;
            case 7:
                aru aruVar7 = this.b;
                aruVar7.a.d.a(new arr(aruVar7, new arv(message.replyTo)));
                return;
            case 8:
                iz.c(data.getBundle("data_search_extras"));
                aru aruVar8 = this.b;
                String string3 = data.getString("data_search_query");
                ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                arv arvVar3 = new arv(message.replyTo);
                if (TextUtils.isEmpty(string3) || resultReceiver2 == null) {
                    return;
                }
                aruVar8.a.d.a(new ars(aruVar8, arvVar3, string3, resultReceiver2));
                return;
            case 9:
                Bundle bundle2 = data.getBundle("data_custom_action_extras");
                iz.c(bundle2);
                aru aruVar9 = this.b;
                String string4 = data.getString("data_custom_action");
                ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                arv arvVar4 = new arv(message.replyTo);
                if (TextUtils.isEmpty(string4) || resultReceiver3 == null) {
                    return;
                }
                aruVar9.a.d.a(new art(aruVar9, arvVar4, string4, bundle2, resultReceiver3));
                return;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                return;
        }
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        Bundle data = message.getData();
        data.setClassLoader(hx.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        int callingPid = Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        } else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, j);
    }
}
