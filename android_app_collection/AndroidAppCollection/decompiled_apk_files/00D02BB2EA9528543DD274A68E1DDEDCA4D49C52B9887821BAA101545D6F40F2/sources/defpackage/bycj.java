package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bycj  reason: default package */
/* loaded from: classes4.dex */
public final class bycj implements awnu {
    static final long a = TimeUnit.DAYS.toMillis(7);
    final dxio<bvjj> b;
    final cqat c;

    public bycj(dxio<bvjj> dxioVar, cqat cqatVar) {
        this.b = dxioVar;
        this.c = cqatVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.CONFIDENTIALITY_REMINDER;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LEGALLY_REQUIRED;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (Math.abs(this.c.b() - this.b.a().d.getLong("confidentialityAcknowledgedTime", 0L)) >= a) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        return false;
    }

    @Override // defpackage.awnu
    @dzsi
    public final ggg g() {
        return null;
    }
}
