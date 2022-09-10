package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bqzb  reason: default package */
/* loaded from: classes4.dex */
public final class bqzb implements Serializable, pqz {
    public final broc a;
    private final dcdc<String> b;

    public bqzb(broc brocVar) {
        this.a = brocVar;
        this.b = brocVar.c;
    }

    @Override // defpackage.pqz
    public final String a() {
        return !this.b.isEmpty() ? this.b.get(0) : this.a.a;
    }

    @Override // defpackage.pqz
    @dzsi
    public final String b() {
        if (this.b.size() > 1) {
            return this.b.get(1);
        }
        return null;
    }

    @Override // defpackage.pqz
    @dzsi
    public final cjtd c() {
        return null;
    }
}
