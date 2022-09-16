package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nan  reason: default package */
/* loaded from: classes3.dex */
public final class nan extends mxg {
    private final TextView A;
    private boolean B;

    public nan(Context context, ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, boolean z, boolean z2, fjn fjnVar, akem akemVar) {
        super(context, ajmyVar, ajxzVar, ajycVar, view, view2, z, z2, fjnVar, akemVar);
        this.A = (TextView) view2.findViewById(R.id.website);
    }

    private final void v(int i, int i2) {
        u(this.d, i);
        u(this.e, i2);
        u(this.A, i2);
    }

    private final void w(Spanned spanned) {
        zag.m(this.A, spanned);
    }

    @Override // defpackage.mxd
    public final void d(acti actiVar, Object obj, auik auikVar, atng atngVar) {
        arag aragVar;
        k(actiVar, obj, auikVar, atngVar, null);
        if ((auikVar.b & 1024) != 0) {
            aragVar = auikVar.m;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        w(ajgl.b(aragVar));
    }

    @Override // defpackage.mxg, defpackage.mxf
    public final void k(acti actiVar, Object obj, auik auikVar, atng atngVar, Integer num) {
        arag aragVar;
        super.k(actiVar, obj, auikVar, atngVar, num);
        if ((auikVar.b & 1024) != 0) {
            aragVar = auikVar.m;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        w(ajgl.b(aragVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mxg
    public final void q() {
        super.q();
        v(2, 1);
        this.B = true;
        t(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mxg
    public final void s() {
        super.s();
        if (this.B) {
            v(1, 2);
            this.B = false;
        }
        r();
    }

    @Deprecated
    public nan(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, boolean z, fjn fjnVar, akem akemVar) {
        this(null, ajmyVar, ajxzVar, ajycVar, view, view2, z, false, fjnVar, akemVar);
    }
}
