package defpackage;
/* compiled from: PG */
/* renamed from: brj  reason: default package */
/* loaded from: classes2.dex */
final class brj extends bla {
    public brj() {
        super(8, 9);
    }

    @Override // defpackage.bla
    public final void a(blv blvVar) {
        blvVar.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
