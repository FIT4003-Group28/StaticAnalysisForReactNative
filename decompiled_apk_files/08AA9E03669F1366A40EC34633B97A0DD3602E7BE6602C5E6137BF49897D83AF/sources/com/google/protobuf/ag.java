package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.ab;
import com.google.protobuf.at;
import com.google.protobuf.ay;
import com.google.protobuf.j;
import com.google.protobuf.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessageReflection.java */
/* loaded from: classes.dex */
public class ag {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MessageReflection.java */
    /* loaded from: classes.dex */
    public interface c {

        /* compiled from: MessageReflection.java */
        /* loaded from: classes.dex */
        public enum a {
            MESSAGE,
            EXTENSION_SET
        }

        a a();

        c a(j.f fVar, Object obj);

        n.b a(n nVar, j.a aVar, int i);

        Object a(f fVar, p pVar, j.f fVar2, ab abVar);

        Object a(g gVar, p pVar, j.f fVar, ab abVar);

        c b(j.f fVar, Object obj);

        Object b(g gVar, p pVar, j.f fVar, ab abVar);

        boolean b(j.f fVar);

        ay.c c(j.f fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ab abVar, Map<j.f, Object> map, h hVar, boolean z) {
        boolean d2 = abVar.getDescriptorForType().e().d();
        if (z) {
            TreeMap treeMap = new TreeMap(map);
            for (j.f fVar : abVar.getDescriptorForType().f()) {
                if (fVar.n() && !treeMap.containsKey(fVar)) {
                    treeMap.put(fVar, abVar.getField(fVar));
                }
            }
            map = treeMap;
        }
        for (Map.Entry<j.f, Object> entry : map.entrySet()) {
            j.f key = entry.getKey();
            Object value = entry.getValue();
            if (d2 && key.u() && key.i() == j.f.b.MESSAGE && !key.p()) {
                hVar.b(key.f(), (ab) value);
            } else {
                q.a(key, value, hVar);
            }
        }
        at unknownFields = abVar.getUnknownFields();
        if (d2) {
            unknownFields.a(hVar);
        } else {
            unknownFields.writeTo(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(ab abVar, Map<j.f, Object> map) {
        boolean d2 = abVar.getDescriptorForType().e().d();
        int i = 0;
        for (Map.Entry<j.f, Object> entry : map.entrySet()) {
            j.f key = entry.getKey();
            Object value = entry.getValue();
            if (d2 && key.u() && key.i() == j.f.b.MESSAGE && !key.p()) {
                i += h.d(key.f(), (ab) value);
            } else {
                i += q.c(key, value);
            }
        }
        at unknownFields = abVar.getUnknownFields();
        if (d2) {
            return i + unknownFields.e();
        }
        return i + unknownFields.getSerializedSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(af afVar) {
        for (j.f fVar : afVar.getDescriptorForType().f()) {
            if (fVar.n() && !afVar.hasField(fVar)) {
                return false;
            }
        }
        for (Map.Entry<j.f, Object> entry : afVar.getAllFields().entrySet()) {
            j.f key = entry.getKey();
            if (key.g() == j.f.a.MESSAGE) {
                if (key.p()) {
                    for (ab abVar : (List) entry.getValue()) {
                        if (!abVar.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (!((ab) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String a(String str, j.f fVar, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (fVar.u()) {
            sb.append('(');
            sb.append(fVar.c());
            sb.append(')');
        } else {
            sb.append(fVar.b());
        }
        if (i != -1) {
            sb.append('[');
            sb.append(i);
            sb.append(']');
        }
        sb.append('.');
        return sb.toString();
    }

    private static void a(af afVar, String str, List<String> list) {
        for (j.f fVar : afVar.getDescriptorForType().f()) {
            if (fVar.n() && !afVar.hasField(fVar)) {
                list.add(str + fVar.b());
            }
        }
        for (Map.Entry<j.f, Object> entry : afVar.getAllFields().entrySet()) {
            j.f key = entry.getKey();
            Object value = entry.getValue();
            if (key.g() == j.f.a.MESSAGE) {
                if (key.p()) {
                    int i = 0;
                    for (af afVar2 : (List) value) {
                        a(afVar2, a(str, key, i), list);
                        i++;
                    }
                } else if (afVar.hasField(key)) {
                    a((af) value, a(str, key, -1), list);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> b(af afVar) {
        ArrayList arrayList = new ArrayList();
        a(afVar, "", arrayList);
        return arrayList;
    }

    /* compiled from: MessageReflection.java */
    /* loaded from: classes.dex */
    static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ab.a f4323a;

        public a(ab.a aVar) {
            this.f4323a = aVar;
        }

        public Object a(j.f fVar) {
            return this.f4323a.getField(fVar);
        }

        @Override // com.google.protobuf.ag.c
        public boolean b(j.f fVar) {
            return this.f4323a.hasField(fVar);
        }

        @Override // com.google.protobuf.ag.c
        public c a(j.f fVar, Object obj) {
            this.f4323a.f(fVar, obj);
            return this;
        }

        @Override // com.google.protobuf.ag.c
        public c b(j.f fVar, Object obj) {
            this.f4323a.e(fVar, obj);
            return this;
        }

        @Override // com.google.protobuf.ag.c
        public c.a a() {
            return c.a.MESSAGE;
        }

        @Override // com.google.protobuf.ag.c
        public n.b a(n nVar, j.a aVar, int i) {
            return nVar.a(aVar, i);
        }

        @Override // com.google.protobuf.ag.c
        public Object a(g gVar, p pVar, j.f fVar, ab abVar) {
            ab.a b2;
            ab abVar2;
            if (abVar != null) {
                b2 = abVar.C();
            } else {
                b2 = this.f4323a.b(fVar);
            }
            if (!fVar.p() && (abVar2 = (ab) a(fVar)) != null) {
                b2.c(abVar2);
            }
            gVar.a(fVar.f(), b2, pVar);
            return b2.r();
        }

        @Override // com.google.protobuf.ag.c
        public Object b(g gVar, p pVar, j.f fVar, ab abVar) {
            ab.a b2;
            ab abVar2;
            if (abVar != null) {
                b2 = abVar.C();
            } else {
                b2 = this.f4323a.b(fVar);
            }
            if (!fVar.p() && (abVar2 = (ab) a(fVar)) != null) {
                b2.c(abVar2);
            }
            gVar.a(b2, pVar);
            return b2.r();
        }

        @Override // com.google.protobuf.ag.c
        public Object a(f fVar, p pVar, j.f fVar2, ab abVar) {
            ab.a b2;
            ab abVar2;
            if (abVar != null) {
                b2 = abVar.C();
            } else {
                b2 = this.f4323a.b(fVar2);
            }
            if (!fVar2.p() && (abVar2 = (ab) a(fVar2)) != null) {
                b2.c(abVar2);
            }
            b2.c(fVar, pVar);
            return b2.r();
        }

        @Override // com.google.protobuf.ag.c
        public ay.c c(j.f fVar) {
            if (fVar.l()) {
                return ay.c.STRICT;
            }
            if (!fVar.p() && (this.f4323a instanceof GeneratedMessage.a)) {
                return ay.c.LAZY;
            }
            return ay.c.LOOSE;
        }
    }

    /* compiled from: MessageReflection.java */
    /* loaded from: classes.dex */
    static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final q<j.f> f4324a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(q<j.f> qVar) {
            this.f4324a = qVar;
        }

        public Object a(j.f fVar) {
            return this.f4324a.b((q<j.f>) fVar);
        }

        @Override // com.google.protobuf.ag.c
        public boolean b(j.f fVar) {
            return this.f4324a.a((q<j.f>) fVar);
        }

        @Override // com.google.protobuf.ag.c
        public c a(j.f fVar, Object obj) {
            this.f4324a.a((q<j.f>) fVar, obj);
            return this;
        }

        @Override // com.google.protobuf.ag.c
        public c b(j.f fVar, Object obj) {
            this.f4324a.b((q<j.f>) fVar, obj);
            return this;
        }

        @Override // com.google.protobuf.ag.c
        public c.a a() {
            return c.a.EXTENSION_SET;
        }

        @Override // com.google.protobuf.ag.c
        public n.b a(n nVar, j.a aVar, int i) {
            return nVar.a(aVar, i);
        }

        @Override // com.google.protobuf.ag.c
        public Object a(g gVar, p pVar, j.f fVar, ab abVar) {
            ab abVar2;
            ab.a C = abVar.C();
            if (!fVar.p() && (abVar2 = (ab) a(fVar)) != null) {
                C.c(abVar2);
            }
            gVar.a(fVar.f(), C, pVar);
            return C.r();
        }

        @Override // com.google.protobuf.ag.c
        public Object b(g gVar, p pVar, j.f fVar, ab abVar) {
            ab abVar2;
            ab.a C = abVar.C();
            if (!fVar.p() && (abVar2 = (ab) a(fVar)) != null) {
                C.c(abVar2);
            }
            gVar.a(C, pVar);
            return C.r();
        }

        @Override // com.google.protobuf.ag.c
        public Object a(f fVar, p pVar, j.f fVar2, ab abVar) {
            ab abVar2;
            ab.a C = abVar.C();
            if (!fVar2.p() && (abVar2 = (ab) a(fVar2)) != null) {
                C.c(abVar2);
            }
            C.c(fVar, pVar);
            return C.r();
        }

        @Override // com.google.protobuf.ag.c
        public ay.c c(j.f fVar) {
            if (fVar.l()) {
                return ay.c.STRICT;
            }
            return ay.c.LOOSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.google.protobuf.g r7, com.google.protobuf.at.a r8, com.google.protobuf.p r9, com.google.protobuf.j.a r10, com.google.protobuf.ag.c r11, int r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ag.a(com.google.protobuf.g, com.google.protobuf.at$a, com.google.protobuf.p, com.google.protobuf.j$a, com.google.protobuf.ag$c, int):boolean");
    }

    private static void a(g gVar, at.a aVar, p pVar, j.a aVar2, c cVar) {
        int i = 0;
        n.b bVar = null;
        f fVar = null;
        while (true) {
            int a2 = gVar.a();
            if (a2 == 0) {
                break;
            } else if (a2 == ay.f4405c) {
                i = gVar.m();
                if (i != 0 && (pVar instanceof n)) {
                    bVar = cVar.a((n) pVar, aVar2, i);
                }
            } else if (a2 == ay.f4406d) {
                if (i != 0 && bVar != null && p.c()) {
                    a(gVar, bVar, pVar, cVar);
                    fVar = null;
                } else {
                    fVar = gVar.l();
                }
            } else if (!gVar.b(a2)) {
                break;
            }
        }
        gVar.a(ay.f4404b);
        if (fVar == null || i == 0) {
            return;
        }
        if (bVar != null) {
            a(fVar, bVar, pVar, cVar);
        } else if (fVar == null) {
        } else {
            aVar.a(i, at.b.a().a(fVar).a());
        }
    }

    private static void a(f fVar, n.b bVar, p pVar, c cVar) {
        j.f fVar2 = bVar.f4686a;
        if (cVar.b(fVar2) || p.c()) {
            cVar.a(fVar2, cVar.a(fVar, pVar, fVar2, bVar.f4687b));
        } else {
            cVar.a(fVar2, new v(bVar.f4687b, pVar, fVar));
        }
    }

    private static void a(g gVar, n.b bVar, p pVar, c cVar) {
        j.f fVar = bVar.f4686a;
        cVar.a(fVar, cVar.b(gVar, pVar, fVar, bVar.f4687b));
    }
}
