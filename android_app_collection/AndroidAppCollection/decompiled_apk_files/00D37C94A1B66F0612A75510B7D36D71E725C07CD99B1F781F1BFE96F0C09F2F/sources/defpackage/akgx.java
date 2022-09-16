package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: akgx  reason: default package */
/* loaded from: classes.dex */
public final class akgx {
    public final akgt a;
    public final Context b;
    public awxw c;

    public akgx(Context context, akgt akgtVar) {
        this.a = akgtVar;
        this.b = context;
    }

    public static void a(OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (IOException unused) {
        }
    }

    public final synchronized void b() {
        if (this.c != null) {
            return;
        }
        ampq g = this.a.g();
        if (!g.h()) {
            zep.l("OnDeviceSuggestIndexStore: Index file is absent in SharedPrefrences, probably not fetched yet. No on-device suggestions will be returned until the file is fetched.");
        } else {
            c((String) g.c());
        }
    }

    public final synchronized boolean c(String str) {
        File file = new File(str);
        if (!file.exists()) {
            zep.b("OnDeviceSuggestIndexStore: Index file does not exist.");
            return false;
        }
        try {
            this.c = new awxw(file.getPath(), this.a.a());
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
            sb.append("OnDeviceSuggestIndexStore: Successfully created Serving instance from ");
            sb.append(valueOf);
            zep.g(sb.toString());
            return true;
        } catch (IOException e) {
            apwt.u("Failed to create Serving instance", e);
            zep.d("OnDeviceSuggestIndexStore: Failed to create Serving instance. ", e);
            return false;
        }
    }
}
