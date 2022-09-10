package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cdhe  reason: default package */
/* loaded from: classes4.dex */
public final class cdhe {
    public final Uri a;
    @dzsi
    public Bitmap b;
    @dzsi
    public final akqq d;
    private final boolean h;
    public aeui c = aeui.b;
    public final List<cpfx> e = dchl.a();
    public final List<cdhg> f = dchl.a();
    private final Map<String, List<String>> g = dcjz.h();

    public cdhe(Uri uri, @dzsi akqq akqqVar, boolean z) {
        this.a = uri;
        this.d = akqqVar;
        this.h = z;
    }

    public final boolean a() {
        return this.h && this.f.isEmpty();
    }

    public final void b(cdhg cdhgVar) {
        c(cdhgVar, null);
    }

    public final void c(cdhg cdhgVar, @dzsi String str) {
        String valueOf = String.valueOf(cdhgVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Rejecting photo: ");
        sb.append(valueOf);
        String sb2 = sb.toString();
        if (str != null) {
            String valueOf2 = String.valueOf(sb2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 3 + str.length());
            sb3.append(valueOf2);
            sb3.append(" (");
            sb3.append(str);
            sb3.append(")");
            sb3.toString();
        }
        this.f.add(cdhgVar);
    }

    public final void d(String str) {
        List<String> list = this.g.get("SNAP_TO_PLACE");
        if (list == null) {
            list = dchl.a();
            this.g.put("SNAP_TO_PLACE", list);
        }
        list.add(str);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("imageUri", this.a);
        b.b("iAmHereState", this.c);
        b.b("icaLabels", this.e);
        b.b("rejectionReasons", TextUtils.join("; ", this.f));
        return b.toString();
    }
}
