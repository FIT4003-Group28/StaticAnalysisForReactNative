package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fpo  reason: default package */
/* loaded from: classes3.dex */
public final class fpo extends ajsl {
    private final ajmy a;
    private final CardView b;
    private final ImageView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final akbm g;
    private final ftc h;
    private final ajrp i;

    public fpo(Activity activity, ajmy ajmyVar, aafo aafoVar, akbn akbnVar, ViewGroup viewGroup) {
        ajmyVar.getClass();
        this.a = ajmyVar;
        CardView cardView = (CardView) LayoutInflater.from(activity).inflate(R.layout.movie_card, viewGroup, false);
        this.b = cardView;
        TextView textView = (TextView) cardView.findViewById(R.id.title);
        textView.getClass();
        this.e = textView;
        TextView textView2 = (TextView) cardView.findViewById(R.id.subtitle);
        textView2.getClass();
        this.f = textView2;
        this.g = akbnVar.a((TextView) cardView.findViewById(R.id.offer_button));
        ImageView imageView = (ImageView) cardView.findViewById(R.id.thumbnail);
        imageView.getClass();
        this.c = imageView;
        this.d = (TextView) cardView.findViewById(R.id.duration);
        this.i = new ajrp(aafoVar, cardView);
        ViewStub viewStub = (ViewStub) cardView.findViewById(R.id.standalone_ypc_badge);
        this.h = viewStub == null ? null : new ftc(viewStub, 1);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dd  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpo.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atim) obj).j.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.i.c();
    }
}
