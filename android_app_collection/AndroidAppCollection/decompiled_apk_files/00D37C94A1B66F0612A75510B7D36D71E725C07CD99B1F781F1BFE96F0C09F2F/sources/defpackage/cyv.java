package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.util.Log;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cyv  reason: default package */
/* loaded from: classes3.dex */
public class cyv {
    public static final dbk a = new dct();
    public final Context b;
    public final String c;
    public final ddm d;
    public String e;
    public cyr f;
    public final dde g;
    public int h;
    public int i;
    public ComponentTree j;
    public dbp k;
    public final tha l;
    public aflw m;
    private final ddd n;

    public cyv(Context context) {
        this(context, (String) null, (tha) null, (aflw) null, (byte[]) null);
    }

    public static cyv d(cyv cyvVar, cyr cyrVar) {
        cyv c = cyvVar.c();
        c.f = cyrVar;
        c.j = cyvVar.j;
        return c;
    }

    private final void o() {
        String str = this.e;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 107);
        sb.append("Updating the state of a component during ");
        sb.append(str);
        sb.append(" leads to unexpected behaviour, consider using lazy state updates.");
        throw new IllegalStateException(sb.toString());
    }

    public final Context a() {
        return this.b.getApplicationContext();
    }

    public final Resources b() {
        return this.b.getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cyv c() {
        return new cyv(this, this.d, this.m, this.k, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbq e() {
        dbp dbpVar = this.k;
        if (dbpVar == null) {
            return null;
        }
        return dbpVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.e = null;
    }

    public void g(ddk ddkVar, String str) {
        o();
        ComponentTree componentTree = this.j;
        if (componentTree == null) {
            return;
        }
        String str2 = this.f.m;
        boolean i = i();
        if (componentTree.m) {
            synchronized (componentTree) {
                if (componentTree.s == null) {
                    return;
                }
                componentTree.w.m(str2, ddkVar, false);
                dio.c.addAndGet(1L);
                componentTree.q(true, str, i);
                return;
            }
        }
        throw new RuntimeException("Triggering async state updates on this component tree is disabled, use sync state updates.");
    }

    public void h(ddk ddkVar, String str) {
        o();
        ComponentTree componentTree = this.j;
        if (componentTree == null) {
            return;
        }
        String str2 = this.f.m;
        boolean i = i();
        synchronized (componentTree) {
            if (componentTree.s == null) {
                return;
            }
            componentTree.w.m(str2, ddkVar, false);
            dio.b.addAndGet(1L);
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                Log.w(ComponentTree.a, "You cannot update state synchronously from a thread without a looper, using the default background layout thread instead");
                synchronized (componentTree.f) {
                    czl czlVar = componentTree.g;
                    if (czlVar != null) {
                        componentTree.o.a(czlVar);
                    }
                    componentTree.g = new czl(componentTree, str, i);
                    componentTree.o.b();
                    componentTree.o.c(componentTree.g);
                }
                return;
            }
            WeakReference weakReference = (WeakReference) ComponentTree.b.get();
            dby dbyVar = weakReference != null ? (dby) weakReference.get() : null;
            if (dbyVar == null) {
                dbyVar = new dbx(myLooper);
                ComponentTree.b.set(new WeakReference(dbyVar));
            }
            synchronized (componentTree.f) {
                czl czlVar2 = componentTree.g;
                if (czlVar2 != null) {
                    dbyVar.a(czlVar2);
                }
                componentTree.g = new czl(componentTree, str, i);
                dbyVar.c(componentTree.g);
            }
        }
    }

    final boolean i() {
        dbq dbqVar;
        dbp dbpVar = this.k;
        if (dbpVar == null || (dbqVar = dbpVar.a) == null) {
            return false;
        }
        return dbqVar.s;
    }

    public final boolean j() {
        ComponentTree componentTree = this.j;
        return componentTree != null ? componentTree.y : dfz.j;
    }

    public final boolean k() {
        czi cziVar;
        dbp dbpVar = this.k;
        if (dbpVar == null || (cziVar = dbpVar.b) == null) {
            return false;
        }
        return cziVar.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        dbp dbpVar = this.k;
        if (dbpVar == null) {
            return false;
        }
        return dbpVar.b();
    }

    public aflw m() {
        return this.m;
    }

    public final aflw n() {
        return aflw.i(this.m);
    }

    public cyv(Context context, String str, tha thaVar, aflw aflwVar, byte[] bArr) {
        if (thaVar == null || str != null) {
            this.b = context;
            this.n = ddd.a(context.getResources().getConfiguration());
            this.g = new dde(this);
            this.m = aflwVar;
            this.l = thaVar;
            this.c = str;
            this.d = null;
            return;
        }
        throw new IllegalStateException("When a ComponentsLogger is set, a LogTag must be set");
    }

    public cyv(cyv cyvVar, ddm ddmVar, aflw aflwVar, dbp dbpVar, byte[] bArr) {
        this.b = cyvVar.b;
        this.n = cyvVar.n;
        this.g = cyvVar.g;
        this.h = cyvVar.h;
        this.i = cyvVar.i;
        this.f = cyvVar.f;
        ComponentTree componentTree = cyvVar.j;
        this.j = componentTree;
        this.k = dbpVar;
        this.l = cyvVar.l;
        String str = cyvVar.c;
        if (str == null && componentTree != null) {
            str = componentTree.f();
        }
        this.c = str;
        this.d = ddmVar == null ? cyvVar.d : ddmVar;
        this.m = aflwVar == null ? cyvVar.m : aflwVar;
    }
}
