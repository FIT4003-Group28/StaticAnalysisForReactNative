package defpackage;
/* compiled from: PG */
/* renamed from: nkz  reason: default package */
/* loaded from: classes3.dex */
final class nkz extends akaq {
    final /* synthetic */ nlc a;
    private final aari d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkz(nlc nlcVar, aari aariVar, yni yniVar, ajyi ajyiVar, yzj yzjVar, acti actiVar) {
        super(aariVar, yniVar, ajyiVar, yzjVar, actiVar, null);
        this.a = nlcVar;
        this.d = aariVar;
    }

    @Override // defpackage.akaq, defpackage.ajyk
    public final ajyj a(Object obj, akam akamVar, akaf akafVar) {
        if (obj instanceof aqbw) {
            nlc nlcVar = this.a;
            xma a = nlcVar.h.a((aqbw) obj, this.d, this.c, nlcVar.i, nlcVar.r);
            nlc nlcVar2 = this.a;
            a.a = nlcVar2;
            final nly nlyVar = nlcVar2.p;
            nlyVar.getClass();
            a.b = new xly() { // from class: nky
                @Override // defpackage.xly
                public final void a() {
                    nly.this.a();
                }
            };
            a.i(this.a.q);
            return a;
        } else if (obj instanceof aakq) {
            nld a2 = this.a.e.a(this.d, this.c);
            a2.i((aakq) obj);
            return a2;
        } else {
            return super.a(obj, akamVar, akafVar);
        }
    }
}
