package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mvt  reason: default package */
/* loaded from: classes3.dex */
public final class mvt extends mxg {
    private final TextView A;
    private final ImageView B;
    private final TextView C;

    public mvt(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, fjn fjnVar, akem akemVar) {
        super(ajmyVar, ajxzVar, ajycVar, view, view2, true, fjnVar, akemVar);
        this.A = (TextView) view2.findViewById(R.id.description);
        this.C = (TextView) view2.findViewById(R.id.advertiser_name_or_website);
        this.B = (ImageView) view2.findViewById(R.id.channel_thumbnail);
    }

    @Override // defpackage.mxg
    public final void a(acti actiVar, Object obj, auik auikVar, auhp auhpVar, boolean z, boolean z2) {
        arag aragVar;
        super.a(actiVar, obj, auikVar, auhpVar, z, z2);
        if ((auikVar.b & 1024) != 0) {
            String valueOf = String.valueOf(this.B.getContentDescription());
            arag aragVar2 = auikVar.m;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            String str = ((arai) aragVar2.c.get(0)).c;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(str);
            this.B.setContentDescription(sb.toString());
        }
        arag aragVar3 = auhpVar.j;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        Spanned b = ajgl.b(aragVar3);
        if ((auikVar.b & 1024) != 0) {
            aragVar = auikVar.m;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b2 = ajgl.b(aragVar);
        avhn avhnVar = auhpVar.h;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        nfj.f(this.A, b);
        nfj.f(this.C, b2);
        nfj.g(this.B, avhnVar, this.m);
    }
}
