package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;
/* compiled from: PG */
/* renamed from: lz  reason: default package */
/* loaded from: classes7.dex */
final class lz extends Handler {
    boolean a;
    final /* synthetic */ mb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz(mb mbVar, Looper looper) {
        super(looper);
        this.b = mbVar;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (!this.a) {
            return;
        }
        switch (message.what) {
            case 1:
                mm.a(message.getData());
                String str = (String) message.obj;
                return;
            case 2:
                this.b.a((PlaybackStateCompat) message.obj);
                return;
            case 3:
                this.b.b((MediaMetadataCompat) message.obj);
                return;
            case 4:
                mf mfVar = (mf) message.obj;
                return;
            case 5:
                List list = (List) message.obj;
                return;
            case 6:
                CharSequence charSequence = (CharSequence) message.obj;
                return;
            case 7:
                mm.a((Bundle) message.obj);
                return;
            case 8:
            case 10:
            default:
                return;
            case 9:
                Integer num = (Integer) message.obj;
                return;
            case 11:
                ((Boolean) message.obj).booleanValue();
                return;
            case 12:
                Integer num2 = (Integer) message.obj;
                return;
        }
    }
}
