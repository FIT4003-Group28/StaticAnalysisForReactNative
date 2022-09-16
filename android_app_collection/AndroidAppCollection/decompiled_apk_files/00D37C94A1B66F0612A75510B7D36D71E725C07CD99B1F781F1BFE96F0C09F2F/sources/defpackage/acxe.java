package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.mdx.background.MdxBackgroundPlaybackBroadcastReceiver;
/* compiled from: PG */
/* renamed from: acxe  reason: default package */
/* loaded from: classes.dex */
public class acxe extends BroadcastReceiver {
    private volatile boolean a = false;
    private final Object b = new Object();

    public final void a(Context context) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((acxg) awwc.q(context)).iq((MdxBackgroundPlaybackBroadcastReceiver) this);
                    this.a = true;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
    }
}
