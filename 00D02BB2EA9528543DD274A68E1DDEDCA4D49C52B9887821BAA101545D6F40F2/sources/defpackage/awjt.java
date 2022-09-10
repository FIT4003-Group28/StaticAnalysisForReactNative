package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awjt  reason: default package */
/* loaded from: classes3.dex */
public final class awjt implements degu<Boolean> {
    final /* synthetic */ boolean a;
    final /* synthetic */ avkf b;
    final /* synthetic */ awju c;

    public awjt(awju awjuVar, boolean z, avkf avkfVar) {
        this.c = awjuVar;
        this.a = z;
        this.b = avkfVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.d.b(avjg.LOW_BATTERY);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        Boolean bool2 = bool;
        if (!this.a) {
            this.c.d.b(avjg.NO_CONNECTIVITY);
        } else if (!bool2.booleanValue()) {
            this.c.d.b(avjg.LOW_BATTERY);
        } else {
            awju awjuVar = this.c;
            awjv awjvVar = awjuVar.d;
            avjy avjyVar = awjuVar.a;
            avih avihVar = avih.UNKNOWN;
            avjg avjgVar = avjg.OK;
            avjv avjvVar = avjv.UNKNOWN_SCREEN_CHECK;
            avjx avjxVar = avjx.UNKNOWN_TIME_BUDGET;
            avjv b = avjv.b(avjyVar.g);
            if (b == null) {
                b = avjv.NO_SCREEN_CHECK;
            }
            if (b.ordinal() == 2 && awjvVar.i.a().b) {
                this.c.d.b(avjg.SCREEN_ON);
                return;
            }
            Executor executor = this.c.d.d;
            final avkf avkfVar = this.b;
            executor.execute(new Runnable(this, avkfVar) { // from class: awjs
                private final awjt a;
                private final avkf b;

                {
                    this.a = this;
                    this.b = avkfVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(this.b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void c(defpackage.avkf r16) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awjt.c(avkf):void");
    }
}
