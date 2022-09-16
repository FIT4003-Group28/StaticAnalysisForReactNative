package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mjn  reason: default package */
/* loaded from: classes3.dex */
public final class mjn extends mfs {
    private final ajrx a;
    private final LinearLayout b;
    private final TextView c;
    private final ajyc d;
    private final ajrp e;

    public mjn(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, gem gemVar, jkv jkvVar, kua kuaVar) {
        super(context, ajmyVar, gemVar, LayoutInflater.from(context).inflate(R.layout.grid_narrow_video_item, (ViewGroup) null, false), aafoVar, jkvVar, null, kuaVar);
        LinearLayout linearLayout = (LinearLayout) this.i.findViewById(R.id.video_info_view);
        this.b = linearLayout;
        this.c = (TextView) linearLayout.findViewById(R.id.title);
        this.d = ajycVar;
        this.a = gemVar;
        this.e = new ajrp(aafoVar, gemVar);
    }

    private static apmi d(arep arepVar) {
        if ((arepVar.b & 2048) != 0) {
            apmg apmgVar = arepVar.m;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            apmi apmiVar = apmgVar.d;
            return apmiVar == null ? apmi.a : apmiVar;
        }
        return null;
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.a).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        atep atepVar;
        Spanned spanned;
        arag aragVar;
        arag aragVar2;
        apmk apmkVar;
        arep arepVar = (arep) obj;
        arepVar.getClass();
        int i = 1;
        boolean z = d(arepVar) != null;
        ajrp ajrpVar = this.e;
        acti actiVar = ajrsVar.a;
        apzg apzgVar = arepVar.h;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        ajrpVar.b(actiVar, apzgVar, ajrsVar.e(), this);
        apmh apmhVar = null;
        ajrsVar.a.u(new acte(arepVar.n), null);
        arag aragVar3 = arepVar.e;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        B(ajgl.b(aragVar3));
        avhn avhnVar = arepVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        z(avhnVar);
        this.a.e(ajrsVar);
        ajrs ajrsVar2 = new ajrs(ajrsVar);
        acti actiVar2 = ajrsVar2.a;
        ajyc ajycVar = this.d;
        View view = ((gem) this.a).b;
        View view2 = this.y;
        ates atesVar = arepVar.g;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = arepVar.g;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atep atepVar2 = atesVar2.c;
            if (atepVar2 == null) {
                atepVar2 = atep.a;
            }
            atepVar = atepVar2;
        } else {
            atepVar = null;
        }
        ajycVar.e(view, view2, atepVar, arepVar, actiVar2);
        avhe avheVar = (avhe) ohn.g(arepVar.d, kue.e);
        if (avheVar != null) {
            arag aragVar4 = avheVar.d;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            spanned = ajgl.b(aragVar4);
        } else {
            spanned = null;
        }
        p(spanned, null, arepVar.d, null);
        if ((arepVar.b & 256) != 0) {
            aragVar = arepVar.j;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((arepVar.b & 128) != 0) {
            aragVar2 = arepVar.i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        m(b, ajgl.b(aragVar2), z);
        if ((arepVar.b & 1024) != 0) {
            apmg apmgVar = arepVar.l;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            apmkVar = apmgVar.c;
            if (apmkVar == null) {
                apmkVar = apmk.a;
            }
        } else {
            apmkVar = null;
        }
        w(apmkVar);
        v(d(arepVar));
        if ((arepVar.b & 512) != 0) {
            apmg apmgVar2 = arepVar.k;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmhVar = apmgVar2.e;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
        }
        u(apmhVar);
        t(ohn.f(arepVar.d));
        this.a.e(ajrsVar2);
        TextView textView = this.c;
        int i2 = arepVar.f;
        if (i2 != 0) {
            i = i2;
        }
        textView.setMaxLines(i);
    }
}
