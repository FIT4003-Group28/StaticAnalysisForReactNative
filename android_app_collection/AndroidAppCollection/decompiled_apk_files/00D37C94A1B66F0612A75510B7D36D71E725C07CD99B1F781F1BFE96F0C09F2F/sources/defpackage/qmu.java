package defpackage;

import com.google.android.gms.cast.SessionState;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qmu  reason: default package */
/* loaded from: classes4.dex */
public final class qmu {
    public static final qpu a = new qpu("TransferController");
    public final Set b = new HashSet();
    public int c = 0;
    public qls d;
    public SettableFuture e;
    public SessionState f;

    public final void a() {
        qku a2;
        qls qlsVar = this.d;
        if (qlsVar == null || (a2 = qlsVar.a()) == null) {
            return;
        }
        a2.e = null;
    }
}
