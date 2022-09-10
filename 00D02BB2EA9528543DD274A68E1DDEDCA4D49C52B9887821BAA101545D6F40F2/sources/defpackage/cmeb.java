package defpackage;
/* compiled from: PG */
/* renamed from: cmeb  reason: default package */
/* loaded from: classes5.dex */
final class cmeb extends cmdw {
    public static final Object b = new Object();
    public final Object d;
    private final Object e;

    public cmeb(clpb clpbVar, Object obj, Object obj2) {
        super(clpbVar);
        this.e = obj;
        this.d = obj2;
    }

    public static cmeb a(clpb clpbVar, Object obj, Object obj2) {
        return new cmeb(clpbVar, obj, obj2);
    }

    public final cmeb b(clpb clpbVar) {
        return new cmeb(clpbVar, this.e, this.d);
    }

    @Override // defpackage.cmdw, defpackage.clpb
    public final clpa f(int i, clpa clpaVar, long j) {
        this.a.f(i, clpaVar, j);
        if (cmny.b(clpaVar.b, this.e)) {
            clpaVar.b = clpa.a;
        }
        return clpaVar;
    }

    @Override // defpackage.cmdw, defpackage.clpb
    public final cloz h(int i, cloz clozVar, boolean z) {
        this.a.h(i, clozVar, z);
        if (cmny.b(clozVar.b, this.d) && z) {
            clozVar.b = b;
        }
        return clozVar;
    }

    @Override // defpackage.cmdw, defpackage.clpb
    public final int i(Object obj) {
        Object obj2;
        clpb clpbVar = this.a;
        if (b.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return clpbVar.i(obj);
    }

    @Override // defpackage.cmdw, defpackage.clpb
    public final Object j(int i) {
        Object j = this.a.j(i);
        return cmny.b(j, this.d) ? b : j;
    }
}
