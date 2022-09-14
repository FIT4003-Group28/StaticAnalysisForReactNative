package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqay  reason: default package */
/* loaded from: classes5.dex */
public final class cqay<T> {
    public final Context d;
    public final String c = "android.intent.action.TIME_TICK";
    public final Set<T> a = dcnm.c();
    public final BroadcastReceiver b = new cqax(this);

    public cqay(Context context) {
        this.d = context;
    }
}
