package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mrc  reason: default package */
/* loaded from: classes3.dex */
public final class mrc extends ajsl {
    private final ajrx a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final int e;
    private final int f;
    private final int g;

    public mrc(Context context, gem gemVar) {
        this.a = gemVar;
        View inflate = View.inflate(context, R.layout.stat_row_item, null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.contents);
        this.e = zhn.j(context, R.attr.ytTextPrimary).orElse(0);
        this.f = zhn.j(context, R.attr.ytTextSecondary).orElse(0);
        this.g = zhn.j(context, R.attr.ytTextDisabled).orElse(0);
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.a).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        auzd auzdVar = (auzd) obj;
        TextView textView = this.c;
        arag aragVar2 = null;
        if ((auzdVar.b & 1) != 0) {
            aragVar = auzdVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.d;
        if ((auzdVar.b & 2) != 0 && (aragVar2 = auzdVar.d) == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        if (!auzdVar.e) {
            this.c.setTextColor(this.e);
            this.d.setTextColor(this.f);
        } else {
            this.c.setTextColor(this.g);
            this.d.setTextColor(this.g);
        }
        this.a.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auzd) obj).f.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
