package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.libraries.backup.Backup;
import com.google.android.youtube.R;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: oky  reason: default package */
/* loaded from: classes3.dex */
public final class oky {
    @Backup
    public static final String PIVOT_BAR_ACCOUNT_HINT_SHOWN = "pivot_bar_account_hint_shown";
    @Backup
    public static final String PIVOT_BAR_LIBRARY_HINT_TIMESTAMP = "pivot_bar_library_hint_timestamp";
    @Backup
    public static final String PIVOT_BAR_LIBRARY_TAB_VISITED = "pivot_bar_library_tab_visited";
    @Backup
    public static final String PIVOT_BAR_TAP_COUNT = "pivot_bar_tap_count";

    private oky() {
    }

    public static yvo b(Activity activity, apy apyVar, axnm axnmVar) {
        if (activity instanceof WatchWhileActivity) {
            return new yvo(apyVar.getLifecycle(), axnmVar);
        }
        return new yvo(apyVar.getLifecycle(), oim.a);
    }

    public static MediaRouteButton c(Context context, aadd aaddVar) {
        MediaRouteButton mediaRouteButton = (MediaRouteButton) LayoutInflater.from(context).inflate(R.layout.player_cast_media_route_button, (ViewGroup) null);
        try {
            atdn atdnVar = aaddVar.a().l;
            if (atdnVar == null) {
                atdnVar = atdn.a;
            }
            mediaRouteButton.e(akf.a(context, true != atdnVar.g ? R.drawable.ic_outlined_media_route : R.drawable.ic_outlined_media_route_outline_checked));
        } catch (Resources.NotFoundException | NullPointerException unused) {
        }
        return mediaRouteButton;
    }

    public static Optional a(Context context) {
        for (int i = 0; i < 10; i++) {
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    return Optional.of((Activity) context);
                }
            } else {
                return Optional.empty();
            }
        }
        return Optional.empty();
    }
}
