package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mwk  reason: default package */
/* loaded from: classes3.dex */
public final class mwk extends mxg {
    private final TextView A;
    private final RatingBar B;
    private final TextView C;
    private final TextView D;
    private final ImageView E;

    public mwk(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, fjn fjnVar, akem akemVar) {
        super(ajmyVar, ajxzVar, ajycVar, view, view2, true, fjnVar, akemVar);
        this.A = (TextView) view2.findViewById(R.id.rating_text);
        this.B = (RatingBar) view2.findViewById(R.id.rating_bar);
        this.C = (TextView) view2.findViewById(R.id.price_text);
        this.D = (TextView) view2.findViewById(R.id.description);
        this.E = (ImageView) view2.findViewById(R.id.channel_thumbnail);
    }

    @Override // defpackage.mxg, defpackage.mxf
    public final void b(acti actiVar, Object obj, auhs auhsVar, auht auhtVar, boolean z) {
        arag aragVar;
        super.b(actiVar, obj, auhsVar, auhtVar, z);
        float f = auhsVar.f;
        int i = auhsVar.g;
        int i2 = auhsVar.h;
        if ((auhsVar.b & 8192) != 0) {
            aragVar = auhsVar.p;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        arag aragVar2 = auhtVar.j;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        Spanned b2 = ajgl.b(aragVar2);
        avhn avhnVar = auhtVar.h;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        nfj.e(this.A, this.B, f, i, i2);
        nfj.f(this.C, b);
        nfj.f(this.D, b2);
        nfj.g(this.E, avhnVar, this.m);
    }
}
