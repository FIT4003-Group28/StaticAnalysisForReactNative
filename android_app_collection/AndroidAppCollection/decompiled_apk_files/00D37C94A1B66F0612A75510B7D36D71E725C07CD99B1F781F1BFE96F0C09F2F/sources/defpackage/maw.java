package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
/* compiled from: PG */
/* renamed from: maw  reason: default package */
/* loaded from: classes3.dex */
public final class maw implements ajru {
    public final aafo a;
    private final ajmy b;
    private final ajyc c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final ImageView i;
    private final int j;

    public maw(Context context, aafo aafoVar, ajmy ajmyVar, ajyc ajycVar, ViewGroup viewGroup) {
        this.a = aafoVar;
        this.b = ajmyVar;
        this.c = ajycVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_suggested_video, viewGroup, false);
        this.d = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.f = (TextView) inflate.findViewById(R.id.duration);
        this.g = (TextView) inflate.findViewById(R.id.headline);
        this.h = (TextView) inflate.findViewById(R.id.view_count);
        this.i = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.compact_suggested_video_last_video_spacing);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        final aqev aqevVar = (aqev) obj;
        this.d.setOnClickListener(new View.OnClickListener() { // from class: mav
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                maw mawVar = maw.this;
                aqev aqevVar2 = aqevVar;
                aafo aafoVar = mawVar.a;
                apzg apzgVar = aqevVar2.i;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
            }
        });
        View view = this.d;
        int i = lj.i(view);
        int paddingTop = this.d.getPaddingTop();
        int h = lj.h(this.d);
        int i2 = 0;
        if (ajrsVar.j("isLastVideo", false)) {
            i2 = this.j;
        }
        lj.Y(view, i, paddingTop, h, i2);
        ajmy ajmyVar = this.b;
        ImageView imageView = this.e;
        avhn avhnVar = aqevVar.e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.f;
        arag aragVar3 = null;
        if ((aqevVar.b & 8) != 0) {
            aragVar = aqevVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.g;
        if ((aqevVar.b & 1) != 0) {
            aragVar2 = aqevVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = this.h;
        if ((aqevVar.b & 2) != 0 && (aragVar3 = aqevVar.d) == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar3));
        ajyc ajycVar = this.c;
        View rootView = this.d.getRootView();
        ImageView imageView2 = this.i;
        aunb aunbVar = aqevVar.g;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        ajycVar.e(rootView, imageView2, (atep) aunbVar.qm(MenuRendererOuterClass.menuRenderer), aqevVar, acti.l);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.e(this.e);
    }
}
