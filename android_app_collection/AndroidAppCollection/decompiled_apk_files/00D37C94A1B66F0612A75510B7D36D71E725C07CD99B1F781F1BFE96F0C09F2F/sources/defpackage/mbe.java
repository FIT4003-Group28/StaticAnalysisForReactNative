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
/* renamed from: mbe  reason: default package */
/* loaded from: classes3.dex */
public final class mbe implements ajru {
    public final aafo a;
    private final ajmy b;
    private final ajyc c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final ImageView h;

    public mbe(Context context, aafo aafoVar, ajmy ajmyVar, ajyc ajycVar, ViewGroup viewGroup) {
        this.a = aafoVar;
        this.b = ajmyVar;
        this.c = ajycVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.suggested_videos_header, viewGroup, false);
        this.d = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.description);
        this.h = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        avhn avhnVar;
        arag aragVar;
        final avcn avcnVar = (avcn) obj;
        this.d.setOnClickListener(new View.OnClickListener() { // from class: mbd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apzg apzgVar;
                mbe mbeVar = mbe.this;
                avcn avcnVar2 = avcnVar;
                aafo aafoVar = mbeVar.a;
                if ((avcnVar2.b & 32) != 0) {
                    apzgVar = avcnVar2.h;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                } else {
                    apzgVar = null;
                }
                aafoVar.c(apzgVar, null);
            }
        });
        ajmy ajmyVar = this.b;
        ImageView imageView = this.e;
        arag aragVar2 = null;
        if ((avcnVar.b & 4) != 0) {
            avhnVar = avcnVar.e;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.f;
        if ((avcnVar.b & 1) != 0) {
            aragVar = avcnVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.g;
        if ((avcnVar.b & 2) != 0 && (aragVar2 = avcnVar.d) == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        ajyc ajycVar = this.c;
        View rootView = this.d.getRootView();
        ImageView imageView2 = this.h;
        aunb aunbVar = avcnVar.f;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        ajycVar.e(rootView, imageView2, (atep) ajjh.l(aunbVar, MenuRendererOuterClass.menuRenderer), avcnVar, acti.l);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.e(this.e);
    }
}
