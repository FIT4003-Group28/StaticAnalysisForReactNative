package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwy  reason: default package */
/* loaded from: classes3.dex */
public final class cwy extends axix {
    public final List a;

    public cwy() {
        super("subs");
        this.a = new ArrayList();
    }

    @Override // defpackage.axiv
    protected final long h() {
        long j = 8;
        for (cwx cwxVar : this.a) {
            j += 6;
            for (int i = 0; i < cwxVar.b.size(); i++) {
                j = j + (s() == 1 ? 4L : 2L) + 6;
            }
        }
        return j;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        long I = hy.I(byteBuffer);
        for (int i = 0; i < I; i++) {
            cwx cwxVar = new cwx();
            cwxVar.a = hy.I(byteBuffer);
            int F = hy.F(byteBuffer);
            for (int i2 = 0; i2 < F; i2++) {
                cww cwwVar = new cww();
                cwwVar.a = s() == 1 ? hy.I(byteBuffer) : hy.F(byteBuffer);
                cwwVar.b = hy.H(byteBuffer);
                cwwVar.c = hy.H(byteBuffer);
                cwwVar.d = hy.I(byteBuffer);
                cwxVar.b.add(cwwVar);
            }
            this.a.add(cwxVar);
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.a.size());
        for (cwx cwxVar : this.a) {
            hy.y(byteBuffer, cwxVar.a);
            hy.w(byteBuffer, cwxVar.b.size());
            for (cww cwwVar : cwxVar.b) {
                if (s() != 1) {
                    hy.w(byteBuffer, axds.p(cwwVar.a));
                } else {
                    hy.y(byteBuffer, cwwVar.a);
                }
                hy.z(byteBuffer, cwwVar.b);
                hy.z(byteBuffer, cwwVar.c);
                hy.y(byteBuffer, cwwVar.d);
            }
        }
    }

    public final String toString() {
        int size = this.a.size();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
        sb.append("SubSampleInformationBox{entryCount=");
        sb.append(size);
        sb.append(", entries=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
