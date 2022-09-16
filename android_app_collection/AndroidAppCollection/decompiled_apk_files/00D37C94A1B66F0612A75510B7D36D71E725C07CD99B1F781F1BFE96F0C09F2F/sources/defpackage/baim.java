package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: baim  reason: default package */
/* loaded from: classes2.dex */
public class baim extends baik implements Serializable, baig {
    private static final long serialVersionUID = -6728882245981L;
    public volatile long a;
    public volatile bahl b;

    public baim() {
        this(bahq.a(), bajl.O());
    }

    @Override // defpackage.baig
    public final long sx() {
        return this.a;
    }

    @Override // defpackage.baig
    public final bahl sy() {
        return this.b;
    }

    public baim(long j, bahl bahlVar) {
        this.b = bahq.d(bahlVar);
        this.a = j;
    }

    public baim(long j, baht bahtVar) {
        this(j, bajl.P(bahtVar));
    }
}
