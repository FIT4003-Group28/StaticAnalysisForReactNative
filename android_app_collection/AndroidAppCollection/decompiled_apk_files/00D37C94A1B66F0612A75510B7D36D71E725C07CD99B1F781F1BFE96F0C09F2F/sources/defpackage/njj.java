package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: njj  reason: default package */
/* loaded from: classes3.dex */
public final class njj extends njf {
    public final awan a;
    public boolean b;

    private njj(Context context, int i, int i2, awan awanVar) {
        super(context, context.getString(i));
        this.h = context.getString(i2);
        this.a = awanVar;
    }

    public static actj c(awan awanVar) {
        awan awanVar2 = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
        int ordinal = awanVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return actj.VIDEO_QUALITY_QUICK_MENU_DATA_SAVER;
            }
            if (ordinal == 3) {
                zep.n("Invalid VE ADVANCED_MENU, using AUTO_QUALITY as placeholder", new Exception());
            }
            return actj.VIDEO_QUALITY_QUICK_MENU_AUTO_QUALITY;
        }
        return actj.VIDEO_QUALITY_QUICK_MENU_HIGHER_QUALITY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static njj[] d(Context context, awan awanVar, boolean z) {
        njj njjVar = new njj(context, R.string.persistent_video_quality_auto_label, R.string.persistent_video_quality_auto_description, awan.VIDEO_QUALITY_SETTING_UNKNOWN);
        njj njjVar2 = new njj(context, R.string.persistent_video_quality_high_label, R.string.persistent_video_quality_high_description, awan.VIDEO_QUALITY_SETTING_HIGHER_QUALITY);
        njj njjVar3 = new njj(context, R.string.persistent_video_quality_low_label, R.string.persistent_video_quality_low_description, awan.VIDEO_QUALITY_SETTING_DATA_SAVER);
        njj njjVar4 = new njj(context, R.string.video_quality_quick_menu_advanced_menu_label, R.string.video_quality_quick_menu_advanced_menu_description, awan.VIDEO_QUALITY_SETTING_ADVANCED_MENU);
        int ordinal = awanVar.ordinal();
        if (ordinal == 0) {
            njjVar.a(true);
        } else if (ordinal == 1) {
            njjVar2.a(true);
        } else if (ordinal == 2) {
            njjVar3.a(true);
        } else if (ordinal == 3) {
            njjVar4.a(true);
        }
        return z ? new njj[]{njjVar, njjVar2, njjVar3} : new njj[]{njjVar, njjVar2, njjVar3, njjVar4};
    }

    @Override // defpackage.akaw, defpackage.vez, defpackage.vex
    public final int b() {
        return R.layout.bottom_sheet_list_secondary_text_checkmark_item;
    }
}
