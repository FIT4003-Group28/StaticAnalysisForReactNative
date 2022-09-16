package defpackage;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: yet  reason: default package */
/* loaded from: classes4.dex */
public final class yet extends ajsl {
    final TextView a;
    final TextView b;
    final TextView c;
    final View d;
    final ImageView e;
    final View f;
    public final HashMap g;
    public atep h;
    private final ViewGroup i;
    private final CardView j;
    private final TextView k;
    private final TextView l;
    private final akbm m;
    private final akbm n;
    private final aafo o;
    private final ajxz p;
    private final ajmy q;

    public yet(final dt dtVar, akbn akbnVar, final aafo aafoVar, final ajxz ajxzVar, ajmy ajmyVar, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(dtVar).inflate(R.layout.subscription_product_card, viewGroup, false);
        this.i = viewGroup2;
        CardView cardView = (CardView) viewGroup2.findViewById(R.id.card_view);
        this.j = cardView;
        View findViewById = cardView.findViewById(R.id.contextual_menu_anchor);
        this.f = findViewById;
        this.e = (ImageView) cardView.findViewById(R.id.logo);
        this.a = (TextView) cardView.findViewById(R.id.metadata);
        this.b = (TextView) cardView.findViewById(R.id.additional_info);
        this.c = (TextView) cardView.findViewById(R.id.description);
        this.d = cardView.findViewById(R.id.red_bar);
        TextView textView = (TextView) cardView.findViewById(R.id.primary_button);
        this.k = textView;
        this.m = akbnVar.a(textView);
        TextView textView2 = (TextView) cardView.findViewById(R.id.secondary_button);
        this.l = textView2;
        this.n = akbnVar.a(textView2);
        new ajyf(cardView, findViewById);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: yes
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yet yetVar = yet.this;
                dt dtVar2 = dtVar;
                aafo aafoVar2 = aafoVar;
                ajxz ajxzVar2 = ajxzVar;
                atep atepVar = yetVar.h;
                if (atepVar != null) {
                    akbc.b(dtVar2, atepVar, aafoVar2, ajxzVar2, null, null, null, null);
                }
            }
        });
        this.o = aafoVar;
        this.p = ajxzVar;
        this.q = ajmyVar;
        HashMap hashMap = new HashMap();
        this.g = hashMap;
        Bundle bundle = new Bundle();
        bundle.putBoolean("menu_as_bottom_sheet", true);
        hashMap.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
    }

    private final SpannableString f(List list) {
        if (!list.isEmpty()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                arag aragVar = (arag) it.next();
                if (i > 0) {
                    spannableStringBuilder.append((CharSequence) System.getProperty("line.separator"));
                }
                spannableStringBuilder.append((CharSequence) aafv.a(aragVar, this.o, false));
                i++;
            }
            return SpannableString.valueOf(spannableStringBuilder);
        }
        return null;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yet.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avbs) obj).k.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
