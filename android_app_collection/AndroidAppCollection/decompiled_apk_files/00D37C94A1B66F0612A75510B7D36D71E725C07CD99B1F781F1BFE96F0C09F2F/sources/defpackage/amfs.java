package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: amfs  reason: default package */
/* loaded from: classes.dex */
public final class amfs {
    public Class a;
    public amft b;
    public bpx c;
    public ampq d;
    private bpu e;
    private ampq f;
    private ampq g;
    private amvn h;

    public amfs() {
    }

    public amfs(amfv amfvVar) {
        this.f = amon.a;
        this.g = amon.a;
        this.d = amon.a;
        this.a = amfvVar.a;
        this.e = amfvVar.b;
        this.f = amfvVar.c;
        this.b = amfvVar.d;
        this.c = amfvVar.e;
        this.g = amfvVar.f;
        this.d = amfvVar.g;
        this.h = amfvVar.h;
    }

    public amfs(byte[] bArr) {
        this.f = amon.a;
        this.g = amon.a;
        this.d = amon.a;
    }

    public final void b(bpu bpuVar) {
        if (bpuVar != null) {
            this.e = bpuVar;
            return;
        }
        throw new NullPointerException("Null constraints");
    }

    public final void c(Set set) {
        this.h = amvn.p(set);
    }

    public final amfv a() {
        bpu bpuVar;
        amft amftVar;
        bpx bpxVar;
        amvn amvnVar;
        Class cls = this.a;
        if (cls == null || (bpuVar = this.e) == null || (amftVar = this.b) == null || (bpxVar = this.c) == null || (amvnVar = this.h) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" workerClass");
            }
            if (this.e == null) {
                sb.append(" constraints");
            }
            if (this.b == null) {
                sb.append(" initialDelay");
            }
            if (this.c == null) {
                sb.append(" inputData");
            }
            if (this.h == null) {
                sb.append(" tags");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new amfv(cls, bpuVar, this.f, amftVar, bpxVar, this.g, this.d, amvnVar);
    }
}
