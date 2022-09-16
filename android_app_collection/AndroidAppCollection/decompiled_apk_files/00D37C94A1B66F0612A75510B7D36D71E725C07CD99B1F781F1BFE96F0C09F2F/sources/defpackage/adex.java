package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.mediarouter.media.MediaTransferReceiver;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adex  reason: default package */
/* loaded from: classes.dex */
public final class adex {
    private final Context a;
    private final acwu b;
    private final Executor c;
    private boolean d = false;
    private boolean e = false;

    static {
        zep.a("MDX.MediaTransferEnabler");
    }

    public adex(Context context, acwu acwuVar, Executor executor) {
        this.a = context;
        this.b = acwuVar;
        this.c = executor;
    }

    public final void a() {
        if (!this.d) {
            boolean z = false;
            boolean z2 = this.a.getPackageManager().getComponentEnabledSetting(new ComponentName(this.a, MediaTransferReceiver.class)) == 1;
            boolean z3 = this.b.D;
            if (z2 || z3) {
                z = true;
            }
            this.e = z;
            Context context = this.a;
            Executor executor = this.c;
            int i = true != z3 ? 2 : 1;
            executor.getClass();
            executor.execute(new zfk(context.getApplicationContext(), MediaTransferReceiver.class, i));
            this.d = true;
        }
    }

    public final boolean b() {
        if (!this.d) {
            a();
        }
        return this.e;
    }
}
