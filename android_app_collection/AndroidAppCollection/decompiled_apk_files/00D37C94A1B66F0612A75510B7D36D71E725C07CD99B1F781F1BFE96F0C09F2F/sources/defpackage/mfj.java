package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: mfj  reason: default package */
/* loaded from: classes3.dex */
public final class mfj implements ajru {
    public final jxn a;
    public acti b;
    public apos c;
    private final View d;
    private final TextView e;
    private final TextView f;
    private final CompoundButton g;
    private final ahit h;
    private final int i;
    private CharSequence j;
    private CharSequence k;

    public mfj(Context context, final jxn jxnVar) {
        this.a = jxnVar;
        View inflate = View.inflate(context, R.layout.autonav_toggle, null);
        this.d = inflate;
        this.e = (TextView) inflate.findViewById(R.id.autonav_title);
        this.f = (TextView) inflate.findViewById(R.id.autonav_toggle_title);
        this.h = new ahit() { // from class: mfi
            @Override // defpackage.ahit
            public final void r(boolean z) {
                mfj mfjVar = mfj.this;
                apos aposVar = mfjVar.c;
                if ((aposVar.b & 16777216) != 0) {
                    mfjVar.b.H(3, new acte(aposVar.v), null);
                }
                mfjVar.d(mfjVar.a.g());
            }
        };
        CompoundButton compoundButton = (CompoundButton) inflate.findViewById(R.id.autonav_toggle);
        this.g = compoundButton;
        compoundButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: mfh
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton2, boolean z) {
                jxn.this.e(z);
            }
        });
        this.i = inflate.getPaddingTop();
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    public final void d(boolean z) {
        this.g.setChecked(z);
        this.f.setText(z ? this.k : this.j);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        apiy apiyVar = (apiy) obj;
        acti actiVar = ajrsVar.a;
        actiVar.getClass();
        this.b = actiVar;
        TextView textView = this.e;
        arag aragVar3 = null;
        if ((apiyVar.b & 1) != 0) {
            aragVar = apiyVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        int i = 0;
        this.e.setVisibility(0);
        aunb aunbVar = apiyVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apos aposVar = (apos) aunbVar.qm(ButtonRendererOuterClass.toggleButtonRenderer);
        this.c = aposVar;
        if ((aposVar.b & 64) != 0) {
            aragVar2 = aposVar.h;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        this.j = ajgl.b(aragVar2);
        apos aposVar2 = this.c;
        if ((aposVar2.b & 4096) != 0 && (aragVar3 = aposVar2.n) == null) {
            aragVar3 = arag.a;
        }
        Spanned b = ajgl.b(aragVar3);
        this.k = b;
        if (TextUtils.isEmpty(b)) {
            this.k = this.j;
        }
        this.a.d(this.h);
        d(this.a.g());
        int q = akpq.q(apiyVar.e);
        if (q == 0 || q != 2) {
            i = this.i;
        }
        if (i != this.d.getPaddingTop()) {
            View view = this.d;
            view.setPaddingRelative(view.getPaddingStart(), i, this.d.getPaddingEnd(), this.d.getPaddingBottom());
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.f(this.h);
    }
}
