package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
/* compiled from: PG */
/* renamed from: adgs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adgs implements View.OnClickListener {
    public final /* synthetic */ adgw a;
    private final /* synthetic */ int b;

    public /* synthetic */ adgs(adgw adgwVar, int i) {
        this.b = i;
        this.a = adgwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            adgw adgwVar = this.a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://support.google.com/youtube/answer/7640706?hl=%@"));
            adgwVar.l.startActivity(intent);
            return;
        }
        adgw adgwVar2 = this.a;
        adgwVar2.l.startActivity(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.cast.settings.CastSettingsActivity").putExtra("ACTIVITY_TYPE", "CastSettings"));
    }
}
