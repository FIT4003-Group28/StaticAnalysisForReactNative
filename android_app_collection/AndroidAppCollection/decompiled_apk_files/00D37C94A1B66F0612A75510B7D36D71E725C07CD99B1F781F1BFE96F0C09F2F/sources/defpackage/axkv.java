package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: axkv  reason: default package */
/* loaded from: classes2.dex */
public final class axkv extends axix {
    public List a;
    private int b;

    public axkv() {
        super("sgpd");
        this.a = new LinkedList();
        this.q = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axkv axkvVar = (axkv) obj;
        if (this.b != axkvVar.b) {
            return false;
        }
        List list = this.a;
        return list == null ? axkvVar.a == null : list.equals(axkvVar.a);
    }

    @Override // defpackage.axiv
    protected final long h() {
        long j = (s() == 1 ? 12L : 8L) + 4;
        for (axkr axkrVar : this.a) {
            if (s() == 1 && this.b == 0) {
                j += 4;
            }
            j += axkrVar.d();
        }
        return j;
    }

    public final int hashCode() {
        int i = this.b * 31;
        List list = this.a;
        return i + (list != null ? list.hashCode() : 0);
    }

    @Override // defpackage.axiv
    protected final void i(ByteBuffer byteBuffer) {
        axkr axloVar;
        u(byteBuffer);
        if (s() != 1) {
            throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
        }
        String K = hy.K(byteBuffer);
        if (s() == 1) {
            this.b = axds.p(hy.I(byteBuffer));
        }
        long I = hy.I(byteBuffer);
        while (true) {
            long j = (-1) + I;
            if (I <= 0) {
                return;
            }
            int i = this.b;
            if (s() == 1) {
                if (this.b == 0) {
                    i = axds.p(hy.I(byteBuffer));
                }
                int position = byteBuffer.position() + i;
                ByteBuffer slice = byteBuffer.slice();
                slice.limit(i);
                List list = this.a;
                if ("roll".equals(K)) {
                    axloVar = new axku();
                } else if ("rash".equals(K)) {
                    axloVar = new axkt();
                } else if ("seig".equals(K)) {
                    axloVar = new axkq();
                } else if ("rap ".equals(K)) {
                    axloVar = new axla();
                } else if ("tele".equals(K)) {
                    axloVar = new axky();
                } else if ("sync".equals(K)) {
                    axloVar = new axlp();
                } else if ("tscl".equals(K)) {
                    axloVar = new axlq();
                } else if ("tsas".equals(K)) {
                    axloVar = new axlr();
                } else {
                    axloVar = "stsa".equals(K) ? new axlo() : new axkz(K);
                }
                axloVar.c(slice);
                list.add(axloVar);
                byteBuffer.position(position);
                I = j;
            } else {
                throw new RuntimeException("This should be implemented");
            }
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        byteBuffer.put(cvq.b(((axkr) this.a.get(0)).a()));
        if (s() == 1) {
            hy.y(byteBuffer, this.b);
        }
        hy.y(byteBuffer, this.a.size());
        for (axkr axkrVar : this.a) {
            if (s() == 1 && this.b == 0) {
                hy.y(byteBuffer, axkrVar.b().limit());
            }
            byteBuffer.put(axkrVar.b());
        }
    }

    public final String toString() {
        String a = this.a.size() > 0 ? ((axkr) this.a.get(0)).a() : "????";
        int i = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(a.length() + 84 + String.valueOf(valueOf).length());
        sb.append("SampleGroupDescriptionBox{groupingType='");
        sb.append(a);
        sb.append("', defaultLength=");
        sb.append(i);
        sb.append(", groupEntries=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
