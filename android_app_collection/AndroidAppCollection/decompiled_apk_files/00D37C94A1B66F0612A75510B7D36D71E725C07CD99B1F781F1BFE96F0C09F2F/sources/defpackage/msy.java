package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: msy  reason: default package */
/* loaded from: classes3.dex */
public final class msy extends mfs {
    public View C;
    public int D;
    private final ajrp E;
    public final snc a;
    public final aafo b;
    public final View c;
    public final View d;
    public final ImageView e;
    public final TextView f;

    public msy(Context context, ajmy ajmyVar, View view, aafo aafoVar, ajxz ajxzVar, snc sncVar, jkv jkvVar) {
        super(context, ajmyVar, new ajsn(), view, aafoVar, ajxzVar, jkvVar, (ftb) null, (kua) null);
        this.a = sncVar;
        this.b = aafoVar;
        this.E = new ajrp(aafoVar, view);
        this.d = view.findViewById(R.id.thumbnail_layout);
        this.e = (ImageView) view.findViewById(R.id.channel_avatar);
        this.f = (TextView) view.findViewById(R.id.context);
        this.c = view;
        zag.o(view.findViewById(R.id.post_author), false);
        zag.o(view.findViewById(R.id.post_text), false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.i;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, awbh awbhVar) {
        apzg apzgVar;
        ajrp ajrpVar = this.E;
        acti actiVar = ajrsVar.a;
        if ((awbhVar.b & 512) != 0) {
            apzgVar = awbhVar.k;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.b(actiVar, apzgVar, ajrsVar.e(), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(avhn avhnVar, ajnb ajnbVar) {
        ajmt b = this.h.c().b();
        b.d = ajnbVar;
        super.A(avhnVar, b.a());
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.E.c();
    }
}
