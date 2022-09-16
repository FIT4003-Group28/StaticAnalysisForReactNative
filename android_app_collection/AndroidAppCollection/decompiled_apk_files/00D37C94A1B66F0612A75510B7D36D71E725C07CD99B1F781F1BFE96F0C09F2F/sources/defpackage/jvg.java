package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jvg  reason: default package */
/* loaded from: classes3.dex */
public final class jvg extends BroadcastReceiver {
    final /* synthetic */ String a = "com.youtube.mainapp.android";
    final /* synthetic */ jvk b;

    public jvg(jvk jvkVar) {
        this.b = jvkVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            jvk jvkVar = this.b;
            jvkVar.c(jvkVar.a());
        }
    }
}
