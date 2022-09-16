package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: taj  reason: default package */
/* loaded from: classes4.dex */
final class taj implements ayqe {
    private final int a;
    private final amup b;
    private final tet c;

    public taj(int i, amup amupVar, tet tetVar) {
        this.a = i;
        this.b = amupVar;
        this.c = tetVar;
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
            final ampq ampqVar = (ampq) entry.getValue();
            hashMap.put(Integer.valueOf(intValue), new Object() { // from class: tah
                public final void a(int i, aool aoolVar) {
                    ampq ampqVar2 = ampq.this;
                    if (ampqVar2.h()) {
                        aoolVar.m(aosl.a(i), (byte[]) ampqVar2.c());
                    }
                }
            });
        }
        tet tetVar = this.c;
        int i = this.a;
        aoog N = aoog.N(tetVar.f());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        aool aj = aool.aj(byteArrayOutputStream);
        for (int i2 = 0; i2 < 13; i2++) {
            aj.j((byte) 0);
        }
        while (!N.E()) {
            int n = N.n();
            int a = aosl.a(n);
            int b = aosl.b(n);
            if (b == 0) {
                aj.E(a, N.w());
            } else if (b == 1) {
                aj.r(a, N.p());
            } else if (b == 2) {
                tah tahVar = (tah) hashMap.remove(Integer.valueOf(a));
                if (tahVar == null) {
                    aj.n(a, N.x());
                } else {
                    N.G(n);
                    tahVar.a(n, aj);
                }
            } else if (b == 5) {
                aj.p(a, N.h());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((tah) entry2.getValue()).a((((Integer) entry2.getKey()).intValue() << 3) | 2, aj);
        }
        aj.i();
        int i3 = ((aooi) aj).d - 13;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        aool aj2 = aool.aj(byteArrayOutputStream2);
        aj2.B(i, 2);
        aj2.D(i3);
        aj2.i();
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int i4 = 13 - length;
        System.arraycopy(byteArray, 0, byteArray2, i4, length);
        return tet.a(ByteBuffer.wrap(byteArray2, i4, i3 + length));
    }
}
