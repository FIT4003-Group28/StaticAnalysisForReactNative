package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aadt  reason: default package */
/* loaded from: classes2.dex */
public class aadt {
    public static final String a = "aadt";
    public final bwqv b;
    public final aach c;
    public final aadq d;
    public aacn e;
    @dzsi
    public dspd f;

    public aadt(bwqv bwqvVar, aaci aaciVar, aadq aadqVar, aacn aacnVar) {
        this.b = bwqvVar;
        this.c = aaciVar.a(new aadr(this));
        this.d = aadqVar;
        this.e = aacnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aacn aacnVar) {
        this.e = aacnVar;
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(aaco aacoVar) {
        this.f = null;
        if (!aacoVar.b().a()) {
            return;
        }
        dilu b = aacoVar.b().b();
        if ((b.a & 4) == 0) {
            return;
        }
        this.f = b.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.c.a != null;
    }
}
