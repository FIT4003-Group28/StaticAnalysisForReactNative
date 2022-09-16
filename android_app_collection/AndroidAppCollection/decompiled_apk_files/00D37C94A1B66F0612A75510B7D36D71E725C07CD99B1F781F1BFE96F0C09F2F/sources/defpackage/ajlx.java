package defpackage;

import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ajlx  reason: default package */
/* loaded from: classes.dex */
public final class ajlx extends sth {
    private final acrr a;

    public ajlx(acrr acrrVar) {
        this.a = acrrVar;
    }

    @Override // defpackage.sth
    public final aooq a() {
        return asvp.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFunctionBinding
    public final StatusOr execute(byte[] bArr) {
        try {
            aoos a = aoos.a();
            acrr acrrVar = this.a;
            arrh arrhVar = ((asvp) aopi.parseFrom(asvp.a, bArr, a)).c;
            if (arrhVar == null) {
                arrhVar = arrh.d();
            }
            boolean c = acrrVar.c(arrhVar);
            aopa createBuilder = asvq.a.createBuilder();
            createBuilder.copyOnWrite();
            asvq asvqVar = (asvq) createBuilder.instance;
            asvqVar.b |= 1;
            asvqVar.c = c;
            return StatusOr.fromValue(((asvq) createBuilder.mo39build()).toByteArray());
        } catch (aopx e) {
            return StatusOr.fromStatus(Status.e.c(e));
        }
    }
}
