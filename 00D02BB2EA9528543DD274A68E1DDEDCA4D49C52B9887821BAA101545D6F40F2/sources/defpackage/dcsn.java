package defpackage;
/* compiled from: PG */
/* renamed from: dcsn  reason: default package */
/* loaded from: classes.dex */
public abstract class dcsn extends dcrl {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public dcsn(String str) {
        this.a = str;
    }

    @Override // defpackage.dcrl
    public String a() {
        return this.a;
    }

    @Override // defpackage.dcrl
    public void d(RuntimeException runtimeException, dcrj dcrjVar) {
        c(new dcsm(runtimeException, dcrjVar));
    }
}
