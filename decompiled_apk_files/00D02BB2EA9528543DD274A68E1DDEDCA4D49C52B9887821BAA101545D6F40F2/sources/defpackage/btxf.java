package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: btxf  reason: default package */
/* loaded from: classes.dex */
final class btxf extends BroadcastReceiver {
    final /* synthetic */ btxg a;

    public btxf(btxg btxgVar) {
        this.a = btxgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        btxg btxgVar = this.a;
        Locale locale = Locale.getDefault();
        synchronized (btxgVar.a.e) {
            if (!btxgVar.a.h.getLanguage().equals(locale.getLanguage()) || !btxgVar.a.h.getCountry().equals(locale.getCountry())) {
                locale.toString();
                btxk btxkVar = btxgVar.a;
                btxkVar.h = locale;
                ((ckcn) btxkVar.b.a().a(ckht.Q)).a();
                btxgVar.a.a(0L, "locale change");
            }
        }
    }
}
