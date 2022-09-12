package defpackage;
/* compiled from: PG */
/* renamed from: bdh  reason: default package */
/* loaded from: classes3.dex */
final class bdh extends bw {
    public bdh() {
        super(8, 9);
    }

    @Override // defpackage.bw
    public final void a(avu avuVar) {
        avuVar.h("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
