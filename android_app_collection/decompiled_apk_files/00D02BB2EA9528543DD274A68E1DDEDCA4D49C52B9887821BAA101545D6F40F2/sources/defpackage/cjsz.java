package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cjsz  reason: default package */
/* loaded from: classes4.dex */
public final class cjsz implements Serializable, cjtg {
    @dzsi
    private final ddho b;
    @dzsi
    private Integer c;

    public cjsz(@dzsi ddho ddhoVar) {
        this.b = ddhoVar;
    }

    @Override // defpackage.cjtg
    @dzsi
    public final ddho a() {
        return this.b;
    }

    @Override // defpackage.cjtg
    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.cjtg
    @dzsi
    public final Integer c() {
        return this.c;
    }

    @Override // defpackage.cjtg
    public final boolean d() {
        return cjtf.a(this);
    }
}
