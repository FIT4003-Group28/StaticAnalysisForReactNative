package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mfg  reason: default package */
/* loaded from: classes3.dex */
public abstract class mfg implements View.OnClickListener, mpy {
    protected final aafo a;
    protected final ajxz b;
    public final View c;
    protected final ImageView d;
    protected final TextView e;
    protected apos f;
    protected Object g;
    public ColorStateList h;
    private final ColorStateList i;
    private final ColorStateList j;
    private final ColorStateList k;
    private final ColorStateList l;
    private final ColorStateList m;

    public mfg(aafo aafoVar, ajxz ajxzVar, Context context, ViewGroup viewGroup, int i, mqp mqpVar) {
        this.a = aafoVar;
        this.b = ajxzVar;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.button_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.button_text);
        this.e = textView;
        this.m = textView != null ? textView.getTextColors() : null;
        if (mqpVar != null) {
            this.i = zhn.f(context, mqpVar.a);
            this.j = zhn.f(context, mqpVar.b);
            this.k = zhn.f(context, mqpVar.a);
            this.l = zhn.f(context, mqpVar.b);
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(zhn.d(context, R.attr.ytTextPrimary));
        this.i = valueOf;
        this.j = valueOf;
        this.k = valueOf;
        this.l = valueOf;
    }

    @Override // defpackage.mpy
    public void b() {
        this.g = null;
        this.f = null;
        this.c.setOnClickListener(null);
    }

    public int c() {
        return R.color.slim_metadata_toggle_button;
    }

    public int d() {
        return R.color.slim_metadata_toggle_button_selected;
    }

    protected abstract apos e(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfg.g():void");
    }

    public final void h(Object obj) {
        this.g = obj;
        apos e = e(obj);
        e.getClass();
        this.f = e;
        this.c.setOnClickListener(this);
    }

    public abstract boolean i();

    @Override // defpackage.mpy
    public final View oN() {
        return this.c;
    }
}
