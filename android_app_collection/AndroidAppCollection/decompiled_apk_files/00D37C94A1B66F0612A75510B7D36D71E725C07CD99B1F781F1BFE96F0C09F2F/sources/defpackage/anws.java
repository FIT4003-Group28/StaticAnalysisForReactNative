package defpackage;

import android.content.Context;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: anws  reason: default package */
/* loaded from: classes.dex */
public final class anws {
    private static WeakReference b;
    final anxh a;

    public anws() {
    }

    public static synchronized anws a(Context context) {
        synchronized (anws.class) {
            WeakReference weakReference = b;
            anws anwsVar = weakReference == null ? null : (anws) weakReference.get();
            if (anwsVar == null) {
                anws anwsVar2 = new anws(context.getApplicationContext());
                b = new WeakReference(anwsVar2);
                return anwsVar2;
            }
            return anwsVar;
        }
    }

    public final void b(anwz... anwzVarArr) {
        try {
            Thing[] thingArr = new Thing[1];
            System.arraycopy(anwzVarArr, 0, thingArr, 0, 1);
            c(new MutateRequest(1, thingArr, null, null, null, null, null));
        } catch (ArrayStoreException unused) {
            rwd.b(new anww("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }

    public final void c(MutateRequest mutateRequest) {
        boolean isEmpty;
        anxh anxhVar = this.a;
        anxg anxgVar = new anxg(anxhVar, mutateRequest);
        anxgVar.b.a.m(anxhVar, anxhVar);
        synchronized (anxhVar.b) {
            isEmpty = anxhVar.b.isEmpty();
            anxhVar.b.add(anxgVar);
        }
        if (isEmpty) {
            anxgVar.a();
        }
    }

    public anws(Context context) {
        this.a = new anxh(new qst(context, null));
    }
}
