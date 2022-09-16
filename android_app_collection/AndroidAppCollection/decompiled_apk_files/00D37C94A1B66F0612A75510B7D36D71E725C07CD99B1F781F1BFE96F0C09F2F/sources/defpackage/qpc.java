package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: qpc  reason: default package */
/* loaded from: classes4.dex */
public class qpc {
    public final qpu a;
    public final String b;
    public qny c;
    public final List d;

    public qpc(String str) {
        qpl.i(str);
        this.b = str;
        qpu qpuVar = new qpu("MediaControlChannel");
        this.a = qpuVar;
        String str2 = null;
        if (!TextUtils.isEmpty(null)) {
            qpuVar.b = !TextUtils.isEmpty(null) ? String.format("[%s] ", null) : str2;
        }
        this.d = Collections.synchronizedList(new ArrayList());
    }

    public final long a() {
        qny qnyVar = this.c;
        if (qnyVar == null) {
            this.a.b("Attempt to generate requestId without a sink", new Object[0]);
            return 0L;
        }
        return qnyVar.b.getAndIncrement();
    }

    public void b() {
        throw null;
    }

    public final void c(String str, final long j) {
        final qny qnyVar = this.c;
        if (qnyVar == null) {
            this.a.b("Attempt to send text message without a sink", new Object[0]);
            return;
        }
        String str2 = this.b;
        qjj qjjVar = qnyVar.a;
        if (qjjVar == null) {
            throw new IllegalStateException("Device is not connected");
        }
        qjjVar.a(str2, str).n(new ruw() { // from class: qnx
            @Override // defpackage.ruw
            public final void c(Exception exc) {
                qny qnyVar2 = qny.this;
                long j2 = j;
                int a = exc instanceof qsp ? ((qsp) exc).a() : 13;
                for (qqb qqbVar : qnyVar2.c.b.d) {
                    qqbVar.e(j2, a);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(qqb qqbVar) {
        this.d.add(qqbVar);
    }
}
