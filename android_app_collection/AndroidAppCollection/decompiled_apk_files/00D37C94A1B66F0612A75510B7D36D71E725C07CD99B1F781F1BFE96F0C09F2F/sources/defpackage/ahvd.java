package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahvd  reason: default package */
/* loaded from: classes.dex */
public final class ahvd extends ahvi {
    public ahvd(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqvc aqvcVar) {
        super(context, creatorEndscreenOverlayPresenter, aqvcVar);
    }

    @Override // defpackage.ahvi, defpackage.ahuz
    public final void g(ahvk ahvkVar) {
        arag aragVar;
        arag aragVar2;
        super.g(ahvkVar);
        ahvkVar.g.setVisibility(8);
        ahvkVar.h.setVisibility(0);
        Drawable a = akf.a(this.a, 2131232569);
        if (a != null) {
            a.mutate().setTint(zhn.j(this.a, R.attr.ytThemedBlue).orElse(0));
        }
        arag aragVar3 = null;
        ahvkVar.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
        ahvkVar.h.setCompoundDrawablePadding(8);
        TextView textView = ahvkVar.j;
        aqvc aqvcVar = this.b;
        if ((aqvcVar.b & 16384) != 0) {
            aragVar = aqvcVar.p;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = ahvkVar.k;
        aqvc aqvcVar2 = this.b;
        if ((aqvcVar2.b & 32768) != 0) {
            aragVar2 = aqvcVar2.q;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = ahvkVar.l;
        aqvc aqvcVar3 = this.b;
        if ((aqvcVar3.b & 8192) != 0 && (aragVar3 = aqvcVar3.o) == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar3));
    }

    @Override // defpackage.ahvi
    public final void j() {
        arag aragVar;
        super.j();
        TextView textView = ((ahvi) this).k;
        aqvc aqvcVar = this.b;
        if ((aqvcVar.b & 131072) != 0) {
            aragVar = aqvcVar.r;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        this.j.setVisibility(8);
    }
}
