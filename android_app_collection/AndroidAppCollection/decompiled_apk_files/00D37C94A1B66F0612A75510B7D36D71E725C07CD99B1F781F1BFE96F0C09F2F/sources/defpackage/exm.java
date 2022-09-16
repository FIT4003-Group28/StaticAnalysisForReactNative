package defpackage;

import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: exm  reason: default package */
/* loaded from: classes3.dex */
public final class exm implements exn {
    private final ymi a;

    public exm(ymi ymiVar) {
        this.a = ymiVar;
    }

    @Override // defpackage.exn
    public final ymg a() {
        try {
            ymi ymiVar = this.a;
            try {
            } catch (Exception e) {
                e = e;
            }
            try {
                String[] split = anhe.j(new File("/proc/self/stat"), Charset.defaultCharset()).a().split(" ");
                int length = split.length;
                if (length <= 21) {
                    StringBuilder sb = new StringBuilder(30);
                    sb.append("Not enough fields: ");
                    sb.append(length);
                    throw new ymh(sb.toString());
                }
                String str = split[21];
                try {
                    long longValue = Long.decode(str).longValue();
                    long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
                    if (sysconf <= 0) {
                        StringBuilder sb2 = new StringBuilder(48);
                        sb2.append("jiffiesPerSecond bad value: ");
                        sb2.append(sysconf);
                        throw new ymh(sb2.toString());
                    } else if (longValue <= 0) {
                        StringBuilder sb3 = new StringBuilder(56);
                        sb3.append("processCreateTimeJiffies bad value: ");
                        sb3.append(longValue);
                        throw new ymh(sb3.toString());
                    } else {
                        long millis = TimeUnit.SECONDS.toMillis(longValue) / sysconf;
                        if (millis > 0 && millis < ymiVar.a.d()) {
                            return new exl(millis);
                        }
                        StringBuilder sb4 = new StringBuilder(52);
                        sb4.append("valueInElapsedMillis bad value: ");
                        sb4.append(millis);
                        throw new ymh(sb4.toString());
                    }
                } catch (NumberFormatException e2) {
                    String valueOf = String.valueOf(str);
                    throw new ymh(valueOf.length() != 0 ? "Failed to parse: ".concat(valueOf) : new String("Failed to parse: "), e2);
                }
            } catch (Exception e3) {
                e = e3;
                String valueOf2 = String.valueOf((Object) null);
                throw new ymh(valueOf2.length() != 0 ? "Failed to get process create time: ".concat(valueOf2) : new String("Failed to get process create time: "), e);
            }
        } catch (Exception e4) {
            afus.c(2, 18, "Failed to obtain process fork time using Kernel stats", e4);
            return null;
        }
    }

    @Override // defpackage.exn
    public final void b(acvp acvpVar) {
        acvpVar.h(exl.class, "proc_k");
    }

    @Override // defpackage.exn
    public final boolean c() {
        return true;
    }
}
