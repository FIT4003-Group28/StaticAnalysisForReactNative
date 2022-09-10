package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aphi  reason: default package */
/* loaded from: classes2.dex */
public final class aphi {
    public static jic a(ilo iloVar, cqtd cqtdVar) {
        String str;
        if (iloVar.bJ().equals(dwfl.w)) {
            str = null;
        } else {
            dwfl dwflVar = iloVar.h().G;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            str = dwflVar.h;
            if (!str.startsWith("http:") || !str.startsWith("https:")) {
                String valueOf = String.valueOf(str);
                str = valueOf.length() != 0 ? "https:".concat(valueOf) : new String("https:");
            }
        }
        if (str != null) {
            cqtdVar = cqrt.f(R.color.qu_grey_200);
        }
        return new jic(str, ckqc.FULLY_QUALIFIED, cqtdVar, 250);
    }
}
