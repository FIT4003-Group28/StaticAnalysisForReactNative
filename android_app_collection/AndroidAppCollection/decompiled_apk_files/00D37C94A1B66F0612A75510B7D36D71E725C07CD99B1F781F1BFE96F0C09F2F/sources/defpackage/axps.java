package defpackage;

import com.google.cardboard.sdk.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: axps  reason: default package */
/* loaded from: classes2.dex */
public abstract class axps {
    public OutputStream a;
    public final axpn b;
    private final InputStream d;
    private axpv e = null;
    private final List f = new LinkedList();
    public int c = 1;

    public axps(axpj axpjVar) {
        axpr axprVar = new axpr(this, axpm.SWITCH_PROTOCOL);
        this.b = axprVar;
        this.d = ((axpi) axpjVar).a;
        axprVar.b("upgrade", "websocket");
        axprVar.b("connection", "Upgrade");
    }

    private final void h(String str, boolean z) {
        if (this.c == 5) {
            return;
        }
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                axpx.m.log(Level.FINE, "close failed", (Throwable) e);
            }
        }
        OutputStream outputStream = this.a;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                axpx.m.log(Level.FINE, "close failed", (Throwable) e2);
            }
        }
        this.c = 5;
        d(str, z);
    }

    protected abstract void a(IOException iOException);

    protected abstract void b(axpw axpwVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c();

    protected abstract void d(String str, boolean z);

    public final void e() {
        String str;
        int i;
        while (true) {
            try {
                if (this.c != 3) {
                    return;
                }
                axpw a = axpw.a(this.d);
                if (a.d == axpv.Close) {
                    if (a instanceof axpu) {
                        axpu axpuVar = (axpu) a;
                        i = axpuVar.b;
                        str = axpuVar.a;
                    } else {
                        str = "";
                        i = 1000;
                    }
                    if (this.c == 4) {
                        h(str, false);
                    } else {
                        g(i, str, true);
                    }
                } else if (a.d == axpv.Ping) {
                    f(new axpw(axpv.Pong, a.g));
                } else if (a.d == axpv.Pong) {
                    continue;
                } else {
                    if (a.e && a.d != axpv.Continuation) {
                        if (this.e != null) {
                            throw new axpt(1002, "Continuous frame sequence not completed.");
                        }
                        if (a.d != axpv.Text && a.d != axpv.Binary) {
                            throw new axpt(1002, "Non control or continuous frame expected.");
                        }
                        b(a);
                    }
                    if (a.d != axpv.Continuation) {
                        if (this.e != null) {
                            throw new axpt(1002, "Previous continuous frame sequence not completed.");
                        }
                        this.e = a.d;
                        this.f.clear();
                        this.f.add(a);
                    } else if (a.e) {
                        axpv axpvVar = this.e;
                        if (axpvVar == null) {
                            throw new axpt(1002, "Continuous frame sequence was not started.");
                        }
                        b(new axpw(axpvVar, this.f));
                        this.e = null;
                        this.f.clear();
                    } else if (this.e == null) {
                        throw new axpt(1002, "Continuous frame sequence was not started.");
                    } else {
                        this.f.add(a);
                    }
                }
            } catch (CharacterCodingException e) {
                a(e);
                h(e.toString(), false);
                return;
            } catch (IOException e2) {
                a(e2);
                if (e2 instanceof axpt) {
                    h(((axpt) e2).a, false);
                }
                return;
            } finally {
                h("Handler terminated without closing the connection.", false);
            }
        }
    }

    public final synchronized void f(axpw axpwVar) {
        OutputStream outputStream = this.a;
        outputStream.write((true != axpwVar.e ? (byte) 0 : Byte.MIN_VALUE) | axpwVar.d.g);
        int length = axpwVar.g.length;
        axpwVar.h = length;
        if (length <= 125) {
            outputStream.write(axpwVar.f() ? ((byte) axpwVar.h) | 128 : (byte) axpwVar.h);
        } else if (length <= 65535) {
            outputStream.write(true != axpwVar.f() ? R.styleable.AppCompatTheme_windowNoTitle : 254);
            outputStream.write(axpwVar.h >>> 8);
            outputStream.write(axpwVar.h);
        } else {
            outputStream.write(true != axpwVar.f() ? 127 : PrivateKeyType.INVALID);
            outputStream.write(0);
            outputStream.write(0);
            outputStream.write(0);
            outputStream.write(0);
            outputStream.write(axpwVar.h >>> 24);
            outputStream.write(axpwVar.h >>> 16);
            outputStream.write(axpwVar.h >>> 8);
            outputStream.write(axpwVar.h);
        }
        if (!axpwVar.f()) {
            outputStream.write(axpwVar.g);
        } else {
            outputStream.write(axpwVar.f);
            for (int i = 0; i < axpwVar.h; i++) {
                outputStream.write(axpwVar.g[i] ^ axpwVar.f[i % 4]);
            }
        }
        outputStream.flush();
    }

    public final void g(int i, String str, boolean z) {
        int i2 = this.c;
        this.c = 4;
        if (i2 == 3) {
            f(new axpu(i, str));
        } else {
            h(str, z);
        }
    }
}
