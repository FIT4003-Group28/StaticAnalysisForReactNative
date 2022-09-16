package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.FaultObserver;
/* compiled from: PG */
/* renamed from: tbi  reason: default package */
/* loaded from: classes4.dex */
final class tbi extends FaultObserver {
    final /* synthetic */ tbl a;

    public tbi(tbl tblVar) {
        this.a = tblVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.FaultObserver
    public final void storeDidFault(ByteStore byteStore, String str) {
        tbl tblVar = this.a;
        awro a = awrp.a();
        aorw e = tbs.e();
        a.copyOnWrite();
        awrp.c((awrp) a.instance, e);
        awri a2 = awrj.a();
        a2.copyOnWrite();
        awrj.c((awrj) a2.instance, str);
        a.copyOnWrite();
        awrp.h((awrp) a.instance, (awrj) a2.mo39build());
        ((DebuggerClient) tblVar.c.get()).sendTimelineEvent(((awrp) a.mo39build()).toByteArray());
    }
}
