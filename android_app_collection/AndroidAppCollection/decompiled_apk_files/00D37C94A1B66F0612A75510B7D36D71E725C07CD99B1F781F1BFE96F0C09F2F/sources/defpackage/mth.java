package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mth  reason: default package */
/* loaded from: classes3.dex */
public final class mth extends ajsl {
    public final yni a;
    private final ajmy b;
    private final ajrx c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;

    public mth(Context context, ajmy ajmyVar, yni yniVar, gem gemVar) {
        ajmyVar.getClass();
        this.b = ajmyVar;
        yniVar.getClass();
        this.a = yniVar;
        this.c = gemVar;
        View inflate = View.inflate(context, R.layout.ypc_post_tip_watch_screen, null);
        this.g = (ImageView) inflate.findViewById(R.id.viewer_thumbnail);
        this.d = (TextView) inflate.findViewById(R.id.confirmation_msg_header);
        this.e = (TextView) inflate.findViewById(R.id.confirmation_msg);
        TextView textView = (TextView) inflate.findViewById(R.id.done);
        this.f = textView;
        textView.setOnClickListener(new mtg(this));
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.c).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        awik awikVar = (awik) obj;
        if (hqs.q(ajrsVar)) {
            this.e.setTextSize(2, 18.0f);
            this.d.setTextSize(2, 18.0f);
            this.d.setLines(2);
        } else {
            this.e.setTextSize(2, 22.0f);
            this.d.setTextSize(2, 22.0f);
        }
        ajmy ajmyVar = this.b;
        ImageView imageView = this.g;
        avhn avhnVar = awikVar.b;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.d;
        arag aragVar = awikVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.e;
        arag aragVar2 = awikVar.d;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        TextView textView3 = this.f;
        arag aragVar3 = awikVar.e;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        textView3.setText(ajgl.b(aragVar3));
        this.c.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awik) obj).f.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
