package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* compiled from: PG */
/* renamed from: tfw  reason: default package */
/* loaded from: classes4.dex */
public final class tfw {
    private final FutureTask a;

    public tfw(final aodt aodtVar, final teb tebVar) {
        this.a = new FutureTask(new Callable() { // from class: tfv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aodt aodtVar2 = aodt.this;
                teb tebVar2 = tebVar;
                if (aodtVar2.U() != 2) {
                    String valueOf = String.valueOf(tfy.j(aodtVar2));
                    tebVar2.b(28, valueOf.length() != 0 ? "Command extension: invalid format: ".concat(valueOf) : new String("Command extension: invalid format: "));
                    return awmt.a;
                } else if (aodtVar2.T() == 0) {
                    String valueOf2 = String.valueOf(tfy.j(aodtVar2));
                    tebVar2.b(23, valueOf2.length() != 0 ? "Command extension: invalid identifier: ".concat(valueOf2) : new String("Command extension: invalid identifier: "));
                    return awmt.a;
                } else {
                    byte[] bArr = new byte[aodtVar2.S()];
                    if (aodtVar2.S() > 0) {
                        aodtVar2.V().get(bArr);
                    }
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        aool aj = aool.aj(byteArrayOutputStream);
                        aj.m(aodtVar2.T(), bArr);
                        aj.i();
                        return (awmt) aopi.parseFrom(awmt.a, byteArrayOutputStream.toByteArray(), aoos.b());
                    } catch (aopx unused) {
                        String valueOf3 = String.valueOf(tfy.j(aodtVar2));
                        tebVar2.b(26, valueOf3.length() != 0 ? "Command extension: invalid data: ".concat(valueOf3) : new String("Command extension: invalid data: "));
                        return awmt.a;
                    } catch (IOException unused2) {
                        String valueOf4 = String.valueOf(tfy.j(aodtVar2));
                        tebVar2.b(26, valueOf4.length() != 0 ? "Error wrapping Command extension: ".concat(valueOf4) : new String("Error wrapping Command extension: "));
                        return awmt.a;
                    }
                }
            }
        });
    }

    public final awmt a() {
        this.a.run();
        try {
            return (awmt) this.a.get();
        } catch (InterruptedException e) {
            throw new ted("CommandFuture interrupted", e);
        } catch (ExecutionException e2) {
            throw new ted("CommandFuture failed", e2);
        }
    }
}
