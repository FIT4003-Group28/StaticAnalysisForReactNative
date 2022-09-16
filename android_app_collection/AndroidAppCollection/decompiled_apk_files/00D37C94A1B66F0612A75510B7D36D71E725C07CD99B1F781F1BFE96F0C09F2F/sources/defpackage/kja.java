package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.DecoratedPlayerBarRendererOuterClass;
/* compiled from: PG */
/* renamed from: kja  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kja implements ayqb {
    public final /* synthetic */ kcb a;
    private final /* synthetic */ int b;

    public /* synthetic */ kja(kcb kcbVar) {
        this.a = kcbVar;
    }

    public /* synthetic */ kja(kcb kcbVar, int i) {
        this.b = i;
        this.a = kcbVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        final ampq ampqVar;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.a.b(((Boolean) obj).booleanValue());
                    return;
                } else if (i == 3) {
                    this.a.nE(((Boolean) obj).booleanValue());
                    return;
                } else {
                    this.a.d(((Boolean) obj).booleanValue());
                    return;
                }
            }
            kcb kcbVar = this.a;
            Rect rect = (Rect) obj;
            if (!kcbVar.e || !kcbVar.k()) {
                return;
            }
            ((TextView) kcbVar.l.b).getGlobalVisibleRect(kcbVar.c);
            kcbVar.m.a(!kcbVar.c.intersect(rect), false);
            return;
        }
        final kcb kcbVar2 = this.a;
        ((TextView) kcbVar2.n.b).setClickable(false);
        lj.M(kcbVar2.n.b, new kbz(kcbVar2));
        aube aubeVar = ((WatchNextResponseModel) obj).i;
        if (aubeVar == null) {
            ampqVar = amon.a;
        } else {
            aunb aunbVar = aubeVar.q;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aqks aqksVar = (aqks) aunbVar.qm(DecoratedPlayerBarRendererOuterClass.decoratedPlayerBarRenderer);
            if ((2 & aqksVar.b) != 0) {
                aunb aunbVar2 = aqksVar.d;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                ampqVar = ampq.j((apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer));
            } else {
                ampqVar = amon.a;
            }
        }
        Drawable[] compoundDrawablesRelative = ((TextView) kcbVar2.n.b).getCompoundDrawablesRelative();
        Drawable drawable = compoundDrawablesRelative.length > 1 ? compoundDrawablesRelative[0] : null;
        if (!ampqVar.h()) {
            ((TextView) kcbVar2.n.b).setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        TextView textView = (TextView) kcbVar2.n.b;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, zhn.g(textView.getContext(), R.attr.chevronRightIcon), (Drawable) null);
        ((TextView) kcbVar2.n.b).setOnClickListener(new View.OnClickListener() { // from class: kby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kcb kcbVar3 = kcb.this;
                ampq ampqVar2 = ampqVar;
                aafo aafoVar = kcbVar3.d;
                apzg apzgVar = ((apoj) ampqVar2.c()).p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.a(apzgVar);
            }
        });
        kcbVar2.a.n(new acte(((apoj) ampqVar.c()).t));
    }
}
