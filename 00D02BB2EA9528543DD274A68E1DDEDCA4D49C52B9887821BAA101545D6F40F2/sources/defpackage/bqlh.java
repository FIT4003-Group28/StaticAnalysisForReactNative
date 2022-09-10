package defpackage;

import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: bqlh  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqlh {
    public static bqlh c() {
        return new bqjd(bqlg.UNDETERMINED, dcdc.e());
    }

    public static bqlh d(List<bbtm> list) {
        return new bqjd(list.isEmpty() ? bqlg.NONE_SUGGESTED : bqlg.SUGGESTED, dcdc.r(list));
    }

    public abstract bqlg a();

    public abstract dcdc<bbtm> b();

    public final void e(Bundle bundle) {
        bundle.putSerializable("suggestedPhotosPhotos", dchl.c(b()));
        bundle.putSerializable("suggestedPhotosStatus", a());
    }
}
