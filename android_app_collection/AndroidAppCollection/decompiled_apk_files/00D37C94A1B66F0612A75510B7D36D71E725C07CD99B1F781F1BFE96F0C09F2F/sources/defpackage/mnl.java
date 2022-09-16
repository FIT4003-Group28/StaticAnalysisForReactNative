package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mnl  reason: default package */
/* loaded from: classes3.dex */
public final class mnl extends ajsl {
    protected final RelativeLayout a;
    private final ajmy b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final View f;
    private final ajyc g;
    private final ImageView h;
    private final ajrx i;
    private final ajrp j;

    public mnl(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, ajyc ajycVar) {
        this.j = new ajrp(aafoVar, gemVar);
        ajmyVar.getClass();
        this.b = ajmyVar;
        this.i = gemVar;
        this.g = ajycVar;
        RelativeLayout relativeLayout = (RelativeLayout) View.inflate(context, R.layout.purchase_item, null);
        this.a = relativeLayout;
        this.c = (TextView) relativeLayout.findViewById(R.id.title);
        this.d = (TextView) relativeLayout.findViewById(R.id.price);
        this.e = (TextView) relativeLayout.findViewById(R.id.free_trial_text);
        this.h = (ImageView) relativeLayout.findViewById(R.id.thumbnail);
        this.f = relativeLayout.findViewById(R.id.contextual_menu_anchor);
        gemVar.c(relativeLayout);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.i).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        aujs aujsVar = (aujs) obj;
        ajrp ajrpVar = this.j;
        acti actiVar = ajrsVar.a;
        atep atepVar = null;
        if ((aujsVar.b & 8) != 0) {
            apzgVar = aujsVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        TextView textView = this.c;
        if ((aujsVar.b & 2) != 0) {
            aragVar = aujsVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.d;
        if ((aujsVar.b & 4) != 0) {
            aragVar2 = aujsVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = this.e;
        if ((aujsVar.b & 32) != 0) {
            aragVar3 = aujsVar.g;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(textView3, ajgl.b(aragVar3));
        if ((aujsVar.b & 1) == 0) {
            this.b.e(this.h);
        } else {
            ajmy ajmyVar = this.b;
            ImageView imageView = this.h;
            avhn avhnVar = aujsVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
        }
        this.f.setVisibility(0);
        ajyc ajycVar = this.g;
        View view = ((gem) this.i).b;
        View view2 = this.f;
        ates atesVar = aujsVar.h;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = aujsVar.h;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atepVar = atesVar2.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
        }
        ajycVar.e(view, view2, atepVar, aujsVar, ajrsVar.a);
        this.i.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aujs) obj).i.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.j.c();
    }
}
