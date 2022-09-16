package defpackage;

import android.content.Context;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vlo  reason: default package */
/* loaded from: classes4.dex */
public final class vlo {
    public final Context a;
    public final ankw b;
    public String c;
    public Set d;
    public vln g;
    private boolean h = false;
    public boolean e = false;
    public amqo f = gsh.j;

    public vlo(Context context, ankw ankwVar) {
        this.a = context;
        this.b = ankwVar;
    }

    public final vlr a() {
        boolean z = true;
        if (!this.h && this.d == null) {
            z = false;
        }
        aqxo.q(z, "Must specify either forKeys(...) or forAllKeys() before calling build().");
        return new vlr(this);
    }

    public final void b() {
        this.e = true;
    }

    public final void c() {
        this.d = null;
        this.h = true;
    }

    public final void d(String... strArr) {
        boolean z = true;
        aqxo.q(strArr != null, "Cannot call forKeys() with null argument");
        amvl i = amvn.i();
        i.i(strArr);
        amvn g = i.g();
        if (g.size() != strArr.length) {
            z = false;
        }
        aqxo.q(z, "Duplicate keys specified");
        this.d = g;
        this.h = false;
    }

    public final void e(vlp vlpVar) {
        this.g = new vln(vlpVar);
    }
}
