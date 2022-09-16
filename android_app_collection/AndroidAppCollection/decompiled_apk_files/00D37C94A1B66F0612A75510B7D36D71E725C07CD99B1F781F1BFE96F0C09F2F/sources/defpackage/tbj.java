package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: tbj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tbj implements Runnable {
    public final /* synthetic */ tbk a;

    public /* synthetic */ tbj(tbk tbkVar) {
        this.a = tbkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tbk tbkVar = this.a;
        awqr e = tbkVar.c.e();
        byte[] byteArray = e == null ? null : e.toByteArray();
        if (byteArray != null && !Arrays.equals(byteArray, tbkVar.b)) {
            ((DebuggerClient) tbkVar.c.c.get()).traverseViewHierarchyResponse(byteArray);
            tbkVar.b = byteArray;
        }
        if (tbkVar.a.get()) {
            tbkVar.c.a.postDelayed(new tbj(tbkVar), 1000L);
        }
    }
}
