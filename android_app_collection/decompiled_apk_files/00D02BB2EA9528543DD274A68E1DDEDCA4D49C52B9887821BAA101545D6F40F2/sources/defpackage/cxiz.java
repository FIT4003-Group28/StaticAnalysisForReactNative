package defpackage;

import android.content.Context;
import android.database.ContentObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxiz  reason: default package */
/* loaded from: classes.dex */
public final class cxiz implements cxiw {
    private static cxiz b;
    @dzsi
    public final Context a;
    @dzsi
    private final ContentObserver c;

    private cxiz() {
        this.a = null;
        this.c = null;
    }

    private cxiz(Context context) {
        this.a = context;
        cxiy cxiyVar = new cxiy();
        this.c = cxiyVar;
        context.getContentResolver().registerContentObserver(cpke.a, true, cxiyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cxiz a(Context context) {
        cxiz cxizVar;
        synchronized (cxiz.class) {
            if (b == null) {
                b = jc.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new cxiz(context) : new cxiz();
            }
            cxizVar = b;
        }
        return cxizVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void c() {
        Context context;
        synchronized (cxiz.class) {
            cxiz cxizVar = b;
            if (cxizVar != null && (context = cxizVar.a) != null && cxizVar.c != null) {
                context.getContentResolver().unregisterContentObserver(b.c);
            }
            b = null;
        }
    }

    @Override // defpackage.cxiw
    /* renamed from: b */
    public final String e(final String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) cxiu.a(new cxiv(this, str) { // from class: cxix
                private final cxiz a;
                private final String b;

                {
                    this.a = this;
                    this.b = str;
                }

                @Override // defpackage.cxiv
                public final Object a() {
                    cxiz cxizVar = this.a;
                    return cpke.a(cxizVar.a.getContentResolver(), this.b, null);
                }
            });
        } catch (IllegalStateException | SecurityException unused) {
            if (String.valueOf(str).length() == 0) {
                new String("Unable to read GServices for: ");
            }
            return null;
        }
    }
}
