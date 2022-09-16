package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arqt  reason: default package */
/* loaded from: classes2.dex */
public final class arqt implements dbty<dcdn<arun, ResolveInfo>> {
    final /* synthetic */ arqu a;

    public arqt(arqu arquVar) {
        this.a = arquVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ dcdn<arun, ResolveInfo> a() {
        dcdg dcdgVar = new dcdg();
        if (this.a.s()) {
            btvo btvoVar = this.a.c;
            dccx F = dcdc.F();
            if (btvoVar.getNavigationParameters().K().a) {
                F.g(arum.a("com.google.android.music", arwz.SKIP_NEXT_PREVIOUS, R.color.nav_media_google_play_music_app_color, R.color.nav_media_google_play_music_app_touch_color));
            }
            if (btvoVar.getNavigationParameters().K().c) {
                F.g(arum.a("com.google.android.apps.youtube.music", arwz.SKIP_NEXT_PREVIOUS, R.color.nav_media_youtube_music_app_color, R.color.nav_media_youtube_music_app_touchcolor));
            }
            Iterator<dkoq> it = btvoVar.getMediaIntegrationParameters().a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dkoq next = it.next();
                if ("com.pandora.android".equals(next.b)) {
                    if (next.a) {
                        F.g(arum.a("com.pandora.android", arwz.SKIP_NEXT_PREVIOUS, R.color.nav_media_pandora_app_color, R.color.nav_media_pandora_app_touchcolor));
                    }
                }
            }
            dcdc f = F.f();
            boolean m = this.a.b.m(bvjk.jj, false);
            if (!f.isEmpty() || m) {
                for (ResolveInfo resolveInfo : this.a.a.getPackageManager().queryIntentServices(new Intent("android.media.browse.MediaBrowserService"), 0)) {
                    int size = f.size();
                    boolean z = false;
                    for (int i = 0; i < size; i++) {
                        arun arunVar = (arun) f.get(i);
                        if (arunVar.a().equals(resolveInfo.serviceInfo.packageName)) {
                            dcdgVar.f(arunVar, resolveInfo);
                            z = true;
                        }
                    }
                    if (!z && m && !resolveInfo.serviceInfo.packageName.equals(this.a.p())) {
                        dcdgVar.f(arum.a(resolveInfo.serviceInfo.packageName, arwz.SKIP_NEXT_PREVIOUS, R.color.nav_media_default_app_color, R.color.nav_media_default_app_touch_color), resolveInfo);
                    }
                }
            }
        }
        return dcdgVar.b();
    }
}
