package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: axkt  reason: default package */
/* loaded from: classes2.dex */
public final class axkt extends axkr {
    private short a;
    private short b;
    private final List c = new LinkedList();
    private int d;
    private int e;
    private short f;

    @Override // defpackage.axkr
    public final String a() {
        return "rash";
    }

    @Override // defpackage.axkr
    public final ByteBuffer b() {
        short s = this.a;
        ByteBuffer allocate = ByteBuffer.allocate(s == 1 ? 13 : (s * 6) + 11);
        allocate.putShort(this.a);
        if (this.a == 1) {
            allocate.putShort(this.b);
        } else {
            for (axks axksVar : this.c) {
                allocate.putInt(axksVar.a);
                allocate.putShort(axksVar.b);
            }
        }
        allocate.putInt(this.d);
        allocate.putInt(this.e);
        hy.z(allocate, this.f);
        allocate.rewind();
        return allocate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    @Override // defpackage.axkr
    public final void c(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        this.a = s;
        if (s != 1) {
            while (true) {
                ?? r1 = s - 1;
                if (s <= 0) {
                    break;
                }
                this.c.add(new axks(axds.p(hy.I(byteBuffer)), byteBuffer.getShort()));
                s = r1;
            }
        } else {
            this.b = byteBuffer.getShort();
        }
        this.d = axds.p(hy.I(byteBuffer));
        this.e = axds.p(hy.I(byteBuffer));
        this.f = (short) hy.H(byteBuffer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axkt axktVar = (axkt) obj;
        return this.f == axktVar.f && this.d == axktVar.d && this.e == axktVar.e && this.a == axktVar.a && this.b == axktVar.b && this.c.equals(axktVar.c);
    }

    public final int hashCode() {
        return (((((((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }
}
