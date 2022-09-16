package defpackage;
/* compiled from: PG */
/* renamed from: acpp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acpp implements Runnable {
    public final /* synthetic */ acps a;
    private final /* synthetic */ int b;

    public /* synthetic */ acpp(acps acpsVar) {
        this.a = acpsVar;
    }

    public /* synthetic */ acpp(acps acpsVar, int i) {
        this.b = i;
        this.a = acpsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            acps acpsVar = this.a;
            ylr.b();
            if (acpsVar.i != null && acpsVar.j) {
                bamj bamjVar = acpsVar.i;
                bapg bapgVar = (bapg) bamjVar;
                bapgVar.a.a.a(false);
                synchronized (bapgVar.a.b) {
                    baph baphVar = ((bapg) bamjVar).a;
                }
            }
            acpsVar.j = false;
            return;
        }
        acps acpsVar2 = this.a;
        ylr.b();
        if (acpsVar2.i != null && !acpsVar2.j) {
            bamj bamjVar2 = acpsVar2.i;
            bapg bapgVar2 = (bapg) bamjVar2;
            bapgVar2.a.a.a(true);
            synchronized (bapgVar2.a.b) {
                baph baphVar2 = ((bapg) bamjVar2).a;
            }
        }
        acpsVar2.j = true;
    }
}
