package defpackage;

import android.content.Context;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cwgb  reason: default package */
/* loaded from: classes5.dex */
public final class cwgb implements cwjs<cwfm> {
    private final Context a;
    private final cwlw b;

    public cwgb(Context context, cwlw cwlwVar) {
        this.a = context;
        dbsk.s(cwlwVar);
        this.b = cwlwVar;
    }

    @Override // defpackage.cwjs
    public final /* bridge */ /* synthetic */ void a(cwfm cwfmVar, int i, cwjr cwjrVar) {
        int i2;
        cwfm cwfmVar2 = cwfmVar;
        Context context = this.a;
        if (i > 0) {
            float f = i / context.getResources().getDisplayMetrics().density;
            int[] a = cwlv.a();
            int i3 = 0;
            while (true) {
                if (i3 >= 4) {
                    i2 = R.styleable.AppCompatTheme_windowFixedHeightMajor;
                    break;
                }
                int i4 = a[i3];
                if (i4 == 0) {
                    throw null;
                }
                if (f <= i4) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
        } else {
            i2 = 64;
        }
        deha.q(this.b.f(cwfmVar2.b(), i2), new cwga(cwjrVar), dege.a);
    }
}
