package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cudc  reason: default package */
/* loaded from: classes5.dex */
public final class cudc extends cufo {
    public Long a;
    public dbsg<cuib> b;
    private ConversationId c;
    private dbsg<String> d;
    private dbsg<String> e;
    private dbsg<Bitmap> f;
    private Boolean g;
    private Long h;
    private Boolean i;
    private Map<String, byte[]> j;
    private dcdc<Integer> k;
    private Long l;
    private Long m;

    public cudc() {
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.f = dbpy.a;
        this.b = dbpy.a;
    }

    public cudc(cufp cufpVar) {
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.f = dbpy.a;
        this.b = dbpy.a;
        cudd cuddVar = (cudd) cufpVar;
        this.c = cuddVar.a;
        this.d = cuddVar.b;
        this.e = cuddVar.c;
        this.f = cuddVar.d;
        this.g = Boolean.valueOf(cuddVar.e);
        this.h = cuddVar.f;
        this.a = cuddVar.g;
        this.i = Boolean.valueOf(cuddVar.h);
        this.j = cuddVar.i;
        this.b = cuddVar.j;
        this.k = cuddVar.k;
        this.l = cuddVar.l;
        this.m = cuddVar.m;
    }

    @Override // defpackage.cufo
    public final void b(Map<String, byte[]> map) {
        if (map != null) {
            this.j = map;
            return;
        }
        throw new NullPointerException("Null appData");
    }

    @Override // defpackage.cufo
    public final void c(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.cufo
    public final void d(dcdc<Integer> dcdcVar) {
        if (dcdcVar != null) {
            this.k = dcdcVar;
            return;
        }
        throw new NullPointerException("Null capabilities");
    }

    @Override // defpackage.cufo
    public final void e(ConversationId conversationId) {
        if (conversationId != null) {
            this.c = conversationId;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    @Override // defpackage.cufo
    public final void f(Long l) {
        if (l != null) {
            this.h = l;
            return;
        }
        throw new NullPointerException("Null expirationTimeMillis");
    }

    @Override // defpackage.cufo
    public final void g(Bitmap bitmap) {
        this.f = dbsg.i(bitmap);
    }

    @Override // defpackage.cufo
    public final void h(String str) {
        this.e = dbsg.i(str);
    }

    @Override // defpackage.cufo
    public final void i(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.cufo
    public final void j(Long l) {
        if (l != null) {
            this.l = l;
            return;
        }
        throw new NullPointerException("Null propertiesExpirationTimeMillis");
    }

    @Override // defpackage.cufo
    public final void k(long j) {
        this.m = Long.valueOf(j);
    }

    @Override // defpackage.cufo
    public final void l(dbsg<cuib> dbsgVar) {
        this.b = dbsgVar;
    }

    @Override // defpackage.cufo
    public final void m(String str) {
        this.d = dbsg.i(str);
    }

    @Override // defpackage.cufo
    public final cufp a() {
        String str = this.c == null ? " conversationId" : "";
        if (this.g == null) {
            str = str.concat(" isImageStale");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" expirationTimeMillis");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" lastDeletedTimeMillis");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" blockable");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" appData");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" capabilities");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" propertiesExpirationTimeMillis");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" serverTimestampUs");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cudd(this.c, this.d, this.e, this.f, this.g.booleanValue(), this.h, this.a, this.i.booleanValue(), this.j, this.b, this.k, this.l, this.m);
    }
}
