package defpackage;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bwus  reason: default package */
/* loaded from: classes4.dex */
final class bwus {
    private static final ckql d;
    public final bwzi a;
    protected final bvrb b;
    private final ckqm f;
    private final Map<String, chr<Bitmap>> e = Collections.synchronizedMap(new HashMap());
    protected final Set<String> c = dcnm.g();

    static {
        ckql ckqlVar = new ckql();
        d = ckqlVar;
        ckqlVar.a = false;
    }

    public bwus(ckqm ckqmVar, bwzi bwziVar, bvrb bvrbVar) {
        this.f = ckqmVar;
        this.a = bwziVar;
        this.b = bvrbVar;
    }

    public final void a(bwur bwurVar, String str) {
        if (dbsj.d(str)) {
            bwurVar.a(null);
        } else if (this.e.containsKey(str)) {
        } else {
            this.e.put(str, this.f.d(str, new bwuq(this, str, ((ckcr) this.a.c.a(ckkd.c)).a(), bwurVar), d));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(String str) {
        chr<Bitmap> chrVar;
        if (!this.c.contains(str) && (chrVar = this.e.get(str)) != null) {
            chrVar.cancel(false);
            ckqm ckqmVar = this.f;
            if (ckqmVar != null) {
                ckqmVar.f(chrVar);
            }
            this.e.remove(str);
        }
    }
}
