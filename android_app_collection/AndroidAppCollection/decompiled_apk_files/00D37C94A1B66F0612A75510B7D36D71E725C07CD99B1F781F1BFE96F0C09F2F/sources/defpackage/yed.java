package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yed  reason: default package */
/* loaded from: classes4.dex */
final class yed implements ajru, akbi {
    public final View a;
    public final int b;
    final /* synthetic */ yee c;
    private final TextView d;
    private final TextView e;
    private final ImageView f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final ScrollView j;
    private final akbm k;
    private final akbm l;
    private final acuh m;

    public yed(yee yeeVar, int i, acuh acuhVar) {
        this.c = yeeVar;
        this.b = i;
        this.m = acuhVar;
        View inflate = LayoutInflater.from(yeeVar.b).inflate(i, yeeVar.f, false);
        this.a = inflate;
        this.j = (ScrollView) inflate.findViewById(R.id.scroll_view);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.body);
        this.f = (ImageView) inflate.findViewById(R.id.foreground);
        this.g = (ImageView) inflate.findViewById(R.id.background);
        TextView textView = (TextView) inflate.findViewById(R.id.action);
        this.h = textView;
        akbm a = yeeVar.e.a(textView);
        this.k = a;
        TextView textView2 = (TextView) inflate.findViewById(R.id.dismiss);
        this.i = textView2;
        akbm a2 = yeeVar.e.a(textView2);
        this.l = a2;
        a.d = this;
        a2.d = this;
        zag.o(inflate, false);
    }

    private final int e() {
        yee yeeVar = this.c;
        asku askuVar = yeeVar.k;
        if (askuVar.f == 7) {
            try {
                return Color.parseColor((String) askuVar.g);
            } catch (Resources.NotFoundException | Exception unused) {
                return 0;
            }
        }
        return zhn.j(yeeVar.b, R.attr.ytTextPrimary).orElse(0);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.asku r14) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yed.d(asku):void");
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        d((asku) obj);
    }

    @Override // defpackage.akbi
    public final void oL(aopc aopcVar) {
        akbi akbiVar = this.c.j;
        if (akbiVar != null) {
            akbiVar.oL(aopcVar);
        }
        this.c.g.a();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
