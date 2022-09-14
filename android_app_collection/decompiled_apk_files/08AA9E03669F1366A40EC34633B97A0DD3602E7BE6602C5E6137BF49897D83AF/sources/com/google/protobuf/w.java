package com.google.protobuf;
/* compiled from: LazyFieldLite.java */
/* loaded from: classes.dex */
public class w {

    /* renamed from: b  reason: collision with root package name */
    private static final p f4762b = p.d();

    /* renamed from: a  reason: collision with root package name */
    protected volatile ac f4763a;

    /* renamed from: c  reason: collision with root package name */
    private f f4764c;

    /* renamed from: d  reason: collision with root package name */
    private p f4765d;
    private volatile f e;

    public int hashCode() {
        return 1;
    }

    public w(p pVar, f fVar) {
        a(pVar, fVar);
        this.f4765d = pVar;
        this.f4764c = fVar;
    }

    public w() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        ac acVar = this.f4763a;
        ac acVar2 = wVar.f4763a;
        if (acVar == null && acVar2 == null) {
            return c().equals(wVar.c());
        }
        if (acVar != null && acVar2 != null) {
            return acVar.equals(acVar2);
        }
        if (acVar != null) {
            return acVar.equals(wVar.a(acVar.E()));
        }
        return a(acVar2.E()).equals(acVar2);
    }

    public ac a(ac acVar) {
        c(acVar);
        return this.f4763a;
    }

    public ac b(ac acVar) {
        ac acVar2 = this.f4763a;
        this.f4764c = null;
        this.e = null;
        this.f4763a = acVar;
        return acVar2;
    }

    public int b() {
        if (this.e != null) {
            return this.e.b();
        }
        if (this.f4764c != null) {
            return this.f4764c.b();
        }
        if (this.f4763a == null) {
            return 0;
        }
        return this.f4763a.getSerializedSize();
    }

    public f c() {
        if (this.e != null) {
            return this.e;
        }
        if (this.f4764c != null) {
            return this.f4764c;
        }
        synchronized (this) {
            if (this.e != null) {
                return this.e;
            }
            if (this.f4763a == null) {
                this.e = f.f4423a;
            } else {
                this.e = this.f4763a.toByteString();
            }
            return this.e;
        }
    }

    protected void c(ac acVar) {
        if (this.f4763a != null) {
            return;
        }
        synchronized (this) {
            if (this.f4763a != null) {
                return;
            }
            try {
                if (this.f4764c != null) {
                    this.f4763a = acVar.getParserForType().c(this.f4764c, this.f4765d);
                    this.e = this.f4764c;
                } else {
                    this.f4763a = acVar;
                    this.e = f.f4423a;
                }
            } catch (u unused) {
                this.f4763a = acVar;
                this.e = f.f4423a;
            }
        }
    }

    private static void a(p pVar, f fVar) {
        if (pVar == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (fVar != null) {
            return;
        }
        throw new NullPointerException("found null ByteString");
    }
}
