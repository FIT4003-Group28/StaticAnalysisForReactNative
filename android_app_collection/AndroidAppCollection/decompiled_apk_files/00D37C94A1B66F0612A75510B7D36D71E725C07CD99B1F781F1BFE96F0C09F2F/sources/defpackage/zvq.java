package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zvq  reason: default package */
/* loaded from: classes4.dex */
public final class zvq extends zvp {
    public zvq(Context context) {
        super(context);
    }

    @Override // defpackage.zvp
    protected final void b(Context context) {
        LayoutInflater.from(context).inflate(R.layout.media_grid_thumb_view_with_duration_background, (ViewGroup) this, true);
    }
}
