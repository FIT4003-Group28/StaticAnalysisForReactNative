package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bkek  reason: default package */
/* loaded from: classes3.dex */
final class bkek implements btzi<dija, dijg> {
    final /* synthetic */ dgjl a;
    final /* synthetic */ bkem b;

    public bkek(bkem bkemVar, dgjl dgjlVar) {
        this.b = bkemVar;
        this.a = dgjlVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dija> btzrVar, btzy btzyVar) {
        this.b.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dija> btzrVar, dijg dijgVar) {
        String str;
        dijg dijgVar2 = dijgVar;
        if (this.b.j().equals(btzrVar.a.b)) {
            ArrayList arrayList = new ArrayList();
            for (dijf dijfVar : dijgVar2.a) {
                if ((dijfVar.a & 2) != 0) {
                    String str2 = dijfVar.b;
                    dije dijeVar = dijfVar.c;
                    if (dijeVar == null) {
                        dijeVar = dije.c;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) str2);
                    spannableStringBuilder.setSpan(new StyleSpan(1), 0, dijeVar.a, 33);
                    spannableStringBuilder.setSpan(new StyleSpan(1), dijeVar.b, str2.length(), 33);
                    str = spannableStringBuilder;
                } else {
                    str = dijfVar.b;
                }
                dbsg<dgis> p = bkem.p(this.a, dijfVar.b);
                if (p.a()) {
                    arrayList.add(new bkdk(str, p.b()));
                }
            }
            this.b.i.put(btzrVar.a.b, arrayList);
            this.b.n(arrayList);
        }
    }
}
