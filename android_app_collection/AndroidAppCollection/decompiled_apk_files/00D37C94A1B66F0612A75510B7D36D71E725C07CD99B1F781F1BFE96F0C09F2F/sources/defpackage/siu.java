package defpackage;
/* compiled from: PG */
/* renamed from: siu  reason: default package */
/* loaded from: classes4.dex */
public final class siu {
    public final agp a;
    private final sit b;

    private siu(agp agpVar, sit sitVar) {
        this.a = agpVar;
        this.b = sitVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static siu a(agp agpVar) {
        return new siu(agpVar, sjc.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static siu b(agp agpVar, sit sitVar) {
        return new siu(agpVar, sitVar);
    }

    public final void c(Object obj) {
        this.a.c(this.b.a(obj));
    }
}
