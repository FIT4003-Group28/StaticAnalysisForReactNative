package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: elx  reason: default package */
/* loaded from: classes3.dex */
public final class elx extends ajsl {
    public final aafo a;
    final TextView b;
    akbm c;
    final ViewGroup d;
    private final fly e;
    private final akbn f;
    private final View g;
    private flx h;

    public elx(Context context, aafo aafoVar, fly flyVar, akbn akbnVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.channel_sub_menu, (ViewGroup) null);
        this.g = inflate;
        this.a = aafoVar;
        this.e = flyVar;
        this.f = akbnVar;
        this.d = (ViewGroup) inflate.findViewById(R.id.sort_videos_container);
        this.b = (TextView) inflate.findViewById(R.id.manage_videos_button);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        auxr auxrVar;
        apuj apujVar = (apuj) obj;
        this.d.removeAllViews();
        if ((apujVar.b & 16) != 0) {
            apuk apukVar = apujVar.d;
            if (apukVar == null) {
                apukVar = apuk.a;
            }
            if ((apukVar.b & 1) != 0) {
                apuk apukVar2 = apujVar.d;
                if (apukVar2 == null) {
                    apukVar2 = apuk.a;
                }
                auxrVar = apukVar2.c;
                if (auxrVar == null) {
                    auxrVar = auxr.a;
                }
            } else {
                auxrVar = null;
            }
            this.d.setVisibility(8);
            if (auxrVar != null) {
                if (this.h == null) {
                    this.h = this.e.b((ViewGroup) this.g);
                }
                this.h.oK(ajrsVar, auxrVar);
                this.d.addView(this.h.c, -2, -2);
                this.d.setVisibility(0);
            }
        }
        if ((apujVar.b & 32) == 0) {
            zag.o(this.b, false);
            return;
        }
        zag.o(this.b, true);
        if (this.c == null) {
            this.c = this.f.a(this.b);
        }
        apok apokVar = apujVar.e;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        final apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        this.c.b(apojVar, ajrsVar.a);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: elw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                elx elxVar = elx.this;
                apoj apojVar2 = apojVar;
                aafo aafoVar = elxVar.a;
                apzg apzgVar = apojVar2.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.a(apzgVar);
            }
        });
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        apuj apujVar = (apuj) obj;
        return null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        flx flxVar = this.h;
        if (flxVar != null) {
            flxVar.qZ(ajsaVar);
        }
    }
}
