package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: vjf  reason: default package */
/* loaded from: classes4.dex */
public final class vjf {
    public String a;
    private final Context b;
    private String c = "files";
    private String d = "common";
    private Account e = vjg.b;
    private String f = "";
    private final amuf g = amuk.f();

    public vjf(Context context) {
        vwl.d(context != null, "Context cannot be null", new Object[0]);
        this.b = context;
        this.a = context.getPackageName();
    }

    public final Uri a() {
        return new Uri.Builder().scheme("android").authority(this.a).path(String.format("/%s/%s/%s/%s", this.c, this.d, vjc.b(this.e), this.f)).encodedFragment(vkc.b(this.g.g())).build();
    }

    public final void b(String str) {
        String str2;
        String str3;
        String substring;
        File e = uwv.e(this.b);
        String absolutePath = e.getAbsolutePath();
        String absolutePath2 = this.b.getCacheDir().getAbsolutePath();
        String absolutePath3 = new File(e, "managed").getAbsolutePath();
        File externalFilesDir = this.b.getExternalFilesDir(null);
        String absolutePath4 = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        if (Build.VERSION.SDK_INT >= 24) {
            File d = uwv.d(this.b);
            str3 = new File(d, "files").getAbsolutePath();
            str2 = new File(d, "cache").getAbsolutePath();
        } else {
            str2 = null;
            str3 = null;
        }
        if (str.startsWith(absolutePath3)) {
            d("managed");
            substring = str.substring(absolutePath3.length());
        } else if (str.startsWith(absolutePath)) {
            d("files");
            substring = str.substring(absolutePath.length());
        } else if (str.startsWith(absolutePath2)) {
            d("cache");
            substring = str.substring(absolutePath2.length());
        } else if (absolutePath4 == null || !str.startsWith(absolutePath4)) {
            if (str3 == null || !str.startsWith(str3)) {
                if (str2 == null || !str.startsWith(str2)) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Path must be in app-private files dir or external files dir: ".concat(valueOf) : new String("Path must be in app-private files dir or external files dir: "));
                } else {
                    d("directboot-cache");
                    substring = str.substring(str2.length());
                }
            } else {
                d("directboot-files");
                substring = str.substring(str3.length());
            }
        } else {
            d("external");
            substring = str.substring(absolutePath4.length());
        }
        List asList = Arrays.asList(substring.split(File.separator));
        vwl.d(asList.size() >= 3, "Path must be in module and account subdirectories: %s", str);
        e((String) asList.get(1));
        String str4 = (String) asList.get(2);
        if (!"managed".equals(this.c) || vjc.d(str4)) {
            c(vjc.a(str4));
            f(substring.substring(this.d.length() + str4.length() + 2));
            return;
        }
        try {
            Integer.parseInt(str4);
            vwl.d(false, "AccountManager cannot be null", new Object[0]);
            try {
                throw null;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalArgumentException(new vjt(e2));
            } catch (ExecutionException e3) {
                throw new IllegalArgumentException(new vjt(e3.getCause()));
            }
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public final void c(Account account) {
        vjc.b(account);
        this.e = account;
    }

    public final void d(String str) {
        vwl.d(vjg.d.contains(str), "The only supported locations are %s: %s", vjg.d, str);
        this.c = str;
    }

    public final void e(String str) {
        vwl.d(vjg.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        vwl.d(!vjg.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.d = str;
    }

    public final void f(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = vjg.a;
        this.f = str;
    }
}
