package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mid  reason: default package */
/* loaded from: classes3.dex */
public final class mid extends kqs {
    private final ajmy o;
    private final ajrx p;
    private final ajrp q;
    private final ImageView r;

    public mid(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar) {
        super(context, ajmyVar, ajycVar, R.layout.compact_station_item, ajxzVar);
        ajmyVar.getClass();
        this.o = ajmyVar;
        this.p = gemVar;
        this.r = (ImageView) this.d.findViewById(R.id.station_thumbnail);
        gemVar.c(this.d);
        this.q = new ajrp(aafoVar, gemVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.p).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        aqeu aqeuVar = (aqeu) obj;
        ajrp ajrpVar = this.q;
        acti actiVar = ajrsVar.a;
        arag aragVar3 = null;
        if ((aqeuVar.b & 8) != 0) {
            apzgVar = aqeuVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        ajrsVar.a.u(new acte(aqeuVar.h), null);
        if ((aqeuVar.b & 1) != 0) {
            aragVar = aqeuVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        k(ajgl.b(aragVar));
        if ((aqeuVar.b & 2) != 0) {
            aragVar2 = aqeuVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        d(ajgl.b(aragVar2));
        if ((aqeuVar.b & 4) != 0 && (aragVar3 = aqeuVar.e) == null) {
            aragVar3 = arag.a;
        }
        l(ajgl.b(aragVar3));
        ajmy ajmyVar = this.o;
        ImageView imageView = this.r;
        avhn avhnVar = aqeuVar.g;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        this.p.e(ajrsVar);
    }

    @Override // defpackage.kqs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.q.c();
    }
}
