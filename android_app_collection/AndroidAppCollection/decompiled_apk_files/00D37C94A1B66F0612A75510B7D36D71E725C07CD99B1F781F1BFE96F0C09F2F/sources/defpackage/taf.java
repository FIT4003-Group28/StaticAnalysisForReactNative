package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: taf  reason: default package */
/* loaded from: classes4.dex */
public final class taf implements ayqe {
    private final int a;
    private final amup b;
    private final tag c;

    public taf(int i, amup amupVar, tag tagVar) {
        this.a = i;
        this.b = amupVar;
        this.c = tagVar;
    }

    @Override // defpackage.ayqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        amup amupVar = this.b;
        HashMap hashMap = new HashMap();
        amzs it = ((amup) obj).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Integer num = (Integer) amupVar.get(entry.getKey());
            num.getClass();
            int intValue = num.intValue();
            final byte[] bArr = (byte[]) entry.getValue();
            hashMap.put(Integer.valueOf(intValue), new Object() { // from class: tad
                public final void a(int i, aool aoolVar) {
                    aoolVar.m(aosl.a(i), bArr);
                }
            });
        }
        aoog O = aoog.O(this.c.a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        aool aj = aool.aj(byteArrayOutputStream);
        while (!O.E()) {
            int n = O.n();
            int a = aosl.a(n);
            int b = aosl.b(n);
            if (b == 0) {
                aj.E(a, ((aooc) O).s());
            } else if (b == 1) {
                aj.r(a, ((aooc) O).r());
            } else if (b == 2) {
                tad tadVar = (tad) hashMap.remove(Integer.valueOf(a));
                if (tadVar == null) {
                    aj.n(a, O.x());
                } else {
                    O.G(n);
                    tadVar.a(n, aj);
                }
            } else if (b == 5) {
                aj.p(a, ((aooc) O).j());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((tad) entry2.getValue()).a((((Integer) entry2.getKey()).intValue() << 3) | 2, aj);
        }
        aj.i();
        return new tag(byteArrayOutputStream.toByteArray()).b(this.a);
    }
}
