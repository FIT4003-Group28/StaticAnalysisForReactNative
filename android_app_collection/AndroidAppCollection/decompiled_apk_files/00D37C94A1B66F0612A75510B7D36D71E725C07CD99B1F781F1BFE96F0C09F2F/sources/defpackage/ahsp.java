package defpackage;

import android.content.Context;
import com.google.vr.sdk.base.HeadsetSelector;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahsp  reason: default package */
/* loaded from: classes.dex */
public final class ahsp {
    public static final /* synthetic */ int a = 0;
    private static final HeadsetSelector.HeadsetInfo b = HeadsetSelector.HeadsetInfo.newInstance("Samsung", "Gear VR", "Samsung Gear VR", false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HeadsetSelector.HeadsetInfo a(Context context, yve yveVar) {
        int a2;
        return (!ahss.b(context) || (a2 = awwc.a(((awvd) yveVar.c()).c)) == 0 || a2 != 3) ? HeadsetSelector.getCurrentHeadsetInfo(context) : b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List b(Context context, yve yveVar) {
        List recentHeadsetInfos = HeadsetSelector.getRecentHeadsetInfos(context);
        if (ahss.b(context)) {
            HeadsetSelector.HeadsetInfo headsetInfo = b;
            if (headsetInfo.equals(a(context, yveVar))) {
                recentHeadsetInfos.add(0, headsetInfo);
            } else {
                recentHeadsetInfos.add(headsetInfo);
            }
        }
        return recentHeadsetInfos;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(HeadsetSelector.HeadsetInfo headsetInfo) {
        if (headsetInfo == null) {
            return 0;
        }
        if (b.equals(headsetInfo)) {
            return 3;
        }
        return headsetInfo.isCardboardViewer() ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Context context, yve yveVar, HeadsetSelector.HeadsetInfo headsetInfo) {
        if (!ahss.b(context) || !b.equals(headsetInfo)) {
            ylx.m(yveVar.b(ahja.d), afsc.r);
            HeadsetSelector.selectHeadset(context, headsetInfo);
            return;
        }
        ylx.m(yveVar.b(ahja.c), afsc.q);
    }
}
