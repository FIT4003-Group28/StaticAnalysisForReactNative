package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hhe  reason: default package */
/* loaded from: classes3.dex */
public final class hhe {
    public final hkl a;
    private final eo b;

    public hhe(eo eoVar, hkl hklVar) {
        this.b = eoVar;
        this.a = hklVar;
    }

    public final void a(dp dpVar, String str) {
        eo eoVar = this.b;
        if (eoVar == null || eoVar.x || eoVar.Z()) {
            StringBuilder sb = new StringBuilder(str.length() + 56);
            sb.append("Attempted fragment replace after instance state saved (");
            sb.append(str);
            sb.append(")");
            zep.b(sb.toString());
            StringBuilder sb2 = new StringBuilder(str.length() + 93);
            sb2.append("[ShortsCreation][Android][Navigation]Attempted fragment replace after instance state saved (");
            sb2.append(str);
            sb2.append(")");
            afus.b(1, 6, sb2.toString());
            return;
        }
        ex l = this.b.l();
        l.u(R.id.reel_container, dpVar, str);
        l.d();
    }
}
