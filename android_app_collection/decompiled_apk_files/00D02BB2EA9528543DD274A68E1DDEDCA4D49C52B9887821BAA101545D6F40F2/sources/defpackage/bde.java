package defpackage;
/* compiled from: PG */
/* renamed from: bde  reason: default package */
/* loaded from: classes3.dex */
final class bde extends bw {
    public bde() {
        super(4, 5);
    }

    @Override // defpackage.bw
    public final void a(avu avuVar) {
        avuVar.h("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        avuVar.h("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
