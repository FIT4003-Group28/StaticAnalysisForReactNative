package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mlf  reason: default package */
/* loaded from: classes3.dex */
public final class mlf extends ajsl {
    public apzg a;
    public apzg b;
    private final TextView c;
    private final TextView d;
    private final ajrx e;

    public mlf(Context context, aafo aafoVar, gem gemVar) {
        aafoVar.getClass();
        this.e = gemVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.link_sub_menu, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.link_text);
        this.c = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.title_text);
        this.d = textView2;
        gemVar.c(inflate);
        gemVar.b(false);
        textView.setOnClickListener(new mle(this, aafoVar, 1));
        textView2.setOnClickListener(new mle(this, aafoVar));
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.e).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        apzg apzgVar;
        aspe aspeVar = (aspe) obj;
        TextView textView = this.c;
        apzg apzgVar2 = null;
        if ((aspeVar.b & 4) != 0) {
            aragVar = aspeVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.d;
        if ((aspeVar.b & 1) != 0) {
            aragVar2 = aspeVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        if ((aspeVar.b & 8) != 0) {
            apzgVar = aspeVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        this.a = apzgVar;
        if ((aspeVar.b & 2) != 0 && (apzgVar2 = aspeVar.d) == null) {
            apzgVar2 = apzg.a;
        }
        this.b = apzgVar2;
        this.e.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aspe) obj).g.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
