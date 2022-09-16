package defpackage;
/* compiled from: PG */
/* renamed from: brg  reason: default package */
/* loaded from: classes2.dex */
final class brg extends bla {
    public brg() {
        super(4, 5);
    }

    @Override // defpackage.bla
    public final void a(blv blvVar) {
        blvVar.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        blvVar.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
