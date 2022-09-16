package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: lb  reason: default package */
/* loaded from: classes7.dex */
final class lb extends Handler {
    private final WeakReference<lj> a;
    private WeakReference<Messenger> b;

    public lb(lj ljVar) {
        this.a = new WeakReference<>(ljVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Messenger messenger) {
        this.b = new WeakReference<>(messenger);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference<Messenger> weakReference = this.b;
        if (weakReference == null || weakReference.get() == null || this.a.get() == null) {
            return;
        }
        Bundle data = message.getData();
        mm.a(data);
        lj ljVar = this.a.get();
        Messenger messenger = this.b.get();
        try {
            int i = message.what;
            if (i == 1) {
                mm.a(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) data.getParcelable("data_media_session_token");
                ljVar.j();
            } else if (i == 2) {
                ljVar.h();
            } else if (i == 3) {
                Bundle bundle = data.getBundle("data_options");
                mm.a(bundle);
                mm.a(data.getBundle("data_notify_children_changed_options"));
                ljVar.i(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle);
            } else {
                String str = "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1;
            }
        } catch (BadParcelableException unused) {
            if (message.what != 1) {
                return;
            }
            ljVar.h();
        }
    }
}
