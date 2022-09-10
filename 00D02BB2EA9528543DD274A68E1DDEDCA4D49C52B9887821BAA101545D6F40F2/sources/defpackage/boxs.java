package defpackage;
/* compiled from: PG */
/* renamed from: boxs  reason: default package */
/* loaded from: classes3.dex */
public class boxs implements bpvn {
    public final bokk a;
    public final bpvm b;
    private final String c;
    @dzsi
    private final cjtd d;

    public boxs(bokk bokkVar, String str, bpvm bpvmVar, @dzsi ddho ddhoVar) {
        this.a = bokkVar;
        this.c = str;
        this.b = bpvmVar;
        this.d = ddhoVar == null ? null : cjtd.a(ddhoVar);
    }

    @Override // defpackage.bpvn
    public String a() {
        return this.a.f;
    }

    @Override // defpackage.bpvn
    public cqgl b() {
        return new cqgl(this) { // from class: boxr
            private final boxs a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                boxs boxsVar = this.a;
                boxsVar.a.f = charSequence.toString();
                boxsVar.b.a();
            }
        };
    }

    @Override // defpackage.bpvn
    public CharSequence c() {
        return this.c;
    }

    public boolean d() {
        return !dbsj.d(this.a.c());
    }

    @Override // defpackage.bpvn
    @dzsi
    public cjtd e() {
        return this.d;
    }
}
