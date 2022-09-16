package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.libraries.youtube.player.ui.mediasession.MediaButtonIntentReceiverProvider$DefaultMediaButtonIntentReceiver;
/* compiled from: PG */
/* renamed from: ajab  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajab implements azqb {
    public final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajab(Context context) {
        this.a = context;
    }

    public /* synthetic */ ajab(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.azqb
    public final Object get() {
        if (this.b == 0) {
            Context context = this.a;
            return new iz(context, "YouTube playerlib", new ComponentName(context.getPackageName(), MediaButtonIntentReceiverProvider$DefaultMediaButtonIntentReceiver.class.getName()), null);
        }
        return this.a.getSharedPreferences("DelayedEventMetricsStore.prefs", 0);
    }
}
