package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahvc  reason: default package */
/* loaded from: classes.dex */
public final class ahvc extends ahvb implements ahuw {
    public ahvc(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqvc aqvcVar) {
        super(context, creatorEndscreenOverlayPresenter, aqvcVar);
    }

    @Override // defpackage.ahvb, defpackage.ahuz
    public final void g(ahvk ahvkVar) {
        avaq avaqVar;
        super.g(ahvkVar);
        jzq jzqVar = this.c.v;
        if (jzqVar != null) {
            aqva aqvaVar = this.b.u;
            if (aqvaVar == null) {
                aqvaVar = aqva.a;
            }
            if (aqvaVar.b == 55419609) {
                ahvkVar.m.setVisibility(0);
                aqvc aqvcVar = this.b;
                FrameLayout frameLayout = ahvkVar.m;
                if (jzqVar.d == null) {
                    jzqVar.e = (TextView) jzqVar.a.getLayoutInflater().inflate(R.layout.subscribe_button, (ViewGroup) frameLayout, true).findViewById(R.id.subscribe_button);
                    jzqVar.d = jzqVar.c.a(jzqVar.e, null);
                    jzqVar.d.c(jzqVar);
                }
                aqva aqvaVar2 = aqvcVar.u;
                if (aqvaVar2 == null) {
                    aqvaVar2 = aqva.a;
                }
                if (aqvaVar2.b == 55419609) {
                    avaqVar = (avaq) aqvaVar2.c;
                } else {
                    avaqVar = avaq.a;
                }
                jzqVar.f = this;
                jzqVar.d.i(avaqVar, jzqVar.b);
                return;
            }
        }
        ahvkVar.h.setVisibility(0);
    }
}
