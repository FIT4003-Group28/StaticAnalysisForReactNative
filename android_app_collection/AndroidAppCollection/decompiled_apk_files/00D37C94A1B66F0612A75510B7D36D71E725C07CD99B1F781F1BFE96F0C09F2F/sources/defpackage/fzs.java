package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.youtube.R;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: fzs  reason: default package */
/* loaded from: classes3.dex */
public final class fzs implements ajxz {
    private final EnumMap a = new EnumMap(arhr.class);
    private final EnumMap b = new EnumMap(arhr.class);
    private final Context c;
    private final ajxz d;

    public fzs(Context context, ajxz ajxzVar) {
        this.c = context;
        this.d = ajxzVar;
        b(arhr.DOWNLOADS_PAGE_EMPTY, R.attr.downloadsPageEmptyIcon, 2131231399);
        b(arhr.YOUTUBE_RED_ORIGINALS_BUTTON_RED, R.attr.youTubeOriginalsButtonIcon, 2131233195);
        b(arhr.CREATE_LIVE_STREAM, R.attr.createLiveIcon, 2131231958);
        b(arhr.CREATE_POST, R.attr.createPostIcon, 2131231960);
        b(arhr.CREATE_REEL_ITEM, R.attr.createReelIcon, 2131231962);
        b(arhr.CREATE_VIDEO, R.attr.createVodIcon, 2131231964);
        b(arhr.SHOW_MORE, R.attr.expandButtonIcon, 2131230989);
        b(arhr.REELS_ADD, R.attr.reelsAddIcon, 2131231968);
        b(arhr.STORIES_ADD_BADGE, R.attr.reelsAddIcon, 2131231968);
        b(arhr.LOGGED_OUT_LIBRARY, R.attr.loggedOutLibrary, 2131231519);
        b(arhr.LOGGED_OUT_SUBS, R.attr.loggedOutSubs, 2131231521);
        b(arhr.WATCH_HISTORY_PAUSED, R.attr.watchHistoryPausedIcon, 2131231943);
        b(arhr.PREMIUM, R.attr.youtubePremiumBadge, 2131233199);
    }

    private final void b(arhr arhrVar, int i, int i2) {
        this.a.put((EnumMap) arhrVar, (arhr) Integer.valueOf(i));
        this.b.put((EnumMap) arhrVar, (arhr) Integer.valueOf(i2));
    }

    @Override // defpackage.ajxz
    public final int a(arhr arhrVar) {
        if (this.a.containsKey(arhrVar)) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.c.getTheme();
            if (theme == null || !theme.resolveAttribute(((Integer) this.a.get(arhrVar)).intValue(), typedValue, true)) {
                return ((Integer) this.b.get(arhrVar)).intValue();
            }
            return typedValue.resourceId;
        }
        return this.d.a(arhrVar);
    }
}
