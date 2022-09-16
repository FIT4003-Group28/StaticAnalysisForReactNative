package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iiv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iiv implements ayqe {
    public final /* synthetic */ Activity a;
    private final /* synthetic */ int b;

    public /* synthetic */ iiv(Activity activity, int i) {
        this.b = i;
        this.a = activity;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        if (this.b == 0) {
            Activity activity = this.a;
            float f = 0.0f;
            if (!((Boolean) obj).booleanValue()) {
                TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(R.style.CompatElevationZ4, new int[]{16843840});
                if (obtainStyledAttributes != null) {
                    f = obtainStyledAttributes.getDimension(0, 4.0f);
                }
                obtainStyledAttributes.recycle();
                f = zew.g(activity.getResources().getDisplayMetrics(), f);
            }
            return Float.valueOf(f);
        }
        return this.a.createConfigurationContext((Configuration) obj);
    }
}
