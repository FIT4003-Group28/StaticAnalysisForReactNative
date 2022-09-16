package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: tan  reason: default package */
/* loaded from: classes4.dex */
public final class tan implements ayqe {
    private final amup a;
    private final /* synthetic */ int b;

    public tan(amup amupVar) {
        this.a = amupVar;
    }

    public tan(amup amupVar, int i) {
        this.b = i;
        this.a = amupVar;
    }

    @Override // defpackage.ayqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i = 0;
        if (this.b == 0) {
            Object[] objArr = (Object[]) obj;
            amum h = amup.h();
            int length = objArr.length;
            while (i < length) {
                Pair pair = (Pair) objArr[i];
                String str = (String) pair.first;
                byte[] bArr = (byte[]) this.a.get(str);
                bArr.getClass();
                h.f(str, (byte[]) ((ampq) pair.second).e(bArr));
                i++;
            }
            return h.b();
        }
        Object[] objArr2 = (Object[]) obj;
        amum h2 = amup.h();
        int length2 = objArr2.length;
        while (i < length2) {
            Pair pair2 = (Pair) objArr2[i];
            String str2 = (String) pair2.first;
            byte[] bArr2 = (byte[]) this.a.get(str2);
            bArr2.getClass();
            h2.f(str2, (byte[]) ((ampq) pair2.second).e(bArr2));
            i++;
        }
        return h2.b();
    }
}
