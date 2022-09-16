package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mtf  reason: default package */
/* loaded from: classes3.dex */
public final class mtf implements ajru {
    public awhu a;
    private final TextView b;

    public mtf(Context context, mte mteVar) {
        TextView textView = (TextView) View.inflate(context, R.layout.ypc_offers_coupon_item, null);
        this.b = textView;
        textView.setOnClickListener(new mtc(this, mteVar));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        awid awidVar = (awid) obj;
        TextView textView = this.b;
        awhu awhuVar = null;
        if ((awidVar.b & 8) != 0) {
            aragVar = awidVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        awic awicVar = awidVar.f;
        if (awicVar == null) {
            awicVar = awic.a;
        }
        if ((awicVar.b & 1) != 0) {
            awic awicVar2 = awidVar.f;
            if (awicVar2 == null) {
                awicVar2 = awic.a;
            }
            awhuVar = awicVar2.c;
            if (awhuVar == null) {
                awhuVar = awhu.a;
            }
        }
        this.a = awhuVar;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a = null;
    }
}
