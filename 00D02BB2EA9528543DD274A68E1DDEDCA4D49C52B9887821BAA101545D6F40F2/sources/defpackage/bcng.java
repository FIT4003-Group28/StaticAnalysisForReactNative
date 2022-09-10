package defpackage;
/* compiled from: PG */
/* renamed from: bcng  reason: default package */
/* loaded from: classes3.dex */
class bcng implements bclz {
    final /* synthetic */ bcnh a;
    private final String b;
    private final int c;
    private final cjtd d;

    public bcng(bcnh bcnhVar, String str, int i, cjtd cjtdVar) {
        this.a = bcnhVar;
        this.b = str;
        this.c = i;
        this.d = cjtdVar;
    }

    @Override // defpackage.bclz
    public String a() {
        return this.b;
    }

    @Override // defpackage.bclz
    public Boolean b() {
        return Boolean.valueOf(this.a.Os().intValue() == this.c);
    }

    @Override // defpackage.bclz
    public cjtd c() {
        return this.d;
    }
}
