package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mxv  reason: default package */
/* loaded from: classes3.dex */
public final class mxv extends mxf {
    private final TextView x;

    public mxv(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, fjn fjnVar, akem akemVar) {
        super(ajmyVar, ajxzVar, ajycVar, view, view2, false, fjnVar, akemVar);
        this.x = (TextView) view2.findViewById(R.id.website);
    }

    @Override // defpackage.mxf
    public final void j(acti actiVar, Object obj, aujb aujbVar, atng atngVar) {
        arag aragVar;
        super.j(actiVar, obj, aujbVar, atngVar);
        if ((aujbVar.b & 4) != 0) {
            aragVar = aujbVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(this.x, ajgl.b(aragVar));
    }
}
