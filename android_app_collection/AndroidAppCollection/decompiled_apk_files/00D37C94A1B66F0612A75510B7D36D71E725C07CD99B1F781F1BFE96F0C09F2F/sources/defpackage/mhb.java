package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mhb  reason: default package */
/* loaded from: classes3.dex */
public final class mhb implements ajru {
    public final View a;
    public apzg b;
    private final mgz c;
    private final mgz d;

    public mhb(Context context, ajmr ajmrVar, final aafo aafoVar, fmh fmhVar, ajyc ajycVar, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_channel_recommendation_card, viewGroup, false);
        this.a = inflate;
        this.c = new mgz(context, ajmrVar, fmhVar, ajycVar, inflate, R.id.centered_card_view_stub);
        this.d = new mgz(context, ajmrVar, fmhVar, ajycVar, inflate, R.id.left_align_card_view_stub);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: mgw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mhb mhbVar = mhb.this;
                aafo aafoVar2 = aafoVar;
                apzg apzgVar = mhbVar.b;
                if (apzgVar != null) {
                    aafoVar2.c(apzgVar, null);
                }
            }
        });
        inflate.setTag(R.id.offset_adjuster_tag, new fqw() { // from class: mgx
            @Override // defpackage.fqw
            public final void a(Rect rect) {
                mhb mhbVar = mhb.this;
                rect.left -= mhbVar.a.getPaddingLeft();
                rect.top -= mhbVar.a.getPaddingTop();
                rect.right -= mhbVar.a.getPaddingRight();
                rect.bottom -= mhbVar.a.getPaddingBottom();
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aqdg aqdgVar = (aqdg) obj;
        apzg apzgVar = aqdgVar.h;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        this.b = apzgVar;
        aqdf aqdfVar = aqdgVar.i;
        if (aqdfVar == null) {
            aqdfVar = aqdf.a;
        }
        int d = aqgn.d(aqdfVar.b);
        if (d == 0 || d != 4) {
            this.c.c(aqdgVar, ajrsVar);
            this.d.a();
            return;
        }
        this.d.c(aqdgVar, ajrsVar);
        this.c.a();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.b();
        this.d.b();
    }
}
