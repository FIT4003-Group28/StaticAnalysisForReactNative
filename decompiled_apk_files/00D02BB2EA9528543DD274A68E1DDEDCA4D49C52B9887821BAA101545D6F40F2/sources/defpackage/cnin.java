package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: PG */
/* renamed from: cnin  reason: default package */
/* loaded from: classes.dex */
public final class cnin implements cnfs {
    public volatile boolean a;
    public final Queue<cnfn> b = new ConcurrentLinkedQueue();
    private final cngv c;

    public cnin(cngv cngvVar) {
        this.c = cngvVar;
    }

    private final boolean e() {
        if (!d()) {
            int i = cnjc.a;
            return false;
        }
        return true;
    }

    @Override // defpackage.cnfs
    public final void a(cnfn cnfnVar) {
        if (cmwk.a("CAR.INPUT", 3)) {
            int i = cnjc.a;
        }
        if (!e()) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            synchronized (this.b) {
                if (!this.b.isEmpty() && this.b.peek() == cnfnVar) {
                    return;
                }
                this.b.offer(cnfnVar);
                EditorInfo editorInfo = new EditorInfo();
                InputConnection onCreateInputConnection = cnfnVar.onCreateInputConnection(editorInfo);
                if (cmwk.a("CAR.INPUT", 3)) {
                    int i2 = editorInfo.imeOptions;
                    int i3 = cnjc.a;
                }
                if (onCreateInputConnection == null) {
                    cnfnVar.getClass();
                    int i4 = cnjc.a;
                    return;
                }
                cngv cngvVar = this.c;
                try {
                    cngvVar.a.J.o(new cngn(onCreateInputConnection, cnfnVar), editorInfo);
                    return;
                } catch (RemoteException unused) {
                    cmyz.a(cngvVar.a.d);
                    return;
                }
            }
        }
        throw new IllegalStateException("expecting main thread");
    }

    @Override // defpackage.cnfs
    public final void b() {
        if (cmwk.a("CAR.INPUT", 3)) {
            int i = cnjc.a;
        }
        if (!e()) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            cngv cngvVar = this.c;
            try {
                cngvVar.a.J.p();
                return;
            } catch (RemoteException unused) {
                cmyz.a(cngvVar.a.d);
                return;
            }
        }
        throw new IllegalStateException("expecting main thread");
    }

    @Override // defpackage.cnfs
    public final boolean c() {
        return d() && !this.b.isEmpty();
    }

    public final boolean d() {
        return !this.a;
    }
}
