package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
/* compiled from: PG */
/* renamed from: ahun  reason: default package */
/* loaded from: classes.dex */
public final class ahun implements afzn {
    final /* synthetic */ CreatorEndscreenOverlayPresenter a;

    public ahun(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter) {
        this.a = creatorEndscreenOverlayPresenter;
    }

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        if ("CPN".equals(str)) {
            String str2 = this.a.n;
            return str2 == null ? "" : str2;
        } else if ("AD_CPN".equals(str)) {
            String str3 = this.a.o;
            return str3 == null ? "" : str3;
        } else if (!"MT".equals(str)) {
            return null;
        } else {
            ajbf ajbfVar = this.a.m;
            if (ajbfVar == null) {
                return "";
            }
            long b = ajbfVar.b();
            StringBuilder sb = new StringBuilder(20);
            sb.append(b / 1000);
            return sb.toString();
        }
    }

    @Override // defpackage.afzn
    public final String b() {
        return "CreatorEndscreenMacroSubstitutor";
    }
}
