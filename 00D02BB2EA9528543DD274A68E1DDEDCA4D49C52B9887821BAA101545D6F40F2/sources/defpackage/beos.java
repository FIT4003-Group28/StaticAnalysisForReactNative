package defpackage;
/* compiled from: PG */
/* renamed from: beos  reason: default package */
/* loaded from: classes3.dex */
public class beos implements benr {
    private final String a;
    private final beoq b;
    private final jic c;

    public beos(beor beorVar, String str, dgfy dgfyVar, bwrs<ilo> bwrsVar, jic jicVar) {
        this.b = beorVar.a(str, null, null, dgfyVar, bwrsVar, null, false);
        this.a = str;
        this.c = jicVar;
    }

    @Override // defpackage.benr
    public jic a() {
        return this.c;
    }

    @Override // defpackage.benr
    public String b() {
        return this.a;
    }

    @Override // defpackage.benr
    public benq c() {
        return this.b;
    }
}
