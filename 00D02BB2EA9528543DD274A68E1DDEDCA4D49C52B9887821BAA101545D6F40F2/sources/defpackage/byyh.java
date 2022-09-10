package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: byyh  reason: default package */
/* loaded from: classes4.dex */
public final class byyh {
    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static String a(List<dpce> list) {
        for (dpce dpceVar : list) {
            if ((dpceVar.a & 2) != 0) {
                doul doulVar = dpceVar.c;
                if (doulVar == null) {
                    doulVar = doul.f;
                }
                return doulVar.b;
            }
        }
        return null;
    }

    public static String b(Context context, String str, long j, long j2) {
        return j > 0 ? context.getResources().getString(R.string.SMARTSPACE_SUBTITLE_ONE_DEPARTURE, str, bvtb.i(context, j2)) : context.getResources().getString(R.string.SMARTSPACE_SUBTITLE_NOW, str);
    }
}
