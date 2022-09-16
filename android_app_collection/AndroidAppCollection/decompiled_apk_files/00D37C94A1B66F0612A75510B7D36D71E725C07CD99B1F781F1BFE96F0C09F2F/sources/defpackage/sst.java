package defpackage;

import android.view.View;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: sst  reason: default package */
/* loaded from: classes4.dex */
public final class sst implements tct {
    public final ssl a;
    private final /* synthetic */ int b;

    public sst(ssl sslVar) {
        this.a = sslVar;
    }

    public sst(ssl sslVar, int i) {
        this.b = i;
        this.a = sslVar;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    public final aooq a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return awqe.b;
            }
            return awqg.b;
        }
        return awqf.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, final tcs tcsVar) {
        int i = this.b;
        if (i == 0) {
            final awqf awqfVar = (awqf) obj;
            return aynr.t(new aypv() { // from class: sss
                @Override // defpackage.aypv
                public final void a() {
                    sst sstVar = sst.this;
                    awqf awqfVar2 = awqfVar;
                    final tcs tcsVar2 = tcsVar;
                    final ssl sslVar = sstVar.a;
                    String str = awqfVar2.c;
                    synchronized (sslVar.e) {
                        final ssk sskVar = (ssk) sslVar.a.get(str);
                        if (sskVar != null) {
                            aypg aypgVar = sskVar.b;
                            if (aypgVar != null && !aypgVar.e()) {
                                return;
                            }
                            long j = sskVar.a.e * 1000.0f;
                            sskVar.b = ayoi.S(j, j, TimeUnit.MILLISECONDS, sslVar.c).as(new ayqb() { // from class: ssi
                                @Override // defpackage.ayqb
                                public final void a(Object obj2) {
                                    ssl sslVar2 = ssl.this;
                                    ssk sskVar2 = sskVar;
                                    tcs tcsVar3 = tcsVar2;
                                    Long l = (Long) obj2;
                                    tcu tcuVar = (tcu) sslVar2.b.get();
                                    awmt awmtVar = sskVar2.a.f;
                                    if (awmtVar == null) {
                                        awmtVar = awmt.a;
                                    }
                                    tcuVar.b(awmtVar, tcsVar3).E(sslVar2.d).Q();
                                }
                            });
                            return;
                        }
                        throw new ted("Cannot start a loop that has not been registered yet");
                    }
                }
            });
        } else if (i == 1) {
            final awqe awqeVar = (awqe) obj;
            return aynr.t(new aypv(awqeVar, tcsVar, null) { // from class: ssm
                public final /* synthetic */ awqe a;
                public final /* synthetic */ tcs b;

                @Override // defpackage.aypv
                public final void a() {
                    sst sstVar = sst.this;
                    awqe awqeVar2 = this.a;
                    tcs tcsVar2 = this.b;
                    ssl sslVar = sstVar.a;
                    if (awqeVar2 != null) {
                        int i2 = awqeVar2.c;
                        if ((i2 & 1) != 0 && (i2 & 4) != 0) {
                            if (awqeVar2.e < 0.1d) {
                                throw new ted("LoopCommand delay is too small");
                            }
                            View view = tcsVar2.a;
                            if (view != null) {
                                synchronized (sslVar.e) {
                                    sslVar.a.put(awqeVar2.d, new ssk(awqeVar2));
                                }
                                view.addOnAttachStateChangeListener(new ssj(sslVar, awqeVar2));
                                return;
                            }
                            throw new ted("No view is available, loop has not been registered");
                        }
                    }
                    throw new ted("Invalid LoopCommand");
                }
            });
        } else {
            final awqg awqgVar = (awqg) obj;
            return aynr.t(new aypv(awqgVar, null) { // from class: ssu
                public final /* synthetic */ awqg a;

                @Override // defpackage.aypv
                public final void a() {
                    sst.this.a.a(this.a.c);
                }
            });
        }
    }
}
