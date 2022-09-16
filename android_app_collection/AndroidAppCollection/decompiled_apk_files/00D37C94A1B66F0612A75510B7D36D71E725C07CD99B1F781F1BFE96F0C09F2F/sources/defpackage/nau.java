package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nau  reason: default package */
/* loaded from: classes3.dex */
public final class nau extends mxg {
    private final TextView A;
    private final TextView B;
    private final TextView C;
    private final TextView D;

    public nau(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, fjn fjnVar, akem akemVar) {
        super(ajmyVar, ajxzVar, ajycVar, view, view2, false, fjnVar, akemVar);
        this.A = (TextView) view2.findViewById(R.id.title);
        this.B = (TextView) view2.findViewById(R.id.advertiser);
        this.C = (TextView) view2.findViewById(R.id.price);
        this.D = (TextView) view2.findViewById(R.id.description);
    }

    @Override // defpackage.mxg, defpackage.mxf
    public final void i(acti actiVar, Object obj, auiy auiyVar, atng atngVar) {
        arag aragVar;
        arag aragVar2;
        super.i(actiVar, obj, auiyVar, atngVar);
        arag aragVar3 = null;
        if ((auiyVar.b & 128) != 0) {
            aragVar = auiyVar.j;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((auiyVar.b & 32) != 0) {
            aragVar2 = auiyVar.h;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        if ((auiyVar.b & 16) != 0 && (aragVar3 = auiyVar.g) == null) {
            aragVar3 = arag.a;
        }
        Spanned b3 = ajgl.b(aragVar3);
        boolean z = auiyVar.u;
        zag.m(this.B, b);
        if (TextUtils.isEmpty(b2)) {
            this.A.setMaxLines(2);
            this.C.setVisibility(8);
        } else {
            this.A.setMaxLines(1);
            zag.m(this.C, b2);
        }
        if (!z || TextUtils.isEmpty(b3)) {
            this.D.setMaxLines(0);
            this.D.setVisibility(8);
            return;
        }
        this.D.setMaxLines(3);
        zag.m(this.D, b3);
    }
}
