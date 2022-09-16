package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lzw  reason: default package */
/* loaded from: classes3.dex */
public final class lzw {
    public aqfg a;
    private final ajmy b;
    private final acti c;
    private View d;
    private TextView e;
    private ImageView f;
    private final View.OnClickListener g;

    public lzw(ajmy ajmyVar, wxc wxcVar, aafo aafoVar, acti actiVar) {
        this.b = ajmyVar;
        this.c = actiVar;
        this.g = new lzv(this, wxcVar, aafoVar);
    }

    public final void a(View view, aqfg aqfgVar) {
        if (view == null) {
            return;
        }
        this.a = aqfgVar;
        this.d = view;
        this.e = (TextView) view.findViewById(R.id.button_text);
        this.f = (ImageView) view.findViewById(R.id.button_image);
        if (aqfgVar == null) {
            this.d.setVisibility(8);
        } else {
            TextView textView = this.e;
            arag aragVar = aqfgVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            zag.m(textView, ajgl.b(aragVar));
            if ((aqfgVar.b & 2) == 0) {
                this.f.setVisibility(8);
            } else {
                ajmy ajmyVar = this.b;
                ImageView imageView = this.f;
                avhn avhnVar = aqfgVar.d;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                ajmyVar.h(imageView, avhnVar);
                this.f.setVisibility(0);
            }
            this.d.setVisibility(0);
            this.c.u(new acte(aqfgVar.f), null);
        }
        this.d.setOnClickListener(this.g);
    }

    public final void b() {
        View view = this.d;
        if (view != null) {
            view.setVisibility(8);
        }
        this.a = null;
    }
}
