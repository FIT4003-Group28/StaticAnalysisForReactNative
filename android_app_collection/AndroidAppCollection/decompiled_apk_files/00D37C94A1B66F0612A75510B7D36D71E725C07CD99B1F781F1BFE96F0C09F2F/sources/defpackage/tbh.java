package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
/* compiled from: PG */
/* renamed from: tbh  reason: default package */
/* loaded from: classes4.dex */
final class tbh extends Observer {
    final /* synthetic */ tbl a;

    public tbh(tbl tblVar) {
        this.a = tblVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.Observer
    public final void storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
        Snapshot endState;
        if (transactionRecord == null || (endState = transactionRecord.endState()) == null) {
            return;
        }
        tbl tblVar = this.a;
        aopa g = tbl.g(endState, transactionRecord.keys());
        g.copyOnWrite();
        awqy awqyVar = (awqy) g.instance;
        awqy awqyVar2 = awqy.a;
        awqyVar.b |= 2;
        awqyVar.d = true;
        aorw e = tbs.e();
        g.copyOnWrite();
        awqy awqyVar3 = (awqy) g.instance;
        e.getClass();
        awqyVar3.e = e;
        awqyVar3.b |= 4;
        tblVar.f((awqy) g.mo39build());
    }
}
