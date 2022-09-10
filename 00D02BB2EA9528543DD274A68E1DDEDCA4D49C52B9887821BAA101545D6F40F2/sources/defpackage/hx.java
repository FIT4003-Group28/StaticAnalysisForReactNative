package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: hx  reason: default package */
/* loaded from: classes6.dex */
public final class hx {
    private final IconCompat a;
    private final CharSequence b;
    private final PendingIntent c;
    private boolean d;
    private final Bundle e;
    private ArrayList<ip> f;
    private boolean g;

    public hx(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat b = i == 0 ? null : IconCompat.b(null, "", i);
        Bundle bundle = new Bundle();
        this.d = true;
        this.g = true;
        this.a = b;
        this.b = ib.c(charSequence);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = true;
    }

    public final hy a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<ip> arrayList3 = this.f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                ip ipVar = arrayList3.get(i);
                boolean z = ipVar.c;
                arrayList2.add(ipVar);
            }
        }
        if (!arrayList.isEmpty()) {
            ip[] ipVarArr = (ip[]) arrayList.toArray(new ip[arrayList.size()]);
        }
        return new hy(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (ip[]) arrayList2.toArray(new ip[arrayList2.size()]), this.d, this.g);
    }

    public final void b(ip ipVar) {
        if (this.f == null) {
            this.f = new ArrayList<>();
        }
        if (ipVar != null) {
            this.f.add(ipVar);
        }
    }
}
