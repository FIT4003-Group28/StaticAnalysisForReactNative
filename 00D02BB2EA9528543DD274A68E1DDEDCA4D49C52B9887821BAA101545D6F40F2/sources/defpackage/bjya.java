package defpackage;
/* compiled from: PG */
/* renamed from: bjya  reason: default package */
/* loaded from: classes3.dex */
class bjya implements bjwi {
    private final bjwh a;
    private final CharSequence b;

    public bjya(bjxv bjxvVar, ilo iloVar, djsj djsjVar) {
        djag djagVar = djsjVar.b;
        this.a = bjxvVar.a(iloVar, djagVar == null ? djag.d : djagVar, djsjVar.d, false);
        djsl djslVar = djsjVar.c;
        this.b = bjgr.h((djslVar == null ? djsl.b : djslVar).a);
    }

    @Override // defpackage.bjwi
    public bjwh a() {
        return this.a;
    }

    @Override // defpackage.bjwi
    public CharSequence b() {
        return this.b;
    }
}
