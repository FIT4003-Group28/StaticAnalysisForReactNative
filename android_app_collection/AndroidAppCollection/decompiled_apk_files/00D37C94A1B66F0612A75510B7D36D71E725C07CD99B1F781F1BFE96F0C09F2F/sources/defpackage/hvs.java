package defpackage;

import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: hvs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hvs implements ampg {
    public final /* synthetic */ hvy a;
    private final /* synthetic */ int b;

    public /* synthetic */ hvs(hvy hvyVar, int i) {
        this.b = i;
        this.a = hvyVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            hvy hvyVar = this.a;
            hwp hwpVar = (hwp) obj;
            if (hwpVar == null) {
                return null;
            }
            int i = hwpVar.g;
            int i2 = hwpVar.h;
            int i3 = hwpVar.i;
            axak b = axak.b(hwpVar.j);
            ArrayList arrayList = new ArrayList();
            hvyVar.h(true);
            if (b == null) {
                b = axak.FONT_FAMILY_UNSPECIFIED;
            }
            hvyVar.e(i3, b, 36.0f, "", i, i2, arrayList);
            return null;
        }
        hvy hvyVar2 = this.a;
        if (!((hwp) obj).c) {
            akge akgeVar = hvyVar2.h;
            akfp a = akfq.a();
            a.a = hvyVar2.k;
            a.b = hvyVar2.b.getResources().getText(R.string.mentions_in_text_hint);
            a.h(1);
            a.c(2);
            a.f(-1);
            a.g(0.5f);
            akgeVar.c(a.a());
            return true;
        }
        return false;
    }
}
