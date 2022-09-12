package defpackage;

import android.app.Activity;
import android.graphics.Picture;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dhj  reason: default package */
/* loaded from: classes6.dex */
public final class dhj implements dhh {
    public final Activity a;
    public final Executor b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    @dzsi
    public dehn<Picture> f;
    private final bvsl g;
    private final TextView h;

    public dhj(Activity activity, bvsl bvslVar, Executor executor) {
        this.a = activity;
        this.g = bvslVar;
        this.b = executor;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.iconic_landmark_primary_layout, (ViewGroup) null);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.icon);
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.h = (TextView) inflate.findViewById(R.id.distance_text);
    }

    @Override // defpackage.dhh
    public final Picture a(float f) {
        b(f);
        return dhq.a(this.c);
    }

    public final void b(float f) {
        this.h.setText(this.a.getString(R.string.AR_PLACE_PIN_LABEL, new Object[]{this.g.c(Math.round(f), null, false, true)}));
    }
}
