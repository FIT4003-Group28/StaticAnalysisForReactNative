package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qrj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class qrj implements Executor {
    private final /* synthetic */ int n;
    public static final /* synthetic */ qrj m = new qrj(15);
    public static final /* synthetic */ qrj l = new qrj(14);
    public static final /* synthetic */ qrj k = new qrj(13);
    public static final /* synthetic */ qrj j = new qrj(12);
    public static final /* synthetic */ qrj i = new qrj(11);
    public static final /* synthetic */ qrj h = new qrj(10);
    public static final /* synthetic */ qrj g = new qrj(9);
    public static final /* synthetic */ qrj f = new qrj(8);
    public static final /* synthetic */ qrj e = new qrj(7);
    public static final /* synthetic */ qrj d = new qrj(6);
    public static final /* synthetic */ qrj c = new qrj(5);
    public static final /* synthetic */ qrj b = new qrj(3);
    public static final /* synthetic */ qrj a = new qrj();

    private /* synthetic */ qrj() {
    }

    public qrj(int i2) {
        this.n = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.n) {
            case 0:
                runnable.run();
                return;
            case 1:
                ((acm) acl.a().b).b.execute(runnable);
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            case 4:
                runnable.run();
                return;
            case 5:
                runnable.run();
                return;
            case 6:
                uwp.h(runnable);
                return;
            case 7:
                ylx.q(runnable);
                return;
            case 8:
                runnable.run();
                return;
            case 9:
                runnable.run();
                return;
            case 10:
                runnable.run();
                return;
            case 11:
                runnable.run();
                return;
            case 12:
                runnable.run();
                return;
            case 13:
                runnable.run();
                return;
            case 14:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
