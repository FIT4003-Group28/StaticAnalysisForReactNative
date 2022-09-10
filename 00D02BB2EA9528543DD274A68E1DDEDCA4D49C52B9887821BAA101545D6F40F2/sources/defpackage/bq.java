package defpackage;
/* compiled from: PG */
/* renamed from: bq  reason: default package */
/* loaded from: classes4.dex */
public final class bq extends avv {
    public ba a;
    public final bo b;
    public final String c;
    public final String d;

    public bq(ba baVar, bo boVar, String str, String str2) {
        super(boVar.a);
        this.a = baVar;
        this.b = boVar;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006e A[EDGE_INSN: B:62:0x006e->B:34:0x006e ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.avv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.avu r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq.a(avu, int, int):void");
    }

    public final void b(avu avuVar) {
        avuVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.c;
        avuVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }
}
