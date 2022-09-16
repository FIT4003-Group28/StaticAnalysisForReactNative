package defpackage;
/* compiled from: PG */
/* renamed from: brk  reason: default package */
/* loaded from: classes2.dex */
final class brk extends bla {
    public brk() {
        super(11, 12);
    }

    @Override // defpackage.bla
    public final void a(blv blvVar) {
        blvVar.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
