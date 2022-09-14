package c.d.j.l;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f3390a;

    public b(Set<c> set) {
        this.f3390a = new ArrayList(set.size());
        for (c cVar : set) {
            if (cVar != null) {
                this.f3390a.add(cVar);
            }
        }
    }

    public b(c... cVarArr) {
        this.f3390a = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            if (cVar != null) {
                this.f3390a.add(cVar);
            }
        }
    }

    private void a(String str, Throwable th) {
        c.d.d.e.a.b("ForwardingRequestListener", str, th);
    }

    public void a(c cVar) {
        this.f3390a.add(cVar);
    }

    @Override // c.d.j.l.c
    public void a(c.d.j.o.c cVar, Object obj, String str, boolean z) {
        int size = this.f3390a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f3390a.get(i).a(cVar, obj, str, z);
            } catch (Exception e2) {
                a("InternalListener exception in onRequestStart", e2);
            }
        }
    }

    @Override // c.d.j.l.c
    public void a(c.d.j.o.c cVar, String str, Throwable th, boolean z) {
        int size = this.f3390a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f3390a.get(i).a(cVar, str, th, z);
            } catch (Exception e2) {
                a("InternalListener exception in onRequestFailure", e2);
            }
        }
    }

    @Override // c.d.j.l.c
    public void a(c.d.j.o.c cVar, String str, boolean z) {
        int size = this.f3390a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f3390a.get(i).a(cVar, str, z);
            } catch (Exception e2) {
                a("InternalListener exception in onRequestSuccess", e2);
            }
        }
    }

    @Override // c.d.j.n.m0
    public void a(String str, String str2) {
        int size = this.f3390a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f3390a.get(i).a(str, str2);
            } catch (Exception e2) {
                a("InternalListener exception in onProducerStart", e2);
            }
        }
    }

    @Override // c.d.j.n.m0
    public void a(String str, String str2, String str3) {
        int size = this.f3390a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f3390a.get(i).a(str, str2, str3);
            } catch (Exception e2) {
                a("InternalListener exception in onIntermediateChunkStart", e2);
            }
        }
    }

    @Override // c.d.j.n.m0
    public void a(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f3390a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f3390a.get(i).a(str, str2, th, map);
            } catch (Exception e2) {
                a("InternalListener exception in onProducerFinishWithFailure", e2);
            }
        }
    }

    @Override // c.d.j.n.m0
    public void a(String str, String str2, Map<String, String> map) {
        int size = this.f3390a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f3390a.get(i).a(str, str2, map);
            } catch (Exception e2) {
                a("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // c.d.j.n.m0
    public void a(String str, String str2, boolean z) {
        int size = this.f3390a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f3390a.get(i).a(str, str2, z);
            } catch (Exception e2) {
                a("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // c.d.j.n.m0
    public boolean a(String str) {
        int size = this.f3390a.size();
        for (int i = 0; i < size; i++) {
            if (this.f3390a.get(i).a(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // c.d.j.l.c
    public void b(String str) {
        int size = this.f3390a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f3390a.get(i).b(str);
            } catch (Exception e2) {
                a("InternalListener exception in onRequestCancellation", e2);
            }
        }
    }

    @Override // c.d.j.n.m0
    public void b(String str, String str2, Map<String, String> map) {
        int size = this.f3390a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f3390a.get(i).b(str, str2, map);
            } catch (Exception e2) {
                a("InternalListener exception in onProducerFinishWithCancellation", e2);
            }
        }
    }
}
