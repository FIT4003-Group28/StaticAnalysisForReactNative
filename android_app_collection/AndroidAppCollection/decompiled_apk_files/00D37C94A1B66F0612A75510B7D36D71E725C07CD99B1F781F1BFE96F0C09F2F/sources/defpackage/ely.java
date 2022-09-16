package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ely  reason: default package */
/* loaded from: classes3.dex */
public final class ely extends ajsl {
    private final ajrx a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final gga e;
    private apus f;

    public ely(Context context, gem gemVar, ggb ggbVar) {
        this.a = gemVar;
        View inflate = View.inflate(context, R.layout.channel_tip_card_item, null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.tip_card_title);
        this.d = (TextView) inflate.findViewById(R.id.tip_card_message);
        this.e = ggbVar.a((TextView) inflate.findViewById(R.id.tip_button));
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.a).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        apus apusVar = (apus) obj;
        if (this.f == apusVar) {
            this.a.e(ajrsVar);
            return;
        }
        this.f = apusVar;
        TextView textView = this.c;
        apoj apojVar = null;
        if ((apusVar.b & 1) != 0) {
            aragVar = apusVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.d;
        if ((apusVar.b & 2) != 0) {
            aragVar2 = apusVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        if (this.c.getVisibility() != 8 && this.d.getVisibility() != 8) {
            gga ggaVar = this.e;
            apok apokVar = apusVar.e;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) != 0) {
                apok apokVar2 = apusVar.e;
                if (apokVar2 == null) {
                    apokVar2 = apok.a;
                }
                apojVar = apokVar2.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
            }
            ggaVar.b(apojVar, ajrsVar.a);
        }
        this.a.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        apus apusVar = (apus) obj;
        return null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
