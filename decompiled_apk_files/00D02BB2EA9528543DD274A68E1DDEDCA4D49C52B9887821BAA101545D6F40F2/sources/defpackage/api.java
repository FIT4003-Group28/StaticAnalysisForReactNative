package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
/* compiled from: PG */
/* renamed from: api  reason: default package */
/* loaded from: classes2.dex */
public final class api extends apd {
    public final aph a;
    private final m b;

    public api(m mVar, aw awVar) {
        this.b = mVar;
        this.a = (aph) new au(awVar, aph.a).a(aph.class);
    }

    public static boolean d(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    @Override // defpackage.apd
    @Deprecated
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aph aphVar = this.a;
        if (aphVar.d.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < aphVar.d.f(); i++) {
                ape h = aphVar.d.h(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(aphVar.d.g(i));
                printWriter.print(": ");
                printWriter.println(h.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(h.g);
                printWriter.print(" mArgs=");
                printWriter.println(h.h);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(h.i);
                h.i.d(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (h.j != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(h.j);
                    apf<D> apfVar = h.j;
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(apfVar.c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                Object obj = h.i;
                printWriter.println(apl.q(h.h()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(h.k());
            }
        }
    }

    public final <D> void e(int i, Bundle bundle, apc<D> apcVar, apl<D> aplVar) {
        try {
            this.a.e = true;
            apl<D> a = apcVar.a(bundle);
            if (a == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (a.getClass().isMemberClass() && !Modifier.isStatic(a.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a);
            }
            ape apeVar = new ape(i, bundle, a, aplVar);
            if (d(3)) {
                String str = "  Created new loader " + apeVar;
            }
            this.a.d.e(i, apeVar);
            this.a.c();
            apeVar.m(this.b, apcVar);
        } catch (Throwable th) {
            this.a.c();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.b.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.b)));
        sb.append("}}");
        return sb.toString();
    }

    @Override // defpackage.apd
    public final <D> void c(int i, apc<D> apcVar) {
        if (this.a.e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        ape<D> d = this.a.d(i);
        if (d(2)) {
            String str = "initLoader in " + this + ": args=" + ((Object) null);
        }
        if (d == null) {
            e(i, null, apcVar, null);
            return;
        }
        if (d(3)) {
            String str2 = "  Re-using existing loader " + d;
        }
        d.m(this.b, apcVar);
    }
}
