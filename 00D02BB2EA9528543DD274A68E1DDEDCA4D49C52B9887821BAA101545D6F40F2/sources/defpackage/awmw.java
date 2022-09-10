package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
/* compiled from: PG */
/* renamed from: awmw  reason: default package */
/* loaded from: classes3.dex */
public final class awmw {
    private final dcep<awmx> a;
    private final dcdn<String, dzsj<? extends IBinder>> b;

    public awmw(Set<awmx> set) {
        this.a = dcep.K(set);
        dcdg p = dcdn.p();
        for (awmx awmxVar : set) {
            p.f(awmxVar.a(), awmxVar.b());
        }
        this.b = p.b();
    }

    @dzsi
    public final IBinder a(Intent intent) {
        dzsj<? extends IBinder> dzsjVar = this.b.get(intent.getAction());
        if (dzsjVar != null) {
            return dzsjVar.a();
        }
        return null;
    }

    public final void b(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dcpd<awmx> it = this.a.iterator();
        while (it.hasNext()) {
            awmx next = it.next();
            IBinder a = next.b().a();
            try {
                printWriter.print("Action: ");
                printWriter.println(next.a());
                printWriter.print("binds to: ");
                printWriter.println(a.getClass().getCanonicalName());
                printWriter.print("implementing: ");
                printWriter.println(a.getInterfaceDescriptor());
                printWriter.println("with state: ");
                printWriter.flush();
                a.dump(fileDescriptor, strArr);
                printWriter.println();
            } catch (RemoteException e) {
                printWriter.println("Exception dumping:");
                deki.c(e, printWriter);
            }
        }
    }
}
