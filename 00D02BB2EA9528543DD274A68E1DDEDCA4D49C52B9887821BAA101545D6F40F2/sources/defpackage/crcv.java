package defpackage;
/* compiled from: PG */
/* renamed from: crcv  reason: default package */
/* loaded from: classes5.dex */
final class crcv implements cree {
    final /* synthetic */ amuo a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ crcx e;

    public crcv(crcx crcxVar, amuo amuoVar, int i, int i2, String str) {
        this.e = crcxVar;
        this.a = amuoVar;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    @Override // defpackage.cree
    public final void a(cred credVar) {
        this.e.b.b(new crev(credVar, this.a, this.c, this.d));
    }

    @Override // defpackage.cree
    public final void b(long j) {
        this.e.b.b(new crex(j, this.a, this.b, this.c, this.d));
    }
}
