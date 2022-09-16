package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lda  reason: default package */
/* loaded from: classes3.dex */
public final class lda {
    public final apy a;
    public final acti b;
    public final eo c;
    public final TextView d;
    final LinearLayout e;
    public final ImageView f;
    public final lec g;
    public final akge h;
    public aurq i;
    private lcv j;
    private final aacz k;
    private final apwt l;

    public lda(aacz aaczVar, lcw lcwVar, apwt apwtVar, akge akgeVar, apy apyVar, LinearLayout linearLayout, acti actiVar, eo eoVar, lec lecVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        String str;
        this.k = aaczVar;
        this.g = lecVar;
        this.l = apwtVar;
        this.h = akgeVar;
        this.a = apyVar;
        this.b = actiVar;
        this.c = eoVar;
        this.e = linearLayout;
        this.d = (TextView) linearLayout.findViewById(R.id.voice_language);
        this.f = (ImageView) linearLayout.findViewById(R.id.voice_language_icon);
        if (eog.au(aaczVar)) {
            String x = apwt.x();
            String a = apwtVar.a();
            if (x.isEmpty() || a.isEmpty()) {
                str = "en-US";
            } else {
                StringBuilder sb = new StringBuilder(x.length() + 1 + String.valueOf(a).length());
                sb.append(x);
                sb.append("-");
                sb.append(a);
                str = sb.toString();
            }
            lcv a2 = lcwVar.a(str);
            this.j = a2;
            ylx.n(apyVar, a2.a(), new lcy(this, 2), new lcy(this, 1));
        }
    }
}
