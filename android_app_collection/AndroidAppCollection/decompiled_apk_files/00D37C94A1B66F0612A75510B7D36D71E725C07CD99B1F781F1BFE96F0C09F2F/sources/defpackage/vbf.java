package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vbf  reason: default package */
/* loaded from: classes4.dex */
public final class vbf implements vbc {
    private static vbf b;
    public final Context a;
    private final ContentObserver c;

    private vbf() {
        this.a = null;
        this.c = null;
    }

    private vbf(Context context) {
        this.a = context;
        vbe vbeVar = new vbe();
        this.c = vbeVar;
        context.getContentResolver().registerContentObserver(rxn.a, true, vbeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vbf a(Context context) {
        vbf vbfVar;
        synchronized (vbf.class) {
            if (b == null) {
                b = iy.A(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new vbf(context) : new vbf();
            }
            vbfVar = b;
        }
        return vbfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        Context context;
        synchronized (vbf.class) {
            vbf vbfVar = b;
            if (vbfVar != null && (context = vbfVar.a) != null && vbfVar.c != null) {
                context.getContentResolver().unregisterContentObserver(b.c);
            }
            b = null;
        }
    }

    @Override // defpackage.vbc
    /* renamed from: c */
    public final String b(final String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) vqw.h(new vbb() { // from class: vbd
                @Override // defpackage.vbb
                public final Object a() {
                    vbf vbfVar = vbf.this;
                    return rxn.d(vbfVar.a.getContentResolver(), str, null);
                }
            });
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }
}
