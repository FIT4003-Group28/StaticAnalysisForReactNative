package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: prq  reason: default package */
/* loaded from: classes4.dex */
public final class prq implements psd {
    public long a;
    private final long c;
    private final long d;
    private final afck e;

    public prq(afck afckVar, long j, long j2) {
        this.c = j;
        this.d = j2;
        this.a = j - 1;
        this.e = afckVar;
    }

    protected final void a() {
        long j = this.a;
        if (j < this.c || j > this.d) {
            throw new NoSuchElementException();
        }
    }

    @Override // defpackage.psd
    public final boolean b() {
        long j = this.a + 1;
        this.a = j;
        return j <= this.d;
    }

    @Override // defpackage.psd
    public final void c() {
        a();
        this.e.b(this.a);
    }

    @Override // defpackage.psd
    public final void d() {
        a();
        this.e.d(this.a);
    }
}
