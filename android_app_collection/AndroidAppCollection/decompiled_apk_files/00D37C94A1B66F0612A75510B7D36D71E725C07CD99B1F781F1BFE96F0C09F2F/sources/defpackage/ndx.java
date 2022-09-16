package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ndx  reason: default package */
/* loaded from: classes3.dex */
public final class ndx extends ajsl {
    private final Context a;
    private final ajmy b;
    private final CardView c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final ajrp h;

    public ndx(Context context, ajmy ajmyVar, aafo aafoVar, ViewGroup viewGroup) {
        this.a = context;
        ajmyVar.getClass();
        this.b = ajmyVar;
        CardView cardView = (CardView) LayoutInflater.from(context).inflate(R.layout.game_card, viewGroup, false);
        this.c = cardView;
        TextView textView = (TextView) cardView.findViewById(R.id.title);
        textView.getClass();
        this.e = textView;
        TextView textView2 = (TextView) cardView.findViewById(R.id.subtitle);
        textView2.getClass();
        this.f = textView2;
        TextView textView3 = (TextView) cardView.findViewById(R.id.auto_generated_notice);
        textView3.getClass();
        this.g = textView3;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.thumbnail);
        imageView.getClass();
        this.d = imageView;
        this.h = new ajrp(aafoVar, cardView);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndx.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arbq) obj).c.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.h.c();
    }
}
