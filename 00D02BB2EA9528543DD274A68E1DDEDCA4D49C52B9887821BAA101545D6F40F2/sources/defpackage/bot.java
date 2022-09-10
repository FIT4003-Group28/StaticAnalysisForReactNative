package defpackage;

import android.graphics.PointF;
/* compiled from: PG */
/* renamed from: bot  reason: default package */
/* loaded from: classes3.dex */
public final class bot implements bpe<PointF> {
    public static final bot a = new bot();

    private bot() {
    }

    @Override // defpackage.bpe
    public final /* bridge */ /* synthetic */ PointF a(bpj bpjVar, float f) {
        int r = bpjVar.r();
        if (r == 1 || r == 3) {
            return bom.c(bpjVar, f);
        }
        if (r == 7) {
            PointF pointF = new PointF(((float) bpjVar.n()) * f, ((float) bpjVar.n()) * f);
            while (bpjVar.h()) {
                bpjVar.p();
            }
            return pointF;
        }
        String a2 = bpi.a(r);
        StringBuilder sb = new StringBuilder(a2.length() + 44);
        sb.append("Cannot convert json to point. Next token is ");
        sb.append(a2);
        throw new IllegalArgumentException(sb.toString());
    }
}
