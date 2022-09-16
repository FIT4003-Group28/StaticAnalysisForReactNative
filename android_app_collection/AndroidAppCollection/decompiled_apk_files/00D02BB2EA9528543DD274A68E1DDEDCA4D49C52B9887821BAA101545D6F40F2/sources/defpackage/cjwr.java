package defpackage;

import com.google.android.apps.gmm.shared.tracing.process.Jiffies;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cjwr  reason: default package */
/* loaded from: classes.dex */
public final class cjwr implements cjwt {
    @dzsi
    public cjwp a;
    @dzsi
    public cjwo b;
    private final cqat c;

    public cjwr(cqat cqatVar) {
        this.c = cqatVar;
    }

    @Override // defpackage.cjwt
    @dzsi
    public final Runnable a(final cjqy cjqyVar) {
        bvrj.UI_THREAD.c();
        if (this.b == null) {
            cjwo cjwoVar = new cjwo(cjqyVar, this.c);
            this.b = cjwoVar;
            bvmo.a(cjwoVar);
            final cjwp cjwpVar = this.a;
            if (cjwpVar == null) {
                return null;
            }
            this.a = null;
            return new Runnable(cjwpVar, cjqyVar) { // from class: cjwq
                private final cjwp a;
                private final cjqy b;

                {
                    this.a = cjwpVar;
                    this.b = cjqyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String[] split;
                    int length;
                    Object obj;
                    cjwp cjwpVar2 = this.a;
                    cjqy cjqyVar2 = this.b;
                    try {
                        try {
                            split = ddau.c(new File("/proc/self/stat"), Charset.defaultCharset()).a().split(" ");
                            length = split.length;
                        } catch (IOException e) {
                            throw new bvmq("Failed to get process create time", e);
                        }
                    } catch (bvmq e2) {
                        bvoo.f(new RuntimeException("Couldn't get process create time", e2));
                    }
                    if (length <= 21) {
                        StringBuilder sb = new StringBuilder(30);
                        sb.append("Not enough fields: ");
                        sb.append(length);
                        throw new bvmq(sb.toString());
                    }
                    try {
                        long longValue = Long.decode(split[21]).longValue();
                        long nativeJiffiesPerSecond = Jiffies.nativeJiffiesPerSecond();
                        if (nativeJiffiesPerSecond == 0) {
                            throw new bvmq("jiffies per second = 0");
                        }
                        bvmo.g(TimeUnit.SECONDS.toMillis(longValue) / nativeJiffiesPerSecond);
                        cjwpVar2.d(cjqyVar2);
                    } catch (NumberFormatException e3) {
                        String valueOf = String.valueOf(obj);
                        throw new bvmq(valueOf.length() != 0 ? "Failed to parse ".concat(valueOf) : new String("Failed to parse "), e3);
                    }
                }
            };
        }
        return null;
    }
}
