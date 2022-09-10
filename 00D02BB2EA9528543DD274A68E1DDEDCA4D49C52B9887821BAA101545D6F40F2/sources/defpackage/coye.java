package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: coye  reason: default package */
/* loaded from: classes5.dex */
public class coye {
    protected final coxz a;
    protected final String b;
    protected long c;

    public coye(coxz coxzVar, String str) {
        this.a = coxzVar;
        this.b = str;
        synchronized (cntk.a) {
        }
        this.c = 2000L;
    }

    public static boolean f(SharedPreferences sharedPreferences, Configurations configurations) {
        Configuration[] configurationArr;
        Flag[] flagArr;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (!configurations.f) {
            edit.clear();
        }
        for (Configuration configuration : configurations.d) {
            if (configuration != null) {
                for (String str : configuration.c) {
                    edit.remove(str);
                }
                for (Flag flag : configuration.b) {
                    int i = flag.g;
                    if (i == 1) {
                        edit.putLong(flag.a, flag.a());
                    } else if (i == 2) {
                        edit.putBoolean(flag.a, flag.b());
                    } else if (i == 3) {
                        edit.putFloat(flag.a, (float) flag.c());
                    } else if (i == 4) {
                        edit.putString(flag.a, flag.d());
                    } else if (i == 5) {
                        edit.putString(flag.a, Base64.encodeToString(flag.e(), 3));
                    }
                }
            }
        }
        edit.putString("__phenotype_server_token", configurations.c);
        edit.putLong("__phenotype_configuration_version", configurations.g);
        edit.putString("__phenotype_snapshot_token", configurations.a);
        return edit.commit();
    }

    private final boolean i(String str, int i) {
        if (i <= 0) {
            if (String.valueOf(this.b).length() == 0) {
                new String("No more attempts remaining, giving up for ");
            }
            return false;
        }
        Configurations c = c(this.b, str, b());
        if (c == null || !a(c)) {
            return false;
        }
        String str2 = c.a;
        if (str2 == null || str2.isEmpty()) {
            return true;
        }
        try {
            cpda.e(this.a.k(c.a), this.c, TimeUnit.MILLISECONDS);
            cxis.c(cxjd.a(this.b));
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            String str3 = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 41);
            sb.append("Committing snapshot for ");
            sb.append(str3);
            sb.append(" failed, retrying");
            sb.toString();
            return i(str, i - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(Configurations configurations) {
        h();
        return true;
    }

    @dzsi
    protected String b() {
        return null;
    }

    @dzsi
    protected final Configurations c(String str, String str2, @dzsi String str3) {
        try {
            return (Configurations) cpda.e(this.a.b(str, str2, str3), this.c, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
            sb.append("Retrieving snapshot for ");
            sb.append(str);
            sb.append(" failed");
            sb.toString();
            return null;
        }
    }

    public final void d(String str, coyd coydVar) {
        Executor executor = cpcw.a;
        cnwc.a(str);
        e(str, executor, coydVar, 3);
    }

    public final void e(final String str, final Executor executor, final coyd coydVar, final int i) {
        this.a.b(this.b, str, b()).n(executor, new cpcf(this, coydVar, executor, i, str) { // from class: coyb
            private final coye a;
            private final coyd b;
            private final Executor c;
            private final int d;
            private final String e;

            {
                this.a = this;
                this.b = coydVar;
                this.c = executor;
                this.d = i;
                this.e = str;
            }

            @Override // defpackage.cpcf
            public final void a(cpcq cpcqVar) {
                final coye coyeVar = this.a;
                final coyd coydVar2 = this.b;
                final Executor executor2 = this.c;
                final int i2 = this.d;
                final String str2 = this.e;
                if (!cpcqVar.b()) {
                    String str3 = coyeVar.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 31);
                    sb.append("Retrieving snapshot for ");
                    sb.append(str3);
                    sb.append(" failed");
                    sb.toString();
                    if (coydVar2 == null) {
                        return;
                    }
                    coydVar2.a(false);
                } else if (!coyeVar.a((Configurations) cpcqVar.d())) {
                    if (coydVar2 == null) {
                        return;
                    }
                    coydVar2.a(false);
                } else {
                    String str4 = ((Configurations) cpcqVar.d()).a;
                    if (str4 != null && !str4.isEmpty()) {
                        coyeVar.a.k(str4).n(executor2, new cpcf(coyeVar, i2, str2, executor2, coydVar2) { // from class: coyc
                            private final coye a;
                            private final int b;
                            private final String c;
                            private final Executor d;
                            private final coyd e;

                            {
                                this.a = coyeVar;
                                this.b = i2;
                                this.c = str2;
                                this.d = executor2;
                                this.e = coydVar2;
                            }

                            @Override // defpackage.cpcf
                            public final void a(cpcq cpcqVar2) {
                                coye coyeVar2 = this.a;
                                int i3 = this.b;
                                String str5 = this.c;
                                Executor executor3 = this.d;
                                coyd coydVar3 = this.e;
                                boolean b = cpcqVar2.b();
                                if (b || i3 <= 1) {
                                    if (coydVar3 == null) {
                                        return;
                                    }
                                    coydVar3.a(b);
                                    return;
                                }
                                String str6 = coyeVar2.b;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 41);
                                sb2.append("Committing snapshot for ");
                                sb2.append(str6);
                                sb2.append(" failed, retrying");
                                sb2.toString();
                                coyeVar2.e(str5, executor3, coydVar3, i3 - 1);
                            }
                        });
                    } else if (coydVar2 == null) {
                    } else {
                        coydVar2.a(true);
                    }
                }
            }
        });
    }

    public final void g(String str) {
        i(str, 3);
    }

    @Deprecated
    protected void h() {
        throw new IllegalStateException("Requires implementation");
    }
}
