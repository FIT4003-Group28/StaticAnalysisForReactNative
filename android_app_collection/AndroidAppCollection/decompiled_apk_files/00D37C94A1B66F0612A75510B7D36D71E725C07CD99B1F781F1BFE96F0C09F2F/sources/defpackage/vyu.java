package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: vyu  reason: default package */
/* loaded from: classes4.dex */
public final class vyu implements ajru {
    public final wfg a;
    public final acti b;
    public final View c;
    public aarw d;
    private final ajxz e;
    private final akbk f;
    private final Context g;
    private final ajmy h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final View l;
    private final View m;
    private final ImageView n;
    private final ImageView o;

    public vyu(Context context, ajmy ajmyVar, acti actiVar, final wfe wfeVar, wfg wfgVar, ajxz ajxzVar, akbk akbkVar) {
        wfeVar.getClass();
        this.g = context;
        this.h = ajmyVar;
        this.b = actiVar;
        this.e = ajxzVar;
        this.f = akbkVar;
        this.a = wfgVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fusion_account_item_layout, (ViewGroup) null);
        this.c = inflate;
        this.i = (TextView) inflate.findViewById(R.id.name);
        this.j = (TextView) inflate.findViewById(R.id.byline);
        this.l = inflate.findViewById(R.id.selection_checkmark);
        this.m = inflate.findViewById(R.id.selection_highlight);
        this.n = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.o = (ImageView) inflate.findViewById(R.id.icon);
        this.k = (TextView) inflate.findViewById(R.id.edit_channel);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: vyr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wfeVar.a(vyu.this.d);
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.aarw r9) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyu.d(aarw):void");
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        d((aarw) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
