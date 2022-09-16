package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lgj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lgj implements ylw {
    private final /* synthetic */ int p;
    public static final /* synthetic */ lgj o = new lgj(14);
    public static final /* synthetic */ lgj n = new lgj(13);
    public static final /* synthetic */ lgj m = new lgj(12);
    public static final /* synthetic */ lgj l = new lgj(11);
    public static final /* synthetic */ lgj k = new lgj(10);
    public static final /* synthetic */ lgj j = new lgj(9);
    public static final /* synthetic */ lgj i = new lgj(8);
    public static final /* synthetic */ lgj h = new lgj(7);
    public static final /* synthetic */ lgj g = new lgj(6);
    public static final /* synthetic */ lgj f = new lgj(5);
    public static final /* synthetic */ lgj e = new lgj(4);
    public static final /* synthetic */ lgj d = new lgj(3);
    public static final /* synthetic */ lgj c = new lgj(2);
    public static final /* synthetic */ lgj b = new lgj(1);
    public static final /* synthetic */ lgj a = new lgj();

    private /* synthetic */ lgj() {
    }

    private /* synthetic */ lgj(int i2) {
        this.p = i2;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        switch (this.p) {
            case 0:
                Void r3 = (Void) obj;
                zep.b("Successfully stored cross device offline device name.");
                return;
            case 1:
                Void r32 = (Void) obj;
                int i2 = ebc.d;
                return;
            case 2:
                Void r33 = (Void) obj;
                zep.b("Successfully stored cross device offline device state.");
                return;
            case 3:
                Void r34 = (Void) obj;
                return;
            case 4:
                Void r35 = (Void) obj;
                return;
            case 5:
                Void r36 = (Void) obj;
                return;
            case 6:
                Void r37 = (Void) obj;
                return;
            case 7:
                Void r38 = (Void) obj;
                return;
            case 8:
                Void r39 = (Void) obj;
                return;
            case 9:
                Void r310 = (Void) obj;
                int i3 = wfn.c;
                return;
            case 10:
                Void r311 = (Void) obj;
                return;
            case 11:
                Void r312 = (Void) obj;
                return;
            case 12:
                Void r313 = (Void) obj;
                return;
            case 13:
                Executor executor = ylx.a;
                return;
            default:
                String valueOf = String.valueOf((ampq) obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("RAM signal initialized: ");
                sb.append(valueOf);
                zep.h("Adaptive", sb.toString());
                return;
        }
    }
}
