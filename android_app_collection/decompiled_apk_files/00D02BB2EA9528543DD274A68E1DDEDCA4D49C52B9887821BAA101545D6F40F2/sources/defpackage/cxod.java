package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxod  reason: default package */
/* loaded from: classes5.dex */
public final class cxod implements Serializable {
    private static final long serialVersionUID = 1;
    public final List<cxoc> a = new ArrayList();

    public final void a(Context context) {
        cxod cxodVar;
        Intent intent;
        cxoc a;
        List<cxoc> list;
        czhd h = czhd.h(context);
        ArrayList arrayList = new ArrayList();
        czhd czhdVar = h;
        do {
            Object f = czhdVar.f(cxoe.class);
            if (f != null) {
                arrayList.add(f);
            }
            czhdVar = czhdVar.b;
        } while (czhdVar != null);
        for (int i = 0; i < arrayList.size(); i++) {
            cxoc a2 = ((cxoe) arrayList.get(i)).a();
            if (a2 != null) {
                this.a.add(a2);
            }
        }
        if (!this.a.isEmpty()) {
            cxof cxofVar = this.a.get(list.size() - 1).a;
        }
        cxnw cxnwVar = (cxnw) h.c(cxnw.class);
        if (cxnwVar != null && (a = cxnwVar.a()) != null) {
            this.a.add(a);
        }
        while (true) {
            cxodVar = null;
            if (context instanceof Activity) {
                intent = ((Activity) context).getIntent();
                break;
            } else if (!(context instanceof ContextWrapper)) {
                intent = null;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (intent == null) {
            return;
        }
        try {
            cxodVar = (cxod) intent.getSerializableExtra("analytics$VisualElementPath");
        } catch (Throwable unused) {
            Log.isLoggable("VisualElementPath", 6);
        }
        if (cxodVar == null) {
            return;
        }
        this.a.addAll(cxodVar.a);
    }

    public final void b(cxoc cxocVar) {
        cxocVar.getClass();
        this.a.add(cxocVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cxod)) {
            return false;
        }
        return czhw.a(((cxod) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        List<cxoc> list = this.a;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append("->");
            }
            sb.append(list.get(i).a.a);
        }
        sb.append(" (leaf->root)");
        return sb.toString();
    }
}
