package defpackage;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: fsh  reason: default package */
/* loaded from: classes3.dex */
public final class fsh {
    public final String a;
    public final ayoi b;
    public final boolean c;
    public final fsi d;
    public final fhg e;
    public final RecyclerView f;
    public final boolean g;
    public final boolean h;

    public fsh() {
    }

    public fsh(String str, ayoi ayoiVar, boolean z, fsi fsiVar, fhg fhgVar, RecyclerView recyclerView, boolean z2, boolean z3) {
        this.a = str;
        this.b = ayoiVar;
        this.c = z;
        this.d = fsiVar;
        this.e = fhgVar;
        this.f = recyclerView;
        this.g = z2;
        this.h = z3;
    }

    public static fsg a() {
        fsg fsgVar = new fsg();
        fsgVar.e(false);
        return fsgVar;
    }

    public final boolean b() {
        return TextUtils.equals(this.a, "FEwhat_to_watch");
    }

    public final boolean c() {
        return TextUtils.equals(this.a, "FEsubscriptions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fsh) {
            fsh fshVar = (fsh) obj;
            String str = this.a;
            if (str != null ? str.equals(fshVar.a) : fshVar.a == null) {
                if (this.b.equals(fshVar.b) && this.c == fshVar.c && this.d.equals(fshVar.d) && this.e.equals(fshVar.e) && this.f.equals(fshVar.f) && this.g == fshVar.g && this.h == fshVar.h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 1237;
        int hashCode = ((((((((((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.h) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        boolean z2 = this.g;
        boolean z3 = this.h;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 207 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("FeedFilterBarModel{feedId=");
        sb.append(str);
        sb.append(", isFilterAppliedObservable=");
        sb.append(valueOf);
        sb.append(", isFilterApplied=");
        sb.append(z);
        sb.append(", shownCallback=");
        sb.append(valueOf2);
        sb.append(", swipeRefreshUiController=");
        sb.append(valueOf3);
        sb.append(", recyclerView=");
        sb.append(valueOf4);
        sb.append(", isAccessibilityEnabled=");
        sb.append(z2);
        sb.append(", shouldSkipHideAnimationOnAppStart=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
