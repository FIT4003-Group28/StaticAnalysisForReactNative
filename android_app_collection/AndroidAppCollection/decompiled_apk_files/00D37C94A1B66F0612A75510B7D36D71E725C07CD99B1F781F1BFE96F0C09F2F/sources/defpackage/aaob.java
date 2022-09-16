package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.player.LoggingUrlModel;
/* compiled from: PG */
/* renamed from: aaob  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aaob implements amqo {
    public final /* synthetic */ LoggingUrlModel a;
    private final /* synthetic */ int b;

    public /* synthetic */ aaob(LoggingUrlModel loggingUrlModel, int i) {
        this.b = i;
        this.a = loggingUrlModel;
    }

    @Override // defpackage.amqo
    public final Object get() {
        if (this.b == 0) {
            return Uri.parse(this.a.a);
        }
        return Uri.parse(this.a.a);
    }
}
