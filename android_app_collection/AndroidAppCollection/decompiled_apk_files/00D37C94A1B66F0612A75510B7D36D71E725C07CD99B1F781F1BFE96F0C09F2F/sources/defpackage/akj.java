package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akj  reason: default package */
/* loaded from: classes.dex */
public final class akj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, ald[] aldVarArr) {
        return hc.b(context, cancellationSignal, aldVarArr, 0);
    }
}
