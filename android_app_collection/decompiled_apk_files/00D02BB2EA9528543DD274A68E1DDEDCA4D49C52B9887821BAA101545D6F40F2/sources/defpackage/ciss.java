package defpackage;

import android.app.Activity;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ciss  reason: default package */
/* loaded from: classes4.dex */
public class ciss implements cisq {
    public final Activity a;
    public final chva b;
    public final dxio<afha> c;
    private final cklf d;
    private final bvsx e;
    private final cayf f;
    private final caxn g;
    private final boolean h;

    public ciss(Activity activity, cklf cklfVar, dxio<afha> dxioVar, caxn caxnVar, chva chvaVar, cayf cayfVar, boolean z) {
        this.a = activity;
        this.d = cklfVar;
        this.c = dxioVar;
        this.b = chvaVar;
        this.f = cayfVar;
        this.h = z;
        this.g = caxnVar;
        this.e = new bvsx(activity.getResources());
    }

    @Override // defpackage.cisq
    @dzsi
    public cqsn a() {
        chva chvaVar = this.b;
        if ((chvaVar.a & 2) != 0) {
            return new cqvf(chvaVar.e);
        }
        return null;
    }

    @Override // defpackage.cisq
    @dzsi
    public cqsn b() {
        chva chvaVar = this.b;
        int i = chvaVar.a;
        Spannable spannable = null;
        ClickableSpan cisrVar = null;
        if ((i & 4) != 0) {
            if ((i & 8) != 0) {
                bvsu c = this.e.c(chvaVar.g);
                chva chvaVar2 = this.b;
                String str = "";
                if (!(chvaVar2.b == 5 ? (String) chvaVar2.c : str).isEmpty()) {
                    cklf cklfVar = this.d;
                    chva chvaVar3 = this.b;
                    if (chvaVar3.b == 5) {
                        str = (String) chvaVar3.c;
                    }
                    cisrVar = cklfVar.g(str, this.a.getResources().getColor(R.color.mod_daynight_blue600));
                } else {
                    chva chvaVar4 = this.b;
                    if (chvaVar4.b == 7) {
                        str = (String) chvaVar4.c;
                    }
                    if (!str.isEmpty()) {
                        cisrVar = new cisr(this, this.a.getResources().getColor(R.color.mod_daynight_blue600));
                    }
                }
                if (cisrVar != null) {
                    c.k(cisrVar);
                }
                spannable = c.c();
            }
            if (spannable != null) {
                bvsu c2 = this.e.c(this.b.f);
                c2.a(spannable);
                return cqsk.a(c2.c());
            }
            return new cqvf(this.b.f);
        }
        return null;
    }

    @Override // defpackage.cisq
    public Boolean c() {
        boolean z = false;
        if (this.h && this.g.a) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public boolean equals(@dzsi Object obj) {
        return (obj instanceof ciss) && this.b.equals(((ciss) obj).b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{ciss.class, this.b});
    }

    @Override // defpackage.caye
    public cayf x() {
        return this.f;
    }
}
