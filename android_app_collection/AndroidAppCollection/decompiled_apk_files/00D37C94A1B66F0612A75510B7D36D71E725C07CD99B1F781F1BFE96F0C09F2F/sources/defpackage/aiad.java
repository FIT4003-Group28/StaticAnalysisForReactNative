package defpackage;

import android.widget.TextView;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aiad  reason: default package */
/* loaded from: classes.dex */
public final class aiad implements airt {
    final /* synthetic */ aiah a;
    private final /* synthetic */ int b;

    public aiad(aiah aiahVar) {
        this.a = aiahVar;
    }

    public aiad(aiah aiahVar, int i) {
        this.b = i;
        this.a = aiahVar;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return this.b != 0 ? new aypg[]{airwVar.V().v(aaku.r).Z(new aiaa(this, null)), airwVar.ad().Z(new aiaa(this, 1, null))} : new aypg[]{airwVar.G().d.h(aiwv.n(airwVar.aB(), 32768L)).h(aiwv.l(1)).aa(new ayqb() { // from class: aiac
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                String format;
                aiad aiadVar = aiad.this;
                ahhx ahhxVar = (ahhx) obj;
                long a = ahhxVar.a();
                long e = ahhxVar.e();
                aiah aiahVar = aiadVar.a;
                long j = 0;
                if (e >= 0 && a >= e) {
                    j = a - e;
                }
                aiahVar.q = j;
                float f = ((float) j) / 1000.0f;
                aiaj aiajVar = (aiaj) aiahVar.a;
                aiajVar.x.setImageBitmap(aiajVar.w.a(f));
                aiajVar.v.setText(String.format(Locale.US, " %.3g s", Float.valueOf(f)));
                aiadVar.a.j();
                aiah aiahVar2 = aiadVar.a;
                ahzy ahzyVar = aiahVar2.a;
                float e2 = aiahVar2.e();
                aiaj aiajVar2 = (aiaj) ahzyVar;
                aiajVar2.t.a.setColor(true != aiadVar.a.t ? -12671196 : -48060);
                aiajVar2.u.setImageBitmap(aiajVar2.t.a(e2));
                TextView textView = aiajVar2.s;
                double d = e2;
                if (d < 1000000.0d) {
                    Locale locale = Locale.US;
                    Double.isNaN(d);
                    format = String.format(locale, " %.3g kbps", Double.valueOf(d / 1000.0d));
                } else if (d < 1.0E9d) {
                    Locale locale2 = Locale.US;
                    Double.isNaN(d);
                    format = String.format(locale2, " %.3g mbps", Double.valueOf(d / 1000000.0d));
                } else {
                    Locale locale3 = Locale.US;
                    Double.isNaN(d);
                    format = String.format(locale3, " %.3g gbps", Double.valueOf(d / 1.0E9d));
                }
                textView.setText(format);
                int intValue = ((Integer) aiadVar.a.b.get()).intValue();
                aiah aiahVar3 = aiadVar.a;
                int i = aiahVar3.g;
                ahzy ahzyVar2 = aiahVar3.a;
                int intValue2 = ((Integer) aiahVar3.c.get()).intValue() - aiadVar.a.h;
                TextView textView2 = ((aiaj) ahzyVar2).z;
                StringBuilder sb = new StringBuilder(25);
                sb.append(intValue2);
                sb.append(" / ");
                sb.append(intValue2 + (intValue - i));
                textView2.setText(sb.toString());
                aiah aiahVar4 = aiadVar.a;
                ahzy ahzyVar3 = aiahVar4.a;
                long j2 = ((aehr) aiahVar4.d.get()).f;
                if (j2 == -1) {
                    aiaj aiajVar3 = (aiaj) ahzyVar3;
                    aiajVar3.C.setVisibility(8);
                    aiajVar3.D.setVisibility(8);
                } else {
                    aiaj aiajVar4 = (aiaj) ahzyVar3;
                    aiajVar4.C.setVisibility(0);
                    aiajVar4.D.setVisibility(0);
                    aiajVar4.D.setText(String.format(Locale.US, "%.2fs", Float.valueOf(((float) j2) / 1000.0f)));
                }
                aiadVar.a.h();
            }
        }, ahqs.q)};
    }
}
