package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nav  reason: default package */
/* loaded from: classes3.dex */
public final class nav extends mxg {
    private final TextView A;
    private final TextView B;
    private final TextView C;

    public nav(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, fjn fjnVar, akem akemVar) {
        super(ajmyVar, ajxzVar, ajycVar, view, view2, false, fjnVar, akemVar);
        this.A = (TextView) view2.findViewById(R.id.advertiser);
        this.B = (TextView) view2.findViewById(R.id.separator);
        this.C = (TextView) view2.findViewById(R.id.price);
    }

    @Override // defpackage.mxg, defpackage.mxf
    public final void i(acti actiVar, Object obj, auiy auiyVar, atng atngVar) {
        arag aragVar;
        arag aragVar2;
        super.i(actiVar, obj, auiyVar, atngVar);
        arag aragVar3 = null;
        if ((auiyVar.b & 32) != 0) {
            aragVar = auiyVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((auiyVar.b & 64) != 0) {
            aragVar2 = auiyVar.i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        if ((auiyVar.b & 128) != 0 && (aragVar3 = auiyVar.j) == null) {
            aragVar3 = arag.a;
        }
        Spanned b3 = ajgl.b(aragVar3);
        if (TextUtils.isEmpty(b)) {
            this.C.setVisibility(8);
            this.B.setVisibility(8);
        } else {
            zag.m(this.C, b);
            zag.m(this.B, b2);
        }
        zag.m(this.A, b3);
    }
}
