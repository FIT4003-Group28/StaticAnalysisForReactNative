package defpackage;

import android.app.Activity;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abwh  reason: default package */
/* loaded from: classes.dex */
public final class abwh implements aafl {
    private final Activity a;

    public abwh(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.a.finish();
    }
}
