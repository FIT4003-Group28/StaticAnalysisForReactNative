package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ij  reason: default package */
/* loaded from: classes3.dex */
public final class ij extends Handler {
    boolean a;
    final /* synthetic */ ik b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(ik ikVar, Looper looper) {
        super(looper);
        this.b = ikVar;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (!this.a) {
            return;
        }
        switch (message.what) {
            case 1:
                iz.c(message.getData());
                String str = (String) message.obj;
                return;
            case 2:
                this.b.b((PlaybackStateCompat) message.obj);
                return;
            case 3:
                this.b.a((MediaMetadataCompat) message.obj);
                return;
            case 4:
                hx hxVar = (hx) message.obj;
                return;
            case 5:
                List list = (List) message.obj;
                return;
            case 6:
                CharSequence charSequence = (CharSequence) message.obj;
                return;
            case 7:
                iz.c((Bundle) message.obj);
                return;
            case 8:
                this.b.c();
                return;
            case 9:
                ((Integer) message.obj).intValue();
                return;
            case 10:
            default:
                return;
            case 11:
                ((Boolean) message.obj).booleanValue();
                return;
            case 12:
                ((Integer) message.obj).intValue();
                return;
        }
    }
}
