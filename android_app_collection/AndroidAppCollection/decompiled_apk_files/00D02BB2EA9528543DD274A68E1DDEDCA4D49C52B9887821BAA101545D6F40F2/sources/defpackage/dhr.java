package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Picture;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dhr  reason: default package */
/* loaded from: classes6.dex */
public final class dhr implements dhh {
    public final View a;
    public final TextView b;
    public final TextView c;
    private final Context d;
    private final bvsl e;

    public dhr(Activity activity, bvsl bvslVar) {
        this.d = activity;
        this.e = bvslVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.orientation_cue_label_layout, (ViewGroup) null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (TextView) inflate.findViewById(R.id.secondary_text);
    }

    @Override // defpackage.dhh
    public final Picture a(float f) {
        b(f);
        return dhq.a(this.a);
    }

    public final void b(float f) {
        this.c.setText(this.d.getString(R.string.AR_PLACE_PIN_LABEL, this.e.c(Math.round(f), null, false, true)));
    }
}
