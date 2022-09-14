package c.d.h.a.a;

import android.content.Context;
import android.content.res.Resources;
import c.d.d.d.l;
import c.d.j.d.p;
import c.d.j.f.h;
import c.d.j.f.k;
import java.util.Set;
/* loaded from: classes.dex */
public class f implements l<e> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2918a;

    /* renamed from: b  reason: collision with root package name */
    private final h f2919b;

    /* renamed from: c  reason: collision with root package name */
    private final g f2920c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<c.d.h.c.d> f2921d;

    /* renamed from: e  reason: collision with root package name */
    private final c.d.h.a.a.i.f f2922e;

    public f(Context context, b bVar) {
        this(context, k.o(), bVar);
    }

    public f(Context context, k kVar, b bVar) {
        this(context, kVar, null, bVar);
    }

    public f(Context context, k kVar, Set<c.d.h.c.d> set, b bVar) {
        this.f2918a = context;
        this.f2919b = kVar.f();
        if (bVar != null) {
            bVar.d();
            throw null;
        }
        this.f2920c = new g();
        g gVar = this.f2920c;
        Resources resources = context.getResources();
        c.d.h.b.a c2 = c.d.h.b.a.c();
        c.d.j.j.a a2 = kVar.a(context);
        c.d.d.b.f b2 = c.d.d.b.f.b();
        p<c.d.b.a.d, c.d.j.k.b> e2 = this.f2919b.e();
        if (bVar != null) {
            bVar.a();
            throw null;
        } else if (bVar != null) {
            bVar.b();
            throw null;
        } else {
            gVar.a(resources, c2, a2, b2, e2, null, null);
            this.f2921d = set;
            if (bVar == null) {
                this.f2922e = null;
            } else {
                bVar.c();
                throw null;
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.d.d.d.l
    /* renamed from: get */
    public e mo139get() {
        return new e(this.f2918a, this.f2920c, this.f2919b, this.f2921d).a(this.f2922e);
    }
}
