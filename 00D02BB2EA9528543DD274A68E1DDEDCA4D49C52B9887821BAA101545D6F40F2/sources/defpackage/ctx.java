package defpackage;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: ctx  reason: default package */
/* loaded from: classes5.dex */
final class ctx implements btzi<buff, bufh> {
    final /* synthetic */ dbsg a;
    final /* synthetic */ cty b;
    final /* synthetic */ bmdn c;

    public ctx(cty ctyVar, dbsg dbsgVar, bmdn bmdnVar) {
        this.b = ctyVar;
        this.a = dbsgVar;
        this.c = bmdnVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<buff> btzrVar, btzy btzyVar) {
        this.b.b.c();
        this.b.b(ddda.j, this.a);
        String valueOf = String.valueOf(btzyVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("Failed to fetch ads call tracking json response: ");
        sb.append(valueOf);
        sb.toString();
        this.c.b();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<buff> btzrVar, bufh bufhVar) {
        String J = bufhVar.b.J();
        if (J.startsWith(")]}'\n")) {
            J = J.substring(5);
        }
        try {
            String string = new JSONObject(J).getString("dpn");
            this.b.b.c();
            this.b.b(ddda.k, this.a);
            bmdn bmdnVar = this.c;
            String valueOf = String.valueOf(string);
            bmdnVar.a(Uri.parse(valueOf.length() != 0 ? "tel: ".concat(valueOf) : new String("tel: ")));
            if (String.valueOf(string).length() != 0) {
                return;
            }
            new String("Calling with ads dynamic call tracked number tel: ");
        } catch (JSONException unused) {
            this.b.b.c();
            this.b.b(ddda.j, this.a);
            if (String.valueOf(J).length() == 0) {
                new String("Failed to parse ads call tracking json response:: ");
            }
            this.c.b();
        }
    }
}
