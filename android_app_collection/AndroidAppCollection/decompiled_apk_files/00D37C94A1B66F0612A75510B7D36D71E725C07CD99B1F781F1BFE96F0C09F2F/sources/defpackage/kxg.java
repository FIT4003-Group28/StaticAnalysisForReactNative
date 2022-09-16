package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kxg  reason: default package */
/* loaded from: classes3.dex */
public final class kxg extends ajsl {
    private final ajmy a;
    private final CardView b;
    private final ImageView c;
    private final TextView d;
    private final ajrp e;

    public kxg(Activity activity, ajmy ajmyVar, aafo aafoVar, akem akemVar, ViewGroup viewGroup) {
        this.a = ajmyVar;
        CardView cardView = (CardView) LayoutInflater.from(activity).inflate(R.layout.album_card, viewGroup, false);
        this.b = cardView;
        TextView textView = (TextView) cardView.findViewById(R.id.title);
        textView.getClass();
        this.d = textView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.thumbnail);
        imageView.getClass();
        this.c = imageView;
        this.e = new ajrp(aafoVar, cardView);
        akemVar.c(cardView, akemVar.a(cardView, null));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        apdv apdvVar = (apdv) obj;
        ajrp ajrpVar = this.e;
        acti actiVar = ajrsVar.a;
        arag aragVar = null;
        if ((apdvVar.b & 8) != 0) {
            apzgVar = apdvVar.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        ajmy ajmyVar = this.a;
        ImageView imageView = this.c;
        avhn avhnVar = apdvVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.d;
        if ((apdvVar.b & 2) != 0 && (aragVar = apdvVar.d) == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apdv) obj).f.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.c();
    }
}
