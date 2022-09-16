package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.mdx.background.MdxBackgroundScanBootReceiver;
/* compiled from: PG */
/* renamed from: acxf  reason: default package */
/* loaded from: classes.dex */
public class acxf extends BroadcastReceiver {
    private volatile boolean a = false;
    private final Object b = new Object();

    public final void a(Context context) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((acxp) awwc.q(context)).ir((MdxBackgroundScanBootReceiver) this);
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
