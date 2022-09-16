package defpackage;
/* compiled from: PG */
/* renamed from: aajc  reason: default package */
/* loaded from: classes.dex */
final class aajc extends aahw {
    private final aajb a;
    private final aake b;
    private final String c;
    private final aqvy d;
    private final byte[] e;
    private final snc f;
    private final aorw g;

    public aajc(aajb aajbVar, aake aakeVar, String str, aqvy aqvyVar, byte[] bArr, snc sncVar, aorw aorwVar) {
        this.a = aajbVar;
        this.b = aakeVar;
        this.c = str;
        this.d = aqvyVar;
        this.e = bArr;
        this.f = sncVar;
        this.g = aorwVar;
    }

    @Override // defpackage.aahw
    public final void b(aaip aaipVar, vox voxVar, amuf amufVar) {
        aakd c = this.a.c(voxVar, this.c);
        if (aajz.d(c.d, this.g)) {
            aajj aajjVar = c.b;
            aajk aajkVar = c.c;
            aajj a = aajz.a(this.b, this.d, this.c, aajjVar, this.e);
            if (a == null) {
                String valueOf = String.valueOf(this.c);
                throw aahd.c(new IllegalArgumentException(valueOf.length() != 0 ? "One of the edits failed for key: ".concat(valueOf) : new String("One of the edits failed for key: ")), -1);
            }
            boolean z = !a.equals(aajjVar);
            String.format("[ENTITY] About to update entity %s(%s)", a.getClass().getSimpleName(), this.c);
            aorw c2 = aajz.c(this.g, c.d);
            aakc a2 = aakd.a();
            a2.a = a;
            a2.c(aajkVar);
            a2.b(c2);
            aakd a3 = a2.a();
            if (amufVar != null && z) {
                aajn a4 = aajp.a();
                a4.c(this.c);
                a4.a = aajjVar;
                a4.b = a;
                a4.b(aajkVar);
                amufVar.h(a4.a());
            }
            c(aaipVar, voxVar, a3, this.f.c(), this.g);
        }
    }
}
