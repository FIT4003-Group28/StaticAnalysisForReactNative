package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kub  reason: default package */
/* loaded from: classes3.dex */
public final class kub extends ajsl implements ynl {
    private final Context a;
    private final afvn b;
    private final azqb c;
    private final yni d;
    private final View e;
    private final ProgressBar f;
    private final TextView g;
    private final TextView h;

    public kub(Context context, afvn afvnVar, azqb azqbVar, yni yniVar) {
        this.a = context;
        this.b = afvnVar;
        this.c = azqbVar;
        this.d = yniVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.storage_info_view, (ViewGroup) null);
        this.e = inflate;
        this.g = (TextView) inflate.findViewById(R.id.storage_used);
        this.h = (TextView) inflate.findViewById(R.id.storage_free);
        this.f = (ProgressBar) inflate.findViewById(R.id.storage_bar);
        inflate.findViewById(R.id.legend_used).setBackground(h(R.attr.ytCallToAction));
        inflate.findViewById(R.id.legend_free).setBackground(h(R.attr.ytIconDisabled));
    }

    private final GradientDrawable h(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(zhn.d(this.a, i));
        return gradientDrawable;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        auzo auzoVar = (auzo) obj;
        this.d.g(this);
        g();
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        auzo auzoVar = (auzo) obj;
        return null;
    }

    public final void g() {
        aghe b;
        agpz agpzVar = null;
        if (this.b.t() && (b = ((agrf) this.c.get()).a().b()) != null) {
            agpzVar = b.b();
        }
        long a = agpzVar == null ? 0L : agpzVar.a();
        long f = zew.f();
        this.f.setMax((int) zew.Q(a + f));
        long Q = zew.Q(a);
        this.f.setProgress((int) Q);
        Resources resources = this.a.getResources();
        this.g.setText(Html.fromHtml(resources.getString(R.string.storage_used, zgh.g(resources, Q))));
        this.h.setText(Html.fromHtml(resources.getString(R.string.storage_free, zgh.g(resources, zew.Q(f)))));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.m(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{agnl.class, agnm.class, agnn.class, agnp.class, agnr.class, agns.class};
            case 0:
                agnl agnlVar = (agnl) obj;
                g();
                return null;
            case 1:
                agnm agnmVar = (agnm) obj;
                g();
                return null;
            case 2:
                agnn agnnVar = (agnn) obj;
                g();
                return null;
            case 3:
                agnp agnpVar = (agnp) obj;
                g();
                return null;
            case 4:
                agnr agnrVar = (agnr) obj;
                g();
                return null;
            case 5:
                agns agnsVar = (agns) obj;
                g();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
