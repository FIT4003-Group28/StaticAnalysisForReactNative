package defpackage;

import android.content.res.Resources;
import com.google.android.libraries.youtube.ads.player.ui.AdProgressTextView;
import com.google.android.youtube.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: xia  reason: default package */
/* loaded from: classes4.dex */
public final class xia extends xhz {
    private final boolean a;
    private final boolean f;
    private Resources g;
    private String h;
    private String i;

    public xia(boolean z, boolean z2) {
        super(xgw.b().a());
        this.a = z;
        this.f = z2;
    }

    private final void a(boolean z) {
        if (this.e) {
            ((AdProgressTextView) this.c).setVisibility(true != z ? 8 : 0);
        }
    }

    @Override // defpackage.xhz
    public final /* bridge */ /* synthetic */ void b(Object obj, boolean z) {
        String str;
        String string;
        xgw xgwVar = (xgw) obj;
        int i = xgwVar.a;
        if (i == -1) {
            ((AdProgressTextView) this.c).a.a();
            i = -1;
        }
        boolean z2 = xgwVar.b;
        if (z2 != ((xgw) this.b).b) {
            ((AdProgressTextView) this.c).a.b(z2, false);
        }
        if (this.d != z) {
            a(z);
        }
        ampm c = ampm.b(this.h).c();
        String[] strArr = new String[3];
        wzr wzrVar = xgwVar.c;
        String str2 = null;
        if (!wzrVar.d) {
            str = this.i;
        } else if (!wzrVar.e.h()) {
            str = null;
        } else {
            apaq apaqVar = ((auwd) wzrVar.e.c()).b;
            if (apaqVar == null) {
                apaqVar = apaq.a;
            }
            str = apaqVar.c;
        }
        strArr[0] = str;
        wzr wzrVar2 = xgwVar.c;
        int i2 = wzrVar2.c;
        if (i2 != 0 && i2 != 1 && !this.a) {
            if (!wzrVar2.d) {
                string = this.g.getString(R.string.ad_count, Integer.valueOf(wzrVar2.b), Integer.valueOf(wzrVar2.c));
            } else if (wzrVar2.f.h()) {
                string = ((apaq) wzrVar2.f.c()).c;
            }
            strArr[1] = string;
            if (i >= 0 && !this.f) {
                str2 = zgh.i((i + 999) / 1000);
            }
            strArr[2] = str2;
            ((AdProgressTextView) this.c).setText(c.d(Arrays.asList(strArr)));
        }
        string = null;
        strArr[1] = string;
        if (i >= 0) {
            str2 = zgh.i((i + 999) / 1000);
        }
        strArr[2] = str2;
        ((AdProgressTextView) this.c).setText(c.d(Arrays.asList(strArr)));
    }

    @Override // defpackage.xhz
    public final void d() {
        a(this.d);
        this.g = ((AdProgressTextView) this.c).getResources();
        this.h = ((AdProgressTextView) this.c).getResources().getString(R.string.ad_text_separator);
        this.i = ((AdProgressTextView) this.c).getResources().getString(R.string.ad_badge);
    }
}
