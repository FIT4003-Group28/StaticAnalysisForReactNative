package defpackage;

import android.app.Activity;
import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: akkm  reason: default package */
/* loaded from: classes.dex */
public final class akkm implements aknx {
    public static final amup a = amup.m(atvo.ADDRESS_BOOK, "android.permission.READ_CONTACTS", atvo.ANDROID_CAMERA, "android.permission.CAMERA", atvo.WRITE_EXTERNAL_STORAGE, "android.permission.WRITE_EXTERNAL_STORAGE");
    public ajgx b;
    private final Activity c;
    private final SparseArray d = new SparseArray();

    public akkm(Activity activity, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.c = activity;
        azqbVar.getClass();
        azqbVar2.getClass();
        azqbVar3.getClass();
    }

    public final akkl a(atvo atvoVar) {
        if (this.d.get(atvoVar.m, null) == null) {
            amup amupVar = a;
            if (amupVar.containsKey(atvoVar)) {
                this.d.put(atvoVar.m, new akkl(this.c, atvoVar, (String) amupVar.get(atvoVar)));
            }
        }
        if (((akkl) this.d.get(atvoVar.m, null)) != null) {
            return (akkl) this.d.get(atvoVar.m);
        }
        throw new IllegalArgumentException("Unsupported Permission Type");
    }

    final akkl b(atvp atvpVar) {
        aqxo.p(atvpVar != null);
        atvo b = atvo.b(atvpVar.c);
        if (b == null) {
            b = atvo.INVALID;
        }
        return a(b);
    }

    public final boolean c(atvp atvpVar) {
        akkl b = b(atvpVar);
        return b.a.checkSelfPermission(b.c) == 0;
    }

    public final void d(atvp atvpVar, aknw aknwVar) {
        akkl b = b(atvpVar);
        if (aknwVar != null) {
            b.d = aknwVar;
        }
        b.a.requestPermissions(new String[]{b.c}, b.b.m);
    }
}
