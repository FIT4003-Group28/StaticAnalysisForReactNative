package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aehu  reason: default package */
/* loaded from: classes.dex */
public final class aehu implements Runnable {
    final /* synthetic */ aehx a;
    private final asy b;

    public aehu(aehx aehxVar, asy asyVar) {
        this.a = aehxVar;
        this.b = asyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                try {
                    ((aeks) this.a.c.b).n.N();
                    this.a.a.h(this.b);
                    ((aeks) this.a.c.b).n.ac();
                    byte[] bArr = new byte[16384];
                    if (!aehx.c(this.a.a.a())) {
                        throw new aeht(6, "Invalid UMP response received");
                    }
                    while (true) {
                        int g = this.a.a.g(bArr, 0, 16384);
                        if (g == -1) {
                            break;
                        }
                        aenr aenrVar = this.a.c;
                        int i = aenrVar.d;
                        if (i < 100000) {
                            if (i == 0 && g > 0) {
                                ((aeks) aenrVar.b).n.Q();
                            }
                            int i2 = aenrVar.d + g;
                            aenrVar.d = i2;
                            if (i2 > 100000) {
                                ((aeks) aenrVar.b).n.O();
                            }
                        }
                        this.a.b.a(ByteBuffer.wrap(bArr, 0, g));
                    }
                    if (!this.a.b.b()) {
                        throw new aeht(6, "Hanging data during UMP parsing");
                    }
                    aenr aenrVar2 = this.a.c;
                    aenq aenqVar = aenrVar2.c;
                    org orgVar = aenqVar.c;
                    if (orgVar != null) {
                        try {
                            aenqVar.d(orgVar);
                            aenqVar.c = null;
                        } catch (aenn e) {
                            aenqVar.a.d(e);
                        }
                    }
                    aenrVar2.b.i();
                    try {
                        this.a.a.j();
                    } catch (IOException unused) {
                    }
                } catch (IOException e2) {
                    aenr aenrVar3 = this.a.c;
                    String valueOf = String.valueOf(e2.getMessage());
                    aenrVar3.b(new aeht(valueOf.length() != 0 ? "IO error ".concat(valueOf) : new String("IO error "), e2));
                    try {
                        this.a.a.j();
                    } catch (IOException unused2) {
                    }
                }
            } catch (aeht e3) {
                this.a.c.b(e3);
                try {
                    this.a.a.j();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable th) {
            try {
                this.a.a.j();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }
}
