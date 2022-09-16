package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xif  reason: default package */
/* loaded from: classes4.dex */
public final class xif extends xii {
    public aice a;
    public xig f;
    public boolean g;
    public boolean h;
    public boolean i;
    private final Context j;
    private final int k;

    public xif(Context context) {
        super(xhe.a().a());
        this.j = context;
        this.k = R.string.ad_learn_more;
    }

    public static final boolean a(boolean z, boolean z2, boolean z3) {
        return z && !z2 && !z3;
    }

    @Override // defpackage.xhz
    public final /* bridge */ /* synthetic */ void b(Object obj, boolean z) {
        xhe xheVar = (xhe) obj;
        CharSequence charSequence = xheVar.c;
        boolean z2 = xheVar.b;
        this.i = xheVar.a;
        int i = 8;
        if (!((xhe) this.b).c.equals(charSequence) || ((xhe) this.b).b != z2) {
            if (!z2) {
                aice aiceVar = this.a;
                if (aiceVar != null) {
                    aiceVar.c(8);
                }
            } else {
                if ("<NONE>".equals(charSequence)) {
                    charSequence = this.j.getResources().getString(this.k);
                }
                aice aiceVar2 = this.a;
                if (aiceVar2 != null) {
                    aiceVar2.b(charSequence);
                }
            }
        }
        aice aiceVar3 = this.a;
        if (aiceVar3 != null) {
            if (z && a(z2, this.i, this.g)) {
                i = 0;
            }
            aiceVar3.c(i);
        }
    }
}
