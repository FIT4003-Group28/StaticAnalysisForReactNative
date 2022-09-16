package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mvl  reason: default package */
/* loaded from: classes3.dex */
public final class mvl extends mfs {
    private final ajyc C;
    private final ajrx D;
    private final ajrp E;
    private final mww F;
    public areu a;
    private final LinearLayout b;
    private final RelativeLayout c;
    private final RelativeLayout d;
    private final TextView e;
    private final Resources f;

    public mvl(Context context, ajmy ajmyVar, aafo aafoVar, gem gemVar, ajyc ajycVar, tjv tjvVar, enm enmVar) {
        super(context, ajmyVar, aafoVar, gemVar, R.layout.compact_promoted_video_item, null, null);
        this.D = gemVar;
        this.f = context.getResources();
        ajycVar.getClass();
        this.C = ajycVar;
        this.E = new ajrp(aafoVar, gemVar);
        LinearLayout linearLayout = (LinearLayout) this.i.findViewById(R.id.video_info_view);
        this.b = linearLayout;
        this.c = (RelativeLayout) linearLayout.findViewById(R.id.thumbnail_layout);
        this.d = (RelativeLayout) linearLayout.findViewById(R.id.text_layout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.ad_call_to_action);
        this.e = textView;
        textView.setOnClickListener(new mvk(this, aafoVar));
        this.F = new mww(aafoVar, tjvVar, enmVar, a());
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.D).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0192  */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvl.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.E.c();
        this.F.c();
    }
}
